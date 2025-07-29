package com.wipro.test;

//import static org.junit.Assert;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class DailyTasksTest {

	@Test
	public void testDoStringConcat() {
		DailyTasks dt = new DailyTasks();
		String actual = dt.doStringConcat("Hello", "World");
		String expected = "HelloWorld";
		assertEquals(expected, actual);
//		fail("Not yet implemented");
	}

}
