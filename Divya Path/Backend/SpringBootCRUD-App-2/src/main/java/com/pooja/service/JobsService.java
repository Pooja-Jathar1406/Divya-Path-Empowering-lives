package com.pooja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pooja.model.Jobs;


@Service
public interface JobsService {

	void add(Jobs job); 
	void removeById(int jid);
	Jobs getById(int jid);
	List<Jobs> getAll();
	List<Jobs> getJobList();
}
