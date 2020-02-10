import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIu5qv7NnG5wIVyxwrCh16Hw_AEAAYASAAEgL88PD_BwE&ef_id=EAIaIQobChMIu5qv7NnG5wIVyxwrCh16Hw_AEAAYASAAEgL88PD_BwE:G:s&s_kwcid=AL!739!3!265109269849!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8921105535");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("p123$%^");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
      driver.findElement(By.name("q")).sendKeys("pen");
      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg"));
      
	}

}
