package page_object.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NewAddressPage {

    private WebDriver driver;

    public NewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "alias")
    private WebElement aliasInputField;

    @FindBy (name = "company")
    private WebElement companyInputField;

    @FindBy (name = "vat_number")
    private WebElement vatNumberInputField;

    @FindBy (name = "address1")
    private WebElement addressInputField;

    @FindBy (name = "postcode")
    private WebElement postcodeInputField;

    @FindBy (name = "city")
    private WebElement cityInputField;

    @FindBy (name = "phone")
    private WebElement phoneInputField;

    @FindBy (name = "submitAddress")
    private WebElement submitField;


    public void fillAliasInputField(String alias) {
        aliasInputField.sendKeys(alias);
    }

    public void fillCompanyInputField(String company) {
        companyInputField.sendKeys(company);
    }

    public void fillVatNumberInputField(String vatNumber) {
        vatNumberInputField.sendKeys(vatNumber);
    }

    public void fillAddressInputField(String address) {
        addressInputField.sendKeys(address);
    }

    public void fillPostcodeInputField(String postcode) {
        postcodeInputField.sendKeys(postcode);
    }

    public void fillCityInputField(String city) {
       cityInputField.sendKeys(city);
    }

    public void selectCountry(String country) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select dropdown = new Select(driver.findElement(By.cssSelector(".form-control.form-control-select.js-country")));
        dropdown.selectByVisibleText("United Kingdom");

    }

//    public void fillPhoneInputField(String phone) {
//        phoneInputField.sendKeys(phone);
//    }
//
//    public void clickSubmitField() {
//        submitField.click();
//    }


}
