import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://aavatech77.github.io/mock-assesment-app/");

		//Adding a task
	    driver.findElement(By.xpath("//input[@id='taskInput']")).sendKeys("ABC");
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Add Task']")).click();
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Edit']")).click();
	  	
	  	// handling popups with alert
	    Thread.sleep(300);
	    
	  	Alert alert=driver.switchTo().alert();

	  	alert.sendKeys("ABCDE");

        alert.accept();
	}

}
