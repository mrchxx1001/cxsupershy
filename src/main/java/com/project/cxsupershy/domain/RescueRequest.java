package com.project.cxsupershy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "rescue_request")
public class RescueRequest {

    @Id
    @Column(name = "rescue_id")
    private String rescueId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "request_date")
    private Date requestDate;
    @Column(name = "approval_YN")
    private boolean approvalYN;

    public String getRescueId() {
        return rescueId;
    }

    public void setRescueId(String rescueId) {
        this.rescueId = rescueId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public boolean isApprovalYN() {
        return approvalYN;
    }

    public void setApprovalYN(boolean approvalYN) {
        this.approvalYN = approvalYN;
    }

    @Override
    public String toString() {
        return "RescueRequest{" +
                "rescueId='" + rescueId + '\'' +
                ", userId='" + userId + '\'' +
                ", requestDate=" + requestDate +
                ", approvalYN=" + approvalYN +
                '}';
    }
}
