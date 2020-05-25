package DevopsPractise.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addBook {
  WebDriver driver ;	
	
  @BeforeMethod
  public void verifyURL() {
	  
	  
		  System.setProperty("webdriver.chrome.driver", "C://Users//AshishSurve//eclipse-workspace//chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.get("http://13.234.66.248:32768/addressbook/");
		 // String x = driver.getTitle();
		 // System.out.println(x);
  }
  
  
  @Test
  public void verifyaddbook() {
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Selenium");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("edureka");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("7066087031");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("ashish@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("04/01/1984");
	
	 
	  
	  
  }
  
  @AfterMethod
  public void close() {
	  
	  
		 driver.close();
  }
}
