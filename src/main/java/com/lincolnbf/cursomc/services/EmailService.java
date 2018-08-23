package com.lincolnbf.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.lincolnbf.cursomc.domain.Pedido;

public interface EmailService {
	
	public void sendOrderConfirmationEmail(Pedido obj);	
	
	public void sendEmail (SimpleMailMessage smm);
	
}
