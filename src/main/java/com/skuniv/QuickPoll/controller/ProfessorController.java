package com.skuniv.QuickPoll.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.skuniv.QuickPoll.service.ProfessorService;

import model.SaveQuestionVo;

@Controller
public class ProfessorController {

	@Resource(name = "ProfessorService")
	private ProfessorService professorService;

	// main
	@RequestMapping(value = "/professor")
	public ModelAndView mainView() throws Exception {
		ModelAndView mv = new ModelAndView("/professor/login");
		return mv;
	}
	
	@RequestMapping(value = "/loginCheckForProfessor")
	public ModelAndView studentList(HttpServletRequest request) throws Exception {
		int professor_id = Integer.parseInt(request.getParameter("id"));
		String input_password = request.getParameter("password");
		ModelAndView mv = new ModelAndView("jsonView");
		boolean login_check = professorService.selectProfessorPassword(professor_id, input_password);
		mv.addObject("loginState", login_check);
		mv.addObject("id", professor_id);
		return mv;
	}
	@RequestMapping(value = "/insertObjectiveQuestion")
	public void insertObjectiveQuestion(HttpServletRequest request) throws Exception {
		String course_id = request.getParameter("course_id");
		String question_content = request.getParameter("question_content");
    	int question_answer = Integer.parseInt(request.getParameter("question_answer"));
    	String example1 = request.getParameter("example1"); 
    	String example2 = request.getParameter("example2");
    	String example3 = request.getParameter("example3");
    	String example4 = request.getParameter("example4");
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("course_id", course_id);
    	map.put("question_content", question_content);
    	map.put("question_answer", question_answer);
    	map.put("example1", example1);
    	map.put("example2", example2);
    	map.put("example3", example3);
    	map.put("example4", example4);
    	professorService.insertObjectiveQuestion(map);
	}
	@RequestMapping(value = "/insertSubjectiveQuestion")
	public void insertSubjectiveQuestion(HttpServletRequest request) throws Exception {
		String course_id = request.getParameter("course_id");
		String question_content = request.getParameter("question_content");
    	String question_answer = request.getParameter("question_answer");
    	String question_similar_answer = request.getParameter("question_similar_answer");
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("course_id", course_id);
    	map.put("question_content", question_content);
    	map.put("question_answer", question_answer);
    	map.put("question_similar_answer", question_similar_answer);
    	professorService.insertSubjectiveQuestion(map);
	}
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
	@RequestMapping(value="/testmklist")
	public ModelAndView testpage() throws Exception{
		ModelAndView mv = new ModelAndView("/professor/test_mklist");
		
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/insertObjective", method = RequestMethod.POST)
	public String insertObjective(SaveQuestionVo model){
		String course_id=model.getCourse_id();
		String question_content = model.getProblem();
    	int question_answer = Integer.parseInt((String)model.getAnswer());
    	String example1 = model.getExample1();
    	String example2 = model.getExample2();
    	String example3 = model.getExample3();
    	String example4 = model.getExample4();
    	System.out.println("course_id : "+course_id+"problem : " + question_content + " example : " + example1 + " , " + example2 + " , " + example3 + " , " + example4 + " , answer : " + question_answer);
    	professorService.insertObjective(model);
    	return "ok";
	}
	@ResponseBody
	@RequestMapping(value="/insertSubjective", method=RequestMethod.POST)
	public String insertSubjective(SaveQuestionVo model) {
		String course_id = model.getCourse_id();
		String question_content = model.getProblem();
		String question_answer = (String)model.getAnswer();
		String question_similar_answer = model.getLike_answer();
		question_similar_answer = question_similar_answer.substring(0, question_similar_answer.length()-1);
		System.out.println("course_id : "+course_id+" qusetion_content : "+question_content+" question_answer : "+question_answer + " question_similar_answer : " +question_similar_answer);
		professorService.insertSubjective(model);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value="/insertOxQuestion" , method=RequestMethod.POST)
	public String insertOXQuestion(SaveQuestionVo model) {
		String course_id = model.getCourse_id();
		String question_content = model.getProblem();
		String question_answer = (String)model.getAnswer();
		System.out.println("course_id : "+ course_id + " question_content : " + question_content + " question_answer : "+ question_answer );
		professorService.insertOXQuestion(model);
		return "ok";
	}

}
