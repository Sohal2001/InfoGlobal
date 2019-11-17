package com.infoglobal.login.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class IGUserExtention {

    @Id
    private String igUserExtensionId;

    private String firstName;
    private String lastName;
    private String birthDate;
    private String gender;

    public IGUserExtention() {
        this.igUserExtensionId = UUID.randomUUID().toString();
    }

    public String getIgUserExtensionId() {
        return igUserExtensionId;
    }

    public void setIgUserExtensionId(String igUserExtensionId) {
        this.igUserExtensionId = igUserExtensionId;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "IGUserExtention{" +
                "igUserExtensionId='" + igUserExtensionId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
