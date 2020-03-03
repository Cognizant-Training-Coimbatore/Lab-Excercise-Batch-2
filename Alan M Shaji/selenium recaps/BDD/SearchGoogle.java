package SearchPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchGoogle {

	WebDriver driver;
@Given("^The application has been opened$")
public void the_application_has_been_opened() throws Throwable {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/?hl=en-US");
}

@When("^The user wants to search for string \"([^\"]*)\"$")
public void the_user_wants_to_search_for_string(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(arg1);
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
 
}
/*
@When("^The user wants to search for string \"([^\"]*)\"$")
public void the_user_wants_to_search_for_string(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(arg1);
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
}
*/
@Then("^The user selects the first link$")
public void the_user_selects_the_first_link() throws Throwable {
    driver.findElement(By.xpath("//*[@class=\"r\"]/a")).click();
    Thread.sleep(2000);
    driver.quit();
}



}
