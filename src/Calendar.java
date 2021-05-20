import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	driver.findElement(By.xpath(".//*[@id=\'travel_date\']")).click();
	
	  while(!driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[2]")).getText().contains("July")) {
	  
	  driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[3]")).click(); 
	  }
	  
	  List<WebElement> day =driver.findElements(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[4]"));
	  
	  int count =driver.findElements(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[4]")).size();
	  System.out.println(day);
	  for(int i=0; i<count ;i++) {
		  
		 String pDay=driver.findElements(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[4]")).get(i).getText();
		  
		 if(pDay.equalsIgnoreCase("21"))
		 {
			  driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[4]")).click();
	  }
	
	}

}}
