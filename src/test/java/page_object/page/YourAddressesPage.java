package page_object.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddressesPage {

    private WebDriver driver;

    public YourAddressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[@data-link-action='add-address']")
    private WebElement createNewAddress;

    @FindBy (css = ".alert.alert-success")
    private WebElement information;

    public void clickCreateNewAddress() {
        createNewAddress.click();
    }

    public String getInformation() {
        return information.getText();
    }

    @FindBy (xpath = "//article//div/address")
    private WebElement userData;

    public String getActualUserData() {
        return userData.getText();
    }


}
