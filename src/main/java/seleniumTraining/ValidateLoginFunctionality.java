package seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ValidateLoginFunctionality {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        String project_home = System.getProperty("user.dir");
       /* System.setProperty("webdriver.chrome.driver",
                project_home+ File.separator+"Drivers"+File.separator+"chromedriver.exe");*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.switchTo().newWindow(WindowType.TAB);//open a new tab
        System.out.println("Browser opened");
        driver.get("http://automationpractice.com/index.php");//open any website
        click(By.className("login"));
        driver.findElement(By.id("email")).sendKeys("kongara.bharghav@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("Testing@1234");
        /*
        id
        name
        className
        linkText
        partialLinkText
        tagName
        cssSelector
        xpath
        cssSelector = tagname[attributeName="value"]
        if you want to represent an id attribute you have to use #
        if you want to represent a class attribute you have to use .
        btn btn-default button button-medium exclusive

        button[type="submit"][name="SubmitCreate"]
        button[type="submit"][id="SubmitCreate"]
        button[type="submit"]#SubmitCreate
        button[type="submit"].btn-default#SubmitCreate
        button[type="submit"].btn-default.btn.button.button-medium

         */

        /*
        <input class="is_required validate account_input form-control" data-validate="isEmail" type="text" id="email" name="email" value="">
         */
        click(By.id("SubmitLogin"));
        //driver.close();// it will close only the tab
        driver.quit();// it will close the complete browser
    }

    public static void click(By locator) {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
