import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		
		WebDriver alloy;
		alloy=new ChromeDriver();
		alloy.get("https://demo.automationtesting.in/Frames.html");
		alloy.switchTo().frame(alloy.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		alloy.findElement(By.xpath("//.input[@type='text']")).sendKeys("Test");
		alloy.switchTo().defaultContent();

		alloy.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		// TODO Auto-generated method stub

	}
}
