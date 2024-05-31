package testng;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.ListenersClass.class)
public class Test8 {
  @Test
  public void button(){
	  System.out.println("button");
	  Assert.assertFalse(true);
	  
  }
  
  @Test
  public void homepage() {
	  System.out.println("homepage");
  }
  
  @Test(dependsOnMethods = "button")
  public void login() {
	  System.out.println("login");
  }
}
