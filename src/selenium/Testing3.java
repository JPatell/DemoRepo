package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test (priority = 1, groups = "smoke")
	public void createUser() {
		  System.out.println("I am in home test");
		  System.out.println("Before assertion");
		  Assert.assertTrue(2 > 3, "Verifying Element");
		  System.out.println("after assertion");
		  Assert.assertEquals("abc", "abc");
	}

	@Test(priority = 2, dependsOnMethods = "createUser")
	public void editUser() {
		  System.out.println("Before assertion");
		  softAssert.assertTrue(2 > 3, "Verifying Element");
		  System.out.println("after assertion");
		  softAssert.assertAll(); // similar to error collector in JUnit
	}
	
	@Test(priority = 3, dependsOnMethods = "editUser")
	public void deleteUser() {
		  System.out.println("I am in end test");
		  System.out.println("Before assertion");
		  softAssert.assertTrue(2 > 3, "Verifying Element");
		  System.out.println("after assertion");
		  softAssert.assertEquals("abc", "abc");
		  System.out.println("after second assertion");
		  softAssert.assertAll();
	}
	
}
