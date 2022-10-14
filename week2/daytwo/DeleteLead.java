package weektwo.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*http://leaftaps.com/opentaps/control/main

Delete Lead:
1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Phone
9	Enter phone number
10	Click find leads button
11	Capture lead ID of First Resulting lead
12	Click First Resulting lead
13	Click Delete
14	Click Find leads
15	Enter captured lead ID
16	Click find leads button
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
18	Close the browser (Do not log out)
*/
public class DeleteLead {

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
         
         WebElement wephonetab= driver.findElement(By.xpath("//span[text()='Phone']"));
         
         wephonetab.click();
         
         WebElement wephonecountrycode =driver.findElement(By.name("phoneCountryCode"));
         
         wephonecountrycode.clear();
         
         wephonecountrycode.sendKeys("91");
         
         WebElement wephoneareacode =driver.findElement(By.name("phoneAreaCode"));
         
         wephoneareacode.sendKeys("887");
         
         WebElement wephoneno =driver.findElement(By.name("phoneNumber"));
         
         wephoneno.sendKeys("94");
         
         WebElement wefindlead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
         
         wefindlead.click();
         
         Thread.sleep(5000);
         
         WebElement wefirstlead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
         
         String leadid = wefirstlead.getText();
         
         wefirstlead.click();
         
         WebElement wedelete = driver.findElement(By.xpath("//a[text()='Delete']"));
         
         wedelete.click();
         
         Thread.sleep(3000);
         
         driver.findElement(By.linkText("Find Leads")).click();
         
         Thread.sleep(5000);
         
         WebElement weleadid=driver.findElement(By.xpath("//input[@name='id']"));
         
         weleadid.sendKeys(leadid);
         
         System.out.println(leadid);
                         
         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
         
         Thread.sleep(5000);
         
         WebElement wepageinfo=driver.findElement(By.xpath("//div[@class='x-paging-info']"));

         System.out.println(wepageinfo.getText());
         
         if(wepageinfo.getText().contains("No records"))
         {
        	 System.out.println("The record is deleted");
         }
         else
         {
        	 System.out.println("The record is not deleted");
         }
                
         Thread.sleep(5000);
         
         driver.quit();
	}

}
