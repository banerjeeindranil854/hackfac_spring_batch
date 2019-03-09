package com.hackfac.rowmapper;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.hackfac.DTO.OutReachRegisteredDTO;

public class RegisterUserRowmapper implements RowMapper<OutReachRegisteredDTO>{

	public RegisterUserRowmapper() {
		
	}
	@Override
	public OutReachRegisteredDTO mapRow(RowSet rs) throws Exception {
		if (rs == null || rs.getCurrentRow() == null) {
            return null;
        }
		OutReachRegisteredDTO OutReachRegisteredDTO=new OutReachRegisteredDTO();
		OutReachRegisteredDTO.setEmpId(rs.getColumnValue(5));
		OutReachRegisteredDTO.setEventDate(rs.getColumnValue(4));
		OutReachRegisteredDTO.setBeneficiaryName(rs.getColumnValue(2));
		OutReachRegisteredDTO.setBaseLocation(rs.getColumnValue(3));
		OutReachRegisteredDTO.setEventName(rs.getColumnValue(1));
		OutReachRegisteredDTO.setEventId(rs.getColumnValue(0));
		return OutReachRegisteredDTO;
	}

}
