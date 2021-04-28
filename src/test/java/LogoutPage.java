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


class LogoutPage extends PageBase {
    private By LogoutButton=By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[4]/div[6]/div/div/div/div/div/div/div[2]/div/div[2]/div[6]/div/div");
    private By HomePageAbout=By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div/a");
    public LogoutPage(WebDriver driver) {
        super(driver);
    }  
    
    public void logOut(){

        this.waitAndReturnElement(LogoutButton).click();
        this.waitAndReturnElement(HomePageAbout);
        


    }
    
    
}
