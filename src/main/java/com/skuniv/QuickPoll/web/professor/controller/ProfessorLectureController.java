package com.skuniv.QuickPoll.web.professor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfessorLectureController {
	// main
		@RequestMapping(value = "/professorLecture")
		public ModelAndView mainView(HttpServletRequest request) throws Exception {
			ModelAndView mv = new ModelAndView("professor_lecture");
			String id = request.getParameter("id");
			mv.addObject("id", id);
			return mv;
		}
}
