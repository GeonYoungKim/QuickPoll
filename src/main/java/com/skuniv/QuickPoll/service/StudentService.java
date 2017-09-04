package com.skuniv.QuickPoll.service;

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
	public List<Map<String, Object>> selectStudentList() throws Exception {
		return studentDao.selectStudentList();
	}
}
