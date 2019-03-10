package com.hackfac.processoe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.hackfac.DTO.OutReachEventInfoDTO;
import com.hackfac.DTO.OutReachEventSummeryDTO;

public class OutReachEventInfoProcessor implements ItemProcessor<OutReachEventInfoDTO, OutReachEventInfoDTO> {
	private static final Logger log = LoggerFactory.getLogger(OutReachEventInfoProcessor.class);

	@Override
	public OutReachEventInfoDTO process(final OutReachEventInfoDTO OutReachEventInfoDTO) throws Exception {

		final String eventId = OutReachEventInfoDTO.getEventId();
		final String baseLocation = OutReachEventInfoDTO.getBaseLocation();
		final String beneficiaryName = OutReachEventInfoDTO.getBeneficiaryName();
		final String councilName = OutReachEventInfoDTO.getCouncilName();
		final String eventName = OutReachEventInfoDTO.getEventName();
		final String eventDescription = OutReachEventInfoDTO.getEventDescription();
		final String eventDate = OutReachEventInfoDTO.getEventDate();
		final String empId = OutReachEventInfoDTO.getEmpId();
		final String empName = OutReachEventInfoDTO.getEmpName();
		final String volunteerHour = OutReachEventInfoDTO.getVolunteerHour();
		final String travleHoures = OutReachEventInfoDTO.getTravleHoures();
		final String livesImpacted = OutReachEventInfoDTO.getLivesImpacted();
		final String businessUnit = OutReachEventInfoDTO.getBusinessUnit();
		final String status = OutReachEventInfoDTO.getStatus();
		final String iIEPCategory = OutReachEventInfoDTO.getIIEPCategory();
		final OutReachEventInfoDTO transformedOutReachEventInfoDTO = new OutReachEventInfoDTO(eventId, baseLocation,
				beneficiaryName, councilName, eventName, eventDescription, eventDate, empId, empName, volunteerHour,
				travleHoures, livesImpacted, businessUnit, status, iIEPCategory);

		log.info("Converting (" + OutReachEventInfoDTO + ") into (" + transformedOutReachEventInfoDTO + ")");

		return transformedOutReachEventInfoDTO;
	}

}
