package com.hackfac.rowmapper;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.hackfac.DTO.OutReachEventSummeryDTO;

public class EventSummeryRowmapper implements RowMapper<OutReachEventSummeryDTO>{

	public EventSummeryRowmapper() {
		
	}
	@Override
	public OutReachEventSummeryDTO mapRow(RowSet rs) throws Exception {
		if (rs == null || rs.getCurrentRow() == null) {
            return null;
        }
		OutReachEventSummeryDTO OutReachEventSummeryDTO=new OutReachEventSummeryDTO();
		OutReachEventSummeryDTO.setEventId(rs.getColumnValue(0));
		OutReachEventSummeryDTO.setMonth(rs.getColumnValue(1));
		OutReachEventSummeryDTO.setBaseLocation(rs.getColumnValue(2));
		OutReachEventSummeryDTO.setBeneficiaryName(rs.getColumnValue(3));
		OutReachEventSummeryDTO.setVenueAddress(rs.getColumnValue(4));
		OutReachEventSummeryDTO.setCouncilName(rs.getColumnValue(5));
		OutReachEventSummeryDTO.setProject(rs.getColumnValue(6));
		OutReachEventSummeryDTO.setCategory(rs.getColumnValue(7));
		OutReachEventSummeryDTO.setEventName(rs.getColumnValue(8));
		OutReachEventSummeryDTO.setEventDescription(rs.getColumnValue(9));
		OutReachEventSummeryDTO.setEventDate(rs.getColumnValue(10));
		OutReachEventSummeryDTO.setTotalVolunteer(rs.getColumnValue(11));
		OutReachEventSummeryDTO.setTotalVolunteerHour(rs.getColumnValue(12));
		OutReachEventSummeryDTO.setTotalTravleHoures(rs.getColumnValue(13));
		OutReachEventSummeryDTO.setOverallVolunteerHours(rs.getColumnValue(14));
		return OutReachEventSummeryDTO;
	}

}
