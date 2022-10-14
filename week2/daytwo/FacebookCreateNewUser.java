package weektwo.daytwo;
/*
 * Assignment:1

FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chrome browser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximize the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enter the password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) 
 * 
 */

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateNewUser {
	
	public static void main(String[] args)
	{
	  WebDriverManager.chromedriver().setup();
	  
	  ChromeDriver driver = new ChromeDriver();
	  	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://en-gb.facebook.com/");
	  
	  WebElement wecreatenewacc=driver.findElement(By.linkText("Create New Account"));	  
	  wecreatenewacc.click();
	  
	  WebElement wefirstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	  wefirstname.sendKeys("George");
	  
	  WebElement welastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	  welastname.sendKeys("Alex");
	  
	  WebElement weemail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	  weemail.sendKeys("9887776543");
	  
	  WebElement weemailconf=driver.findElement(By.xpath("(//div[text()='New password']/following::input)[1]"));
	  weemailconf.sendKeys("9887776543");
	  
	  
	  WebElement wepass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	  wepass.sendKeys("testcom");
	  
	  WebElement webirthday=driver.findElement(By.name("birthday_day"));
	  Select sebirthday=new Select(webirthday);
	  sebirthday.selectByVisibleText("20");
	  
	  WebElement webirthmonth=driver.findElement(By.name("birthday_month"));
	  Select sebirthmonth=new Select(webirthmonth);
	  sebirthmonth.selectByValue("5");
	  
	  WebElement webirthyear=driver.findElement(By.id("year"));
	  Select sebirthyear=new Select(webirthyear);
	  sebirthyear.selectByIndex(30);
	  
	  WebElement wegender=driver.findElement(By.xpath("(//label[text()='Female']/following::input)[1]"));
	  wegender.click();
	  
	}
	
}
