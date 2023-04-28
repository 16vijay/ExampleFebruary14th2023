package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	driver.findElement(By.className("ggj6brxn gfz4du6o r7fjleex g0rxnol2 lhj4utae le5p0ye3 l7jjieqr _11JPr")).click();
	driver.findElement(By.className("selectable-text copyable-text iq0m558w")).sendKeys("hello madam full busy na");
	
	}
}
