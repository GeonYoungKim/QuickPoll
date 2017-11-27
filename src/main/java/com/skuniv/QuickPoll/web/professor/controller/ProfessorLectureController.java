package com.skuniv.QuickPoll.web.professor.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.skuniv.QuickPoll.service.ProfessorService;

import model.RealCourseVo;

@Controller
public class ProfessorLectureController {
	@Resource(name = "ProfessorService")
	private ProfessorService professorService;

	// main
//	@RequestMapping(value = "/redirectProfessorLecture", method = RequestMethod.GET)
//	public String mainDisplay(HttpServletRequest request, RedirectAttributes redirectAttributes) throws Exception {
//		int id = Integer.parseInt(request.getParameter("id"));
//		String course_id = request.getParameter("course_id");
//		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
//		List<Map<String, Object>> menteeList = professorService.selectMenteeList(id);
//		List<LinkedHashMap<String, Object>> objectiveQuestionList = professorService.selectObjectiveQuestionList(course_id);
//		List<LinkedHashMap<String, Object>> subjectiveQuestionList = professorService.selectSubjectiveQuestionList(course_id);
//		redirectAttributes.addFlashAttribute("professorInfo", professorList);
//		redirectAttributes.addFlashAttribute("menteeList", menteeList);
//		redirectAttributes.addFlashAttribute("objectiveQuestionList", objectiveQuestionList);
//		redirectAttributes.addFlashAttribute("subjectiveQuestionList", subjectiveQuestionList);
//	    return "redirect:/professorLecture";
//	}
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
		mv.addObject("courseId", course_id);
		return mv;
	}
	@RequestMapping(value = "/participationRate", method = RequestMethod.GET)
	public ModelAndView displayParticipationRate(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/participationRate");
		int id = Integer.parseInt(request.getParameter("id"));
		String course_id = request.getParameter("course_id");
		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
		List<HashMap<String, Integer>> participationRateList = professorService.selectAnswerListForCourse(course_id);
		int questionCount = professorService.selectCountForQuestion(course_id);
		mv.addObject("professorInfo", professorList);
		mv.addObject("participationRateList", participationRateList);
		mv.addObject("questionCount", questionCount);
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
		int id = Integer.parseInt(request.getParameter("id"));
		//professor 
		List<Map<String, Object>> list = professorService.selectProfessorList(id);
		List<RealCourseVo> courseList = professorService.selectCourseList(id);
		mv.addObject("professorInfo", list);
		mv.addObject("courseListInfo", courseList);
		return mv;
	}
	@RequestMapping(value = "/insertCourse", method = RequestMethod.GET)
	public void insertCourse(HttpServletRequest request) throws Exception {
		String course_id = request.getParameter("course_id");
		String course_name = request.getParameter("course_name");
		int period = Integer.parseInt(request.getParameter("period"));
		String day = request.getParameter("day");
		float credit = Float.parseFloat(request.getParameter("credit"));
		int professor_id = Integer.parseInt(request.getParameter("professor_id"));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("course_id", course_id);
		map.put("course_name", course_name);
		map.put("period", period);
		map.put("day", day);
		map.put("credit", credit);
		map.put("professor_id", professor_id);
		professorService.insertCourse(map);
	}
	@RequestMapping(value = "/attendance")
	public ModelAndView displayAttendance(HttpServletRequest request) throws Exception {
		System.out.println("hi");
		String course_id = request.getParameter("course_id");
		int professor_id = Integer.parseInt(request.getParameter("professor_id"));
		List<Map<String, Object>> professorList = professorService.selectProfessorList(professor_id);
		List<LinkedHashMap<String, Object>> list = professorService.selectAttendance(course_id);
		ModelAndView mv = new ModelAndView("professor/attendance");
		mv.addObject("attendanceList", list);
		mv.addObject("professorInfo", professorList);
		return mv;
	}
	@RequestMapping(value = "/uploadAttendance")
	public ModelAndView displayUploadPage(HttpServletRequest request) throws Exception {
		int professor_id = Integer.parseInt(request.getParameter("id"));
		List<Map<String, Object>> professorList = professorService.selectProfessorList(professor_id);
		ModelAndView mv = new ModelAndView("professor/uploadAttendance");
		mv.addObject("professorInfo", professorList);
		return mv;
	}
	@ResponseBody
	@RequestMapping(value = "/uploadExcel", method = RequestMethod.POST)
	public ModelAndView excelUploadAjax(MultipartHttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		Map<String, MultipartFile> files = request.getFileMap();
		
		CommonsMultipartFile excelFile = (CommonsMultipartFile) files.get("excelFile");
		String path = request.getSession().getServletContext().getRealPath("/resources");
		path += "/common/excel/" + excelFile.getOriginalFilename();
		System.out.println("path : " + path);
		File file = new File(path);
		// // 파일 업로드 처리 완료.
		excelFile.transferTo(file);
		List<HashMap<String, Object>> result = professorService.parsingExcel(file);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", result);
		// FileUtils.delete(destFile.getAbsolutePath());
		professorService.insertEnroll(map);
		String course_id = request.getParameter("course_id");
		int professor_id = Integer.parseInt(request.getParameter("professor_id"));
		List<Map<String, Object>> professorList = professorService.selectProfessorList(professor_id);
		List<LinkedHashMap<String, Object>> list = professorService.selectAttendance(course_id);
		ModelAndView mv = new ModelAndView("professor/attendance");
		mv.addObject("attendanceList", list);
		mv.addObject("professorInfo", professorList);
		return mv;
	}
}
