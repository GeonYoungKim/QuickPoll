package com.skuniv.QuickPoll.web.student.controller;

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

import com.skuniv.QuickPoll.service.StudentService;

@Controller
public class StudentLectureController {
	@Resource(name = "StudentService")
	private StudentService studentService;

	// select list for student
//	@RequestMapping(value = "/studentLectureMain", method = RequestMethod.GET)
//	public ModelAndView studentList(HttpServletRequest request) throws Exception {
//		ModelAndView mv = new ModelAndView("/student/student_lecture");
//		int id = Integer.parseInt(request.getParameter("student_id"));
//		System.out.println("student_id : " + id);
//		mv.addObject("student_id", id);
//		return mv;
//	}
	@RequestMapping(value = "/redirectstudentLecture", method = RequestMethod.GET)
	public String redirectLectureQuickPoll(HttpServletRequest request, RedirectAttributes redirectAttributes) throws Exception {
		int student_id = Integer.parseInt(request.getParameter("student_id"));
		List<Map<String, Object>> list = studentService.selectStudentInfo(student_id);
		redirectAttributes.addFlashAttribute("studentInfo", list);
	    return "redirect:/studentLecture";
	}
	@RequestMapping(value = "/studentLecture", method = RequestMethod.GET)
	public ModelAndView displayLectureQuickPollView(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/student/student_lecture");
		return mv;
	}
	@RequestMapping(value = "/redirectStudentLectureList", method = RequestMethod.GET)
	public String redirectStudentLectureList(HttpServletRequest request, RedirectAttributes redirectAttributes) throws Exception {
		int student_id = Integer.parseInt(request.getParameter("student_id"));
		//professor 
		List<Map<String, Object>> list = studentService.selectStudentInfo(student_id);
		System.out.println(list.get(0).get("name"));
		List<LinkedHashMap<String, Object>> courseList = studentService.selectStudentEnrollList(student_id);
		redirectAttributes.addFlashAttribute("studentInfo", list);
		redirectAttributes.addFlashAttribute("courseListInfo", courseList);
	    return "redirect:/studentLectureList";
	}
	
	@RequestMapping(value = "/studentLectureList", method = RequestMethod.GET)
	public ModelAndView displayStudentMain(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/student/lectureList");
		return mv;
	}
	
}
