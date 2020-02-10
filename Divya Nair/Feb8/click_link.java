import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/chrome.html");
		System.out.println(driver.getTitle());
		WebElement link1=driver.findElement(By.linkText("Google"));
		link1.click();
		System.out.println(driver.getTitle());
		WebElement name=driver.findElement(By.id("txt1"));
		name.sendKeys("Enter your name");
		Thread.sleep(30000);
		driver.quit();
		

	}

}
