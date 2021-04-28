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


class SearchItem extends PageBase {
    
    
    private By waitComponent=By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]");
    private By LogoutMenu= By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[4]/div[5]/button/div");
    private By LogBar=By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[4]/div[6]/div/div/div/div/div/div/div[2]/div/div[2]/div[6]/div/div/div/div/div");
    private By SearchBar=By.xpath("//*[@id=\"searchBoxContainer\"]/div/div/div[3]/input");

    public SearchItem(WebDriver driver) {
        super(driver);
    }  
    public void search(String inputSearch){
        this.waitAndReturnElement(SearchBar).sendKeys(inputSearch+"\n");
        this.getBodyText();
        this.waitAndReturnElement(waitComponent);

    }
    public LogoutPage logoutAfterSearch(){
        this.waitAndReturnElement(LogoutMenu).click();
        this.waitAndReturnElement(LogBar).click();

        return new LogoutPage(this.driver);
    }
    
   
    
    
}
