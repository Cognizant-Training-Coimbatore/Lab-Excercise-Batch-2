package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select prod=new Select(driver.findElement(By.name("category_id")));
		int size=prod.getOptions().size();
		for(int i=0;i<size;i++)
		{
			prod.selectByIndex(i);
			Thread.sleep(3000);
			String s=prod.getFirstSelectedOption().getText();
			System.out.println(s);
			
		}
		
		driver.quit();

	}

}
