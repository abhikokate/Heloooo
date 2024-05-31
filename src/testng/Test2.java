package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	
	
	@BeforeSuite
	public void precondition4() {
		System.out.println("before suit");
	}
		
	@BeforeTest
	public void precondition3() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void precondition2() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void precondition1() {
		System.out.println("before method");
	}

  @Test
  public void testcase2() {
	  System.out.println("test case 2");
  }
	  
	    @AfterMethod
	       public void postcondition1() {
	    	   System.out.println("after method");   
	       }
	  
	       @AfterClass
	       public void postcondition2(){
	    	   System.out.println("after class");
	       }
	  
	       @AfterTest
	       public void postcondition3() {
	    	   System.out.println("after test");
	       }
	       
	       @AfterSuite
	       public void postcondition4() {
	    	   System.out.println("after suit");
	    	   
	  
  }
  
}
