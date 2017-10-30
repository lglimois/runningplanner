package fr.sh.runningplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sh.runningplanner.model.RunTemplate;
import fr.sh.runningplanner.repo.RunTemplateRepository;

@RestController
public class RunTemplateController {
	@Autowired
	RunTemplateRepository repository;
	
	@RequestMapping("/findall")
	public String findAll(){
		String result = "<html>";
		
		for(RunTemplate temp : repository.findAll()){
			result += "<div>" + temp.toString() + "</div>";
		}
		
		return result + "</html>";
	}
	
}
