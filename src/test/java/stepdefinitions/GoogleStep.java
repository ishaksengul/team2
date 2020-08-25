package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleStep {



        System.out.println("Hello everyone!");
        System.out.println("Mustafa!");
        System.out.println("KRAL HAKAN SUKUR");
        System.out.println("Herkese Merhaba Selcuk");
        System.out.println("ismail'den selamlar");
        System.out.println("Fedai'den selamlar");
        System.out.println("KRAL HAKAN SUKUR");  
        System.out.println("ilk commit from ruveyda");
        
        
        
        System.out.println("Yeni bir Dünya!");
        System.out.println("KRAL HAKAN  I aggree");
        
         System.out.println("Osman'dan selamlar");





        System.out.println("Merhaba Arkadaslar, ilk projemi gonderiyorum");

    }

    @Given("user searches for iphone")
    public void user_searches_for_iphone() {
        googlePage.searchBox.sendKeys("iphone");
        googlePage.searchBox.submit();
        System.out.println("ilk commit from ruveyda");
    }

    @Then("verify the results has iphone")
    public void verify_the_results_has_iphone() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("iphone"));

        System.out.println("Usame den merhabalar");

    }


}
