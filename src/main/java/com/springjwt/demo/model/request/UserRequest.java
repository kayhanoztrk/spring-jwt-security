package com.springjwt.demo.model.request;

import lombok.Data;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
@Data
public class UserRequest {
    private String username;
    private String password;
}
