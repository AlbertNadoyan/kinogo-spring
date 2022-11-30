package com.example.kinogospring.service;

import javax.mail.MessagingException;

public interface MailService {

    public void sendHtmlEmail(String to, String subject, String text) throws MessagingException;
}
