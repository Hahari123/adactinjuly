package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lenovo\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(); 
        driver.get("http://www.google.com"); 
 
	}

}
