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
                "- Big Logo is visible\n________________________");
    }

    @Test
    public void aboutUsCheck() {
        Assert.assertTrue(landingPage.getAboutUs().isDisplayed(), "Element is not visible!");
        Assert.assertTrue(landingPage.getAboutUs().getAttribute("href").contains("#about"), "Element does not contains \"#about\"!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- \"О нас\" equals to id - \"#about\" " + "\n" +
                "- \"О нас\" is visible\n________________________");
    }

    @Test
    public void projectItemCheck() {
        Assert.assertTrue(landingPage.getProjectItem().isDisplayed(), "Element is not visible!");
        Assert.assertTrue(landingPage.getProjectItem().getAttribute("href").contains("#projects"), "Element does not contains \"#projects\"!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- \"Проекты\" equals to id - \"#projects\" " + "\n" +
                "- \"Проекты\" is visible\n________________________");
    }

    @Test
    public void mentorsItemCheck() {
        Assert.assertTrue(landingPage.getMentorsItem().isDisplayed(), "Element is not visible!");
        Assert.assertTrue(landingPage.getMentorsItem().getAttribute("href").contains("#mentors"), "Element does not contains \"#mentors\"!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- \"Менторы\" equals to id - \"#mentors\" " + "\n" +
                "- \"Менторы\" is visible\n________________________");
    }

    @Test
    public void startUpItemCheck() {
        Assert.assertTrue(landingPage.getStartUpItem().isDisplayed(), "Element is not visible!");
        Assert.assertTrue(landingPage.getStartUpItem().getAttribute("href").contains("#startup"), "Element does not contains \"#startup\"!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- \"StartUp\" equals to id - \"#startup\" " + "\n" +
                "- \"StartUp\" is visible\n________________________");
    }

    @Test
    public void sunIconCheck() {
        Assert.assertTrue(landingPage.getSunIcon().isDisplayed(), "Element is not visible!");
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- Sun Icon Logo is visible\n________________________");
    }

    @Test
    public void checkBackgroundColorOfSunIcon() {
        String sunIconColor = landingPage.getSunIcon().getCssValue("background-color");
        landingPage.clickOnSunIcon();
        String crescentIconColor = landingPage.getCrescentIcon().getCssValue("background-color");
        Assert.assertNotEquals(sunIconColor, crescentIconColor,
                "Color does not change!");
        landingPage.clickOnCrescentIcon();
        System.out.println("________________________\n" +
                "TEST PASSED:\n" +
                "- Background-color changes!\n________________________");
    }
}
