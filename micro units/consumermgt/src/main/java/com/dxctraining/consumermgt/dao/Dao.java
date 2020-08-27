package com.dxctraining.consumermgt.dao;

import java.util.List;

import com.dxctraining.consumermgt.entites.Consumer;

public interface Dao {

	public Consumer findConsumerById(int id);
	public Consumer add(Consumer consumer);
	public Consumer remove(int id);
	public List<Consumer> allConsumers();
}
