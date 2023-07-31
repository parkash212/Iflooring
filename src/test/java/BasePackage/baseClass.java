package BasePackage;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {
	public WebDriver driver;
	public Logger logger; // for logging
	//JavascriptExecutor js = ((JavascriptExecutor)driver);

	@BeforeClass(groups = {"Regression,sanity "})
	public void setup() {
		logger = LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://iflooring.customerdevsites.com/");	
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	}
	@AfterClass(groups = {"Regression,sanity "})
	public void teardown()  {
		//driver.quit();
	}
	

}
