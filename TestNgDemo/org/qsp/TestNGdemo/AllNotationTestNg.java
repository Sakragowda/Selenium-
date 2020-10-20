package org.qsp.TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllNotationTestNg {
	int count;
  @Test(invocationCount = 3)
  public void Tc_sgk() 
  {
	  System.out.println("Tc_sgk : count"+count);
	  count++;
  }  
  @Test(invocationTimeOut = 3)
  public void Tc2_sgk()
  {
	  System.out.println("Tc2_sag : count ="+count);
	  count++;
  }
  @Test(successPercentage = 50)
  public void Tc3_sgk() 
  {
	  System.out.println("Tc3_sag : count ="+count);
	  count++;
  } 
  @Test(enabled = true)
  public void Tc4_sgk() 
  {
	  System.out.println("Tc4_sag : count ="+count);
	  count++;
  }  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method");
  }

//
//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("Befor class");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("After the class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Befor Test case");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After test case");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("Before Souit");
  }
  
  @Test(testName = "tc")
  public void Tc5_sgk() 
  {
	  System.out.println("Tc_sgk : count"+count);
	  count++;
  }  
   
  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After Souit");
  }

}
