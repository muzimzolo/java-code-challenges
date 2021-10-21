package com.debugger.java.challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordComplexityTest {

	   @Test
	   public void isPasswordComplex_true() {
	       assertTrue(PasswordComplexity.isPasswordComplex("MuziDebugger452"));
	       assertTrue(PasswordComplexity.isPasswordComplex("ChelseaFC2021"));
	       assertTrue(PasswordComplexity.isPasswordComplex("45Password"));
	       assertTrue(PasswordComplexity.isPasswordComplex("He11oworld"));
	       assertTrue(PasswordComplexity.isPasswordComplex("goodMusic66"));
	   }

	   @Test
	   public void isPasswordComplex_false() {
	       assertFalse(PasswordComplexity.isPasswordComplex("12aB "));
	       assertFalse(PasswordComplexity.isPasswordComplex("Ab112"));
	       assertFalse(PasswordComplexity.isPasswordComplex("happy"));
	       assertFalse(PasswordComplexity.isPasswordComplex("happy_1"));
	       assertFalse(PasswordComplexity.isPasswordComplex("p assword12"));
	       assertFalse(PasswordComplexity.isPasswordComplex("Sur18"));
	       assertFalse(PasswordComplexity.isPasswordComplex(""));
	   }
	}