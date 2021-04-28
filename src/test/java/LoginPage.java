import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class LoginPage extends PageBase {

    private By nameInputBoxBy = By.xpath("//*[@id=\"email\"]");
    private By passwordInputBoxBy = By.xpath("//*[@id=\"password\"]");
    private By MenuLocator = By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[4]/div[3]/div/button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }    
    
    public DashboardPage login(String username, String password){
        this.waitAndReturnElement(nameInputBoxBy).sendKeys(username);
        this.waitAndReturnElement(passwordInputBoxBy).sendKeys(password+"\n");
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(MenuLocator));
        return new DashboardPage(this.driver);
    }
    
}
