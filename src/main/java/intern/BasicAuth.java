package intern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//since inspect is not available in popups,username and pw are injected in url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String x=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(x);
		
	}

}
