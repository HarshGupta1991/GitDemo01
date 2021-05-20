import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("/html/body/div[1]/p")).click();
		Actions act = new Actions(driver);
		WebElement drag= driver.findElement(By.id("draggable"));
	    WebElement drop= driver.findElement(By.id("droppable"));	
		act.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/ul/li[2]/a")).click();

	}

}
