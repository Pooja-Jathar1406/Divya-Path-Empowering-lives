package com.pooja.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pooja.model.Places;

@Service
public interface PlacesService {

	void add(Places place);
	void modify(Places place);
	void removeById(int id);
	Places getById(int id);
	List<Places> getAll();
	 
}
