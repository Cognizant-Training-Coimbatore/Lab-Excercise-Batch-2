import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4J_sample {

	static Logger log=Logger.getLogger(log4J_sample.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		log.info("Browser initialised");
		driver.get("http://demowebshop.tricentis.com");
		log.info("Application launched");
		if(driver.getTitle().equals("Demo Web Shop"))
			log.info("Title verified");
		else
			log.error("login failed");
		driver.findElement(By.linkText("Log in")).click();
		log.info("login page clicked");
		driver.findElement(By.id("Email")).sendKeys("sarath@mail.com");
		log.debug("username entered");
		driver.findElement(By.id("Password")).sendKeys("password");
		log.info("password entered");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		log.info("login successful");
		log.debug("login failed");
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
		log.info("Application closed");
	}

}
