package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium8_Q3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select combo1 = new Select(driver.findElement(By.name("category_id")));
		System.out.println("total count of combo box" + combo1.getOptions().size()); 
		int size = combo1.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			combo1.selectByIndex(i);
			Thread.sleep(5000);
			String s = combo1.getFirstSelectedOption().getText();
			System.out.println(s);
		}
		driver.quit();
	}

}
