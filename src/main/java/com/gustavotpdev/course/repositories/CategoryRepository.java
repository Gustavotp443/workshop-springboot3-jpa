package com.gustavotpdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavotpdev.course.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{
	
}
