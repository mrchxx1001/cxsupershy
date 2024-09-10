package com.project.cxsupershy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "safety_scores")
public class SafetyScores {
    @Id
    @Column(name = "score_id")
    private String scoreId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "before_score")
    private int beforeScore;
    @Column(name = "speed_score")
    private int speedScore;
    @Column(name = "legal_score")
    private int legalScore;
    @Column(name = "start_date")
    private Date startDate;

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getBeforeScore() {
        return beforeScore;
    }

    public void setBeforeScore(int beforeScore) {
        this.beforeScore = beforeScore;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "SafetyScores{" +
                "scoreId='" + scoreId + '\'' +
                ", userId='" + userId + '\'' +
                ", beforeScore=" + beforeScore +
                ", speedScore=" + speedScore +
                ", legalScore=" + legalScore +
                ", startDate=" + startDate +
                '}';
    }
}
