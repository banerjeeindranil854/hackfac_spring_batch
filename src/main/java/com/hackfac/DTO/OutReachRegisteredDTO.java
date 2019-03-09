package com.hackfac.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Contains the information of a single anime
 *
 * @author Michael C Good michaelcgood.com
 */
@Entity
@Table(name = "outreach_registered")
public class OutReachRegisteredDTO {
	@Id
	@Column(name = "event_id")
	private String eventId;
	@Column(name = "event_name")
	private String eventName;
	@Column(name = "beneficiary_name")
	private String beneficiaryName;
	@Column(name = "base_location")
	private String baseLocation;
	@Column(name = "event_date")
	private String eventDate;
	@Column(name = "emp_id")
	private String empId;

	public OutReachRegisteredDTO() {
		super();
	}

	public OutReachRegisteredDTO(String eventId, String eventName, String beneficiaryName, String baseLocation,
			String eventDate, String empId) {
		this.eventId = eventId;
		this.beneficiaryName = beneficiaryName;
		this.baseLocation = baseLocation;
		this.eventDate = eventDate;
		this.empId = empId;
		this.eventName=eventName;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("eventId", this.eventId).append("beneficiaryName", this.beneficiaryName)
				.append("baseLocation", this.baseLocation).append("eventDate", this.eventDate).append("empId", this.empId).toString();
	}

}
