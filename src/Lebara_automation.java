import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lebara_automation {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D://ChromeDriverownlaoded//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("www.google.com");
	
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	  driver.get("https://mobile.lebara.com/gb/en/best-sim-only-deals/c/simo-contract");
		/*
		 * driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		 * //driver.manage().window().maximize();
		 * System.out.println(driver.getCurrentUrl()); Actions actions = new
		 * Actions(driver); Thread.sleep(10000); WebElement buyNow =
		 * driver.findElement(By.xpath(
		 * "./html[1]/body[1]/main[1]/div[6]/div[1]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[3]/div[2]/div[1]/form[1]/button[1]"
		 * )); actions.moveToElement(buyNow).click().perform();
		 * //driver.findElement(By.xpath(
		 * "/html[1]/body[1]/main[1]/div[6]/div[1]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[3]/div[2]/div[1]/form[1]/button[1]"
		 * )).click(); System.out.println("Harsh");
		 */
	  /** driver.findElement(By.cssSelector("button.btn.btn-primary.btn-block")).click(
		 * ); driver.findElement(By.id("register.email")).sendKeys("abc");
		 * driver.findElement(By.id("register.firstName")).sendKeys("Sonal");
		 * driver.findElement(By.id("register.lastName")).sendKeys("Sthapak");
		 * driver.findElement(By.id("password")).sendKeys("pwd");
		 * driver.findElement(By.id("verifyPassword")).sendKeys("pwd");
		 * driver.findElement(By.name("postalCode")).sendKeys("MIG");
		 */
	  
	  ////body/main0[1]/div[6]/div[1]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[3]/div[2]/div[1]/form[1]/button[1]
	 
}}
