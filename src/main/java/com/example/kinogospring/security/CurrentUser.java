package com.example.kinogospring.security;

import com.example.kinogospring.entity.User;
import org.springframework.security.core.authority.AuthorityUtils;




public class CurrentUser extends org.springframework.security.core.userdetails.User {


    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPassword(), user.isEnabled(), true, true, true, AuthorityUtils.createAuthorityList(user.getRole().name()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}