package seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ValidateLoginTestcases {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String project_home = System.getProperty("user.dir");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        try {
            Duration duration = Duration.ofSeconds(20);
            driver.manage().timeouts().implicitlyWait(duration);//which will wait for element to come into DOM
            driver.manage().window().maximize();
            WebDriverWait wait = new WebDriverWait(driver, duration);
            System.out.println("Browser opened");
            driver.get("http://automationpractice.com/index.php");//open any website
            wait.until(ExpectedConditions.
                    numberOfElementsToBe(By.xpath("//*[@id=\"homefeatured\"]//*[@class=\"product-name\"]"),
                            7));
//            WebElement sample3 = driver.findElement();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"homeslider\"]/li[4]/a/img")));
//            driver.findElement(By.xpath("//li[@class=\"homeslider-container bx-clone\"]//*[@title=\"sample-3\"]/following-sibling::div//button[text()=\"Shop now !\"]")).click();
            ////li[@class="homeslider-container bx-clone"]//*[@title="sample-3"]/following-sibling::div//button[text()="Shop now !"]
            List<WebElement> productText = driver.findElements(By.xpath("//*[@id=\"homefeatured\"]//*[@class=\"product-name\"]"));
//            alt="sample-3"
            System.out.println("The number of products :: " + productText.size());
            for (WebElement e: productText) {
                System.out.println(e.getText());
            }
            if(productText.size()==7) {
                System.out.println("The number fo products displayed in home page is proper");
            } else if(productText.size()<7) {
                System.out.println("Lesser number of products are displayed");
            } else {
                System.out.println("Greater number of products are displayed");
            }
            click(By.className("login"));
            By email = By.id("email");
            WebElement emailInputBox = driver.findElement(email);
            emailInputBox.click();
            emailInputBox.clear();
            emailInputBox.sendKeys("kongara.bharghav@gmail.com");
            driver.findElement(By.name("passwd")).sendKeys("Testing@123");
            String typeAttribute = driver.findElement(By.name("passwd")).getAttribute("type");
            if (typeAttribute.equals("password")) {
                System.out.println("The password is getting masked");
            } else {
                System.out.println("The password is not getting masked");
            }
            click(By.id("SubmitLogin"));

            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//*[text()=\"Authentication\"]/following-sibling::div//ol")));
//        Thread.sleep(10000);
            boolean isErrorMessageDisplayed = driver.findElement
                    (By.xpath("//*[text()=\"Authentication\"]/following-sibling::div//ol")).isDisplayed();
            if (isErrorMessageDisplayed == true) {
                System.out.println("Invalid login error message is displayed");
            } else {
                System.out.println("Invalid login error message is not displayed");
            }
            String actualErrorMessage = driver.findElement
                    (By.xpath("//*[text()=\"Authentication\"]/following-sibling::div//ol")).getText();
            String expectedErrorMessage = "Authentication failed.";
            if (actualErrorMessage.equals(expectedErrorMessage)) {
                System.out.println("Error message text is proper");
            } else {
                System.out.println("Error message text is not proper");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();// it will close the complete browser
        }

    }

    public static void click(By locator) {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

}
