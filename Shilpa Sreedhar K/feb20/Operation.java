package execution;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Operation {
	WebDriver driver;
	public Operation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
    public void perform(Properties prop,String opr,String ObjectName,String ObjectType,String Value) throws Exception
    {
    	switch (opr.toUpperCase()) {
    	case "CLICK":    		
    		driver.findElement(this.getObject(prop,ObjectName,ObjectType)).click();
    		break;
    	case "SETTEXT":    		
    		driver.findElement(this.getObject(prop,ObjectName,ObjectType)).sendKeys(Value);
		break;
    	case "GOTOURL":    	
    		driver.get(prop.getProperty(Value));
		break;
		default:
			break;
		}
    }
    private By getObject(Properties p,String objectName,String objectType) throws Exception{
        if(objectType.equalsIgnoreCase("XPATH")){
            
            return By.xpath(p.getProperty(objectName));
        }
        else if(objectType.equalsIgnoreCase("ID")){
            
            return By.id(p.getProperty(objectName));
            
        }
        else if(objectType.equalsIgnoreCase("CLASSNAME")){
            
            return By.className(p.getProperty(objectName));
            
        }
        else if(objectType.equalsIgnoreCase("NAME")){
            
            return By.name(p.getProperty(objectName));
            
        }
        else if(objectType.equalsIgnoreCase("CSS")){
            
            return By.cssSelector(p.getProperty(objectName));
            
        }
        else if(objectType.equalsIgnoreCase("LINK")){
            
            return By.linkText(p.getProperty(objectName));
            
        }
        else if(objectType.equalsIgnoreCase("PARTIALLINK")){
            
            return By.partialLinkText(p.getProperty(objectName));
            
        }else
        {
            throw new Exception("Wrong object type");
        }
    }
}
