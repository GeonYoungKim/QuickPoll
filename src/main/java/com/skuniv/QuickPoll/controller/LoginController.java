package com.skuniv.QuickPoll.controller;




import javax.annotation.Resource;
import org.springframework.stereotype.Controller;


import com.skuniv.QuickPoll.service.ProfessorService;

@Controller
public class LoginController {
	@Resource(name = "ProfessorService")
	private ProfessorService professorService;

	

	
}
