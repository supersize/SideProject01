package com.supersize.sideproject01.repository;

import com.supersize.sideproject01.domain.User;
import com.supersize.sideproject01.repository.customs.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-14
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>, UserRepositoryCustom { }
