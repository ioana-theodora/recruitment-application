package com.recruitment.application.application.domain;


public class Position {

    private Long resourceId;
    private String positionName;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "Position{" +
                "resourceId=" + resourceId +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
