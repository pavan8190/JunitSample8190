package junit.junitSamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit2 {

	@Test
	public void test1() {
		
		String str= "I am done with Junit setup";
	    assertEquals("I am done with Junit setup",str);
	    assertNotNull(str);
	    //assertNull(str); //case fails
	    
	    assertFalse(false);
	    System.out.println("TestJunit2");
	    
	}

}
