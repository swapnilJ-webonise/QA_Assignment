package selenium.test.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowserLaunch implements Runnable{

    public static void main(String[] args) {
        
       try {
        System.setProperty("webdriver.chrome.driver", "/home/webonise/selenuim/selenium/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
 
        driver.get("https://www.lenskart.com");
        
        WebElement  click_login = driver.findElement(By.xpath("//div[@class='header-content']/span[@class = 'login-text']"));
        click_login.click();
               
        WebElement  signup = driver.findElement(By.xpath("//a[@id=\"acheckout\"]"));
        signup.click();
        
        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[1]/input[@id=\"firstname\"]"));
        firstname.sendKeys("Anthony");
        
        WebElement lastname = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[2]/input[@id=\"lastname\"]"));
        lastname.sendKeys("Jones");
        
        WebElement mobile = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[3]/input[@id=\"confirmation_mobile\"]"));
        mobile.sendKeys("8888947681");
        
        WebElement email = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[4]/input[@id=\"email_address\"]"));
        email.sendKeys("Anthony.jones@gmail.com");

        WebElement password = driver.findElement(By.xpath( "//form[@id=\"signup-lenskart\"]/ul/li[5]/input[@id=\"password\"]"));
        password.sendKeys("jones@94");

        WebElement submit = driver.findElement(By.xpath("//form[@id=\"signup-lenskart\"]/ul/li[9]/div/a[@class=\"submit\"]"));
        submit.click();
        
        Thread.sleep(3000);
  
        driver.quit();
       }catch(Exception e) {
    	 System.out.println(""+e);  
       }
    }

	@Override
	public void run() {
	
	}
 
}

