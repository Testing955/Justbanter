package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminlogin extends Baseclass
{
WebDriver driver;
public Adminlogin(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[1]/input")
WebElement email;
@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/input")
WebElement password;
@FindBy(xpath="/html/body/div[1]/div/div[2]/button")
WebElement signin;
@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/img")
WebElement logout;
public void email(String efield)
{
email.sendKeys(efield);
}
public void pwd(String pwdfield)
{
password.sendKeys(pwdfield);
}
public void signinbutton()
{
signin.click();
}
public void logoutbutton()
{
logout.click();
}
}
