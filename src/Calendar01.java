import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		https://www.makemytrip.com/
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/label")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
	Thread.sleep(5000);
	
	
	//driver.findElement(By.xpath(".//*[@id=\'travel_date\']")).click();

	}

}
