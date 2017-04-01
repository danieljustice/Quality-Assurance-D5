package com.laboon;

import java.util.*;

import java.lang.Integer;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Pinning Tests for toString method in ProgramStack class
 */




public class ToStringPinningTest{

	//A ProgramStack with variable sized integers (not only single digits)
	//should be represented by a string of the integers in order, 
	//separated by commas and spaces and surrounded by "[" and "]"
	@Test
	public void testToStringDiffSizedIntegers(){
		ProgramStack stack = new ProgramStack();
		stack.push(0);
		stack.push(1);
		stack.push(20);
		stack.push(300);
		assertTrue(stack.toString().equals("[0, 1, 20, 300]"));
	}

	//A ProgramStack with negative and positive integers
	//should be represented by a string of the integers in order, 
	//separated by commas and spaces and surrounded by "[" and "]"
	@Test
	public void testToStringNegatives(){
		ProgramStack stack = new ProgramStack();
		stack.push(-1);
		stack.push(20);
		stack.push(-300);
		assertTrue(stack.toString().equals("[-1, 20, -300]"));
	}

	//A ProgramStack should be able to handle Max and Min Integer values
	//and should be represented by a string of the integers in order, 
	//separated by commas and spaces and surrounded by "[" and "]"
	@Test
	public void testToStringExtremeIntegers(){
		ProgramStack stack = new ProgramStack();
		stack.push(Integer.MAX_VALUE);
		stack.push(Integer.MIN_VALUE);

		assertTrue(stack.toString().equals("[2147483647, -2147483648]"));
	}

}