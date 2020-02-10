package Exercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q04_30_01_2020 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		
		WebElement email,password;
		email = driver.findElement(By.id("Email"));
		password = driver.findElement(By.id("Password"));
		email.sendKeys("sarath@mail.com");
		password.sendKeys("password");
		
		WebElement log = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		log.click();
		
		WebElement searchbar = driver.findElement(By.id("small-searchterms"));
		searchbar.sendKeys("laptop");
		
		WebElement search = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
		search.click();
		
		Thread.sleep(1000);
		WebElement laptop = driver.findElement(By.linkText("14.1-inch Laptop"));
		laptop.click();
		
		WebElement addCart = driver.findElement(By.id("add-to-cart-button-31"));
		addCart.click();
		
		WebElement cart = driver.findElement(By.className("cart-label"));
		cart.click();
		
		WebElement terms = driver.findElement(By.id("termsofservice"));
		terms.click();
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		
		Select address = new Select(driver.findElement(By.id("billing-address-select")));
		address.selectByVisibleText("New Address");
		
		Select country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		country.selectByVisibleText("India");
			
		WebElement City =  driver.findElement(By.id("BillingNewAddress_City"));
		City.sendKeys("Kochi city");
		
		WebElement Addr =  driver.findElement(By.id("BillingNewAddress_Address1"));
		Addr.sendKeys("Kochi Address");
			
		WebElement post =  driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		post.sendKeys("666666");
		
		WebElement ph =  driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		ph.sendKeys("6666666666");
		
		WebElement continue1 = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
		continue1.click();
		
		Select Shipaddress = new Select(driver.findElement(By.id("billing-address-select")));
		Shipaddress.selectByIndex(1);
		
		Thread.sleep(1000);
		WebElement continue2 = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
		continue2.click();
		
		Thread.sleep(1000);
		WebElement continue3 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
		continue3.click();
		
		Thread.sleep(1000);
		WebElement pay = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
		pay.click();
		
		Thread.sleep(1000);
		WebElement continue4 = driver.findElement(By.xpath(" //*[@id=\"payment-info-buttons-container\"]/input"));
		continue4.click();
		
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
		confirm.click();
		
		Thread.sleep(1000);
		WebElement continue5 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input"));
		continue5.click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
