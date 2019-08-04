package Gitpacakge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitclass {
	
	
	public static void main(String[] args) {
	
			
			
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    String baseUrl = "https://en-gb.facebook.com/r.php?locale=en_GB";
	    
	    driver.get(baseUrl);	
	  

}
}