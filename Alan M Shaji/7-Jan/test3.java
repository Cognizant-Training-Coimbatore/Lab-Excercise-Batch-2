package Webdriver_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test3 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println("Titel\t:\t"+driver.getTitle());
		Thread.sleep(2000);
		Select product= new Select(driver.findElement(By.name("category_id")));
		System.out.println(product.getOptions().size());
		Thread.sleep(5000);
		driver.quit();
	}

}
