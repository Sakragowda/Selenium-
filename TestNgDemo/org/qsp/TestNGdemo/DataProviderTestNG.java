package org.qsp.TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTestNG {
  @DataProvider
  public String [][] dp() 
  {
	  String [][] dtl = new String[2][2];
    dtl[0][0] = "sakra";
    dtl[0][1] = "naveen";
    dtl[1][0] = "raman" ;
    dtl[1][1] = "kaarti";
    return dtl;
  }
//    new Runnable() {
//	public void run() {
//		System.out.println("run able");
//	}
//}
//  {
//	  System.out.println("unerName   :  passWord");
//  }  
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n + " : " + s );
  }  
}
