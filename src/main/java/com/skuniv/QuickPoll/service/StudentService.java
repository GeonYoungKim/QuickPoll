package com.skuniv.QuickPoll.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skuniv.QuickPoll.dao.StudentDao;

@Service("StudentService")
public class StudentService {
	@Resource(name = "StudentDao")
	private StudentDao studentDao;
	public Object good() {
		// TODO Auto-generated method stub
		return "quickpoll";
	}
	public List<Map<String, Object>> selectStudentInfo(int student_id) throws Exception {
		return studentDao.selectStudentInfo(student_id);
	}
	public List<Map<String, Object>> selectStudentList() throws Exception {
		return studentDao.selectStudentList();
	}
	public boolean selectStudentPassword(int student_id, String input_password) throws Exception {
		String student_password = studentDao.selectStudentPassword(student_id);
		if (student_password == null) return false;
		return isLoginCheck(student_password, input_password);
	}
	boolean isLoginCheck(String student_password, String input_password) {
		if (student_password.equals(input_password)) return true;
		else return false;
	}
	public List<LinkedHashMap<String, Object>> selectStudentEnrollList(int student_id) throws Exception {
		return studentDao.selectStudentEnrollList(student_id);
	}
}
