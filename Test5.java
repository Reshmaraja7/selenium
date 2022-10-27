import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) {
		WebDriver ash;
		ash=new ChromeDriver();
		ash.get("https://demo.guru99.com/test/drag_drop.html");
		Actions r=new Actions(ash);
		WebElement green=ash.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement red=ash.findElement(By.xpath("//ol[@id='bank']"));
		
		r.dragAndDrop(green, red).build().perform();
		WebElement green1=ash.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement red1=ash.findElement(By.xpath("//ol[@id='loan']"));
		
		r.dragAndDrop(green1, red1).build().perform();
		
		WebElement green2=ash.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement red2=ash.findElement(By.xpath("//ol[@id='amt7']"));
		
		r.dragAndDrop(green2, red2).build().perform();
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
