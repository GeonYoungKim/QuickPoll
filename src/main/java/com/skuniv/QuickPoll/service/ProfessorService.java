package com.skuniv.QuickPoll.service;

import java.util.List;
import java.util.Map;

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
	public boolean selectProfessorPassword(int professor_id, String input_password) throws Exception {
		String professor_password = professorDao.selectProfessorPassword(professor_id);
		return isLoginCheck(professor_password, input_password);
	}
	boolean isLoginCheck(String professor_password, String input_password) {
		if (professor_password.equals(input_password)) return true;
		else return false;
	}
}
