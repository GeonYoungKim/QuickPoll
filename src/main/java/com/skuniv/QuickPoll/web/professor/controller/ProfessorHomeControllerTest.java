package com.skuniv.QuickPoll.web.professor.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.CourseVo;

public class ProfessorHomeControllerTest {

	@Test
	public void test() {
		HashMap<String , HashMap<String,List<Integer>>> group_by_name=new HashMap<String, HashMap<String,List<Integer>>>();
		HashMap<String ,List<Integer>> group_by_day =new HashMap<String, List<Integer>>();
		List <Integer> periodList=new ArrayList<Integer>();
		List<CourseVo> courseList=new ArrayList<CourseVo>();
		
		CourseVo courseVo=new CourseVo();
		courseVo.setCourse_id("cs101");
		courseVo.setCredit(1.5);
		courseVo.setProfessor_id(301001);
		
		periodList.add(21);	
		periodList.add(22);
		group_by_day.put("Tuesday", periodList);
		group_by_name.put("network", group_by_day);
		courseVo.setGroup_by_name(group_by_name);
		
		courseList.add(courseVo);
		
		periodList=new ArrayList<Integer>();
		group_by_day=new HashMap<String, List<Integer>>();
		group_by_name=new HashMap<String, HashMap<String,List<Integer>>>();
		
		courseVo=new CourseVo();
		
		
		courseVo.setCourse_id("cs102");
		courseVo.setCredit(1.5);
		courseVo.setProfessor_id(301001);
		
		periodList.add(25);		
		periodList.add(26);
		group_by_day.put("thursday", periodList);
		group_by_name.put("capston", group_by_day);
		courseVo.setGroup_by_name(group_by_name);
		
		courseList.add(courseVo);
		
		
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		System.out.println(gson.toJson(courseList));
	}

}
