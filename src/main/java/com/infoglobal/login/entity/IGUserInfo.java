package com.infoglobal.login.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class IGUserInfo {

    @Id
    private String igUserInfoId;

    private String createdBy;
    private String updatedBy;
    private String createdDate;
    private String updatedDate;

    public IGUserInfo() {
        this.igUserInfoId = UUID.randomUUID().toString();
    }

    public String getIgUserInfoId() {
        return igUserInfoId;
    }

    public void setIgUserInfoId(String igUserInfoId) {
        this.igUserInfoId = igUserInfoId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "IGUserInfo{" +
                "igUserInfoId='" + igUserInfoId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                '}';
    }
}
