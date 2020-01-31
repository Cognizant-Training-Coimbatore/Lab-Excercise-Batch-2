import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PROGRAM_3_GIVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		String s=driver.getTitle();
		System.out.println(s);
		int titleLength = driver.getTitle().length(); 
		System.out.println("title length");
		
		System.out.println(titleLength);
		String actualUrl = driver.getCurrentUrl(); 
		System.out.println(actualUrl);
		System.out.println("current url length");
		
		int urlLength=driver.getCurrentUrl().length();
		System.out.println(urlLength);
		if(actualUrl==driver.
		{
			
		}
				
		
		
		
		
		
		
		driver.quit();
		
		

	}

}
