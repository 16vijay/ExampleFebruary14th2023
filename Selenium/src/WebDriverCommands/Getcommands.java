package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	String text=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"))
	.getText();
	System.out.println(text);
//	driver.close();               //close current window
		
	driver.quit();                //closes multiple window
	
	
	
	
	
	}
		}
