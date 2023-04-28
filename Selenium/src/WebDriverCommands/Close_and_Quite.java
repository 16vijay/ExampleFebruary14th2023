package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_and_Quite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Thread.sleep(2000);
		//driver.close();

		driver.quit();
	}
}
