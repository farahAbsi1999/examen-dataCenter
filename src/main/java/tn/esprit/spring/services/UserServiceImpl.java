package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repositories.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public void ajouterUser(User user) {
		userRepository.save(user);
	}

}
