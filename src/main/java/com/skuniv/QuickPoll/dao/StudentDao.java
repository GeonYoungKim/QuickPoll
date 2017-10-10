package com.skuniv.QuickPoll.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.skuniv.QuickPoll.connect.ConnectDB;

@SuppressWarnings("unchecked")
@Repository("StudentDao")
public class StudentDao extends ConnectDB {
	public String selectStudentPassword(int student_id) {
		return (String)selectOne("student.selectStudentPassword", student_id);
	}
	public List<Map<String, Object>> selectStudentInfo(int student_id) {
		return (List<Map<String,Object>>)selectList("student.selectStudentInfo", student_id);
	}
	public List<Map<String, Object>> selectStudentList() {
		return (List<Map<String,Object>>)selectList("student.selectStudentList");
	}
	public List<LinkedHashMap<String, Object>>selectStudentEnrollList(int student_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("student.selectStudentEnrollList", student_id);
	}
	public List<LinkedHashMap<String, Object>>selectObjectiveQuickPollList(String course_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("student.selectObjectiveQuickPollList", course_id);
	}
	public List<LinkedHashMap<String, Object>>selectSubjectiveQuickPollList(String course_id) {
		return (List<LinkedHashMap<String, Object>>)selectList("student.selectSubjectiveQuickPollList", course_id);
	}
}
