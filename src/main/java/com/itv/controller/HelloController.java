package com.itv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itv.model.Player;
import com.itv.model.Student;
import com.itv.service.PlayerService;

@Controller
public class HelloController {
	
	@Autowired
	PlayerService playerService;
	
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
	
	@RequestMapping("/getAllPlayers")
	public String getAllPlayers(Model model)
	{
		List<Player> players=playerService.listOfPlayers();
		model.addAttribute("khiladis",players);
		return "allplayers"; //return name of view / html/jsp file
	}
	
	
	@RequestMapping("/getPlayer/{myjno}")
	public String getPlayer(@PathVariable("myjno") int j, Model model)
	{
		Player player=playerService.getPlayer(j);
		model.addAttribute("singleplayer",player);
		return "player"; //return name of view / html/jsp file
	}

}
