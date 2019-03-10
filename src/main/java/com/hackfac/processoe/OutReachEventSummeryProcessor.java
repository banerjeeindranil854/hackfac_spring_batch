package com.hackfac.processoe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.hackfac.DTO.OutReachEventSummeryDTO;
import com.hackfac.DTO.OutReachNotRegisteredDTO;
import com.hackfac.config.MailConfig;

public class OutReachEventSummeryProcessor implements ItemProcessor<OutReachEventSummeryDTO, OutReachEventSummeryDTO> {
	private static final Logger log = LoggerFactory.getLogger(OutReachEventSummeryProcessor.class);

	@Override
	public OutReachEventSummeryDTO process(final OutReachEventSummeryDTO OutReachEventSummeryDTO) throws Exception {

		final String eventId = OutReachEventSummeryDTO.getEventId();
		final String month = OutReachEventSummeryDTO.getMonth();
		final String baseLocation = OutReachEventSummeryDTO.getBaseLocation();
		final String beneficiaryName = OutReachEventSummeryDTO.getBeneficiaryName();
		final String venueAddress = OutReachEventSummeryDTO.getVenueAddress();
		final String councilName = OutReachEventSummeryDTO.getCouncilName();
		final String project = OutReachEventSummeryDTO.getProject();
		final String category = OutReachEventSummeryDTO.getCategory();
		final String eventName = OutReachEventSummeryDTO.getEventName();
		final String eventDescription = OutReachEventSummeryDTO.getEventDescription();
		final String eventDate = OutReachEventSummeryDTO.getEventDate();
		final String totalVolunteer = OutReachEventSummeryDTO.getTotalVolunteer();
		final String totalVolunteerHour = OutReachEventSummeryDTO.getTotalVolunteerHour();
		final String totalTravleHoures = OutReachEventSummeryDTO.getTotalTravleHoures();
		final String overallVolunteerHours = OutReachEventSummeryDTO.getOverallVolunteerHours();
		final OutReachEventSummeryDTO transformedOutReachNotRegisteredDTO = new OutReachEventSummeryDTO(eventId, month,
				baseLocation, beneficiaryName, venueAddress, councilName, project, category, eventName,
				eventDescription, eventDate, totalVolunteer,totalVolunteerHour, totalTravleHoures, overallVolunteerHours);

		log.info("Converting (" + OutReachEventSummeryDTO + ") into (" + transformedOutReachNotRegisteredDTO + ")");

		return transformedOutReachNotRegisteredDTO;
	}

}
