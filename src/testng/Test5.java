package testng;

import org.testng.annotations.Test;

public class Test5 {
	
	
  @Test(enabled = false)
  public void button() {
	  System.out.println("buttton");
  }

  @Test
  public void entercred() {
	  System.out.println("entercred");
  }

  @Test(enabled = false)
  public void login() {
	  System.out.println("login");
  }
}
