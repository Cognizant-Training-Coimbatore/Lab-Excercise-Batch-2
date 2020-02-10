package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\javaprograms\\\\selenium_examples\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("http://demowebshop.tricentis.com/");
		WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
		Actions actions= new Actions(driver);
		actions.moveToElement(computers).build().perform();
//         Thread.sleep(5000);
         driver.findElement(By.linkText("Accessories")).click();
         Thread.sleep(5000);
driver.close();         
	}

	}


