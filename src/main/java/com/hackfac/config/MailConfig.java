package com.hackfac.config;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailConfig {
	private static final Logger log = LoggerFactory.getLogger(MailConfig.class);
	public void sendMail(String userId) {
		final Logger log = LoggerFactory.getLogger(MailConfig.class);
		final String fromEmail = "banerjeeindranil854@gmail.com"; // requires valid gmail id
		final String password = "give your password"; // correct password for gmail id
		final String toEmail = userId + "@cognizant.com"; // can be any email id

		log.info("SSLEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
		props.put("mail.smtp.socketFactory.port", "465"); // SSL Port
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // SSL Factory Class
		props.put("mail.smtp.auth", "true"); // Enabling SMTP Authentication
		props.put("mail.smtp.port", "465"); // SMTP Port

		Authenticator auth = new Authenticator() {
			// override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};

		Session session = Session.getDefaultInstance(props, auth);
		log.info("Session created");
		EmailUtil.sendEmail(session, toEmail, "SSLEmail Testing Subject", "SSLEmail Testing Body");
	}
}
