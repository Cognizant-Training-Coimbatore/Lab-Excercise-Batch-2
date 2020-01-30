import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String s=driver.getTitle();
		System.out.println("page title: " +s);
		int titleLength = driver.getTitle().length();  
		System.out.println("title length: " +titleLength);
		String actualUrl = driver.getCurrentUrl(); 
		if (actualUrl.equals("https://www.amazon.in/")){  
			System.out.println("current and actual url are same");  
			}  
			else{  
			  
			System.out.println("current and actual url are  not same");  
			         } 
		
		String pageSource = driver.getPageSource();  
		int pageSourceLength = pageSource.length();  
        
		
		System.out.println("Total length of the Page Source is : " + pageSourceLength);  
		
		driver.quit();

	}

}
