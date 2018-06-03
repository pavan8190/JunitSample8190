package junit.junitSamples;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	 public static void main(String[] args) {
	     //Result result = JUnitCore.runClasses(TestJunit1.class,TestJunit2.class);
		 
		 Result result = JUnitCore.runClasses(AllTests.class); //test suite of TestJunit1.class,TestJunit2.class
		 
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Result=="+result.wasSuccessful());
	   }
}
