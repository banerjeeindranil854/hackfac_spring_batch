package com.hackfac.rowmapper;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.hackfac.DTO.OutReachEventInfoDTO;
import com.hackfac.DTO.OutReachEventSummeryDTO;

public class EventInfoRowmapper implements RowMapper<OutReachEventInfoDTO>{

	public EventInfoRowmapper() {
		
	}
	@Override
	public OutReachEventInfoDTO mapRow(RowSet rs) throws Exception {
		if (rs == null || rs.getCurrentRow() == null) {
            return null;
        }
		OutReachEventInfoDTO OutReachEventInfoDTO=new OutReachEventInfoDTO();
		OutReachEventInfoDTO.setEventId(rs.getColumnValue(0));
		OutReachEventInfoDTO.setBaseLocation(rs.getColumnValue(1));
		OutReachEventInfoDTO.setBeneficiaryName(rs.getColumnValue(2));
		OutReachEventInfoDTO.setCouncilName(rs.getColumnValue(3));
		OutReachEventInfoDTO.setEventName(rs.getColumnValue(4));
		OutReachEventInfoDTO.setEventDescription(rs.getColumnValue(5));
		OutReachEventInfoDTO.setEventDate(rs.getColumnValue(6));
		OutReachEventInfoDTO.setEmpId(rs.getColumnValue(7));
		OutReachEventInfoDTO.setEmpName(rs.getColumnValue(8));
		OutReachEventInfoDTO.setVolunteerHour(rs.getColumnValue(9));
		OutReachEventInfoDTO.setTravleHoures(rs.getColumnValue(10));
		OutReachEventInfoDTO.setLivesImpacted(rs.getColumnValue(11));
		OutReachEventInfoDTO.setBusinessUnit(rs.getColumnValue(12));
		OutReachEventInfoDTO.setStatus(rs.getColumnValue(13));
		OutReachEventInfoDTO.setIIEPCategory(rs.getColumnValue(14));
		return OutReachEventInfoDTO;
	}

}
