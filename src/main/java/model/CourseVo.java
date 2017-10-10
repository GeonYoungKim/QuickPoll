package model;

import java.util.HashMap;
import java.util.List;

public class CourseVo {
	private String course_id;
	private HashMap<String,HashMap<String,List<Integer>>> group_by_name;
	private int professor_id;
	private double credit;
	
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public HashMap<String, HashMap<String, List<Integer>>> getGroup_by_name() {
		return group_by_name;
	}
	public void setGroup_by_name(HashMap<String, HashMap<String, List<Integer>>> group_by_name) {
		this.group_by_name = group_by_name;
	}
	public int getProfessor_id() {
		return professor_id;
	}
	public void setProfessor_id(int professor_id) {
		this.professor_id = professor_id;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	

}
