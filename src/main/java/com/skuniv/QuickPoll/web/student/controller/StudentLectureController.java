package com.skuniv.QuickPoll.web.student.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentLectureController {
	//test

	// select list for student
	@RequestMapping(value = "/studentLectureMain", method = RequestMethod.GET)
	public ModelAndView studentList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/student/student_lecture");
		int id = Integer.parseInt(request.getParameter("student_id"));
		System.out.println("student_id : " + id);
		mv.addObject("student_id", id);
		return mv;
	}
}
