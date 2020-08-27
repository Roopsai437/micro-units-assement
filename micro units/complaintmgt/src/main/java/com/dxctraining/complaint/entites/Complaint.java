package com.dxctraining.complaint.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Complaint {
	@Id
	@GeneratedValue
	private int id;
	private String des;
	private int conid;

	public int getConid() {
		return conid;
	}

	public void setConid(int conid) {
		this.conid = conid;
	}

	public Complaint() {

	}

	public Complaint(String des,int conid) {
		this.des = des;
		this.conid=conid;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || obj != obj.getClass()) {
			return false;
		}
		Complaint that = (Complaint) obj;
		return this.id == that.id;
	}

}
