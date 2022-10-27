import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test7 {

	public static void main(String[] args) {
	
	
			WebDriver hall;
			hall=new ChromeDriver();
			hall.get("https://demo.guru99.com/test/simple_context_menu.html");
			Actions c=new Actions(hall);
			WebElement ref=hall.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			c.contextClick(ref).build().perform();
			
			// TODO Auto-generated method stub

		}

	
		// TODO Auto-generated method stub
		
		

	}


