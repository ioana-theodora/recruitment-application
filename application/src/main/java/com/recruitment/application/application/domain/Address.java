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
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "CAN_ADDRESS")
public class Address {

	@Id
	@GenericGenerator(name = "add_seq", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "add_seq"), @Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1") })
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "add_seq")
	@Column(name = "ID", nullable = false, unique = true)
    private Long resourceId;

	@Column(name = "ADD_COUNTRY")
	@Size(max = 256)
	@NotEmpty
	private String country;
	
	@Column(name = "ADD_REGION")
	@Size(max = 256)
	@NotEmpty
    private String region;
	
	@Column(name = "ADD_CITY")
	@Size(max = 256)
	@NotEmpty
    private String city;
	
	@Column(name = "ADD_STREET")
	@Size(max = 256)
	@NotEmpty
    private String street;
	
	@Column(name = "ADD_NUMBER")
	@Size(max = 256)
	@NotEmpty
    private String number;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

	@Override
	public String toString() {
		return "Address [resourceId=" + resourceId + ", country=" + country + ", region=" + region + ", city=" + city
				+ ", street=" + street + ", number=" + number + "]";
	}

    
    
}
