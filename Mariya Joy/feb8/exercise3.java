package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\Java programs\\\\Selenium_examples\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		int size=product.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			
			product.selectByIndex(i);
			Thread.sleep(1000);
			String s=product.getFirstSelectedOption().getText();
			System.out.println(s);			
		}
		int total=product.getOptions().size();
		System.out.println(total);
		driver.quit();
		
		
	}

}
