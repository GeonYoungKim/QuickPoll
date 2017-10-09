package com.skuniv.QuickPoll.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skuniv.QuickPoll.service.ProfessorService;

@Controller
public class LoginController {
	@Resource(name = "ProfessorService")
	private ProfessorService professorService;

	

	
}
