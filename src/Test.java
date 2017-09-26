import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	WebDriver driver;

	public void browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "DD:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("test1");
		Thread.sleep(1000);
		driver.close();
		System.out.println("x");
	}

}
