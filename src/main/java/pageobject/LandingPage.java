package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    @FindBy(xpath = "//div[@id='header']//img")
    private WebElement bigLogo;

    @FindBy(xpath = "//div[@class='sc-fnykZs fEkGUM']")
    private WebElement sunIcon;

    @FindBy(xpath = "//a[contains(text(),'О нас')]")
    private WebElement aboutUs;

    @FindBy(xpath = "//a[contains(text(),'Проекты')]")
    private WebElement projectItem;

    @FindBy(xpath = "//a[contains(text(),'Менторы')]")
    private WebElement mentorsItem;

    @FindBy(xpath = "//a[contains(text(),'StartUp для')]")
    private WebElement startUpItem;

    @FindBy(xpath = "//div[@class='sc-fnykZs lfkjFc']")
    private WebElement crescentIcon;


    public WebElement getBigLogo() {
        return bigLogo;
    }

    public WebElement getSunIcon() {
        return sunIcon;
    }

    public WebElement getAboutUs() {
        return aboutUs;
    }

    public WebElement getProjectItem() {
        return projectItem;
    }

    public WebElement getMentorsItem() {
        return mentorsItem;
    }

    public WebElement getStartUpItem() {
        return startUpItem;
    }

    public WebElement getCrescentIcon() {
        return crescentIcon;
    }

    public void clickOnSunIcon() {
        sunIcon.click();
    }

    public void clickOnCrescentIcon() {
        crescentIcon.click();
    }
}
