import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AddTask {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://aavatech77.github.io/mock-assesment-app/");
		
	    driver.findElement(By.xpath("//input[@id='taskInput']")).sendKeys("ABC");
	    
	    Thread.sleep(200);
		
		driver.findElement(By.xpath("//button[normalize-space()='Add Task']")).click();
		
		
		
	}

}
