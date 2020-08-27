package com.dxctraining.complaint.dao;

import java.util.List;

import com.dxctraining.complaint.entites.Complaint;

public interface Dao {
	public Complaint findComplaintById(int id);
	public Complaint add(Complaint complaint);
	public Complaint remove(int id);
	public List<Complaint> allComplaints();
	public List<Complaint> allComplaintsByConsumer(int consumerId);

}
