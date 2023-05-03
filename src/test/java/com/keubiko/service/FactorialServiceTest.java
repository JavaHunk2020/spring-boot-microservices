package com.keubiko.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialServiceTest {
	
	private FactorialService factorialService=new FactorialService();
	
	@Test
	public void testFactWhenNumZero() {
		int result=factorialService.fact(0);
		assertEquals(1, result);
	}
	
	@Test
	public void testFactWhenNumOne() {
		int result=factorialService.fact(1);
		assertEquals(1, result);
	}
	
	@Test
	public void testFactWhenNumFive() {
		int result=factorialService.fact(5);
		assertEquals(120, result);
	}
	
	@Test
	public void testFactWhenNumSix() {
		int result=factorialService.fact(6);
		assertEquals(720, result);
	}
	
	
	@Test
	public void testFactWhenNumNegative() {
		 ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
			factorialService.fact(-2);
	     });
		 assertEquals("Hey! you cannot compute factorial of negative num!", thrown.getMessage());
	}

}
