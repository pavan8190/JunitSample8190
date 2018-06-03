package junit.junitSamples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

//Ignores test class
//@Ignore
public class TestJunit1 {

	static int i,j;
	
	@Before
	public void allocate() {
		//runs before every test case
		i = 1;
	}
	
	@After
	public void deallocate() {
		//runs after every test case
		i = 0;
		System.out.println(i);
	}
	
	@BeforeClass
	public static void allocateOnce() {
		//runs before all test cases & it should be static method
		j = 1;
	}
	
	@AfterClass
	public static void dealloacteOnce() {
		//runs after all test cases & it should be static method
		j = 2;
		System.out.println(j);
	}
	
	//@Test(timeout=10) //test case fails after 10millisec
	//@Test(expected=ArithmeticException.class) //exception handling in test cases 
	@Test
	public void test1() {
		
		/*Integer k = 100000000;
		for(int i=0;i<k;i++) {
			System.out.println(i);
			//test case failed after 10millisec
		}*/
		
		//int k = 1/0;  //expected arithmetic exception ,still test case runs
		
		assertEquals(1, i);
		assertEquals(1, j);
		System.out.println("TestJunit1");
	}
	
	//@Ignore //ignore test case
	@Test
	public void test2() {
		assertNull(null);
	}

}
