package intern;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		//to select the specific checkbox
      driver.findElement(By.xpath("//input[1]")).click();

		//to check whether the button is clicked or not
	  WebElement x=driver.findElement(By.xpath("//input[1]"));
	  
	  if(x.isSelected()) {
		  System.out.println("1 is selected");
	  }
		  else{
			  System.out.println("1 is notselected");

		  }
	  }
	
	 

		
		
		
	}


