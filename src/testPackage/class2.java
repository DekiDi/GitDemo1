package testPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {

	@Test(groups= {"Smoke"})
	public void PLoan() {
		
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("I will execute first");
		
		
	}
}
