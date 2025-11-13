package javatask11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlingExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.manage().window().maximize();

        String originalWindow = driver.getWindowHandle();

        
        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        WebElement heading = driver.findElement(By.tagName("h3"));
        if (heading.getText().equals("New Window")) {
            System.out.println(" Verification Passed: Text 'New Window' is present.");
        } else {
            System.out.println(" Verification Failed: Text not found.");
        }

        driver.close();
        driver.switchTo().window(originalWindow);
        if (driver.getWindowHandle().equals(originalWindow)) {
            System.out.println("Original window is active.");
        } else {
            System.out.println("Original window is not active.");
        }
        driver.quit();
    }
}
