import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting Gecko Property
		System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());

	}

}
