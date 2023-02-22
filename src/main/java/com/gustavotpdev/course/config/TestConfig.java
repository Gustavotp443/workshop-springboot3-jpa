package com.gustavotpdev.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gustavotpdev.course.entities.User;
import com.gustavotpdev.course.repositories.UserRespository;

@Configuration
@Profile("test")					//Executa automaticamente quando aplicacao iniciar
public class TestConfig implements CommandLineRunner{
	
	@Autowired			 //proprio spring resolve dependencia e instancia auto
	private UserRespository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));	//saveAll salva uma lista de objetos
		
	}	//Agora tudo que eu colocar aqui vai ser executado quando a app iniciar
	
	
}
