import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3_Chrome_Firefox_IE {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String s=driver.getTitle();
		System.out.println("length of the Title= "+s.length());
		String str=driver.getCurrentUrl();
		System.out.println(str);
		System.out.println("Length of current url "+str.length());
		System.out.println(str);
		if(s.length()==str.length())
		{
			System.out.println("Same Length");
		}
		else
		{
			System.out.println(driver.getClass());
			System.out.println(driver.getPageSource());
			System.out.println(driver.getPageSource().length());
			
		}
		
		

	}

}
