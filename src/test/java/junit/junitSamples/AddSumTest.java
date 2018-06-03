package junit.junitSamples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AddSumTest {

	private int a;
	private int b;
	private int expected;
	private AddSum as;
	
	public AddSumTest(int a,int b,int expected) {
		super();
		this.a = a;
		this.b = b;
		this.expected = expected;
	}
	
	@Before
	public void initialize() {
		as = new AddSum();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3},{11,22,33}});
	}
	
	@Test
	public void test() {
		System.out.println(expected);
		assertEquals(expected, as.sum(a, b));
	}
}
