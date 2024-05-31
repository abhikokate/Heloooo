package testng;

import org.testng.annotations.Test;

public class Test6 {
	
	  @Test(invocationCount = 3)
	  public void button() {
		  System.out.println("buttton");
	  }

	  @Test(invocationCount = 2)
	  public void entercred() {
		  System.out.println("entercred");
	  }

	  @Test
	  public void login() {
		  System.out.println("login");
}
}