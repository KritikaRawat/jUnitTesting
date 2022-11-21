package JUnitTESPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitFunctions junit = new JUnitFunctions();
		String result = junit.AddStrings("Hello", " Their");
		assertEquals("Hello Their",result);
	}

}
