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


class MainPage extends PageBase {

    private By loginMenuButtonBy = By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[2]/button");

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.pinterest.com/");
    }    
    
    public LoginPage openLogin() {
        this.waitAndReturnElement(loginMenuButtonBy).click();
        return new LoginPage(this.driver);
    }
}
