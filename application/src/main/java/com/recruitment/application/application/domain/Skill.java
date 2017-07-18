package com.recruitment.application.application.domain;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CAN_SKILL")
public class Skill {

    @Id
    @GenericGenerator(name = "skill_seq",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "skill_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skill_seq")
    @Column(name = "ID", nullable = false, unique = true)
    private Long resourceId;
    
    @Column(name = "SKILL_NAME")
    @Size(max=256)
    @NotEmpty
    private String name;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skill [resourceId=" + resourceId + ", name=" + name + "]";
	}

   
}
