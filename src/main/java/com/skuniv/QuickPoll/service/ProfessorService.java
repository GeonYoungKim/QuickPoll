package com.skuniv.QuickPoll.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.skuniv.QuickPoll.dao.ProfessorDao;

import model.CourseVo;
import model.RealCourseVo;

@Service("ProfessorService")
public class ProfessorService {
	@Resource(name = "ProfessorDao")
	private ProfessorDao professorDao;
	public Object good() {
		// TODO Auto-generated method stub
		return "quickpoll";
	}
	public List<Map<String, Object>> selectProfessorList(int professor_id) throws Exception {
		return professorDao.selectProfessorList(professor_id);
	}
	
	public Map<String, Object> selectResultListForObjectiveQuestion(int quickpoll_question_id) throws Exception {
		List<Map<String, Object>> resultList = professorDao.selectResultListForQuickPollAnswer(quickpoll_question_id);
		return parsingObjectiveAnswer(resultList);
	}
	public Map<String, Integer> selectResultListForSubjectiveQuestion(int quickpoll_question_id) throws Exception {
		List<Map<String, Object>> resultList = professorDao.selectResultListForQuickPollAnswer(quickpoll_question_id);
		return parsingSubjectiveAnswer(resultList);
	}
	public Map<String, Object> parsingObjectiveAnswer(List<Map<String, Object>> resultList) {
		int answer_array[] = new int[5];
		Map<String, Object> parsingMap = new HashMap<String, Object>();
		for (int i = 0 ; i < resultList.size(); i++) {
			String value = (String)resultList.get(i).get("question_answer");
			answer_array[Integer.parseInt(value)] ++;
		}
		parsingMap.put("answer1", answer_array[1]);
		parsingMap.put("answer2", answer_array[2]);
		parsingMap.put("answer3", answer_array[3]);
		parsingMap.put("answer4", answer_array[4]);
		parsingMap.put("totalPeople", resultList.size());
		return parsingMap;
	}
	public Map<String, Integer> parsingSubjectiveAnswer(List<Map<String, Object>> resultList) {
		Map<String, Integer> parsingMap = new HashMap<String, Integer>();
		for (int i = 0; i < resultList.size(); i++) {
			String value = (String)resultList.get(i).get("question_answer");
			if (parsingMap.containsKey(value)) {
				int count = parsingMap.get(value);
				parsingMap.put(value, count+1);
			} else {
				parsingMap.put(value, 1);
			}
		}
		TreeMap<String, Integer> sortedParsingMap = new TreeMap<String, Integer>(parsingMap);
		sortedParsingMap.descendingMap();
		sortedParsingMap.put("totalPeople", resultList.size());
		return sortedParsingMap;
	}
	public boolean selectProfessorPassword(int professor_id, String input_password) throws Exception {
		String professor_password = professorDao.selectProfessorPassword(professor_id);
		if (professor_password == null) return false;
		return isLoginCheck(professor_password, input_password);
	}
	boolean isLoginCheck(String professor_password, String input_password) {
		if (professor_password.equals(input_password)) return true;
		else return false;
	}
	
