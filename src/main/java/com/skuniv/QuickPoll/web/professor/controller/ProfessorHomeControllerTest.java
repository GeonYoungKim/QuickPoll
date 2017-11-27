package com.skuniv.QuickPoll.web.professor.controller;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.skuniv.QuickPoll.util.ExcelRead;
import com.skuniv.QuickPoll.util.ExcelReadOption;

public class ProfessorHomeControllerTest {

	@Test
	public void test() {
		
		ExcelReadOption ro = new ExcelReadOption();
		ro.setFilePath("sample.xlsx");
		ro.setOutputColumns("A", "B", "C", "D");
		ro.setStartRow(1);

		List<Map<String, String>> result = ExcelRead.read(ro);
		System.out.println(result.get(1).keySet());
		for (Map<String, String> map : result) {
			System.out.println(map.get("A") + " , " + map.get("B") + " , " + map.get("C") + " , " + map.get("D"));
		}

	}

}
