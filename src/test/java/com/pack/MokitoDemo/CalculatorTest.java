package com.pack.MokitoDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
	Calculator c = null ;
	//CalculationService cs = null;
	CalculationService cs = new Mockito().mock(CalculationService.class);
	
	@Test
	public void test() {
		assertEquals(0,c.PerformanceCalculation(cs));
		System.out.println("Tested operation.......");
		}
	@Before
	public void createObject()
	{
		System.out.println("Object Created");
		c = new Calculator();
		/*cs = new CalculationService() {
			
			public int add(int a, int b) {
				// It acts as a anonymous class which implements interface
				return a+b;
			}
		};*/
	}
	@After
	public void removeObject()
	{
		System.out.println("Object Dereferenced");
		c = null;
		cs = null;

}
	}
