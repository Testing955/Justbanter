package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Blogcreation extends Adminlogin
{
WebDriver driver;
public Blogcreation(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="/html/body/div[2]/div[1]/div[2]/div[7]/div/div[2]/div")
WebElement blog;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div")
WebElement addblog;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/input")
WebElement title;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]")
WebElement drpdown;
@FindBy(xpath="//div[contains(@class, 'bubble-element Text') and contains(text(), 'sports')]")
WebElement sports;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/div[2]/div[3]/div[2]/input")
WebElement url;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/div[2]/div[5]/div[2]/div/div[1]/span[2]/button[1]/svg/path[2]")
WebElement bold;
@FindBy(xpath="//*[@id=\"richtext-editor-0\"]")
WebElement content;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/div[2]/div[6]/textarea")
WebElement conclusion;
@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div/img")
WebElement cancelbutton;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div")
WebElement publish;
@FindBy(xpath="/html/body/div[6]/div/div/div[3]/button[2]")
WebElement publishblog;
@FindBy(xpath="/html/body/div[6]/div/div/div[3]/button[1]")
WebElement cancel;
public void blogbutton()
{
blog.click();
}
public void addnewblog()
{
addblog.click();
}
public void  titlecate(String categorytitle)
{
title.sendKeys(categorytitle);
}
public void drp()
{
drpdown.click();
}
public void selectcat()
{
sports.sendKeys("sports");
}
public void urlvideo()
{
url.sendKeys("https://youtu.be/BGTx91t8q50?si=tRqYoiKkUYlwhjli");
}
public void blogbold()
{
bold.click();
}
public void blogcontent()
{
blog.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
}
public void blogconclusion() 
{
conclusion.sendKeys("Good Blog");
}
public void confirmation()
{
publish.click();
}
public void buttoncancel()
{
cancelbutton.click();
}
public void pconfirmation()
{
publishblog.click();	
}
public void can()
{
cancel.click();
}
}

