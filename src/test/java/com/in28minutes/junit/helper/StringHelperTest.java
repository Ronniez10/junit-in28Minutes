package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.Parameters;

class StringHelperTest {
	
	StringHelper stringHelper;
	

	@BeforeEach
	void init()
	{
		stringHelper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));	
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_WithNegativeScenario()
	{
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_WithPositiveScenario()
	{
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@AfterEach
	public void tearDown()
	{
		System.out.println("After Everytest Run");
	}

}
