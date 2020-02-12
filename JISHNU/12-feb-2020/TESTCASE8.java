package feb_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TESTCASE8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase8.html");
		Actions actions=new Actions(driver);
		WebElement image=driver.findElement(By.xpath("/html/body/div/button"));
		actions.moveToElement(image).build().perform();
		WebElement dest=driver.findElement(By.linkText("Google"));
		actions.moveToElement(dest).build().perform();
		actions.click().build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
