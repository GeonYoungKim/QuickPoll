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
public class LoginController {
	@Resource(name = "ProfessorService")
	private ProfessorService professorService;

	// main
	@RequestMapping(value = "/")
	public ModelAndView mainView() throws Exception {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	// select list for student
	@RequestMapping(value = "/loginCheck")
	public ModelAndView studentList(HttpServletRequest request) throws Exception {
		int professor_id = Integer.parseInt(request.getParameter("id"));
		String input_password = request.getParameter("password");
		ModelAndView mv = new ModelAndView("jsonView");
		boolean login_check = professorService.selectProfessorPassword(professor_id, input_password);
//		if (login_check) {
//			List<Map<String, Object>> list = professorService.selectProfessorList(professor_id);
//			request.getSession().setAttribute("professorInfo", list);
//		}
		mv.addObject("loginState", login_check);
		mv.addObject("id", professor_id);
		return mv;
	}
}
