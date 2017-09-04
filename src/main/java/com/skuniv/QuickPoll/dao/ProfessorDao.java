package com.skuniv.QuickPoll.dao;

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

}
