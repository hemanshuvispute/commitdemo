package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("Test class started");}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Test class Finished");}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test method started");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test method finisheds");
	}

	@Test
	void test1() {
		assertEquals(true,true);
	}
	@Test
	void test2() {
		assertEquals(true,true);
	}

}
