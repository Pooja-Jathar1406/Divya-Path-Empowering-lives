package com.pooja.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pooja.model.Grievance;
import com.pooja.model.Places;
import com.pooja.model.User;
import com.pooja.service.GrievanceService;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class GrievanceController {	
	
	@Autowired
	private GrievanceService grievanceService;
	
	@PostMapping(value = {"/grievance/add"}) 
	public String grievanceAdd(@RequestBody Grievance grievance) {
		grievanceService.add(grievance);
		return "success";
	}
 

	@PutMapping(value = {"/grievance/update/{id}"})
	public String GrievUpdate(@PathVariable int id) { 
		grievanceService.editById(id);
		return "success";
	}
	
	@PutMapping(value = {"/grievance/update2/{id}"})
	public String GrievUpdate2(@PathVariable int id) { 
		grievanceService.editById(id);
		return "success";
	}
  
	@GetMapping(value = {"/grievance/{id}"})
	public Grievance grievanceGet(@PathVariable int id) {
		return grievanceService.getById(id);
	}
	
	@GetMapping(value = {"/grievancelist"})
	public List<Grievance> grievanceList(){
		return grievanceService.getAll();
	}
 	
//	@GetMapping(value = {"/mygrievancelist/{uid}"})
//	public List<Grievance> grievanceList(int uid){
//		return grievanceService.getGrievancesByUserId(uid);
//	}
	
	@GetMapping(value = {"/griev/pending"})
	public List<Grievance> pendingGrieves(){
		return grievanceService.getByStatus();
	}
 
	@GetMapping(value = {"/mygrievancelist/{email}"})
 	public List<Grievance> userGet(@PathVariable String email) {
 		return grievanceService.getGrievEmail(email);
 	}
	
	
	
	 
}

 
