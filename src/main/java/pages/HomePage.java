package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {
    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    // Page elements
    private By aboutSortterDropDown = By.xpath("/html/body/div/div[1]/div/div[1]/header/div/div[3]/nav/div[4]/div[1]");
    private By informationAboutUs = By.xpath("/html/body/div/div[1]/div/div[1]/header/div/div[3]/nav/div[4]/nav/a[1]");
    private By title = By.xpath("//h1[text()='Sortter on Suomen reiluin lainavertailu']");

    // nav2
    private By button = By.xpath("//a[@id='company-link-onboarding']");
    private By button2 = By.xpath("//button[@id='cta-button']");

    // Methods

    public String navigateToNextPage() {
        navigateToUrl("");
        driver.findElement(aboutSortterDropDown).click();
        driver.findElement(informationAboutUs).click();
        return driver.findElement(title).getText();
    }

    public String nav2() throws InterruptedException {
        navigateToNextPage();
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(button)).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(button2)));
        return driver.getCurrentUrl();
    }
}
