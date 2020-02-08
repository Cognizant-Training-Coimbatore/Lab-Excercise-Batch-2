import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Sonitha/seleniumnew/seleniumcts.html");
		driver.findElement(By.id("txt1")).sendKeys("venkat123");
		//sendkeys: ( for entering text into the textbox )
		//to copy this to a variable
		String s = driver.findElement(By.id("txt1")).getAttribute("value");
		//getAttribute: ( to capture the value from the textbox and store it in to the data )
		System.out.println(s.length());
		Thread.sleep(5000);

		driver.quit();
	}

}
