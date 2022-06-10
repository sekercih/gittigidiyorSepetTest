package pages;


import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    @FindBy(xpath = "//input[@data-cy='header-search-input']")
    public WebElement searchInput;

    @FindBy(xpath = "//span[text()='BUL']")
    public WebElement bulButton;

    @FindBy(xpath = "//span[.='Sepetim']")
    public WebElement Sepetim;

    @FindBy(xpath = "//span[.='Kapat']")
    public WebElement closeCookies;

    @FindBy(xpath = "//h1[.='Sayfa Bulunamadı.']")
    public WebElement pageNotFoundError;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
