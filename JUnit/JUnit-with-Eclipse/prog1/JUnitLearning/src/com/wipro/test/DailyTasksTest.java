package com.wipro.test;

//import static org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class DailyTasksTest {
	private DailyTasks dt;
	
	@Before
	public void setup() {
		dt = new DailyTasks();
	}
	
	@Test
	public void testDoStringConcat() {
		DailyTasks dt = new DailyTasks();
		String actual = dt.doStringConcat("Hello", "World");
		String expected = "Hello World";
		assertEquals(expected, actual);
//		fail("Not yet implemented");
	}
	
	@Test
	public void testSortValues() {
		DailyTasks dt = new DailyTasks();
		int[] arr = {3,5,1,4,2};
		int[] actual = dt.sortValues(arr);
		int[] expected = {1,2,3,4,5};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testCheckPresence() {
		DailyTasks dt = new DailyTasks();
		String str = "Java";
		boolean actual = dt.checkPresence(str, "a");
		boolean expected = true;
		assertEquals(expected,actual);
	}
	
	@Test
    public void testCheckPresence_True() {
        assertTrue(dt.checkPresence("Welcome to Java", "Java"));
    }

    @Test
    public void testCheckPresence_False() {
        assertFalse(dt.checkPresence("Welcome to Java", "Python"));
    }
}
