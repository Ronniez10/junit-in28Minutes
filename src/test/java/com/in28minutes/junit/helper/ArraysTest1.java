package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysTest1 {

	StringHelper stringHelper= new StringHelper();
	
	
	@Test
	public void arraysSortTest_RandomArray()
	{
		int[] numbers = {12,4,3,1,2};
		int[] expected = {1,2,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	
	@Test()
	public void testSort_Performance()
	{
		assertTimeout(Duration.ofSeconds(5), () -> sortArray());
	}
	
	 public int[] sortArray() throws InterruptedException {
			Thread.sleep(10000);
			
			return new int[] {1,2,3,4};
		}
	

}
