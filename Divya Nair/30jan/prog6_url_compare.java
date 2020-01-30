import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog6_url_compare {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s=driver.getTitle();
		System.out.println(s);
		int len=s.length();
		System.out.println("The length of the title is:"+len);
		String url=driver.getCurrentUrl();
		System.out.println("The current url is:"+url);
		int length=url.length();
		System.out.println("The length of the current url is:"+length);
		System.out.println("Are the curent url and actua url equal?"+s.equals(url));
		String pagesource=driver.getPageSource();
		System.out.println("The page source is:"+pagesource);
		int l=pagesource.length();
		System.out.println("The length of the page source is:"+l);
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
