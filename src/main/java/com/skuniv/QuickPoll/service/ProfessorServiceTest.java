package com.skuniv.QuickPoll.service;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.Test;

public class ProfessorServiceTest {

	@Test
	public void test() {
		StringTokenizer st = new StringTokenizer("bit[token]byte[token]frame[token]packet[token]");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken("[]"));
		}
		
	}
	
}
