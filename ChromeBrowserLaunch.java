package selenium.test.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowserLaunch implements Runnable{

    public static void main(String[] args) {
        
       try { //Creating a driver object referencing WebDriver interface
       

        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "/home/webonise/selenuim/selenium/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        //Instantiating driver object
        
        //Using get() method to open a webpage
        driver.get("https://www.lenskart.com");
        
        /*WebElement  fname = driver.findElement(By.xpath("//input[@name='firstname']"));
        fname.sendKeys("Swapnil");
        
        
        WebElement  signup = driver.findElement(By.xpath("//button[@type='submit' and text()='Sign Up']"));
        signup.click();
        */
        WebElement  click_login = driver.findElement(By.xpath("//div[@class='header-content']/span[@class = 'login-text']"));
        click_login.click();
               
         WebElement  signup = driver.findElement(By.xpath("//a[@id=\"acheckout\"]"));
         signup.click();
        
         Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[1]/input[@id=\"firstname\"]"));
        firstname.sendKeys("Swapnil");
        
        WebElement lastname = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[2]/input[@id=\"lastname\"]"));
        lastname.sendKeys("JEJURKAR");
        
        WebElement mobile = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[3]/input[@id=\"confirmation_mobile\"]"));
        mobile.sendKeys("8888876814");
        
        WebElement email = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[4]/input[@id=\"email_address\"]"));
        email.sendKeys("sjjejurkar@gmail.com");

        WebElement password = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[5]/input[@id=\"password\"]"));
        password.sendKeys("Swapnil@94");

        
      //form[@id="signup-lenskart"]/ul/li[5]/input[@id="password"]
        
        WebElement submit = driver.findElement(By.xpath("//form[@id=\"signup-lenskart\"]/ul/li[9]/div/a[@class=\"submit\"]"));
        submit.click();
        
        Thread.sleep(3000);
   	 //System.out.println(fname);  
   	 

        //Closing the browser
        driver.quit();
       }catch(Exception e) {
    	 System.out.println(""+e);  
       }
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
 
}