	public List<Map<String, Object>> selectMenteeList(int professor_id) throws Exception {
		return professorDao.selectMenteeList(professor_id);
	}
	public List<LinkedHashMap<String, Object>> selectObjectiveQuestionList(String course_id) throws Exception {
		return professorDao.selectObjectiveQuestionList(course_id);
	}
	public List<LinkedHashMap<String, Object>> selectSubjectiveQuestionList(String course_id) throws Exception {
		return professorDao.selectSubjectiveQuestionList(course_id);
	}
	public List<LinkedHashMap<String, Object>> selectObjectiveQuickPollList(String course_id) throws Exception {
		return professorDao.selectObjectiveQuickPollList(course_id);
	}
	public List<LinkedHashMap<String, Object>> selectSubjectiveQuickPollList(String course_id) throws Exception {
		return professorDao.selectSubjectiveQuickPollList(course_id);
	}
	public List<HashMap<String, Integer>> selectAnswerListForCourse(String course_id) throws Exception {
		return parsingParticipationRate(professorDao.selectAnswerListForCourse(course_id));
	}
	public int selectCountForQuestion(String course_id) throws Exception {
		return professorDao.selectCountForQuestion(course_id);
	}
	public List<HashMap<String, Integer>> parsingParticipationRate(List<LinkedHashMap<String, Object>> answerList) {
		
		Map<String, HashMap<String, Integer>> setMap = new HashMap<String, HashMap<String, Integer>>();
		for (int i = 0 ; i < answerList.size(); i++) {
			LinkedHashMap<String, Object> map = answerList.get(i);
			int student_id = (Integer)map.get("student_id");
			String str_student_id = String.valueOf(student_id);
			int answer_count = (Integer)map.get("answer_state");
			answer_count = answer_count == 1 ? 1 : 0;
			System.out.println("count : " + answer_count);
			if (setMap.containsKey(str_student_id)) {
				HashMap<String, Integer> stateMap = setMap.get(str_student_id);
				stateMap.put("participate_count", stateMap.get("participate_count")+1);
				stateMap.put("answer_count", stateMap.get("answer_count")+answer_count);
				setMap.put(str_student_id, stateMap);
			} else {
				HashMap<String, Integer> stateMap = new HashMap<String, Integer>();
				stateMap.put("participate_count", 1);
				stateMap.put("answer_count", answer_count);
				setMap.put(str_student_id, stateMap);
			}
		}
		return setParticipationRateList(setMap);
	}
	public List<HashMap<String, Integer>> setParticipationRateList(Map<String, HashMap<String, Integer>> setMap) {
		List<HashMap<String, Integer>> participationRateList = new LinkedList<HashMap<String, Integer>>();
		Iterator<String> student_id = setMap.keySet().iterator();
		while (student_id.hasNext()) {
			String str_student_id = student_id.next();
			HashMap<String, Integer> stateMap = setMap.get(str_student_id);
			int participate_count = stateMap.get("participate_count");
			int answer_count = stateMap.get("answer_count");
			stateMap.put("student_id", Integer.parseInt(str_student_id));
			stateMap.put("participate_count", participate_count);
			stateMap.put("answer_count", answer_count);
			participationRateList.add(stateMap);
		}
		return participationRateList;
	}
	public void insertCourse(Map<String, Object> map) {	
		professorDao.insert("professor.insertCourse", map);
	}
	public void insertObjectiveQuestion (Map<String, Object> map) {	
		professorDao.insertObjectiveQuestion(map);
	}
	public void insertSubjectiveQuestion (Map<String, Object> map) {	
		professorDao.insertSubjectiveQuestion(map);
	}
	public List<RealCourseVo> selectCourseList(int professor_id) throws Exception {
		return reParsingCourse(groupByCourse(professorDao.selectCourseList(professor_id)));
	}
	public List<RealCourseVo> reParsingCourse(List<CourseVo> courseVos){
		List<RealCourseVo> courseVoList=new ArrayList<RealCourseVo>();
		
		List<String> courseNames=new ArrayList<String>();
		List<String> dayWithPeriods=new ArrayList<String>();
		String str;
		for(int i=0;i<courseVos.size();i++) {
			Iterator<String> keySetIterator = courseVos.get(i).getGroup_by_name().keySet().iterator();
			while (keySetIterator.hasNext()) {
				String key = keySetIterator.next();
				Iterator<String> dayKeySetIterator=courseVos.get(i).getGroup_by_name().get(key).keySet().iterator();
				str="";
				while (dayKeySetIterator.hasNext()) {
					String dayKey = dayKeySetIterator.next();
					str+=dayKey+courseVos.get(i).getGroup_by_name().get(key).get(dayKey)+" ";
				}
				System.out.println(str);
				dayWithPeriods.add(str);
			    courseNames.add(key);
			}
		}	
		for(int i=0;i<courseVos.size();i++) {
			RealCourseVo realCourseVo=new RealCourseVo();
			realCourseVo.setCourse_id(courseVos.get(i).getCourse_id());
			realCourseVo.setCredit(courseVos.get(i).getCredit());
			realCourseVo.setProfessor_id(courseVos.get(i).getProfessor_id());
			realCourseVo.setCourse_name(courseNames.get(i));
			realCourseVo.setDayWithPeroid(dayWithPeriods.get(i));
			courseVoList.add(realCourseVo);
		}		
		return courseVoList;
	}

