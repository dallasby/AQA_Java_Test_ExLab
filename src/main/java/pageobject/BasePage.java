package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static driver.Driver.getDriver;

public class BasePage {
    protected WebDriver driver;
    protected String baseUrl = "http://test.exlab.team/";

    public BasePage() {
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "logo_mobile")
    private WebElement logo;

    public BasePage open() {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        return this;
    }

    public WebElement getLogo() {
        return logo;
    }
}

