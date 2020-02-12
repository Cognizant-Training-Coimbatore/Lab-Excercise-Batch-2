package labexecise1222020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase2.html.htm");
		Select a=new Select(driver.findElement(By.id("country")));
		int b=a.getOptions().size();
		String c=String.valueOf(b);
		driver.findElement(By.id("t1")).sendKeys(c);
		
		
		
		
	}

}
