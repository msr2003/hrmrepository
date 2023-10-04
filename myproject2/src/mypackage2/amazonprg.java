package mypackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonprg {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrom.driver","chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://www.amazon.in");
	     driver.findElement(By.id("icp-nav-flyout")).click();
    // List <WebElement> rbutton=driver.findElements(By.xpath("//input[type='radio']"));
     //rbutton.get(4).click();
     
    // e.click();
     
     /*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
     Thread.sleep(5000);
     driver.findElement(By.id("nav-search-submit-button")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//span[text()='Casual Daypacks']")).click();
     driver.findElement(By.linkText("Get It Today")).click();
     Thread.sleep(5000);
    WebElement drop= driver.findElement(By.name("s"));
    Select s=new Select(drop);
   List<WebElement> l= s.getOptions();
   System.out.println(l.size());
   System.out.println(l.get(1).getText());
  /* for(int i=1;i<=l.size();i++)
   {
     //System.out.println(l.get(2).getText());
     l.get(1).click();
   }*/
 /* s.selectByIndex(3);
  WebElement eledisplay=driver.findElement(By.linkText("Women"));
  try
  {
  if(eledisplay.isDisplayed())
  {
	  System.out.println("test case pass");
  }
  }
  catch(Exception e)
  {
	  System.out.println("test case fail");
  }*/
    // driver.close();
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     /*driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
     String tv=driver.getCurrentUrl();
     if(tv.contains("minitv"))
     {
    	 System.out.println("mini tv link  url test pass ");
    	 
     }
     else
     {
    	 System.out.println("mini tv link  url fail");
     }
     //driver.findElement(By.xpath("//h1[text()='Home']")).click();
     /*Thread.sleep(10000);
     driver.findElement(By.xpath("//h1[text()='Web Series']")).click();
     Thread.sleep(10000);
    String webserpage= driver.getCurrentUrl();
    if(webserpage.contains("web-series"))
    {
    	System.out.println("webseries page is displayed");
    }
    else
    {
    	System.out.println("webseries page is not displayed");
    }
     
     Thread.sleep(15000);
     
     driver.findElement(By.xpath("//img[data-testid='appnavbar_menuitem_mshopicon']")).click();
     */
     
     
     
     
     
	}

}
