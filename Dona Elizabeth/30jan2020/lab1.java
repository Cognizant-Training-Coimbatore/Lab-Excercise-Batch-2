import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String str="https://google.com";
		//WebElement login=driver.findElement(By.linkText("Enter the Store"));
		//login.click();
		String s=driver.getTitle();
		System.out.println("Title length: "+s.length());
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("URL length: "+url.length());
		if(str.equals(url))
		{
			System.out.println("Same url");
		}
		else
		{
			System.out.println("Different url");
		}
		String ps=driver.getPageSource();
		System.out.println("Page source length: "+ps.length());
		
		driver.quit();
	}

}
