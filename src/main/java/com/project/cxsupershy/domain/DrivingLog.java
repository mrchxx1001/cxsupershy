package com.project.cxsupershy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "driving_log")
public class DrivingLog {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "body_temperature")
    private double bodyTemperature;
    @Column(name = "heart_rate")
    private int hearRate;
    @Column(name = "is_vulnerable")
    private boolean isVulnerable;
    @Column(name = "speed_score")
    private int speedScore;
    @Column(name = "legal_score")
    private int legalScore;
    @Column(name = "log_date")
    private Date logDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getHearRate() {
        return hearRate;
    }

    public void setHearRate(int hearRate) {
        this.hearRate = hearRate;
    }

    public boolean isVulnerable() {
        return isVulnerable;
    }

    public void setVulnerable(boolean vulnerable) {
        isVulnerable = vulnerable;
    }

    public int getSpeedScore() {
        return speedScore;
    }

    public void setSpeedScore(int speedScore) {
        this.speedScore = speedScore;
    }

    public int getLegalScore() {
        return legalScore;
    }

    public void setLegalScore(int legalScore) {
        this.legalScore = legalScore;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Override
    public String toString() {
        return "DrivingLog{" +
                "userId='" + userId + '\'' +
                ", bodyTemperature=" + bodyTemperature +
                ", hearRate=" + hearRate +
                ", isVulnerable=" + isVulnerable +
                ", speedScore=" + speedScore +
                ", legalScore=" + legalScore +
                ", logDate=" + logDate +
                '}';
    }
}
