package testng;

import org.testng.annotations.Test;

public class Test3 {
	
	     @Test (priority = 3)
	     public void button () {
	    	 System.out.println("button");
	     }
	    	
	     @Test(priority = 2)
	     public void entercred() {
	    	 System.out.println("entercred");
	     }
	     
	     @Test(priority = 1)
	     public void login () {
	    	 System.out.println("login");
	     }
	  }
	  
