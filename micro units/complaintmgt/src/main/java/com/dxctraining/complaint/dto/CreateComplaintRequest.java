package com.dxctraining.complaint.dto;

public class CreateComplaintRequest {
	private String description;

	private int conid;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getConid() {
		return conid;
	}

	public void setConid(int conid) {
		this.conid = conid;
	}
}
