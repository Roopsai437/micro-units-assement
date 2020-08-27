package com.dxctraining.consumermgt.service;

import java.util.List;

import com.dxctraining.consumermgt.entites.Consumer;

public interface IService {
	public Consumer findConsumerById(int id);
	public Consumer add(Consumer consumer);
	public Consumer remove(int id);
	public List<Consumer> allConsumers();
	public void validate(Object obj);
}
