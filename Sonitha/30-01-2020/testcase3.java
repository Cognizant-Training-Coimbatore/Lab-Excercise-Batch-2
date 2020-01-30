import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//which browser to use
		WebDriver driver = new ChromeDriver();//webdriver obj
		 driver.get("http://demowebshop.tricentis.com/");
		 //to launch the wegpage
		 String actual ="http://demowebshop.tricentis.com/";
		String s = driver.getTitle();//to get title
		System.out.println(s);
		System.out.println(s.length());
		String current = driver.getCurrentUrl();
		System.out.println(current);
	   if(actual != current)
	   {
		   System.out.println("same");
	   }
	   else
	   {
		   System.out.println("not same");
	   }
	   WebElement element = driver.findElement(By.className(driver.getCurrentUrl()));
	   
	  System.out.println(driver.getPageSource()); 
	  System.out.println(driver.getPageSource().length());
		driver.quit();

	}

}
