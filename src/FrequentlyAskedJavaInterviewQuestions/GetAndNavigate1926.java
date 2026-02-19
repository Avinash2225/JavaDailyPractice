package FrequentlyAskedJavaInterviewQuestions;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate1926 {

	public static void main(String[] args) throws MalformedURLException {
WebDriver driver = new ChromeDriver();

//driver.navigate().to("https://www.amazon.in/");  // string formet and url object formet both

// driver.get("https://www.youtube.com/");
 // navigate.to method internally calling get method it will check weather url is string formet or object formet it will do some kind of validation
// diver.get accepts url only in string formet 

// we never use url type of object

//@SuppressWarnings("deprecation")
//URL myurl = new URL("");

driver.navigate().to("https://demo.nopcommerce.com/");

driver.navigate().to("https://www.youtube.com/");

driver.navigate().back();

System.out.println(driver.getCurrentUrl());




	}

}
