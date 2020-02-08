package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriver_day2_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );		
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String s=driver.getTitle();
		System.out.println(s);
		Select product=new Select(driver.findElement(By.name("category_id")));
		int total=product.getOptions().size();
		System.out.println(total);
		driver.quit();
		

	}

}
