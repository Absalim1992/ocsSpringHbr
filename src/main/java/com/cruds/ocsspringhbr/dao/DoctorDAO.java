package com.cruds.ocsspringhbr.dao;

import java.util.List;

import com.cruds.ocsspringhbr.model.Doctor;

public interface DoctorDAO {
	public void adddoctor(Doctor d);
	public List<Doctor> getAllDoctor();
	public void delDoctor(String str);

	Doctor findDoctorByDid(String did);
}
