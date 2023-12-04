package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class3 {
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("Before executing any methods in the class");
	}
	
	
	
	@Test 
	public void webloginCarLoan() {
		
		System.out.println("WebloginCar");
	}
	
	@BeforeMethod
	public void beforeevery() {
		
		System.out.println("I will execute before every test method in day 3 class");
		
	}
	
	@AfterClass
public void afterclass() {
		
		System.out.println("after executing all the methods in the class");
	}
	
	
	@AfterMethod
	public void beforeevery1() {
		
		System.out.println("I will execute after every test method in day 3 class");
		
	}
	
	
	@Test
	public void mobileSigninCarLoan() {
		
		System.out.println("mobilesigninCar");
	}
	
	@BeforeSuite 
	public void Bfsuite() {
		
		System.out.println("I am no 1");
	}
	
	@Test
	public void mobileSignoutCarLoan() {
		
		System.out.println("mobilesignoutCar");
	}

}
