package com.cruds.ocsspringhbr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cruds.ocsspringhbr.dao.DoctorDAO;
import com.cruds.ocsspringhbr.dao.OcsDAO;
import com.cruds.ocsspringhbr.model.Doctor;
import com.cruds.ocsspringhbr.model.Register;

@Service("ocsService")
@Transactional
public class OcsServiceImpl implements OcsService{
	@Autowired
	private OcsDAO ocsDAO;
	
	@Autowired
	private DoctorDAO doctorDAO;
	
	@Override
	public void create(Register r)
	{
		ocsDAO.create(r);
	}

	@Override
	public void adddoctor(Doctor d) {
		doctorDAO.adddoctor(d);
		
	}

	@Override
	public List<Doctor> getAllDoctor() {
		return doctorDAO.getAllDoctor();
	}

	@Override
	public void delDoctor(String str) {
		doctorDAO.delDoctor(str);
		
	}

	@Override
	public Doctor findDoctorByDid(String did) {
		return doctorDAO.findDoctorByDid(did);
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		Doctor entity = doctorDAO.findDoctorByDid(doctor.getDoctorID());
		System.out.println("MODIFY DOCTOR ID : " + doctor.getDoctorID());
		if(entity!=null){
			entity.setCity(doctor.getCity());
			entity.setDateOfBirth(doctor.getDateOfBirth());
			entity.setDateOfJoining(doctor.getDateOfJoining());
			entity.setDoctorID(doctor.getDoctorID());
			entity.setDoctorName(doctor.getDoctorName());
			entity.setEmailID(doctor.getEmailID());
			entity.setGender(doctor.getGender());
			entity.setLocation(doctor.getLocation());
			entity.setMobileNo(doctor.getMobileNo());
			entity.setPincode(doctor.getPincode());
			entity.setQualification(doctor.getQualification());
			entity.setSpecialization(doctor.getSpecialization());
			entity.setState(doctor.getState());
			entity.setStreet(doctor.getStreet());
			entity.setYearsOfExperience(doctor.getYearsOfExperience());
		}
		
	}

}




