import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\Work\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
	}

}
