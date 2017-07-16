package com.recruitment.application.application.domain;


public class Job {

    private Long resourceId;
    private String jobName;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "Job{" +
                "resourceId=" + resourceId +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
