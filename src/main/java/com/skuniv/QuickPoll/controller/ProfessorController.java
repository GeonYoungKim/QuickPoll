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
public class ProfessorController {

	@Resource(name = "ProfessorService")
	private ProfessorService professorService;
	
	@RequestMapping(value = "/resultListForObjectiveQuestion")
	public ModelAndView getResultListForObjectiveQuestion(HttpServletRequest request) throws Exception {
		int quickpoll_question_id = Integer.parseInt(request.getParameter("quickpoll_question_id"));
		System.out.println("quickpoll_question_id : " + quickpoll_question_id);
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> resultList = professorService.selectResultListForObjectiveQuestion(quickpoll_question_id);
		mv.addObject("resultListForObjectiveQuestion", resultList);
		return mv;
	}
	
	@RequestMapping(value = "/resultListForSubjectiveQuestion")
	public ModelAndView getResultListForSubjectiveQuestion(HttpServletRequest request) throws Exception {
		int quickpoll_question_id = Integer.parseInt(request.getParameter("quickpoll_question_id"));
		System.out.println("quickpoll_question_id : " + quickpoll_question_id);
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Integer> resultList = professorService.selectResultListForSubjectiveQuestion(quickpoll_question_id);
		System.out.println(resultList.keySet());
		System.out.println(resultList.values());
		mv.addObject("resultListForSubjectiveQuestion", resultList);
		return mv;
	}
}
