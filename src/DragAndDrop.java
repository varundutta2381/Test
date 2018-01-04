import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static WebDriver driver;
	

	public static void main (String args[])throws InterruptedException
	
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		Actions builder = new Actions(driver); 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable = driver.findElement(By.id("draggable")) ;
		WebElement droppable = driver.findElement(By.id("droppable")) ;
		new Actions(driver).dragAndDrop(draggable, droppable).build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
