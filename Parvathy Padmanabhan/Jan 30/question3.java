import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question3 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//specify which browser should be used.
		WebDriver driver = new ChromeDriver();
		String actualurl = "http:www.gmail.com"; 
		driver.get(actualurl);
		String Title = driver.getTitle();
		System.out.println("Title :  "+Title + "\n Title length :" + Title.length());
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current URL :  "+ currenturl +"\n Current URL Length :  "+currenturl.length());
		System.out.println("Actual URL :  "+actualurl);
		if(actualurl.contentEquals(currenturl))
		{
			System.out.println("Both Actual and Current URL are same");
		}
		else
		{
			System.out.println("Actual and Current URL are not same");
		}
		Class<? extends WebDriver> pageclass = driver.getClass();
		System.out.println("Page Class :  " + pageclass);
		String pagesource = driver.getPageSource();
		System.out.println( "Page Source :   " +pagesource +"\n Page Source length :   " + pagesource.length());
		driver.quit();
	}
}
