package com.skuniv.QuickPoll.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.skuniv.QuickPoll.connect.ConnectDB;

@SuppressWarnings("unchecked")
@Repository("StudentDao")
public class StudentDao extends ConnectDB {
	public List<Map<String, Object>> selectStudentList() {
		return (List<Map<String,Object>>)selectList("student.selectStudentList");
	}
}
