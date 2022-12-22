import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.BasePage;

import static driver.Driver.*;

public class BasePageTest {
    protected BasePage basePage;

    @BeforeClass
    public void start() {
        createDriver();
        basePage = new BasePage();
        basePage.open();
    }

    @AfterTest
    public void finish() {
        quite();
    }

    @Test
    public void pageIsOpened() {
        Assert.assertEquals(getDriver().getCurrentUrl(), "http://test.exlab.team/",
                "URL is not the same!");
        Assert.assertEquals(getDriver().getTitle(), "ExLab Landing",
                "Title is not the same!");
        Assert.assertTrue(basePage.getLogo().isDisplayed(), "ExLab logo is not visible!");

        System.out.println("________________________\n" +
                "TEST PASSED: website is opened:\n" +
                "- URL is the same\n" +
                "- Title is the same" + "\n" +
                "- Logo is visible\n________________________");
    }
}
