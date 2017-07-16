package com.recruitment.application.application.domain;


import java.util.Date;
import java.util.List;

public class Candidate {

    private Long resourceId;
    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Address address;
    private ContactsOptions contactsOptions;
    private Position position;
    private List<Skill> candidateSkills;
    private List<Job> jobsList;
    private Status status;

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

    public ContactsOptions getContactsOptions() {
        return contactsOptions;
    }

    public void setContactsOptions(ContactsOptions contactsOptions) {
        this.contactsOptions = contactsOptions;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Skill> getCandidateSkills() {
        return candidateSkills;
    }

    public void setCandidateSkills(List<Skill> candidateSkills) {
        this.candidateSkills = candidateSkills;
    }

    public List<Job> getJobsList() {
        return jobsList;
    }

    public void setJobsList(List<Job> jobsList) {
        this.jobsList = jobsList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "resourceId=" + resourceId +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", contactsOptions=" + contactsOptions +
                ", position=" + position +
                ", candidateSkills=" + candidateSkills +
                ", jobsList=" + jobsList +
                ", status=" + status +
                '}';
    }
}
