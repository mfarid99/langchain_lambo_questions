import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Macintosh HD⁩/Users⁩/moe⁩/⁨Documents⁩/chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "//Users/moe//Documents//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		 System.out.print(driver.getTitle());
		 driver.get("https://www.udemy.com/");
//		 System.out.print(driver.getTitle());
		 System.out.print(driver.getCurrentUrl());
		 driver.navigate().back();
		 driver.close();
			 
	}

}
