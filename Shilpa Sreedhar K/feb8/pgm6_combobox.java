package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm6_combobox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("file://E:/exp.html");
				driver.findElement(By.id("txt1")).sendKeys("Shilpa");
				Select combo1=new Select(driver.findElement(By.id("combo1")));
				combo1.selectByVisibleText("OptionC");
				System.out.println(combo1.getOptions().size());
				Thread.sleep(5000);
	
				driver.quit();
	}

}
