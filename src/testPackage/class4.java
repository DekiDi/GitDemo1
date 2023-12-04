package testPackage;

import org.testng.annotations.Test;

public class class4 {
	
	@Test 
	public void webloginHomeLoan() {
		
		System.out.println("WebloginHome");
	}
	
	@Test
	public void mobileloginHomeLoan() {
		
		System.out.println("mobileloginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void loginAPIHomeLoan() {
		
		System.out.println("APIloginHome");
	}

}
