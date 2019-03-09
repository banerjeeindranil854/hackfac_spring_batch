package com.hackfac.rowmapper;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;

import com.hackfac.DTO.OutReachNotRegisteredDTO;

public class NonRegisterUserRowmapper implements RowMapper<OutReachNotRegisteredDTO>{

	public NonRegisterUserRowmapper() {
		
	}
	@Override
	public OutReachNotRegisteredDTO mapRow(RowSet rs) throws Exception {
		if (rs == null || rs.getCurrentRow() == null) {
            return null;
        }
		OutReachNotRegisteredDTO OutReachNotRegisteredDTO=new OutReachNotRegisteredDTO();
		OutReachNotRegisteredDTO.setEmpId(rs.getColumnValue(5));
		OutReachNotRegisteredDTO.setEventDate(rs.getColumnValue(4));
		OutReachNotRegisteredDTO.setBeneficiaryName(rs.getColumnValue(2));
		OutReachNotRegisteredDTO.setBaseLocation(rs.getColumnValue(3));
		OutReachNotRegisteredDTO.setEventName(rs.getColumnValue(1));
		OutReachNotRegisteredDTO.setEventId(rs.getColumnValue(0));
		return OutReachNotRegisteredDTO;
	}

}
