package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program1Test {

	@Test
	void test1() {
		try {
			int res=new Program1().solution("a#n90");
		}
		catch (BugException e) {
			// TODO: handle exception
			assertEquals("Invalid Character", e.getMessage());
		}
	}
	@Test
	void test2() {
		
		try {
			Program1 p =new Program1();
			int res;
			res = p.solution("a123");
			assertEquals(6, res);
		} catch (BugException e) {
			// TODO Auto-generated catch block
			fail();}}}
		
