package com.pooja.service;

import java.util.List;

import com.pooja.model.Grievance;
import com.pooja.model.User;

public interface GrievanceService {
	
	void add(Grievance griev); 
	Grievance getById(int id);
	List<Grievance> getAll(); 
	void editById(int id);   
	List<Grievance> getGrievEmail(String email);
	List<Grievance> getByStatus();
 
}
