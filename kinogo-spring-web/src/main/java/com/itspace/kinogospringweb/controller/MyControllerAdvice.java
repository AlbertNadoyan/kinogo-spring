package com.itspace.kinogospringweb.controller;

import com.itspace.kinogospringcommon.model.entity.User;
import com.itspace.kinogospringcommon.security.CurrentUser;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class MyControllerAdvice {

    @ModelAttribute(name = "currentUser")
    public User currentUser(@AuthenticationPrincipal CurrentUser currentUser){
        if(currentUser!=null){
            return currentUser.getUser();
        }
        return null;
    }
}
