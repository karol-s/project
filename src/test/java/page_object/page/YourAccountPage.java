package page_object.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {

    private WebDriver driver;

    public YourAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@href='https://prod-kurs.coderslab.pl/index.php?controller=addresses']")
    private WebElement addressesButton;

    public void clickAddressesButton() {
        addressesButton.click();
    }
}
