package com.lincolnbf.cursomc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SMTPEmailService extends AbstractEmailService {

	@Autowired
	private MailSender mailSender;

	private static final Logger LOG = LoggerFactory.getLogger(SMTPEmailService.class);

	@Override
	public void sendEmail(SimpleMailMessage smm) {
		LOG.info("Enviando email...");
		mailSender.send(smm);
		LOG.info("Email enviado...");
	}

}
