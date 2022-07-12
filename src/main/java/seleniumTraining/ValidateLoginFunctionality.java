package seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ValidateLoginFunctionality {
    public static void main(String[] args) throws InterruptedException {
        String project_home = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",
                project_home+ File.separator+"Drivers"+File.separator+"chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.switchTo().newWindow(WindowType.TAB);//open a new tab

        System.out.println("Browser opened");
        driver.get("http://automationpractice.com/index.php");//open any website
        try {
            driver.findElement(By.className("login")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("email")).sendKeys("kongara.bharghav@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("Testing@1234");
        try {
            driver.findElement(By.id("SubmitLogin")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //driver.close();// it will close only the tab
        driver.quit();// it will close the complete browser
    }
}
