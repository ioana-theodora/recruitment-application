package com.recruitment.application.application.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CAN_SOCIAL_STATUS")
public class SocialStatus {

    @Id
    @GenericGenerator(name = "social_status_seq",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "social_status_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "social_status_seq")
    @Column(name = "ID", nullable = false, unique = true)
    private Long resourceId;
    
    @Column(name = "SOS_NAME")
    @Size(max=256)
    @NotEmpty
    private String socialStatus;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

	public String getSocialStatus() {
		return socialStatus;
	}

	public void setSocialStatus(String socialStatus) {
		this.socialStatus = socialStatus;
	}

	@Override
	public String toString() {
		return "Status [resourceId=" + resourceId + ", socialStatus=" + socialStatus + "]";
	}

   
}
