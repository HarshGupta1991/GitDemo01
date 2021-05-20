import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QAClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li[5]/a")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer= driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footerColumn=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(footerColumn.findElements(By.tagName("a")).size());
		
        for(int i=1;i<footerColumn.findElements(By.tagName("a")).size();i++) {
        	
        	String clickOn= Keys.chord(Keys.CONTROL,Keys.ENTER);
        	footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOn);
        	Thread.sleep(5000);
        }
        
        Set<String> abc=driver.getWindowHandles();
        Iterator<String> it=abc.iterator();
        
        while(it.hasNext()) {
        	
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
        	
        }
	}

}
