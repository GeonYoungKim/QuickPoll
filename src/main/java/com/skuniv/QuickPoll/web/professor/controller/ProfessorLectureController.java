package com.skuniv.QuickPoll.web.professor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skuniv.QuickPoll.service.ProfessorService;

@Controller
public class ProfessorLectureController {
	@Resource(name = "ProfessorService")
	private ProfessorService professorService;

	// main
	@RequestMapping(value = "/professorLecture", method = RequestMethod.GET)
	public ModelAndView mainView(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/professor_lecture");
		int id = Integer.parseInt(request.getParameter("id"));
		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
		List<Map<String, Object>> menteeList = professorService.selectMenteeList(id);
		mv.addObject("professorInfo", professorList);
		mv.addObject("menteeList", menteeList);
		return mv;
	}
	
	@RequestMapping(value = "/tab", method = RequestMethod.GET)
	public ModelAndView tab(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("tab");
		
		return mv;
	}
	
	// display lecture list
	@RequestMapping(value = "/lectureList", method = RequestMethod.GET)
	public ModelAndView displayLectureList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/gunyoungList");
		return mv;
	}
	@RequestMapping(value = "/panel", method = RequestMethod.GET)
	public ModelAndView panel(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/panel");
		return mv;
	}
	@RequestMapping(value = "/practice", method = RequestMethod.GET)
	public ModelAndView practice(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/practice");
		return mv;
	}
}
