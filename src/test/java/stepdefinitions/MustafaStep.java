package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import pages.MustafaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MustafaStep {
    MustafaPage mustafaPage = new MustafaPage();
    @Given("user on the google page")
    public void user_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Given("user searches for muska")
    public void user_searches_for_muska() {
        mustafaPage.searchBox.sendKeys("muska");
        mustafaPage.searchBox.submit();
    }
    @Then("verify the results has muska")
    public void verify_the_results_has_muska() {

        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("muska"));

    }
}
