package com.itspace.kinogospringcommon.service;

import com.itspace.kinogospringcommon.model.entity.User;

import javax.mail.MessagingException;
import java.util.Optional;

public interface UserService {

    User save(User user) throws MessagingException;
    void verifyUser(String email, String token) throws Exception;

    Optional<User> findByEmail(String email);

    User update(User id);
}
