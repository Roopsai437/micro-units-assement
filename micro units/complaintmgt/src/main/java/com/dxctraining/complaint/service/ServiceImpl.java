package com.dxctraining.complaint.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.complaint.dao.Dao;
import com.dxctraining.complaint.entites.Complaint;
import com.dxctraining.complaint.exceptions.InvalidArgumentException;


@Transactional
@Service
public class ServiceImpl implements IService{
	
	@Autowired
	private Dao dao;

	@Override
	public Complaint findComplaintById(int id) {
		validate(id);
		Complaint complaint=dao.findComplaintById(id);
		return complaint;
	}

	@Override
	public Complaint add(Complaint complaint) {
		validate(complaint);
		dao.add(complaint);
		return complaint;
	}

	@Override
	public Complaint remove(int id) {
		validate(id);
		Complaint complaint=dao.remove(id);
		return complaint;
	}

	@Override
	public List<Complaint> allComplaints() {
		List<Complaint>complaint=dao.allComplaints();
		return complaint;
	}

	@Override
	public void validate(Object obj) {
		if(obj==null) {
			throw new InvalidArgumentException("Argument not found");
		}
	}

	@Override
	public List<Complaint> allComplaintsByConsumer(int consumerId) {
		List<Complaint> list=dao.allComplaintsByConsumer(consumerId);
		return list;
	}

}