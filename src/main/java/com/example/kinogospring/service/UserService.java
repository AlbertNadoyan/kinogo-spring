package com.example.kinogospring.service;

import com.example.kinogospring.entity.User;
import com.example.kinogospring.exception.DuplicateResourceException;

import javax.mail.MessagingException;

public interface UserService {
    void save(User user) throws DuplicateResourceException, MessagingException;

    void verifyUser(String mail, String token) throws Exception;
}
