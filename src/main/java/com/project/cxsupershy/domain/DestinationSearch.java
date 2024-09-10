package com.project.cxsupershy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "destination_search")
public class DestinationSearch {
    @Id
    @Column(name = "destination_id")
    private String destinationId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "destination_addr")
    private String destinationAddr;
    @Column(name = "search_date")
    private Date searchDate;

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDestinationAddr() {
        return destinationAddr;
    }

    public void setDestinationAddr(String destinationAddr) {
        this.destinationAddr = destinationAddr;
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }

    @Override
    public String toString() {
        return "DestinationSearch{" +
                "destinationId='" + destinationId + '\'' +
                ", userId='" + userId + '\'' +
                ", destinationAddr='" + destinationAddr + '\'' +
                ", searchDate=" + searchDate +
                '}';
    }
}
