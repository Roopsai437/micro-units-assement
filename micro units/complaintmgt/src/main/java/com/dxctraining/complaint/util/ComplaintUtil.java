package com.dxctraining.complaint.util;

import org.springframework.stereotype.Component;

import com.dxctraining.complaint.dto.ComplaintDto;
import com.dxctraining.complaint.entites.Complaint;


@Component
public class ComplaintUtil {

	public ComplaintDto complaintDto(Complaint complaint, int consumerId, String consumerName) {
		ComplaintDto dto=new ComplaintDto(complaint.getId(),complaint.getDes());
		dto.setConid(consumerId);
		dto.setConname(consumerName);
		return dto;
	}
	
}
