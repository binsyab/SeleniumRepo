package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	/*
	 * Assignment 2:Edit Lead
		  1. Launch URL "http://leaftaps.com/opentaps/control/main"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Click on Create Button
                  15. Click on edit button
                  16. Clear the Description Field using .clear()
		  17. Fill ImportantNote Field with Any text
		  18. Click on update button 
		  19. Get the Title of Resulting Page. refer the video  using driver.getTitle()
	 */
	
public static void main( String[] args ) throws InterruptedException
        {
	  WebDriverManager.chromedriver().setup();
	       
	  ChromeDriver driver = new ChromeDriver();
	       
	  driver.get("http://leaftaps.com/opentaps/control/main");
	       
	  driver.manage().window().maximize();
	       
	   WebElement weusername =driver.findElement(By.id("username"));
	       
	   weusername.sendKeys("Demosalesmanager");
	       
           WebElement wepassword =driver.findElement(By.id("password"));
	       
           wepassword.sendKeys("crmsfa");
           
           WebElement welogin= driver.findElement(By.className("decorativeSubmit"));
          
           welogin.click();
          
           Thread.sleep(5000); 
          
           WebElement wecrmlink = driver.findElement(By.linkText("CRM/SFA"));
         
           wecrmlink.click();
         
           WebElement weleads =driver.findElement(By.linkText("Leads"));
         
           weleads.click();
         
           WebElement wecreatelead=driver.findElement(By.linkText("Create Lead"));
         
           wecreatelead.click();
           
           WebElement wecompanyname = driver.findElement(By.id("createLeadForm_companyName"));
           
           wecompanyname.sendKeys("HR Consultancy");
           
           WebElement wefirstname=driver.findElement(By.id("createLeadForm_firstName"));
           
           wefirstname.sendKeys("Alex");
           
           WebElement welastname= driver.findElement(By.id("createLeadForm_lastName"));
           
           welastname.sendKeys("Abraham");
           
           WebElement wefirstnamelocal= driver.findElement(By.id("createLeadForm_firstNameLocal"));
           
           wefirstnamelocal.sendKeys("Alexy");
           
           WebElement wedepartment= driver.findElement(By.id("createLeadForm_departmentName"));
           
           wedepartment.sendKeys("HR");
           
           WebElement wedescription = driver.findElement(By.id("createLeadForm_description"));
           
           wedescription.sendKeys("Human Resource Department");
           
           WebElement weemail = driver.findElement(By.id("createLeadForm_primaryEmail"));
           
           weemail.sendKeys("test@email.com");
           
           WebElement wecreatebutton = driver.findElement(By.name("submitButton"));
           
           wecreatebutton.click();
           
           String title= driver.getTitle();
           
           System.out.println("Title of Resulting Page: " + title);      
           
           WebElement weedit = driver.findElement(By.linkText("Edit"));
           
           weedit.click();
           
           Thread.sleep(5000);
           
           WebElement weupdatedesc=driver.findElement(By.id("updateLeadForm_description"));
           
           weupdatedesc.clear();
           
           WebElement weimpnote = driver.findElement(By.id("updateLeadForm_importantNote"));
           
           weimpnote.sendKeys("Important Note : Data Edited ");
           
           WebElement weupdate= driver.findElement(By.name("submitButton"));
           
           weupdate.click();
           
           String editpagetitle=driver.getTitle();
           
           System.out.println("Title of Edit Page: " + editpagetitle);
           
	    }

	
}
