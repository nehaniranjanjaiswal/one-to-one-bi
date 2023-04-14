package com.jsp.vehicle.chasis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("neha");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Vehicle v1=new Vehicle();
	v1.setName("scooty");
	v1.setBrand("abc");
	v1.setColor("grey");
	v1.setPrice(400000);
	
	Chasis c1=new Chasis();
	c1.setChasisno("xcvbnm0987654");
	c1.setVehicle1(v1);
	v1.setChasis1(c1);
	
	et.begin();
	em.persist(c1);
	em.persist(v1);
	et.commit();
}
}
