package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Blogcreation;
import TestBase.Testbasepage;

public class TC_002_Blogcreation extends Testbasepage
{
@Test(groups= {"sanity","regression","master"})
public void setupblog() throws InterruptedException
{
logger.info("*** Strting of the test case blog creation ***");
try
{
Blogcreation bgcreation = new Blogcreation(driver);
bgcreation.email(p.getProperty("email"));
bgcreation.pwd(p.getProperty("password"));
bgcreation.signinbutton();
Thread.sleep(5000);
bgcreation.blogbutton();
bgcreation.addnewblog();
bgcreation.titlecate(randomString());
Thread.sleep(5000);
bgcreation.drp();
Thread.sleep(5000);
//bgcreation.selectcat();
//Thread.sleep(5000);
bgcreation.urlvideo();
Thread.sleep(10000);
//bgcreation.blogbold();
bgcreation.blogcontent();
bgcreation.blogconclusion();
bgcreation.confirmation();
bgcreation.buttoncancel();
Thread.sleep(5000);
bgcreation.can();
Thread.sleep(5000);
bgcreation.pconfirmation();
}
catch(Exception e )
{
	logger.error("test failed");	
	Assert.fail();
}

}
}
