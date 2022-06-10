package pages;

import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage{

    @FindBy(xpath="//div[@data-cy='pageinfo']/../div[3]//li")
    public List<WebElement> productList;

    @FindBy(css = "[title=\"2. sayfa\"]")
    public WebElement ikinciSayfa;



    public WebElement getSearchPageElement(int i){
        WebElement element = Driver.getDriver().findElement(By.xpath("//li[@data-testid]["+i+"]//span"));
        return element;
    }
    public void clickRandomProduct (){
        Random rd = new Random();
        int randomProduct = rd.nextInt(productList.size());
        productList.get(randomProduct).click();
    }

    public void refreshPage(){
        try {
            if (pageNotFoundError.getText().equals("Sayfa Bulunamadı.")){
                Driver.getDriver().navigate().refresh();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
