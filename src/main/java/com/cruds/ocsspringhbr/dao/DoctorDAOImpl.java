package com.cruds.ocsspringhbr.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cruds.ocsspringhbr.model.Doctor;


@Repository("doctorDAO")
public class DoctorDAOImpl extends AbstractDao<Integer, Doctor> implements DoctorDAO{
	
	public void adddoctor(Doctor d) {
		persist(d);
	}

	@SuppressWarnings("unchecked")
	public List<Doctor> getAllDoctor() {
		Criteria criteria = createEntityCriteria();
		return (List<Doctor>) criteria.list();
	}

	@Override
	public void delDoctor(String doctorID) {
		Query query = getSession().createSQLQuery("delete from doctor where doctorID = :doctorID");
		query.setString("doctorID", doctorID);
		query.executeUpdate();
		
	}

	@Override
	public Doctor findDoctorByDid(String did) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("doctorID", did));
		return (Doctor) criteria.uniqueResult();
	}

}
