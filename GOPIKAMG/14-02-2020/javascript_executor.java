package repository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\javaprg\\seleniumexamples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.get("https://google.co.in");
	 	JavascriptExecutor js=(JavascriptExecutor)driver;
	 	js.executeScript("alert('Welcome to google page');",5000);
	 	Thread.sleep(5000);
	 	driver.switchTo().alert().accept();
	 	Thread.sleep(5000);
	 	driver.quit();
	}

}
