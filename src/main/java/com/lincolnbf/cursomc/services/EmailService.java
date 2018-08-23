package com.lincolnbf.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.lincolnbf.cursomc.domain.Pedido;

public interface EmailService {

	public void sendOrderConfirmationEmail(Pedido obj);

	public void sendEmail(SimpleMailMessage smm);

	public void sendOrderConfirmationHtmlEmail(Pedido obj);

	public void sendHtmlEmail(MimeMessage mm);

}
