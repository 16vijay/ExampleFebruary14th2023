package WebDriverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_and_FindElements {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\guess\\\\eclipse-workspace\\\\Selenium\\\\software\\\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

//Flmt --->Return the single element
//scenario1
//WebElement search=d.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
//search.sendKeys("just");

//scenario2
//WebElement ele=d.findElement(By.xpath("/html/body/div[6]/div[4]"));
//System.out.println(ele.getText());

//3
//WebElement searchbutton=d.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/login")); //NoSuchElementException
//System.out.println(searchbutton.getText());

//FindElements()--------> returns multiple web Elements
List<WebElement>links=d.findElements(By.xpath("/html/body/div[6]/div[4]//a"));
System.out.println("number of elements captured:"+links.size());
		
	}
}
