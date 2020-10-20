package org.qsp.TestNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class groupNdependans {
	  @Test(groups = "integration" , dependsOnGroups = "functional" , priority = 2)
	  public void Tc_01()
	  {
		  System.out.println("integration testing - 2");
	  }
	  @Test(groups = "integration" , dependsOnGroups = "functional" , priority = 1)
	  public void Tc_02() 
	  {
		  System.out.println("integration testing - 1");
	  } 
	  @Test(groups = "functional" ,dependsOnGroups = "somke" , priority = 1)
	  public void Tc_03() 
	  {
		  System.out.println("Functional Testingv - 1");
	  }  
	  @Test(groups = "somke" , priority = 1 , invocationCount = 0)
	  public void Tc_04() 
	  {
		  System.out.println("Somke Testing - 1" );
	  }  
	  @Test (groups = "somke" , priority = 2)
	  public void Tc_05() 
	  {
		  System.out.println("Somke Testing - 2");
         // Assert.fail();
	  }  
	  @Test(groups = "funtional" )
	  public void Tc_06()
	  {
		  System.out.println("functional Testing");
	  }  
	  @Test(groups = "integration")
	  public void Tc_07() {
		  System.out.println("integration Testing");
	  }  
	  @Test(groups = "some" , priority = 2)
	  public void Tc_08() {
		  System.out.println("some - 2");
	  }
}
