import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web8 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement link=driver.findElement(By.linkText("COMPUTERS"));

		Actions actions=new Actions(driver);
		actions.moveToElement(link).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Accessories")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
