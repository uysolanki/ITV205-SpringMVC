package com.itv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itv.model.Player;
import com.itv.model.Student;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model theModel)
	{
		String spouseName="Anushka";
		//theModel.addAttribute("spouse",spouseName);
		Player p1=new Player(7,"Dhoni",100, 5000);
		theModel.addAttribute("csk",p1);
		return "virat"; //return name of view / html/jsp file
	}
	
	@RequestMapping("/welcome")
	public String welcome(ModelMap modelmap)
	{
		 modelmap.addAttribute("team","MI");
		 modelmap.addAttribute("category","Platinum");
		 modelmap.addAttribute("position","Opener");
		return "rohit"; //return name of view / html/jsp file
	}
	
	@RequestMapping("/addStudentForm")
	public String addStudentForm(Model model)
	{
		Student s1=new Student();
		model.addAttribute("emptyStudentObject",s1);
		return "addNewStudent";
	}

	
	@RequestMapping("/saveStudentDetails")
	public String saveStudentDetails(@ModelAttribute Student student,Model model)
	{
		model.addAttribute("abc",student);
		return "itv";
	}

}
