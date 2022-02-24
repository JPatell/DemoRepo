package selenium;

import org.testng.annotations.Test;

public class Sample {
	  @Test(dataProvider = "dp")
	  public void abc(Integer n, String s) {
		  System.out.println(n+s);
	  }
	

}
