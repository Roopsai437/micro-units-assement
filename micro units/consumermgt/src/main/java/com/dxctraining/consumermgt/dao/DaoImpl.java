package com.dxctraining.consumermgt.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.dxctraining.consumermgt.entites.Consumer;
import com.dxctraining.consumermgt.exceptions.ConsumerNotFoundException;



@Repository
public class DaoImpl implements Dao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Consumer findConsumerById(int id) {
		Consumer consumer = em.find(Consumer.class, id);
		if (consumer == null) {
			throw new ConsumerNotFoundException("Consumer not found for id= " + id);
		}
		return consumer;
	}

	@Override
	public Consumer add(Consumer consumer) {
		em.persist(consumer);
		return consumer;
	}

	@Override
	public Consumer remove(int id) {
		Consumer consumer = findConsumerById(id);
		em.remove(consumer);
		return consumer;
	}

	@Override
	public List<Consumer> allConsumers() {
		String jpaql = "from Consumer ";
		TypedQuery<Consumer> query = em.createQuery(jpaql, Consumer.class);
		List<Consumer> list = query.getResultList();
		return list;
	}

}