package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class TestHomePage extends BaseTest {
    private HomePage homePage = new HomePage(driver);

    @Test
    void homePage() {
        String title = homePage.navigateToNextPage();
        Assertions.assertEquals("Sortter on Suomen reiluin lainavertailu", title);
    }

    @Test
    void nav2() throws InterruptedException {
        String text = homePage.nav2();
        Assertions.assertEquals("https://sortter.fi/lainahakemus/", text);
    }
}
