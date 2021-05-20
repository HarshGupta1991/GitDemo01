import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> handles= driver.getWindowHandles();
		Iterator <String> it =handles.iterator();
		
		String parent= it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/div/app-interview-material/div/div/div[2]/p[2]")).getText());
		String emailId= driver.findElement(By.xpath("/html/body/app-root/div/app-interview-material/div/div/div[2]/p[2]")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailId);
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(emailId);

	}

}
