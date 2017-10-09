package com.skuniv.QuickPoll.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skuniv.QuickPoll.service.StudentService;

@Controller
public class StudentController {

	@Resource(name = "StudentService")
	private StudentService studentService;

	@RequestMapping(value = "/student")
	public ModelAndView mainView() throws Exception {
		ModelAndView mv = new ModelAndView("/student/login");
		return mv;
	}

	@RequestMapping(value = "/loginCheckForStudent")
	public ModelAndView studentList(HttpServletRequest request) throws Exception {
		int student_id = Integer.parseInt(request.getParameter("student_id"));
		String input_password = request.getParameter("password");
		ModelAndView mv = new ModelAndView("jsonView");
		boolean login_check = studentService.selectStudentPassword(student_id, input_password);
		mv.addObject("loginState", login_check);
		mv.addObject("student_id", student_id);
		return mv;
	}
	
	// select list for student
	@RequestMapping(value = "/studentList")
	public ModelAndView studentList() throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = studentService.selectStudentList();
		mv.addObject("student_list", list);
		return mv;
	}
}
