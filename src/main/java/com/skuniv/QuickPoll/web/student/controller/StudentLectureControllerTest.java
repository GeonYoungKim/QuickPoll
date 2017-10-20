package com.skuniv.QuickPoll.web.student.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StudentLectureControllerTest {

	@Test
	public void test() {
		  StringBuffer message = new StringBuffer();
		  InputStreamReader isr = null;
		  BufferedReader br = null;
		  try {
		   Process p = Runtime.getRuntime().exec(System.getenv("windir")+"\\system32\\"+"tasklist.exe");
		   isr = new InputStreamReader(p.getInputStream());
		   br = new BufferedReader(isr);
		   
		   String line = null;
		   while ((line = br.readLine())!= null) {
		System.out.println("msg=>"+line);
		     }
		  } catch (IOException e) {
		   e.printStackTrace();
		  } finally {
		   if(isr!=null) try {isr.close(); } catch (IOException e) {}
		   if(br!=null) try { br.close();} catch (IOException e) {}
		  }

//	      msgBox("Running processes : " + result);
	}

	public static List<String> listRunningProcesses() {
	    List<String> processes = new ArrayList<String>();
	    try {
	      String line;
	      Process p = Runtime.getRuntime().exec(System.getenv("windir")+"\\SysWOW64\\tasklist.exe /fo csv /nh");
	      BufferedReader input = new BufferedReader
	          (new InputStreamReader(p.getInputStream()));
	      while ((line = input.readLine()) != null) {
	          if (!line.trim().equals("")) {
	              // keep only the process name
	              line = line.substring(1);
	              processes.add(line.substring(0, line.indexOf("")));
	          }

	      }
	      input.close();
	    }
	    catch (Exception err) {
	      err.printStackTrace();
	    }
	    return processes;
	  }


	  public static void msgBox(String msg) {
	    javax.swing.JOptionPane.showConfirmDialog((java.awt.Component)
	       null, msg, "WindowsUtils", javax.swing.JOptionPane.DEFAULT_OPTION);
	  }
}
