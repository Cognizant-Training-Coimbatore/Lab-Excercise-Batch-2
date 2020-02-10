import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3_enter_into_textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Documents/app.html");
	 driver.findElement(By.id("txt1")).sendKeys("fathima123");
	 
	 Thread.sleep(5000);
		
	
		driver.quit();
		
		

	}

}
