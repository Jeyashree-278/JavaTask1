package javatask11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class NestedFramesAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
        List<WebElement> frames = driver.findElements(By.xpath("//frame"));
        if (frames.size() == 3) {
            System.out.println(" There are three frames inside the top frame.");
        } else {
            System.out.println(" Expected 3 frames, found " + frames.size());
        }
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
        String leftText = driver.findElement(By.xpath("//body")).getText();
        System.out.println("Left Frame Text: " + leftText);
        if (leftText.equals("LEFT")) {
            System.out.println("Verified LEFT frame text.");
        }
        driver.switchTo().parentFrame();

     
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        String middleText = driver.findElement(By.xpath("//div")).getText();
        System.out.println("Middle Frame Text: " + middleText);
        if (middleText.equals("MIDDLE")) {
            System.out.println("Verified MIDDLE frame text.");
        }
        driver.switchTo().parentFrame();

        
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
        String rightText = driver.findElement(By.xpath("//body")).getText();
        System.out.println("Right Frame Text: " + rightText);
        if (rightText.equals("RIGHT")) {
            System.out.println("Verified RIGHT frame text.");
        }       
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
        String bottomText = driver.findElement(By.xpath("//body")).getText();
        System.out.println("Bottom Frame Text: " + bottomText);
        if (bottomText.equals("BOTTOM")) {
            System.out.println("Verified BOTTOM frame text.");
            
        }
        driver.switchTo().defaultContent();

       driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
       String title = driver.getTitle();
       System.out.println("Page title: " + title);

       if (title.equals("Frames")) {
           System.out.println("Verified page title is 'Frames'");
       } else {
           System.out.println("Page title is not frames. Found: " + title);
       }
       
       
        driver.quit();
    }
}

