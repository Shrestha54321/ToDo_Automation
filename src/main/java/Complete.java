import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://aavatech77.github.io/mock-assesment-app/");
		
		//Adding a task
	    driver.findElement(By.xpath("//input[@id='taskInput']")).sendKeys("ABC");
	    
	     driver.findElement(By.xpath("//button[normalize-space()='Add Task']")).click();
	    
	    Thread.sleep(300);

	 

	    
	    //completing
	    driver.findElement(By.xpath("//input[@onclick='completeTask(this)']")).click();


	}

}
