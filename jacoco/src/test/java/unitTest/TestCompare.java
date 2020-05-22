package unitTest;

import org.testng.annotations.Test;


import compare.CompareString;

public class TestCompare {
	@Test
	public void test1() {
		CompareString obj = new CompareString();
		obj.containsOrNot("Selenium is Test Automation Tool");
		
	}
/*	@Test
	public void test2() {
		CompareString obj = new CompareString();
		obj.containsOrNot("jenkins is CI tool");
	}*/
}
