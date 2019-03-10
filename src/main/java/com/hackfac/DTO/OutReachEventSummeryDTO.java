package com.hackfac.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "outreach_event_summery")
public class OutReachEventSummeryDTO {
	@Id
	@Column(name = "event_id")
	private String eventId;

	@Column(name = "month")
	private String month;

	@Column(name = "base_location")
	private String baseLocation;

	@Column(name = "beneficiary_name")
	private String beneficiaryName;

	@Column(name = "venue_address")
	private String venueAddress;

	@Column(name = "council_name")
	private String councilName;

	@Column(name = "project")
	private String project;

	@Column(name = "category")
	private String category;

	@Column(name = "event_name")
	private String eventName;

	@Column(name = "event_description")
	private String eventDescription;

	@Column(name = "event_date")
	private String eventDate;

	@Column(name = "total_volunteer")
	private String totalVolunteer;
	
	@Column(name = "total_volunteer_hour")
	private String totalVolunteerHour;

	@Column(name = "total_travle_houres")
	private String totalTravleHoures;

	@Column(name = "overall_volunteer_hours")
	private String overallVolunteerHours;

	public OutReachEventSummeryDTO() {
		super();
	}

	public OutReachEventSummeryDTO(String eventId, String month, String baseLocation, String beneficiaryName,
			String venueAddress, String councilName, String project, String category, String eventName,
			String eventDescription, String eventDate, String totalVolunteer,String totalVolunteerHour, String totalTravleHoures,
			String overallVolunteerHours) {
		this.eventId = eventId;
		this.month = month;
		this.baseLocation = baseLocation;
		this.beneficiaryName = beneficiaryName;
		this.venueAddress = venueAddress;
		this.councilName = councilName;
		this.totalVolunteerHour=totalVolunteerHour;
		this.project = project;
		this.category = category;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.totalVolunteer = totalVolunteer;
		this.totalTravleHoures = totalTravleHoures;
		this.overallVolunteerHours = overallVolunteerHours;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getTotalVolunteer() {
		return totalVolunteer;
	}

	public void setTotalVolunteer(String totalVolunteer) {
		this.totalVolunteer = totalVolunteer;
	}

	public String getTotalVolunteerHour() {
		return totalVolunteerHour;
	}

	public void setTotalVolunteerHour(String totalVolunteerHour) {
		this.totalVolunteerHour = totalVolunteerHour;
	}

	public String getTotalTravleHoures() {
		return totalTravleHoures;
	}

	public void setTotalTravleHoures(String totalTravleHoures) {
		this.totalTravleHoures = totalTravleHoures;
	}

	public String getOverallVolunteerHours() {
		return overallVolunteerHours;
	}

	public void setOverallVolunteerHours(String overallVolunteerHours) {
		this.overallVolunteerHours = overallVolunteerHours;
	}
}
