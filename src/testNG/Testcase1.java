package testNG;

import org.testng.annotations.*;

public class Testcase1 {
	
	
	@BeforeTest
	public void BeforeTest1() {
		System.out.println("Inside Before Test");
	}
	
	@BeforeMethod
	public void BeforeMethod1() {
		
		System.out.println("Inside Before Method");
	}
	
	@Test (priority = 1)
	public void HomeLoanTest1() {
		
		System.out.println("Inside HomeLoanTest1");
		
	}
	
	@Test(priority = 0)
	public void HomeLoanTest2() {
		
		System.out.println("Inside HomeLoanTest2");
		
	}
	
	@Test (priority = 2)
	public void CarLoanTest1() {
		
		System.out.println("Inside CarLoanTest1");
		
	}
	
	@AfterMethod
	public void AfterMethod1() {
		
		System.out.println("Inside AfterMethod1");
	}
	
	@AfterTest
	public void AfterTest1() {
		System.out.println("Inside Before Test");
	}

}
