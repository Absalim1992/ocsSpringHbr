package com.cruds.ocsspringhbr.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.ocsspringhbr.model.Doctor;
import com.cruds.ocsspringhbr.model.Register;
import com.cruds.ocsspringhbr.service.OcsService;



@Controller
@RequestMapping("/")
public class AppController {
	@Autowired
	OcsService Service;
	
	@RequestMapping(value={"/register"},method=RequestMethod.GET) 
	public String showRegisterForm(ModelMap model)
	{
		Register r = new Register();
		model.addAttribute("register", r);
		return "register";
	}
	
	@RequestMapping(value={"/register"}, method=RequestMethod.POST)
	public String handleRegisterForm(BindingResult result,@Valid Register r,ModelMap model)
	{		
		System.out.println(r.getUserID()+ " : "+ r.getFirstName() + " : " + r.getLastName() + " : " + r.getDateOfBirth() + " : " + r.getGender() + " : " +
							r.getStreet() + " : " + r.getLocation() + " : " + r.getCity() + " : " + r.getState() + " : " + r.getPincode() + " : " + r.getMobileNo() + " : " +
							r.getEmailID() + " : " + r.getPassword()+ " : " + r.getUserType());
		Service.create(r);
		return "register";
	}
	
	@RequestMapping(value={"/adddoctor"},method=RequestMethod.GET) 
	public String showDoctorForm(ModelMap model)
	{
		Doctor d = new Doctor();
		model.addAttribute("doctor", d);
		model.addAttribute("edit", false);
		return "adddoctor";
	}
	
	@RequestMapping(value="/adddoctor", method=RequestMethod.POST)
	public String addDoctorForm(@Valid  Doctor d,BindingResult result,ModelMap model)
		{
		//Service.adddoctor(d);
		System.out.println(d.getDoctorID()+ " : "+ d.getDoctorName() + " : " + d.getDateOfBirth() + " : " + d.getDateOfJoining() + " : " + d.getGender() + " : " +
				d.getStreet() + " : " + d.getLocation() + " : " + d.getCity() + " : " + d.getState() + " : " + d.getPincode() + " : " + d.getMobileNo() + " : " +
				d.getEmailID() + " : " + d.getQualification()+ " : " + d.getSpecialization()+ " : " + d.getYearsOfExperience());
		Service.adddoctor(d);
		return "redirect:/viewdoctor";
		}
	
	@RequestMapping(value = {"/viewdoctor" }, method = RequestMethod.GET)
	public String listDoctor(ModelMap model) {

		List<Doctor> d = Service.getAllDoctor();
		model.addAttribute("doctor",d );
		return "viewdoctor";
	}
	
	@RequestMapping(value = { "/delete-{doctorID}-doctor" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable String doctorID) {
		Service.delDoctor(doctorID);
		return "redirect:/viewdoctor";
	}
	
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}
	
	@RequestMapping(value = { "/edit-{doctorID}-doctor" }, method = RequestMethod.GET)
	public String editDoctor(@PathVariable String doctorID, ModelMap model) {
		
		Doctor doctor = Service.findDoctorByDid(doctorID);
		System.out.println("SELECTED FOR EDIT : " + doctorID);
		model.addAttribute("doctor", doctor);
		model.addAttribute("edit", true);
		return "adddoctor";
	}
	
	
	@RequestMapping(value = { "/edit-{doctorID}-doctor" }, method = RequestMethod.POST)
	public String updateDoctor(@Valid Doctor doctor, BindingResult result,
			ModelMap model, @PathVariable String doctorID) {

		if (result.hasErrors()) {
			return "adddoctor";
		}
		
		Service.updateDoctor(doctor);
		System.out.println("After update btn : " + doctor.getDoctorID() + " : " + doctor.getDoctorName());
		
		model.addAttribute("success", "Doctor " + doctor.getDoctorID()	+ " updated successfully");
		return "redirect:/viewdoctor";
	}

}
