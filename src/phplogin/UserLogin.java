package phplogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;


//@Test
public class UserLogin
{
    public static WebDriver driver;
    public static void main(String[] args)
      {

          System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\IdeaProjects\\phptravelsdemo\\src\\resource\\drivers\\chromedriver_win32\\chromedriver.exe");
          //System.setProperty("webdriver.chrome.silentOutput","true");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.phptravels.net/login");
          System.out.println("Travel UserLogin is" + driver.getTitle());
          driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
          driver.findElement(By.name("password")).sendKeys("demouser");
          driver.findElement(By.xpath("//button[text()='Login']")).click();
          System.out.println("Travel UserLoginAccountPage is" + driver.getTitle());
          System.setProperty("webdriver.chrome.silentOutput","true");
          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
          driver.close();
          driver.quit();


      }

}
