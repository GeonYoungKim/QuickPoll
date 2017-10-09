package com.skuniv.QuickPoll.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skuniv.QuickPoll.dao.ProfessorDao;

@Service("ProfessorService")
public class ProfessorService {
	@Resource(name = "ProfessorDao")
	private ProfessorDao professorDao;
	public Object good() {
		// TODO Auto-generated method stub
		return "quickpoll";
	}
	public List<Map<String, Object>> selectProfessorList(int professor_id) throws Exception {
		return professorDao.selectProfessorList(professor_id);
	}
	public Map<String, Object> selectResultListForObjectiveQuestion(int quickpoll_question_id) throws Exception {
		List<Map<String, Object>> resultList = professorDao.selectResultListForQuickPollAnswer(quickpoll_question_id);
		return parsingObjectiveAnswer(resultList);
	}
	public Map<String, Integer> selectResultListForSubjectiveQuestion(int quickpoll_question_id) throws Exception {
		List<Map<String, Object>> resultList = professorDao.selectResultListForQuickPollAnswer(quickpoll_question_id);
		return parsingSubjectiveAnswer(resultList);
	}
	public Map<String, Object> parsingObjectiveAnswer(List<Map<String, Object>> resultList) {
		int answer_array[] = new int[5];
		Map<String, Object> parsingMap = new HashMap<String, Object>();
		for (int i = 0 ; i < resultList.size(); i++) {
			String value = (String)resultList.get(i).get("question_answer");
			answer_array[Integer.parseInt(value)] ++;
		}
		parsingMap.put("answer1", answer_array[1]);
		parsingMap.put("answer2", answer_array[2]);
		parsingMap.put("answer3", answer_array[3]);
		parsingMap.put("answer4", answer_array[4]);
		parsingMap.put("totalPeople", resultList.size());
		return parsingMap;
	}
	public Map<String, Integer> parsingSubjectiveAnswer(List<Map<String, Object>> resultList) {
		Map<String, Integer> parsingMap = new HashMap<String, Integer>();
		for (int i = 0; i < resultList.size(); i++) {
			String value = (String)resultList.get(i).get("question_answer");
			if (parsingMap.containsKey(value)) {
				int count = parsingMap.get(value);
				parsingMap.put(value, count+1);
			} else {
				parsingMap.put(value, 1);
			}
		}
		TreeMap<String, Integer> sortedParsingMap = new TreeMap<String, Integer>(parsingMap);
		sortedParsingMap.descendingMap();
		return sortedParsingMap;
	}
	public boolean selectProfessorPassword(int professor_id, String input_password) throws Exception {
		String professor_password = professorDao.selectProfessorPassword(professor_id);
		if (professor_password == null) return false;
		return isLoginCheck(professor_password, input_password);
	}
	boolean isLoginCheck(String professor_password, String input_password) {
		if (professor_password.equals(input_password)) return true;
		else return false;
	}
	
	public List<Map<String, Object>> selectMenteeList(int professor_id) throws Exception {
		return professorDao.selectMenteeList(professor_id);
	}
	public List<LinkedHashMap<String, Object>> selectObjectiveQuestionList(String course_id) throws Exception {
		return professorDao.selectObjectiveQuestionList(course_id);
	}
	public List<LinkedHashMap<String, Object>> selectSubjectiveQuestionList(String course_id) throws Exception {
		return professorDao.selectSubjectiveQuestionList(course_id);
	}
}
