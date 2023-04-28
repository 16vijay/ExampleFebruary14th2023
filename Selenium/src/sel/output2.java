package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class output2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("banaras Songs");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"] ")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(" //*[@id=\"video-title\"]")).click();
	
	}

}
