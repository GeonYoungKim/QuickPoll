package model;

public class RealCourseVo {
	private String course_id;
	private int professor_id;
	private double credit;
	private String course_name;
	private String dayWithPeroid;
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
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
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getDayWithPeroid() {
		return dayWithPeroid;
	}
	public void setDayWithPeroid(String dayWithPeroid) {
		this.dayWithPeroid = dayWithPeroid;
	}
	

}
