import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']"))).doubleClick().build().perform();
	act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Harsh").contextClick().build().perform();

	}

}
