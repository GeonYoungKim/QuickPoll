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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.skuniv.QuickPoll.service.ProfessorService;

@Controller
public class ProfessorLectureController {
	@Resource(name = "ProfessorService")
	private ProfessorService professorService;

	// main
	@RequestMapping(value = "/redirectProfessorLecture", method = RequestMethod.GET)
	public String mainDisplay(HttpServletRequest request, RedirectAttributes redirectAttributes) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		String course_id = request.getParameter("course_id");
		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
		List<Map<String, Object>> menteeList = professorService.selectMenteeList(id);
		List<LinkedHashMap<String, Object>> objectiveQuestionList = professorService.selectObjectiveQuestionList(course_id);
		List<LinkedHashMap<String, Object>> subjectiveQuestionList = professorService.selectSubjectiveQuestionList(course_id);
		redirectAttributes.addFlashAttribute("professorInfo", professorList);
		redirectAttributes.addFlashAttribute("menteeList", menteeList);
		redirectAttributes.addFlashAttribute("objectiveQuestionList", objectiveQuestionList);
		redirectAttributes.addFlashAttribute("subjectiveQuestionList", subjectiveQuestionList);
	    return "redirect:/professorLecture";
	}
	@RequestMapping(value = "/professorLecture", method = RequestMethod.GET)
	public ModelAndView mainView(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/professor_lecture");
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
	
	@RequestMapping(value = "/lectureList")
	public ModelAndView displayLectureList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/lectureList");
		return mv;
	}
}
