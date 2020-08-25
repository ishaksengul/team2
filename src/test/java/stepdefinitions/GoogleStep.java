package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStep {
    GooglePage googlePage = new GooglePage();
    @Given("user on the google page")
    public void user_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
        System.out.println("Merhaba Arkadaslar, ilk projemi gonderiyorum");
    }

    @Given("user searches for iphone")
    public void user_searches_for_iphone() {
        googlePage.searchBox.sendKeys("iphone");
        googlePage.searchBox.submit();
    }

    @Then("verify the results has iphone")
    public void verify_the_results_has_iphone() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("iphone"));

    }

}
