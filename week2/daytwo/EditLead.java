package weektwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*http://leaftaps.com/opentaps/control/main

* 1	Launch the browser
* 2	Enter the username
* 3	Enter the password
* 4	Click Login
* 5	Click crm/sfa link
* 6	Click Leads link
* 7	Click Find leads
* 8	Enter first name
* 9	Click Find leads button
* 10 Click on first resulting lead
* 11 Verify title of the page
* 12 Click Edit
* 13 Change the company name
* 14 Click Update
* 15 Confirm the changed name appears
* 16 Close the browser (Do not log out)
*/
public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	         
	     WebElement wefindleads = driver.findElement(By.linkText("Find Leads"));
	     wefindleads.click();
	     
	     WebElement wefirstname = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
	     wefirstname.sendKeys("Naveen");
	   
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     
	     Thread.sleep(5000);
	     
         WebElement wefirstlead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
         
         wefirstlead.click();
                 
         String title= driver.getTitle();
         
         Thread.sleep(5000);
         
         WebElement weedit = driver.findElement(By.xpath("//a[text()='Edit']"));
         weedit.click();
         
         Thread.sleep(5000);
         
         String compnameupdate="Test House LLC";
         
         WebElement wecompname=driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
         wecompname.clear();
         wecompname.sendKeys(compnameupdate);
         
         WebElement weupdate=  driver.findElement(By.name("submitButton"));
         weupdate.click();
         
         WebElement weviewcompname= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
         String compname=weviewcompname.getText();
         
         if (compname.contains(compnameupdate))
         {
        	 System.out.println("Company name is updated with the given text "+compnameupdate );
        	 
         }
         else 
         {
        	 System.out.println("Company name is not updated ");
        	 
         }
         
         System.out.println(title);
         
         Thread.sleep(5000);
         
         driver.quit();

	}

}
