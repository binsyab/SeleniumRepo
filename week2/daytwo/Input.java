package weektwo.daytwo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("(//h5[text()='Type your name']/following::div)[2]/input")).sendKeys("Binsy");
		
		driver.findElement(By.xpath("(//h5[text()='Append Country to this City.']/following::div)[2]/input")).sendKeys("-India");
		
		WebElement wedisabled = driver.findElement(By.xpath("(//h5[text()='Verify if text box is disabled']/following::div)[2]/input"));
		
		if (wedisabled.isEnabled()==false)
		{
			System.out.println("The Text Box is disabled");
		}
		else
		{
			System.out.println("The Text Box is not disabled");
		}
				
		WebElement weclear = driver.findElement(By.xpath("(//h5[text()='Clear the typed text.']/following::div)[2]/input"));
		weclear.clear();
		
		WebElement wegettext = driver.findElement(By.xpath("(//h5[text()='Retrieve the typed text.']/following::div)[2]/input"));
		String strtext=wegettext.getAttribute("value");
		System.out.println("The retrieved text is : "+strtext);
		
		WebElement weemail= driver.findElement(By.xpath("(//h5[contains(text(),'Type email')]/following::div)[2]/input"));
		weemail.sendKeys("test@email.com");
		
		weemail.sendKeys(Keys.TAB);
		
		WebElement weabout = driver.findElement(By.xpath("//textarea[@placeholder='About yourself']"));
		weabout.sendKeys("My name is Binsy");
	
		WebElement weconferrmsg = driver.findElement(By.xpath("(//h5[contains(text(),'Just Press Enter')]/following::input)[2]"));
		weconferrmsg.sendKeys(Keys.ENTER);
		
		WebElement errtext = driver.findElement(By.xpath("//span[contains(@id,'error-detail')]"));
		String strerrmsg=errtext.getText();
		
		if(strerrmsg.equalsIgnoreCase("Age is Mandatory"))
		{
			System.out.println("Error message " + strerrmsg + " matches with the given text" );
		}
		else
		{
			System.err.println("Error message " + strerrmsg + " does not match with the given text" );
			
		}
		
		WebElement welabelusername = driver.findElement(By.xpath("//label[text()='Username']"));
		
		System.out.println("Location of user name label before entering the user name :" + welabelusername.getLocation());
		
		WebElement weusername = driver.findElement(By.xpath("//span[@class='ui-float-label']/input"));
		weusername.sendKeys("Binsy");
		
		System.out.println("Location of user name label after entering the user name :" + welabelusername.getLocation());
		
		WebElement wesearcharrow = driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']"));
		wesearcharrow.click();
		
		WebElement wesearch = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		wesearch.sendKeys("Binsy");
		
		Thread.sleep(5000);
		
		WebElement wethirdopt = driver.findElement(By.xpath("(//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li)[3]"));
		wethirdopt.click();
		
		String dob = new String("2/2/1995");
				
		WebElement wedob = driver.findElement(By.xpath("//h5[contains(text(),'Type your DOB')]/following::input"));
		wedob.sendKeys(dob);
		
		Thread.sleep(5000);
		
		WebElement wedobclick= driver.findElement(By.xpath("//a[@class=' ui-state-default ui-state-active']"));
		wedobclick.click();
		
		
		if (dob.equalsIgnoreCase((wedob.getAttribute("value"))))
		{
			System.out.println("The value in the DOB text matches with the Date Of Birth " + dob);
		}
		else
		{
			System.err.println("The value in the DOB text does not match with the Date Of Birth " + dob );
		}
		
		String spinvalue=new String("34");
		
		WebElement wespin = driver.findElement(By.xpath("(//h5[contains(text(),'spin')]/following::input)[1]"));
		wespin.sendKeys(spinvalue);
		
		if(wespin.getAttribute("value").equals(spinvalue))
		{
			System.out.println("The value retrieved from the spin text matches with the given text " + spinvalue);
			
		}
		else
		{
			System.out.println("The value retrieved from the spin text does not match with the given text " + spinvalue);
		}
		
		WebElement werandomno = driver.findElement(By.xpath("(//h5[contains(text(),'Type random number (1-100)')]/following::input)[1]"));
		werandomno.sendKeys("100");
		
		WebElement weslider=driver.findElement(By.xpath("(//div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']/following::span)[1]"));
		
		System.out.println(weslider.getAttribute("style"));
		
		WebElement we = driver.findElement(By.xpath("(//h5[contains(text(),'Keyboard ')]/following::input)[1]"));
		we.click();
		
	
		
		
		
		
		}

}
