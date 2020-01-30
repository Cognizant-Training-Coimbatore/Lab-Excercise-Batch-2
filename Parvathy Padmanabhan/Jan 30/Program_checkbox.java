import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_checkbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement reg = driver.findElement(By.linkText("Log in"));
		reg.click();
		WebElement check = driver.findElement(By.name("RememberMe"));
		boolean s = check.isSelected();
		if(s==true)
		{
			System.out.println("Already Selected");
		}
		else
		{
			System.out.println("Not selected.. Selecting now...");
			check.click();
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
