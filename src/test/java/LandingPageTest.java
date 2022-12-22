import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.LandingPage;

public class LandingPageTest extends BasePageTest {
    private LandingPage landingPage;

    @BeforeClass
    public LandingPage initLandingPage() {
        landingPage = new LandingPage();
        return new LandingPage();
    }

    @Test
    public void bigLogoCheck() {
        Assert.assertTrue(landingPage.getBigLogo().isDisplayed(), "Element is not visible!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- Logo is visible\n________________________");
    }

    @Test
    public void aboutUsCheck() {
        Assert.assertTrue(landingPage.getAboutUs().isDisplayed(), "Element is not visible!");
        Assert.assertTrue(landingPage.getAboutUs().getAttribute("href").contains("#about"),
                "Element does not contains \"#about\"!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- \"О нас\" equals to id - \"#about\" " + "\n" +
                "- \"О нас\" is visible\n________________________");
    }

    @Test
    public void projectItemCheck() {
        Assert.assertTrue(landingPage.getProjectItem().isDisplayed(), "Element is not visible!");
        Assert.assertTrue(landingPage.getProjectItem().getAttribute("href").contains("#projects"),
                "Element does not contains \"#projects\"!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- \"Проекты\" equals to id - \"#projects\" " + "\n" +
                "- \"Проекты\" is visible\n________________________");
    }

}
