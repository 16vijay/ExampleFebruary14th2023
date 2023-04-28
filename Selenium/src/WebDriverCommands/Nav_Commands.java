package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nav_Commands {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
WebDriver d= new ChromeDriver();
d.get("https://demo.guru99.com/test/newtours/");
System.out.println(d.getTitle());
		d.navigate().to("https://www.facebook.com/login/");
		System.out.println(d.getTitle());
		d.navigate().back();
		System.out.println(d.getTitle());
		d.navigate().forward();
		System.out.println(d.getTitle());
		
		d.navigate().refresh();
		System.out.println(d.getTitle());
		d.close();
		
	}
}
