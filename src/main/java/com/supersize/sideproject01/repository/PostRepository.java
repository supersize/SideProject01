package com.supersize.sideproject01.repository;

import com.supersize.sideproject01.domain.Post;
import com.supersize.sideproject01.repository.customs.PostRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
  * explanation
  * @author 김재형
  * @date 2025-02-14
  *
  */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer>, PostRepositoryCustom {
}
