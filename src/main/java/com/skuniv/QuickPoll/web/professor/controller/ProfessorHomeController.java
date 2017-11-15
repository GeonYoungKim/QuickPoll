package com.skuniv.QuickPoll.web.professor.controller;

import java.io.File;
import java.io.IOException;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skuniv.QuickPoll.service.ProfessorService;

import model.RealCourseVo;

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
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/redirectLectureList", method = RequestMethod.GET)
	public String mainDisplay(HttpServletRequest request, RedirectAttributes redirectAttributes) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		// professor
		List<Map<String, Object>> list = professorService.selectProfessorList(id);
		List<RealCourseVo> courseList = professorService.selectCourseList(id);

		redirectAttributes.addFlashAttribute("professorInfo", list);
		redirectAttributes.addFlashAttribute("courseListInfo", courseList);
		return "redirect:/lectureList";
	}

	@RequestMapping(value = "/quickpollList")
	public ModelAndView disPlayQuickPollList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/professor/quickpollList");
		int id = Integer.parseInt(request.getParameter("id"));
		String course_id = request.getParameter("course_id");
		List<Map<String, Object>> professorList = professorService.selectProfessorList(id);
		List<LinkedHashMap<String, Object>> objectiveQuickPollList = professorService
				.selectObjectiveQuickPollList(course_id);
		List<LinkedHashMap<String, Object>> subjectiveQuickPollList = professorService
				.selectSubjectiveQuickPollList(course_id);
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
		List<RealCourseVo> courseList = professorService.selectCourseList(301001);
		mv.addObject("courseList", courseList);
		return mv;
	}

	@RequestMapping(value = "/upload")
	public ModelAndView displayUploadPage(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("professor/uploadExcel");
		return mv;
	}

	@ResponseBody
	@RequestMapping(value = "/uploadExcel", method = RequestMethod.POST)
	public ModelAndView excelUploadAjax(MultipartHttpServletRequest request) throws IllegalStateException, IOException {
		request.setCharacterEncoding("utf-8");
		Map<String, MultipartFile> files = request.getFileMap();
		CommonsMultipartFile excelFile = (CommonsMultipartFile) files.get("excelFile");
		String path = request.getSession().getServletContext().getRealPath("/resources");
		path += "/common/excel/" + excelFile.getOriginalFilename();
		System.out.println("path : " + path);
		File file = new File(path);

		// // 파일 업로드 처리 완료.
		excelFile.transferTo(file);
		professorService.parsingExcel(file);
		// FileUtils.delete(destFile.getAbsolutePath());

		ModelAndView view = new ModelAndView();
		view.setViewName("");
		return view;
	}

	// @RequestMapping(value = "/insertCourse", method=RequestMethod.POST)
	// public ModelAndView insertCourse(MultipartHttpServletRequest request)
	// throws IllegalStateException, IOException {
	// request.setCharacterEncoding("utf-8");
	// String name = new String(request.getParameter("name").getBytes("8859_1"),
	// "UTF-8");
	// String content = new
	// String(request.getParameter("content").getBytes("8859_1"), "UTF-8");;
	// Map<String, MultipartFile> files = request.getFileMap();
	// CommonsMultipartFile cmf = (CommonsMultipartFile) files.get("img");
	// // 경로
	// String pdfPath =
	// request.getSession().getServletContext().getRealPath("/resources");
	// System.out.println("pdf : " + pdfPath);
	// String savePath = ""+pdfPath+"/common/hyo/images/"+new
	// String(cmf.getOriginalFilename().getBytes("8859_1"), "UTF-8");;
	// System.out.println("저장 경로 : " +savePath);
	// File file = new File(savePath);
	// // 파일 업로드 처리 완료.
	// cmf.transferTo(file);
	//
	//// String img = "alg.png";
	// Map<String, Object> map = new HashMap<String, Object>();
	// map.put("name", name);
	// map.put("content", content);
	// map.put("img", cmf.getOriginalFilename());
	//
	// service.insertRoom(map);
	//
	// ModelAndView mv = new ModelAndView("main");
	// return mv;
	// }

}