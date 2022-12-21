package com.springjwt.demo.exception;

/**
 * @author Kayhan Öztürk
 * @version 0.1
 * @since 0.1
 */
public class UserNotFoundException extends NotFoundException{

    public UserNotFoundException(Long id){
        super(String.format("User with %s id could not found", id));
    }
    
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