	public List<CourseVo> groupByCourse(List<LinkedHashMap<String, Object>> courseList) {
		HashMap<String , HashMap<String,List<Integer>>> group_by_name=new HashMap<String, HashMap<String,List<Integer>>>();
		HashMap<String ,List<Integer>> group_by_day =new HashMap<String, List<Integer>>();
		List <Integer> periodList=new ArrayList<Integer>();		
		List<CourseVo> courseVoList=new ArrayList<CourseVo>();
		CourseVo courseVo=new CourseVo();
		String course_id="";
		String course_name="";
		String day="";
		System.out.println(courseList.size());
		for(int i=0;i<courseList.size();i++) {
			
			if(i==0) {
				courseVo=new CourseVo();
				group_by_name=new HashMap<String, HashMap<String,List<Integer>>>();
				group_by_day =new HashMap<String, List<Integer>>();
				periodList=new ArrayList<Integer>();
				courseVo.setCourse_id(courseList.get(i).get("course_id").toString());
				courseVo.setCredit((Double) courseList.get(i).get("credit"));
				courseVo.setProfessor_id((Integer) courseList.get(i).get("professor_id"));
				
			}else {
				group_by_name=new HashMap<String, HashMap<String,List<Integer>>>();
				group_by_day =new HashMap<String, List<Integer>>();
				if(courseList.get(i).get("course_id").toString().equals(course_id)&&courseList.get(i).get("course_name").toString().equals(course_name)) {
					if(courseList.get(i).get("day").toString().equals(day)) {
						periodList=new ArrayList<Integer>();
						periodList.add((Integer)courseList.get(i-1).get("periood"));
						periodList.add((Integer)courseList.get(i).get("periood"));
						group_by_day.put(courseList.get(i).get("day").toString(), periodList);
						group_by_name.put(courseList.get(i).get("course_name").toString(), group_by_day);
						courseVo.setGroup_by_name(group_by_name);
						courseVoList.add(courseVo);
					}else {
						group_by_name=new HashMap<String, HashMap<String,List<Integer>>>();
						group_by_day =new HashMap<String, List<Integer>>();
						periodList=new ArrayList<Integer>();
						
						periodList.add((Integer)courseList.get(i-1).get("periood"));
						group_by_day.put(courseList.get(i-1).get("day").toString(), periodList);
						periodList=new ArrayList<Integer>();
						periodList.add((Integer)courseList.get(i).get("periood"));
						group_by_day.put(courseList.get(i).get("day").toString(), periodList);
						group_by_name.put(courseList.get(i).get("course_name").toString(), group_by_day);
						courseVo.setGroup_by_name(group_by_name);
						courseVoList.add(courseVo);
					}
				}else {
					courseVo=new CourseVo();
					courseVo.setCourse_id(courseList.get(i).get("course_id").toString());
					courseVo.setCredit((Double) courseList.get(i).get("credit"));
					courseVo.setProfessor_id((Integer) courseList.get(i).get("professor_id"));					
				}
			}
			course_id=courseList.get(i).get("course_id").toString();
			course_name=(String) courseList.get(i).get("course_name").toString();
			day=(String) courseList.get(i).get("day").toString();
		}	
		
		return courseVoList;
	
	}
	/**°´°ü½Ä insertservice**/
	public void insertObjective(Map<String,Object>map){
		professorDao.insertObjective(map);
	}
	public void insertSubjective(Map<String,Object>map) {
		professorDao.insertSubjective(map);
	}
	public void insertOXQuestion(Map<String,Object> map){
		String s = map.get("question_answer").toString();
		int question_answer = s.equals("O")? 1 : 0;
		map.put("question_answer", question_answer);
		professorDao.insertOXQuestion(map);
	}
}
