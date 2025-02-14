package com.supersize.sideproject01.service;

import com.supersize.sideproject01.domain.User;
import com.supersize.sideproject01.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * explanation
 *
 * @author 김재형
 * @date 2025-02-14
 */
@Service
@AllArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public User addUser(User user) {
        if (user == null) { return null; }

        user.setCreatedDtm(Timestamp.valueOf(LocalDateTime.now()));
        user.setUpdatedDtm(Timestamp.valueOf(LocalDateTime.now()));
        User result = null;
        try {
            result = this.userRepository.save(user);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        return user;
    }



    public List<User> findUsersWithPosts() {

//        this.userRepository.findUsersWithPosts();

        return null;
    }

}
