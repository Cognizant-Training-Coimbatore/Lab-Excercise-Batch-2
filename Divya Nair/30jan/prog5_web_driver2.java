import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog5_web_driver2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io");
		WebElement enter_store=driver.findElement(By.linkText("Enter the Store"));
		enter_store.click();
		String s=driver.getTitle();
		System.out.println(s);

	}

}
