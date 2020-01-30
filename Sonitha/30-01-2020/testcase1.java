import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class testcase1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//which browser to use
		WebDriver driver = new ChromeDriver();//webdriver obj
		driver.get("https://jpetstore.cfapps.io/");//to launch the wegpage
		
		WebElement login = driver.findElement(By.linkText("Enter the Store"));//to find the element
		login.click();
		
		String s = driver.getTitle();//to get title
		System.out.println(s);
		driver.quit();
	}

}
