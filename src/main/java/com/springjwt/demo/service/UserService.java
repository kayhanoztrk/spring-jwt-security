package com.springjwt.demo.service;

import com.springjwt.demo.entity.User;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public interface UserService {
    User findByUsername(String username);
    User createUser(User user);
    User findById(Long id);
}
