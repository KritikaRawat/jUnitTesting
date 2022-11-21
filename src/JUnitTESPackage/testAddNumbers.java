package JUnitTESPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);	
		}
	

}
