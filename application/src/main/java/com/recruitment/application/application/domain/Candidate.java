package com.recruitment.application.application.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "CAN_CANDIDATE")
public class Candidate {

	@Id
	@GenericGenerator(name = "cand_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "cand_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cand_seq")
	@Column(name = "ID", nullable = false, unique = true)
	private Long resourceId;

	@Column(name = "CAN_EMAIL")
	@Size(max = 256)
	@NotEmpty
	private String email;

	@Column(name = "CAN_FIRST_NAME")
	@Size(max = 256)
	@NotEmpty
	private String firstName;

	@Column(name = "CAN_LAST_NAME")
	@Size(max = 256)
	@NotEmpty
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CAN_DATE_OF_BIRTH")
	private Date dateOfBirth;

	@OneToOne(fetch = FetchType.LAZY, targetEntity = Address.class)
	@JoinColumn(name = "CAN_ADDRESS_ID")
	private Address address;

	@OneToOne(fetch = FetchType.LAZY, targetEntity = Contact.class)
	@JoinColumn(name = "CAN_CONTACT_ID")
	private Contact contact;

	@OneToOne(fetch = FetchType.LAZY, targetEntity = Position.class)
	@JoinColumn(name = "CAN_POSITION_ID")
	private Position position;

	@OneToOne(fetch = FetchType.LAZY, targetEntity = Skill.class)
	@JoinColumn(name = "CAN_SKILL_ID")
	private Skill skills;

	@OneToOne(fetch = FetchType.LAZY, targetEntity = Job.class)
	@JoinColumn(name = "CAN_JOB_ID")	
	private Job jobs;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Status.class)
	@JoinColumn(name = "CAN_STATUS_ID")
	private Status status;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Cv.class)
	@JoinColumn(name = "CAN_CV_ID")
	private Cv cv;

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Skill getSkills() {
		return skills;
	}

	public void setSkills(Skill skills) {
		this.skills = skills;
	}

	public Job getJobs() {
		return jobs;
	}

	public void setJobs(Job jobs) {
		this.jobs = jobs;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "Candidate [resourceId=" + resourceId + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", contact=" + contact
				+ ", position=" + position + ", skills=" + skills + ", jobs=" + jobs + ", status=" + status + ", cv="
				+ cv + "]";
	}
}
