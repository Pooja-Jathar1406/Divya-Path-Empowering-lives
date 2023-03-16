package com.pooja.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pooja.model.Jobs;

@Repository
public interface JobsDao extends JpaRepository<Jobs, Integer> {

}
