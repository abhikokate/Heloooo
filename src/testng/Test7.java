package testng;

import org.testng.annotations.Test;

public class Test7 {
	
	  @Test(priority = 1, description = "click on button")
	  public void button() {
		  System.out.println("buttton");
	  }

	  @Test(priority = 2, description = "entercred given")
	  public void entercred() {
		  System.out.println("entercred");
	  }

	  @Test(priority = 3,  description = "this is login test case for user")
	  public void login() {
		  System.out.println("login");
}
}