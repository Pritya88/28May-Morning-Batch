package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check1 {
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.amazon.in/");
	}

}
