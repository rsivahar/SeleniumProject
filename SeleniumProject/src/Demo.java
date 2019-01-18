import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code is written here. A class is basically a test case in the test suite
		
		//Invoke the .exe file for which browser you will use. This ensures that the browser will be invoked after creating the driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		
		// Create Driver Object. But we are strictly implementing methods of WebDriver, which is why we write WebDriver when invoking the class
		WebDriver driver = new ChromeDriver();
		
		String x = new String ();
		String y = new String ();
		Methods result = new Methods();
		
		x = "https://www.google.ca/";
		
		//Opening the URL
		driver.get(x);
		
		//To get the title of the page and print it on the console
		//System.out.println(driver.getTitle());
		
		//To validate if you are on the correct webpage
		//y = driver.getCurrentUrl();
		
		//Using the simple method I created to check the URLs
		//System.out.println(result.comparePage(x, y));
		
		//Navigating to another webpage
		driver.navigate().to("https://www.facebook.com");
		
		//Navigating back to the previous page
		driver.navigate().back();
		
		driver.close(); //closes the current browser that is in focus
		//driver.quit(); //closes all the browsers opened by Selenium 
		
	}

}
