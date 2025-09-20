package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Drag and Drop")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement src=driver.findElement(By.cssSelector("#column-a"));
		WebElement dest=driver.findElement(By.cssSelector("#column-b"));
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest);
		action.build().perform();
		System.out.println("Dropped successfully");
		driver.close();
		

	}

}
