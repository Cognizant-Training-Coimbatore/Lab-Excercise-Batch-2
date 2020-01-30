package seleniumDriver_demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test2_edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String s=driver.getTitle();
		System.out.println("Title\t:\t"+s);
		System.out.println("Title Length\t:\t"+s.length());
		System.out.println("URL\t:\t"+driver.getCurrentUrl());
		System.out.println("URL length\t:\t"+(driver.getCurrentUrl()).length());
		if(driver.getCurrentUrl().equals("http://google.com"))
			System.out.println("current URL and original URL are same");
		else
			System.out.println("current URL and original URL are different");
		System.out.println("Class\t:\t"+driver.getClass());
		System.out.println("PAGE SOURCE\n"+driver.getPageSource());
		System.out.println("PAGE SOURCE length \t:\t"+(driver.getPageSource()).length());
		
		driver.quit();
	}

	}
