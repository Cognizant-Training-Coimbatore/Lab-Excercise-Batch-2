import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4_getattribute {

	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/amith/app.html");
		WebElement name=driver.findElement(By.id("text1"));
		name.sendKeys("amith");
		String s=name.getAttribute("value");
		System.out.println("the value is "+s+"length is "+s.length());
		Thread.sleep(4000);
		driver.quit();

	}

}
