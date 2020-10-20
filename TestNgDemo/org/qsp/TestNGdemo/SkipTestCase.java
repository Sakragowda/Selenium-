package org.qsp.TestNGdemo;

import org.testng.annotations.Test;



public class SkipTestCase {
  @Test
  public void f()
  {
	  System.out.println("Test - 1");
  }
  @Test
  public void f1()
  {
	  
	  org.testng.Assert.fail();
	  System.out.println("Test - 2");
	  
  }
}
