package day1;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import wrappers.LeafTapswrappers;

public class GetAttribute extends LeafTapswrappers {
	@Test
	
	public void attri() throws InterruptedException{ 

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElementById("lst-ib").sendKeys("Hello");
		Thread.sleep(5000);
		String S = driver.findElementById("lst-ib").getCssValue(null);
		System.out.println(S);

	}
}
