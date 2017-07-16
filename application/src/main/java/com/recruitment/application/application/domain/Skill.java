package com.recruitment.application.application.domain;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Table(name = "CAN_SKILL")
public class Skill {

    @Id
    @GenericGenerator(name = "skill_seq",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "skill_seq"),
                    @Parameter(name = "initial_value", value = "0"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skill_seq")
    @Column(name = "ID", nullable = false, unique = true)
    private Long resourceId;
    @Column(name = "SKILL_NAME", nullable = false)
    private String skill;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "resourceId=" + resourceId +
                ", skill='" + skill + '\'' +
                '}';
    }
}
