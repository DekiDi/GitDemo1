package testPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
//we removed public static main void...
public class class1 {

	@AfterTest
	public void lastexecution() {
		
		System.out.println("I will execute last");
	}
	
	
	@Test(groups= {"Smoke"}) // for running tests in testNG
	public void demo() {   //every test is nothing but a method
	
	System.out.println("hello");
}
	
	@AfterSuite 
	public void afSuite() {
		
		System.out.println("I am the last number");
		
	}
	
	@Test 
	public void SecondTest() {
		
		System.out.println("bye");
		
	}

}
