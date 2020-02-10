import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		
		
		 System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("file:///C:\\Users\\Admin\\Desktop");
		    System.out.println(driver.getTitle());
		    driver.quit();
		    
		    
		    
		    
	}

}
