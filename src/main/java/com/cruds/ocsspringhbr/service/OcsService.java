package com.cruds.ocsspringhbr.service;

import java.util.List;

import com.cruds.ocsspringhbr.model.Doctor;
import com.cruds.ocsspringhbr.model.Register;

public interface OcsService {
	public void create(Register r);
	public void adddoctor(Doctor d);
	public List<Doctor> getAllDoctor();
	public void delDoctor(String str);
	
	Doctor findDoctorByDid(String did);
	
	void updateDoctor(Doctor doctor);
}
