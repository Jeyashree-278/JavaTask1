
package javatask10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAutomation {
	
	    public static void main(String[] args) throws InterruptedException {
	        
	       
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://jqueryui.com/droppable/");
	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	        WebElement source = driver.findElement(By.id("draggable"));
	        WebElement target = driver.findElement(By.id("droppable"));
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(source, target).build().perform();

	        Thread.sleep(2000);
	        String bgColor = target.getCssValue("background-color");
	        System.out.println("Background color after drop: " + bgColor);

	        String targetText = target.getText();
	        if (targetText.equals("Dropped!")) {
	            System.out.println("Drag and Drop Successful! Text changed to: " + targetText);
	        } else {
	            System.out.println(" Drag and Drop Failed! Current text: " + targetText);
	        }

	 
	        driver.quit();
	    }
	}


