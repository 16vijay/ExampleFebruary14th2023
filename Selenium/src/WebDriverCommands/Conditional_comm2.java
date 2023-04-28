package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_comm2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	WebElement Searchstore=	d.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
           System.out.println("Dispalyedstatus:"+Searchstore.isDisplayed());
           System.out.println("Enabled status:"+Searchstore.isEnabled());
	
	WebElement male=d.findElement(By.xpath("//*[@id=\"gender-male\"]"));
	male.click();
	System.out.println("status id disply:"+male.isDisplayed());
	System.out.println("status of selected:"+male.isSelected());
	System.out.println("status of enabled:"+male.isEnabled());
	d.close();
	}
}
