package com.hackfac.processoe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.hackfac.DTO.OutReachNotRegisteredDTO;
import com.hackfac.config.MailConfig;

public class OutReachNotRegisteredProcessor implements ItemProcessor<OutReachNotRegisteredDTO, OutReachNotRegisteredDTO>{
	private static final Logger log = LoggerFactory.getLogger(OutReachNotRegisteredProcessor.class);
	@Override
    public OutReachNotRegisteredDTO process(final OutReachNotRegisteredDTO OutReachNotRegisteredDTO) throws Exception {
    	
    	final String eventId = OutReachNotRegisteredDTO.getEventId();
        final String eventName = OutReachNotRegisteredDTO.getEventName();
        final String beneficiaryName = OutReachNotRegisteredDTO.getBeneficiaryName();
        final String baseLocation = OutReachNotRegisteredDTO.getBaseLocation();
        final String eventDate = OutReachNotRegisteredDTO.getEventDate();
        final String empId = OutReachNotRegisteredDTO.getEmpId();
        MailConfig MailConfig =new MailConfig();
        MailConfig.sendMail(empId);
        final OutReachNotRegisteredDTO transformedOutReachNotRegisteredDTO = new OutReachNotRegisteredDTO(eventId, eventName, beneficiaryName,baseLocation,eventDate,empId);

        log.info("Converting (" + OutReachNotRegisteredDTO + ") into (" + transformedOutReachNotRegisteredDTO + ")");

        return transformedOutReachNotRegisteredDTO;
    }
	
}
