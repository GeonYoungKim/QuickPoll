package com.skuniv.QuickPoll.web.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class StudentHomeController {
	@RequestMapping(value = "/studentRegister")
	public ModelAndView mainView() throws Exception {
		ModelAndView mv = new ModelAndView("/student/register");
		return mv;
	}
}
