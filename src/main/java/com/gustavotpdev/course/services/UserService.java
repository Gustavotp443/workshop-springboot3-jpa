package com.gustavotpdev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavotpdev.course.entities.User;
import com.gustavotpdev.course.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();	//Se o valor existir ele retorna pelo .get()
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		//Vai deixar um objeto apenas monitorado pelo JPA, melhor do que ter que instanciar trazendo o obj do BD
		User entity = repository.getReferenceById(id);	
		updateData(entity, obj);	
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		//EU APENAS RESTRINJO A ATT A ESSES CAMPOS
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
