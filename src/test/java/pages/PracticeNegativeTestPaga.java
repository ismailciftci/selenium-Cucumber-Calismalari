package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeNegativeTestPaga {

    public PracticeNegativeTestPaga(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signinSymbol;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signinButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "(//*[.='Sign in'])[4]")
    public WebElement signinWithCredentials;

    @FindBy(xpath = "//*[contains(text(), 'Authentication information not correct.')]")
    public WebElement popUpMessage;//ACILIP KAPANAN MESAJLAR ICIN kalip loked sadece tirnak icindeki mesaj degistirilerek
                                   //tekrar kullanilabilir

    //ACILIP KAPANAN MESAJLAR ICIN
    //contains text() olayı tum web elementleri icinde,
    // icerisinde text olarak 'şu'  text i iceren locateleri bul diyor.
    // bunu baska bir text icerigi ile aranan metni değistirerek te kullanabiliriz


}
