package com.supersize.sideproject01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-07
 */
@Entity
@Table(name = "user", schema = "test")
@Data
public class User {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "role")
    private String role;
    @Column(name = "isused")
    private boolean isUsed;
    @Column(name = "level")
    private String level;
    @Column(name = "created_dtm")
    private Timestamp createdDtm;
    @Column(name = "update_dtm")
    private Timestamp updatedDtm;
}



