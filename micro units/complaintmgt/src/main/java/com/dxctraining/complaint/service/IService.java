package com.dxctraining.complaint.service;

import java.util.List;

import com.dxctraining.complaint.entites.Complaint;

public interface IService {

	public Complaint findComplaintById(int id);
	public Complaint add(Complaint complaint);
	public Complaint remove(int id);
	public List<Complaint> allComplaints();
	public void validate(Object obj);
	public List<Complaint> allComplaintsByConsumer(int consumerId);
}
