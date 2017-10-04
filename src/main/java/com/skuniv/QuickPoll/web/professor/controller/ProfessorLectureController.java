package com.skuniv.QuickPoll.web.professor.controller;

import java.util.LinkedHashMap;
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
		String course_id = request.getParameter("course_id");
		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
		List<Map<String, Object>> menteeList = professorService.selectMenteeList(id);
		List<LinkedHashMap<String, Object>> objectiveQuestionList = professorService.selectObjectiveQuestionList(course_id);
		List<LinkedHashMap<String, Object>> subjectiveQuestionList = professorService.selectSubjectiveQuestionList(course_id);
		mv.addObject("professorInfo", professorList);
		mv.addObject("menteeList", menteeList);
		mv.addObject("objectiveQuestionList", objectiveQuestionList);
		mv.addObject("subjectiveQuestionList", subjectiveQuestionList);
		return mv;
	}
	
	@RequestMapping(value = "/tab", method = RequestMethod.GET)
	public ModelAndView tab(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("tab");
		
		return mv;
	}
	@RequestMapping(value = "/testtable", method = RequestMethod.GET)
	public ModelAndView testtable(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/testtable");
		
		return mv;
	}
	@RequestMapping(value = "/testchart", method = RequestMethod.GET)
	public ModelAndView chart(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/testchart");
		
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
