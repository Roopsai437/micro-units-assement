package com.dxctraining.complaint.dto;

public class ComplaintDto {
	private int id; 
	private String description;
	private int conid;
	private String conname;
	
	public ComplaintDto() {
		
	}
	
	public ComplaintDto(int id, String description) {
		this.id=id;
		this.description=description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getConname() {
		return conname;
	}

	public void setConname(String conname) {
		this.conname = conname;
	}
	

}
