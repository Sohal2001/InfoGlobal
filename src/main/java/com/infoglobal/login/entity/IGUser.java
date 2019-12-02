package com.infoglobal.login.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class IGUser {
    @Id
    private String igUserId;
    private String email;
    private String userName;
    private String password;
    private String retired;

    @PrimaryKeyJoinColumn(name="igUserId", referencedColumnName="igUserInfoId")
    @OneToOne(cascade = CascadeType.ALL)
    private IGUserInfo igUserInfo;

    @PrimaryKeyJoinColumn(name = "igUserId", referencedColumnName="igUserExtentionId")
    @OneToOne(cascade = CascadeType.ALL)
    private IGUserExtention igUserExtention;


    public IGUser() {
        this.igUserId = UUID.randomUUID().toString();
    }

    public String getIgUserId() {
        return igUserId;
    }

    public void setIgUserId(String igUserId) {
        this.igUserId = igUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetired() {
        return retired;
    }

    public void setRetired(String retired) {
        this.retired = retired;
    }

    public IGUserInfo getIgUserInfo() {
        return igUserInfo;
    }

    public void setIgUserInfo(IGUserInfo igUserInfo) {
        this.igUserInfo = igUserInfo;
    }

    public IGUserExtention getIgUserExtention() {
        return igUserExtention;
    }

    public void setIgUserExtention(IGUserExtention igUserExtention) {
        this.igUserExtention = igUserExtention;
    }

    @Override
    public String toString() {
        return "IGUser{" +
                "igUserId='" + igUserId + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", retired='" + retired + '\'' +
                ", igUserInfo=" + igUserInfo +
                ", igUserExtention=" + igUserExtention +
                '}';
    }
}
