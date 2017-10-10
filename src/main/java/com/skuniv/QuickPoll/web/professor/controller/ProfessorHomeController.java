package com.skuniv.QuickPoll.web.professor.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.skuniv.QuickPoll.service.ProfessorService;

import model.CourseVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProfessorHomeController {
	@Resource(name = "ProfessorService")
	private ProfessorService professorService;
	private static final Logger logger = LoggerFactory.getLogger(ProfessorHomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
//	@RequestMapping(value = "/redirectLectureList", method = RequestMethod.GET)
//	public String mainDisplay(HttpServletRequest request, RedirectAttributes redirectAttributes) throws Exception {
//		int id = Integer.parseInt(request.getParameter("id"));
//		//professor 
//		List<Map<String, Object>> list = professorService.selectProfessorList(id);
//		List<CourseVo> courseList = professorService.selectCourseList(id);
//		
//		redirectAttributes.addFlashAttribute("professorInfo", list);
//		redirectAttributes.addFlashAttribute("courseListInfo", courseList);
//	    return "redirect:/lectureList";
//	}
	@RequestMapping(value = "/quickpollList")
	public ModelAndView disPlayQuickPollList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/quickpollList");
		int id = Integer.parseInt(request.getParameter("id"));
		String course_id = request.getParameter("course_id");
		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
		List<LinkedHashMap<String, Object>> objectiveQuickPollList = professorService.selectObjectiveQuickPollList(course_id);
		List<LinkedHashMap<String, Object>> subjectiveQuickPollList = professorService.selectSubjectiveQuickPollList(course_id);
		mv.addObject("professorInfo", professorList);
		mv.addObject("objectiveQuestionList", objectiveQuickPollList);
		mv.addObject("subjectiveQuestionList", subjectiveQuickPollList);
		return mv;
	}
	@RequestMapping(value = "/menteeList", method = RequestMethod.GET)
	public ModelAndView studentList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("menteeList");
		int id = Integer.parseInt(request.getParameter("id"));
		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
		List<Map<String, Object>> menteeList = professorService.selectMenteeList(id);
		mv.addObject("professorInfo", professorList);
		mv.addObject("menteeList", menteeList);
		return mv;
	}
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	
	public ModelAndView get(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<CourseVo> courseList = professorService.selectCourseList(301001);
		mv.addObject("courseList",courseList);
		return mv;
	}
}