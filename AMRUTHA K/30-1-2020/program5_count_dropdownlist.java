package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program5_count_dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");//to open the web page
		Select product= new Select(driver.findElement(By.name("category_id")));
		Thread.sleep(3000);
		int x=product.getOptions().size();
		System.out.println(x);
		product.selectByVisibleText("Databases");
		Thread.sleep(3000);
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
