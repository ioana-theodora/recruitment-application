package com.recruitment.application.application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "CAN_CONTACT")
public class Contact {

	@Id
	@GenericGenerator(name = "cont_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "cont_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cont_seq")
	@Column(name = "ID", nullable = false, unique = true)
	private Long resourceID;

	@Column(name = "CONT_PHONE_NUMBER")
	@Size(max = 256)
	private String phoneNumber;

	@Column(name = "CONT_FACEBOOK")
	@Size(max = 256)
	private String facebook;

	@Column(name = "CONT_LINKDIN")
	@Size(max = 256)
	private String linkedIn;

	@Column(name = "CONT_SKYPE")
	@Size(max = 256)
	private String skype;

	public Long getResourceID() {
		return resourceID;
	}

	public void setResourceID(Long resourceID) {
		this.resourceID = resourceID;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	@Override
	public String toString() {
		return "Contact [resourceID=" + resourceID + ", phoneNumber=" + phoneNumber + ", facebook=" + facebook
				+ ", linkedIn=" + linkedIn + ", skype=" + skype + "]";
	}



}
