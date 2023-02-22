package com.gustavotpdev.course.repositories;

import com.gustavotpdev.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

// <TIPO DE ENTIDADE, TIPO DO ID>
public interface UserRespository extends JpaRepository<User,Long>{
	
	//SO COM ESSA DEFINIÇÃO JÁ ESTÁ PRONTO POR CONTA DO JPAREPOSITORY
}
