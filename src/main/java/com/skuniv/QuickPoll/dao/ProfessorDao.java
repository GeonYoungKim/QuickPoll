package com.skuniv.QuickPoll.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.skuniv.QuickPoll.connect.ConnectDB;

@SuppressWarnings("unchecked")
@Repository("ProfessorDao")
public class ProfessorDao extends ConnectDB {
	public String selectProfessorPassword(int professor_id) {
		return (String)selectOne("professor.selectProfessorPassword", professor_id);
	}
	//
	public List<Map<String, Object>>selectProfessorList(int professor_id) {
		return (List<Map<String,Object>>)selectList("professor.selectProfessorList", professor_id);
	}
	// select mentee list
	public List<Map<String, Object>>selectMenteeList(int professor_id) {
		return (List<Map<String,Object>>)selectList("professor.selectMenteeList", professor_id);
	}
	public List<Map<String, Object>>selectResultListForQuickPollAnswer(int quickpoll_question_id) {
		return (List<Map<String,Object>>)selectList("professor.selectResultListForQuickPollAnswer", quickpoll_question_id);
	}
	public List<LinkedHashMap<String, Object>>selectObjectiveQuestionList(String course_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("professor.selectObjectiveQuestionList", course_id);
	}
	public List<LinkedHashMap<String, Object>>selectSubjectiveQuestionList(String course_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("professor.selectSubjectiveQuestionList", course_id);
	}
	public List<LinkedHashMap<String, Object>>selectCourseList(int professor_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("professor.selectCourseList", professor_id);
	}
	public List<LinkedHashMap<String, Object>>selectObjectiveQuickPollList(String course_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("professor.selectObjectiveQuickPollList", course_id);
	}
	public List<LinkedHashMap<String, Object>>selectSubjectiveQuickPollList(String course_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("professor.selectSubjectiveQuickPollList", course_id);
	}
	public List<LinkedHashMap<String, Object>> selectAnswerListForCourse(String course_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("professor.selectAnswerListForCourse", course_id);
	}
	public int selectCountForQuestion(String course_id) {
		return (Integer)selectOne("professor.selectCountForQuestion", course_id);
	}
	
	public void insertCourse(Map<String, Object> map) {	
		insert("professor.insertCourse", map);
	}
	
	
	
}
