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


public class FillForm extends PageBase{
    private By Title=By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/h1");
    private By nameInputBoxBy = By.xpath("//*[@id=\"email\"]");
    private By passwordInputBoxBy = By.xpath("//*[@id=\"password\"]");
    private By MenuLocator = By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[4]/div[3]/div/button");
    private By LastNameInput=By.xpath("//*[@id=\"last_name\"]");
    private By AboutYouFiled=By.xpath("//*[@id=\"about\"]");
    private By WebsiteUrl=By.xpath("//*[@id=\"listed_website_url\"]");
    private By Location=By.xpath("//*[@id=\"location\"]");
    private By SaveNutton=By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div[2]/button");
    public FillForm(WebDriver driver){
        super(driver);

    }

    public void fillSettingForm(String username,String about,String website,String location){
        this.waitAndReturnElement(Title);
        this.waitAndReturnElement(LastNameInput).clear();
        this.waitAndReturnElement(LastNameInput).sendKeys(username);
        this.waitAndReturnElement(AboutYouFiled).clear();
        this.waitAndReturnElement(AboutYouFiled).sendKeys(about);
        this.waitAndReturnElement(WebsiteUrl).clear();
        this.waitAndReturnElement(WebsiteUrl).sendKeys(website);
        this.waitAndReturnElement(Location).clear();
        this.waitAndReturnElement(Location).sendKeys(location);
        this.waitAndReturnElement(SaveNutton).click();
        this.waitAndReturnElement(Title);   
    }
    
}
