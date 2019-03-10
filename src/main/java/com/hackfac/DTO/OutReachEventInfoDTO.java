package com.hackfac.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "outreach_event_info")
public class OutReachEventInfoDTO {
	
	@Column(name = "event_id")
	private String eventId;

	@Column(name = "base_location")
	private String baseLocation;

	@Column(name = "beneficiary_name")
	private String beneficiaryName;

	@Column(name = "council_name")
	private String councilName;

	@Column(name = "event_name")
	private String eventName;

	@Column(name = "event_description")
	private String eventDescription;

	@Column(name = "event_date")
	private String eventDate;
	@Id
	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "volunteer_hour")
	private String volunteerHour;

	@Column(name = "travle_houres")
	private String travleHoures;

	@Column(name = "lives_impacted")
	private String livesImpacted;

	@Column(name = "business_unit")
	private String businessUnit;

	@Column(name = "status")
	private String status;

	@Column(name = "iiep_category")
	private String iIEPCategory;

	public OutReachEventInfoDTO() {
		super();
	}

	public OutReachEventInfoDTO(String eventId, String baseLocation, String beneficiaryName, String councilName,
			String eventName, String eventDescription, String eventDate, String empId, String empName,
			String volunteerHour, String travleHoures, String livesImpacted, String businessUnit, String status,
			String iIEPCategory) {
		this.eventId = eventId;
		this.baseLocation = baseLocation;
		this.beneficiaryName = beneficiaryName;
		this.councilName = councilName;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.empId = empId;
		this.empName = empName;
		this.volunteerHour = volunteerHour;
		this.travleHoures = travleHoures;
		this.livesImpacted = livesImpacted;
		this.businessUnit = businessUnit;
		this.status = status;
		this.iIEPCategory = iIEPCategory;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
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

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getVolunteerHour() {
		return volunteerHour;
	}

	public void setVolunteerHour(String volunteerHour) {
		this.volunteerHour = volunteerHour;
	}

	public String getTravleHoures() {
		return travleHoures;
	}

	public void setTravleHoures(String travleHoures) {
		this.travleHoures = travleHoures;
	}

	public String getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(String livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIIEPCategory() {
		return iIEPCategory;
	}

	public void setIIEPCategory(String iIEPCategory) {
		this.iIEPCategory = iIEPCategory;
	}

	
}
