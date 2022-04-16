package mavenScript;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstScript {
	@Test
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
	}
	
	@Test
	public void ReadData() throws IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/config.properties");
		Properties pt=new Properties();
		pt.load(file);
		System.out.println(pt.getProperty("username"));
		
	}
	
	

}
