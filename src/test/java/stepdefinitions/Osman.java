package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GooglePage;
import utilities.Driver;

public class Osman {
    GooglePage googlePage = new GooglePage();

    @Given("user searches for Mathematik")
    public void user_searches_for_Mathematik() {
        Driver.getDriver().get("https://www.google.com");
        System.out.println("Osman dan Merhabalar ");
    }

    @Then("verify the results has Mathematik")
    public void verify_the_results_has_Mathematik() {

        System.out.println();
    }


}
