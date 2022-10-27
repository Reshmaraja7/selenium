import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Select dropDown= new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		dropDown.selectByIndex(4);
		
		

	
		
		
	}

}
		
		
		
		
		// TODO Auto-generated method stub

