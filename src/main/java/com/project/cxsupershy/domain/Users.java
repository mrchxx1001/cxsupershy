package com.project.cxsupershy.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "user_id")
    private String userId;
    private String username;
    private String icon;
    @Column(name = "face_embedding")
    private String faceEmbedding;
    @Column(name = "seat_position")
    private String seatPosition;
    @Column(name = "mirror_angle_back")
    private String mirrorAngleBack;
    @Column(name = "mirror_angle_side")
    private String mirrorAngleSide;
    private String display;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getFaceEmbedding() {
        return faceEmbedding;
    }

    public void setFaceEmbedding(String faceEmbedding) {
        this.faceEmbedding = faceEmbedding;
    }

    public String getSeatPosition() {
        return seatPosition;
    }

    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    public String getMirrorAngleBack() {
        return mirrorAngleBack;
    }

    public void setMirrorAngleBack(String mirrorAngleBack) {
        this.mirrorAngleBack = mirrorAngleBack;
    }

    public String getMirrorAngleSide() {
        return mirrorAngleSide;
    }

    public void setMirrorAngleSide(String mirrorAngleSide) {
        this.mirrorAngleSide = mirrorAngleSide;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", icon='" + icon + '\'' +
                ", faceEmbedding='" + faceEmbedding + '\'' +
                ", seatPosition='" + seatPosition + '\'' +
                ", mirrorAngleBack='" + mirrorAngleBack + '\'' +
                ", mirrorAngleSide='" + mirrorAngleSide + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
