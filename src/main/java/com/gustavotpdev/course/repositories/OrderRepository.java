package com.gustavotpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavotpdev.course.entities.Order;

// <TIPO DE ENTIDADE, TIPO DO ID>

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{
	
	//SO COM ESSA DEFINIÇÃO JÁ ESTÁ PRONTO POR CONTA DO JPAREPOSITORY
}
