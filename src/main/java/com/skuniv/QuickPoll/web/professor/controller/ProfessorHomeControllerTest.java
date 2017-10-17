package com.skuniv.QuickPoll.web.professor.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.CourseVo;

public class ProfessorHomeControllerTest {

	@Test
	public void test() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("student_id", 2011301013);
		Iterator<String> student_id = map.keySet().iterator();
		while (student_id.hasNext()) {
			System.out.println(student_id.next());
		}
	}

}
