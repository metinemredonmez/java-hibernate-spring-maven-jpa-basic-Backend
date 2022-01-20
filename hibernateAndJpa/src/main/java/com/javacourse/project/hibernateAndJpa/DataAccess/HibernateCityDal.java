package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;

//jPA- ORM



public class HibernateCityDal implements ICityDal{
	
	
	private EntityManager entityManager;
	
	
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		
		
		this.entityManager = entityManager;
	}
	
	
	
	
//AOP ASPECT ORIENTED PROGRAMING 
	
	
	@Override
	@Transactional
	public List<City> getAll() {
		
	Session session = entityManager.unwrap(Session.class);
	List<City> cities =  session.createQuery("from city", City.class).getResultList();
	return  cities;
		
	}

		
		
	

	@Override
	public void add(City city) {
		
		
	}

	@Override
	public void update(City city) {
		
		
	}

	@Override
	public void delete(City city) {
		
		
	}
	
	

}
