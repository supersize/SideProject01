package com.supersize.sideproject01.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-12
 */
@Entity(name = "post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "psot_id")
    private String postId;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "created_dtm")
    private Timestamp createdDtm;
    @Column(name = "update_dtm")
    private Timestamp updatedDtm;
}