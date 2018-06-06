package junit.junitSamples;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCaseOrder {
 
		@Test
	    public void secondTest() {
	        System.out.println("Executing second test");
	    }
	  
	    @Test
	    public void firstTest() {
	        System.out.println("Executing first test");
	    }
	 
	    @Test
	    public void thirdTest() {
	        System.out.println("Executing third test");
	    }

}
