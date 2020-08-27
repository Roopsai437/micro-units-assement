package com.dxctraining.consumermgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dxctraining.consumermgt.dto.CreateConsumerRequest;
import com.dxctraining.consumermgt.dto.Dto;
import com.dxctraining.consumermgt.entites.Consumer;
import com.dxctraining.consumermgt.service.IService;

@RestController
@RequestMapping("/consumers")
public class Controller {

	@Autowired
	private IService service;
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Dto add(@RequestBody CreateConsumerRequest request) {
		Consumer consumer=new Consumer();
		consumer.setName(request.getName());
		consumer=service.add(consumer);
		Dto response=toDto(consumer);
		return response;
	}
	@GetMapping("/get/{id}")
	public Dto  findConsumerById(@PathVariable("id") int id){
		Consumer consumer=service.findConsumerById(id);
		Dto response=toDto(consumer);
		return response;
	}
	public Dto toDto(Consumer consumer) {
		Dto dto=new Dto();
		dto.setId(consumer.getId());
		dto.setName(consumer.getName());
		return dto;
				
	}
}
