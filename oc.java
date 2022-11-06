package Demo;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class oc {
	static {
		System.setProperty("webdriver.chrome.driver","./driver./chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver./geckodriver.exe");
	}
    public static boolean main (String[]args) 
    {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
    	Object a = driver.find_element(By.xpath,"//a[contains(text(),'Release date')]").click();
    	Object b = driver.find_element(By.xpath,"//a[contains(text(),'Country of origin')]").click();
    	driver.close();
    	FirefoxDriver driver1=new FirefoxDriver();
    	driver1.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
    	Object c = driver1.find_element(By.xpath,"//a[contains(text(),'Release date')]").click();
    	Object d = driver1.find_element(By.xpath,"//a[contains(text(),'Country of origin')]").click();
    	driver1.close();
    	
    	SimpleDateFormat formatter1=new SimpleDateFormat("17/12/2021");  
    	 if (!formatter1.format(17/12/202).equals(a)) 
    	    {
    	      String errorMessage = "The date that you provided is invalid.";
    	      return false;
    	    }  	
    	
    }
    }
