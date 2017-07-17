package com.recruitment.application.application.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Table(name = "CAN_STATUS")
public class Status {

    @Id
    @GenericGenerator(name = "status_seq",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "status_seq"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "status_seq")
    @Column(name = "ID", nullable = false, unique = true)
    private Long resourceId;
    @Column(name = "STS_NAME", nullable = false)
    private String status;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "resourceId=" + resourceId +
                ", status='" + status + '\'' +
                '}';
    }
}
