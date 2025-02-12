package kr.go.forest.map.dpbs.boot.document.sideproject01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-07
 */
@Entity
@Data
public class User {
    @Id
    private String userId;
    private String password;
    private String email;
    private String userName;
    private String role;
    private boolean isUsed;
    private String level;
    private Timestamp createdDtm;
    private Timestamp updatedDtm;
}



