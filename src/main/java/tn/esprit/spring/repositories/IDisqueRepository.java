package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Disque;


public interface IDisqueRepository extends CrudRepository<Disque, Integer> {

}
