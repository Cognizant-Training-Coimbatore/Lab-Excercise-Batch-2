import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program10_mouse_actions {

	public static void main(String[] args) throws InterruptedException 
	{

		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement comp=driver.findElement(By.linkText("COMPUTERS"));
		Actions action= new Actions(driver);
		action.moveToElement(comp).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Notebooks")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
