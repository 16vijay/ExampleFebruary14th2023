package sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Output3 {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver  d= new ChromeDriver();
		d.get("https://www.google.com/");
		String title=d.getTitle();
		System.out.println(title);
		String url=d.getCurrentUrl();
		System.out.println(url);
		String src=d.getPageSource();
		System.out.println(src);
	}

}
