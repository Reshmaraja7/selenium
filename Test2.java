import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String[] args) {
		
	try {
		WebDriver core;
		core=new ChromeDriver();
		core.get("https://demo.automationtesting.in/Alerts.htm");
		core.findElement(By.xpath("//a[@aria-expanded='true']")).click();
		core.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();

		
		System.out.println(core.switchTo().alert().getText());
		Thread.sleep(2000);
		core.switchTo().alert().accept();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

		
	}

}
