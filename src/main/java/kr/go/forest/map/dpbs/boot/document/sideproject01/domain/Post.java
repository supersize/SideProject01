package kr.go.forest.map.dpbs.boot.document.sideproject01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-12
 */
@Entity
@Data
public class Post {
    @Id
    private String postId;
    private String title;
    private String content;
    private String userId;
    private Timestamp createdDtm;
    private Timestamp updatedDtm;
}