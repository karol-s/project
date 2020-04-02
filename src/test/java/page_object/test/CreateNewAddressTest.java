package page_object.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.page.LoginPage;
import page_object.page.NewAddressPage;
import page_object.page.YourAccountPage;
import page_object.page.YourAddressesPage;

import java.util.concurrent.TimeUnit;


public class CreateNewAddressTest {

    private WebDriver driver;

    @Given("User is logged in to CodersLab shop")
    public void userIsLoggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("miwpxrvovnltjbkojq@ttirv.net", "password123");
    }


    @When("User clicks Addresses button")
    public void userClicksAddressesButton() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickAddressesButton();
    }

    @And("User clicks Create new address button")
    public void userClicksCreateNewAddressButton() {
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.clickCreateNewAddress();
    }


    @And("User type (.*) in Alias field")
    public void userTypeAliasInAliasField(String alias) {
        new NewAddressPage(driver).fillAliasInputField(alias);
    }

    @And("User type (.*) in Company field")
    public void userTypeCompanyInCompanyField(String company) {
        new NewAddressPage(driver).fillCompanyInputField(company);
    }

    @And("User type (.*) in VAT number field")
    public void userTypeVatNumberInVATNumberField(String vatNumber) {
        new NewAddressPage(driver).fillVatNumberInputField(vatNumber);
    }

    @And("User type (.*) in Address field")
    public void userTypeAddressInAddressField(String address) {
        new NewAddressPage(driver).fillAddressInputField(address);
    }

    @And("User type (.*) in CodeZip\\/Postal Code field")
    public void userTypeCodezipPostalCodeInCodeZipPostalCodeField(String postCode) {
        new NewAddressPage(driver).fillPostcodeInputField(postCode);
    }

    @And("User type (.*) in City field")
    public void userTypeCityInCityField(String city) {
        new NewAddressPage(driver).fillCityInputField(city);
    }

    @And("User type (.*) in Phone field")
    public void userTypePhoneInPhoneField(String phone) {
        new NewAddressPage(driver).fillPhoneInputField(phone);
    }

    @And("User selects (.*) from Country field")
    public void userSelectsCountryFromCountryField(String country) {
        new NewAddressPage(driver).selectCountry(country);
    }

    @And("User submits form")
    public void userSubmitsForm() {
        new NewAddressPage(driver).clickSubmitField();
    }



//    @Then("User sees information: (.*)")
//    public void userSeesInformationAddressSuccessfullyAdded(String expectedInformation) {
//        String actualInformation = new YourAddressesPage(driver).getInformation();
//        Assert.assertEquals(expectedInformation, actualInformation);
//    }
//
//    @And("User data on the screen are the same as previously typed")
//    public void userDataOnTheScreenAreTheSameAsPreviouslyTyped() {
//        String actualUserData = new YourAddressesPage(driver).getActualUserData();
//        String expectedUserData = ;
//        Assert.assertEquals("", actualUserData);


}
