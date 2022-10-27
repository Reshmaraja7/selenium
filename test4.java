import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='#Single']")).click();	
	
	}


		// TODO Auto-generated method stub

	}

