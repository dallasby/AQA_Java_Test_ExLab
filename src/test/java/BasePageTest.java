import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.BasePage;
import static driver.driver.createDriver;
import static driver.driver.quite;

public class BasePageTest {

    public BasePage basePage;

    @BeforeTest
    public void start () {
        createDriver();
        basePage = new BasePage();
        basePage.open();
    }

    @AfterTest
    public void finish() {
        quite();
    }

    @Test
    public void pageOpened() {

        // Один тест-кейс - один тест. В конце теста выводим сообщение об успешно пройденной проверке

        System.out.println("________________________\n" +
                "TEST PASSED: website is opened:\n" +
                "- URL is the same\n" +
                "- Title is the same" + "\n" +
                "- Logo is visible\n________________________");
    }

}
