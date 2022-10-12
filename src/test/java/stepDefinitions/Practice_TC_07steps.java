package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Practice_TC07_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07steps {
    Practice_TC07_Page practice_tc07_page=new Practice_TC07_Page();
    @Given("Tarayıcıyı başlatarak {string} url'sine gidin")
    public void tarayıcıyı_başlatarak_url_sine_gidin(String istenenUrl ){
        Driver.getDriver().get(istenenUrl);

    }
    @Then("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
    public void ana_sayfanın_başarıyla_görünür_olduğunu_doğrulayın() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());

    }
    @Then("Test Case buttonu na tıklayın")
    public void test_case_buttonu_na_tıklayın() {
        practice_tc07_page.testCaseLink.click();

    }
    @Then("Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın")
    public void kullanıcının_test_case_sayfasına_başarıyla_yönlendirildiğini_doğrulayın() {
        Assert.assertTrue(practice_tc07_page.testCaseTitle.isDisplayed());

    }
    @Then("İlgili sayfanın ekran görüntüsünü alın")
    public void ilgili_sayfanın_ekran_görüntüsünü_alın() {

        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
