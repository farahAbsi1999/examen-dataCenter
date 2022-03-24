package tn.esprit.spring.services;

import tn.esprit.spring.entities.User;

public interface IUserService {

	void ajouterUser(User user);
	void deleteUser(Integer id);

}
