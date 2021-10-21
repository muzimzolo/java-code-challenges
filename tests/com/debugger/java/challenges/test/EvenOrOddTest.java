package com.debugger.java.challenges.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.debugger.java.challenges.EvenOrOdd;

public class EvenOrOddTest {

	// successful test case
	@Test
	public void isEvenTest() {
		assertTrue(EvenOrOdd.isEven(0));
		assertTrue(EvenOrOdd.isEven(2));
		assertTrue(EvenOrOdd.isEven(4));
		assertTrue(EvenOrOdd.isEven(6));
		assertTrue(EvenOrOdd.isEven(8));
		assertTrue(EvenOrOdd.isEven(-10));
		assertTrue(EvenOrOdd.isEven(-58));
	}

	// unsuccessful test case
	@Test
	public void isEven_false() {
		assertFalse(EvenOrOdd.isEven(1));
		assertFalse(EvenOrOdd.isEven(3));
		assertFalse(EvenOrOdd.isEven(5));
		assertFalse(EvenOrOdd.isEven(7));
		assertFalse(EvenOrOdd.isEven(9));
		assertFalse(EvenOrOdd.isEven(-11));
		assertFalse(EvenOrOdd.isEven(93));
		assertFalse(EvenOrOdd.isEven(-75));
	}
}
