package com.nhnent.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nhnent.model.GradeType;

/**
 * The Class CalculateTest.
 */
public class CalculatorTest {
	
	private Calculator calculator = new Calculator();

	/**
	 * Test calculate_90점_이상이면_ a를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_90점_이상이면_A를_받는다() throws Exception {
		
		GradeType actual = calculator.calculate(96);
		
		assertEquals(GradeType.A, actual);
	}
	
	/**
	 * Test calculate_80점에서_90점_사이면_ b를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_80점에서_90점_사이면_B를_받는다() throws Exception {
		
	}
	
	/**
	 * Test calculate_70점에서_80점_사이면_ c를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_70점에서_80점_사이면_C를_받는다() throws Exception {
		
	}
	
	/**
	 * Test calculate_60점에서_70점_사이면_ d를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_60점에서_70점_사이면_D를_받는다() throws Exception {
		
	}
	
	/**
	 * Test calculate_60점_이하이면_ f를_받는다.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculate_60점_이하이면_F를_받는다() throws Exception {
		
	}
}
