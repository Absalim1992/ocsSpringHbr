package com.cruds.ocsspringhbr.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.cruds.ocsspringhbr.model.Doctor;
import com.cruds.ocsspringhbr.model.Register;



@Repository("ocsDAO")
public class OcsDAOImpl extends AbstractDao<Integer, Register> implements OcsDAO{

	
	//Register
	public void create(Register r) {
		persist(r);
         
	}

	
	
}