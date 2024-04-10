package Testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObject.Adminlogin;
import TestBase.Testbasepage;

public class TC_001_Adminsignin extends Testbasepage
{
@Test(groups= {"sanity","master"})
public void signin()
{
logger.info("**Starting of the testcase**");
try
{
Adminlogin al = new Adminlogin(driver);
Thread.sleep(5000);
al.email(p.getProperty("email"));
logger.info("Entering valid email");
al.pwd(p.getProperty("password"));
logger.info("Entering valid password");
Thread.sleep(5000);
al.signinbutton();
logger.info("Admin login successfull");
Thread.sleep(5000);
//al.logoutbutton();
logger.info("admin signout the account");

}
catch(Exception e)
{
logger.error("test failed");	
Assert.fail();
}
}
}
