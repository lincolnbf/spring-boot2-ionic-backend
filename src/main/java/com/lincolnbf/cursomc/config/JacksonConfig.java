package com.lincolnbf.cursomc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lincolnbf.cursomc.domain.PagamentoComBoleto;
import com.lincolnbf.cursomc.domain.PagamentoComCartao;

@Configuration
public class JacksonConfig {
	@Bean
	public Jackson2ObjectMapperBuilder objectMapperBuilder() {
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder() {
			public void configure(ObjectMapper ObjectMapper) {
				ObjectMapper.registerSubtypes(PagamentoComCartao.class);
				ObjectMapper.registerSubtypes(PagamentoComBoleto.class);
				super.configure(ObjectMapper);
			};
		};
		return builder;
	}
}
