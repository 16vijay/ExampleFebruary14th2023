package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_fb {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guess\\eclipse-workspace\\Selenium\\software\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062067%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwz6ShBhCMARIsAH9A0qU8HPJrQbxf5pyG0svxKTy5ustj31aRmm5k_KXgcEW1EDpAyJYZe9saAlnVEALw_wcB");
	
dr.findElement(By.className("_9bq5")).click();
	Thread.sleep(5000);
	
	System.out.println(dr.getCurrentUrl());
	
	String exp=dr.getTitle();

	if(dr.getTitle().equals(exp)) {
	System.out.println("test case is passed");
	}else {
		System.out.println("test case is failed");
	}
	
	dr.close();
}
}