package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenersClass implements ITestListener {
 @Override
  public void onTestStart(ITestResult result) {
	 System.out.println("on test start");
  }
 @Override
 public void onTestSuccess(ITestResult result) {
	 System.out.println("on test succcess");
	 
 }
 
 @Override
 public void onTestSkipped(ITestResult result) {
	 System.out.println("on test skipped");
 }
}
