import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog6_5browser 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(1000);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		String s1=driver.getTitle();
		System.out.println(s1);
		int l=s1.length();
		System.out.println("Length of title is " +l);
		
		int l1=s.length();
		System.out.println("Length of current URL is : " +l1);
		System.out.println("Comparing actual and current url " +s.equals ("http://www.gmail.com"));
		Object obj=driver.getClass();
		System.out.println("Class name " +obj);
		
		driver.quit();
		
		
	}

}
