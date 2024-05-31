package testng;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
	
	
	
  @Test(dependsOnMethods = "entercred")
  public void button() {
	  System.out.println("button");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void entercred() {
	  System.out.println("entercred");
  }
  
  @Test(dependsOnMethods = "button")
  public void login() {
	  System.out.println("login");
  }
}
