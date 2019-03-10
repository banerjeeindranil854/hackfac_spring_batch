package com.hackfac.listener;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hackfac.DTO.OutReachEventSummeryDTO;
import com.hackfac.DTO.OutReachNotRegisteredDTO;
import com.hackfac.DTO.OutReachRegisteredDTO;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("============ JOB FINISHED ============ Verifying the results....\n");

			List<OutReachNotRegisteredDTO> results1 = jdbcTemplate.query("SELECT event_id, event_name, beneficiary_name, base_location, event_date, emp_id  FROM hackfac.outreach_not_registered", new RowMapper<OutReachNotRegisteredDTO>() {
				@Override
				public OutReachNotRegisteredDTO mapRow(ResultSet rs, int row) throws SQLException {
					return new OutReachNotRegisteredDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				}
			});
			
			List<OutReachRegisteredDTO> results2 = jdbcTemplate.query("SELECT event_id, event_name, beneficiary_name, base_location, event_date, emp_id  FROM hackfac.outreach_registered", new RowMapper<OutReachRegisteredDTO>() {
				@Override
				public OutReachRegisteredDTO mapRow(ResultSet rs, int row) throws SQLException {
					return new OutReachRegisteredDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				}
			});
			
			List<OutReachEventSummeryDTO> results3 = jdbcTemplate.query("SELECT event_id, month, base_location, beneficiary_name, venue_address, council_name, project, category, event_name, event_description, event_date, total_volunteer, total_volunteer_hour, total_travle_houres, overall_volunteer_hours  FROM hackfac.outreach_event_summery", new RowMapper<OutReachEventSummeryDTO>() {
				@Override
				public OutReachEventSummeryDTO mapRow(ResultSet rs, int row) throws SQLException {
					return new OutReachEventSummeryDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
				}
			});

			for (OutReachNotRegisteredDTO OutReachNotRegisteredDTO : results1) {
				log.info("Discovered <" + OutReachNotRegisteredDTO + "> in the database.");
			}
			
			for (OutReachRegisteredDTO OutReachRegisteredDTO : results2) {
				log.info("Discovered <" + OutReachRegisteredDTO + "> in the database.");
			}
			
			for (OutReachEventSummeryDTO OutReachEventSummeryDTO : results3) {
				log.info("Discovered <" + OutReachEventSummeryDTO + "> in the database.");
			}

		}
	}
	
}
