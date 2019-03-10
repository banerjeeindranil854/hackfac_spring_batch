package com.hackfac.processoe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.hackfac.DTO.OutReachRegisteredDTO;
import com.hackfac.config.MailConfig;

public class OutReachRegisteredProcessor implements ItemProcessor<OutReachRegisteredDTO, OutReachRegisteredDTO>{
	private static final Logger log = LoggerFactory.getLogger(OutReachRegisteredProcessor.class);
	@Override
    public OutReachRegisteredDTO process(final OutReachRegisteredDTO OutReachRegisteredDTO) throws Exception {
    	
    	final String eventId = OutReachRegisteredDTO.getEventId();
        final String eventName = OutReachRegisteredDTO.getEventName();
        final String beneficiaryName = OutReachRegisteredDTO.getBeneficiaryName();
        final String baseLocation = OutReachRegisteredDTO.getBaseLocation();
        final String eventDate = OutReachRegisteredDTO.getEventDate();
        final String empId = OutReachRegisteredDTO.getEmpId();
        MailConfig MailConfig =new MailConfig();
        //MailConfig.sendMail(empId);
        final OutReachRegisteredDTO transformedOutReachRegisteredDTO = new OutReachRegisteredDTO(eventId, eventName, beneficiaryName,baseLocation,eventDate,empId);

        log.info("Converting (" + OutReachRegisteredDTO + ") into (" + transformedOutReachRegisteredDTO + ")");

        return transformedOutReachRegisteredDTO;
    }
	
}
