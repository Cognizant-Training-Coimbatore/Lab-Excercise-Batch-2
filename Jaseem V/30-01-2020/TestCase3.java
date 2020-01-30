import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gaana.com");
		
		String s = driver.getTitle();
		System.out.println(s);
		System.out.println("Title Length :"+s.length());
		String x = driver.getCurrentUrl();
		System.out.println("Current url length :"+x.length());
		String y = "http://gaana.com";
			if(x==y)
			{
				System.out.println("Same url");
			}
			else
			{
				System.out.println("Different url");
			}
		String z = driver.getPageSource();
		System.out.println(z);
		System.out.println("page source length :"+z.length());
		Class a = driver.getClass();
		System.out.println(a);
		
			
		driver.quit();

	}

}
