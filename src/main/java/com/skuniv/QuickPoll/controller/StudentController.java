package com.skuniv.QuickPoll.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skuniv.QuickPoll.service.StudentService;

@Controller
public class StudentController {

	@Resource(name = "StudentService")
	private StudentService studentService;

	// select list for student
	@RequestMapping(value = "/studentList")
	public ModelAndView studentList() throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = studentService.selectStudentList();
		mv.addObject("student_list", list);
		return mv;
	}
}
