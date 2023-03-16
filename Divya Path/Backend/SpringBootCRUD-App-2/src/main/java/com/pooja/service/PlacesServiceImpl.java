package com.pooja.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pooja.dao.PlacesDao;
import com.pooja.model.Places;

@Service 
public class PlacesServiceImpl implements PlacesService {
	
	@Autowired
	private PlacesDao placesDao;

	@Override
	public void add(Places place) {
		placesDao.save(place);
	}

	@Override
	public void modify(Places place) {
		 placesDao.save(place);
	}

	@Override
	public void removeById(int id) {
		placesDao.deleteById(id);
	}

	@Override
	public Places getById(int id) {
		Optional<Places> opt = placesDao.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Places> getAll() {
		Iterable<Places> itr = placesDao.findAll();
		List<Places> lst = new ArrayList<Places>();
		itr.forEach(ele->lst.add(ele));
		return lst;
	}
 
}
