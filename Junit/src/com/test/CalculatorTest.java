package com.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;

import com.day13.Calculator;

public class CalculatorTest {
	int input1; 
	int input2;
	static Calculator calc;
	
	@BeforeClass
	static public void beforeClass() {
		System.out.println("Before Class");
		calc = new Calculator();
	}
	
	@AfterClass
	static public void AfterClass() {
		System.out.println("Before Class");
		calc = null;
	}
	
	@Before
	public void before()
	{	
		System.out.println("Before");
		input1 =20;
		input2 =30;
	}
	@After
	public void After()
	{
		System.out.println("After");
	}
	@Test
	public void testAddition() {
		System.out.println("Test Addition");
		int actual = calc.addition(input1, input2);
		int expected = 50;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubraction() {
		System.out.println("Test Subraction");
		int actual = calc.subraction(input1,input2);
		int expected = -10;
		assertEquals(expected, actual);
	}

}
