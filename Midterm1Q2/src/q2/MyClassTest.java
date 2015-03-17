package q2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//referenced the 'Midterm1' project in the build path
import MainPackage.MyClass; // imported the class 'MyClass' here

public class MyClassTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReturnTrue() {
		assertTrue("This method did not return true", MyClass.ReturnTrue());
	}
	
	@Test
	public void testAddTwoNumbers() {
		int num1 = 2;
		int num2 = 3;
		int expectedValue = 5;
		
		assertEquals("addTwoNumbers did not calculate the correct sum", 
				MyClass.AddTwoNumbers(num1, num2), expectedValue);
	}
	
}
