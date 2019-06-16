package runTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	ChromeDriver driver;
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		/*driver.findElementById("username")
			.sendKeys("DemoSalesManager");
		driver.findElementById("password")
			.sendKeys("crmsfa");*/
		type("username", "DemoSalesManager");
		type("password", "crmsfa");
	}
	public void type(String locatorValue, String value) {
		driver.findElementById(locatorValue)
		.sendKeys(value);
		System.out.println(
				value+" has been passed to "
		+locatorValue);
	}





}
