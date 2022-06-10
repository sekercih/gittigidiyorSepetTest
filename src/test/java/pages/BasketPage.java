package pages;

import utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BasketPage{

    public BasketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@class='amount']")
    public WebElement dropdownElement;

    @FindBy(xpath = "//a[@title='Sil']")
    public WebElement delete;

    @FindBy(xpath = "//*[@id='empty-cart-container']//h2")
    public WebElement emptyText;

    @FindBy(xpath="//div[@class='text-box']//h2")
    public WebElement productName;

    @FindBy(xpath="//div[@class='total-price']//strong")
    public WebElement productPrice;

    @FindBy(css = "[id=\"sp-subTitle\"]")
    public WebElement secilenUrunBilgisiWebelement;

    @FindBy(xpath = "(//span[@id=\"sp-price-highPrice\"])[1]")
    public WebElement FiyatWebelement;


    public void selectAmount(String amount){
        Select dropdownAmount = new Select(dropdownElement);
        dropdownAmount.selectByValue(amount);
    }

//  Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır.
       // String secilenUrunBilgisi=secilenUrunBilgisiWebelement.getText().toLowerCase();
       // String Fiyat=FiyatWebelement.getText().toLowerCase();
       // yazdir(secilenUrunBilgisi,Fiyat);
 /*
    public void compareProductInformation() throws FileNotFoundException {
        File file=new File("src/test/resources/product.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if (s.contains("Ürün Fiyatı")){
                System.out.println("scanner.hasNextLine() = " + s);
                Assert.assertEquals(s.substring(s.indexOf(":")+1).trim(),productPrice.getText());
            }

        }
        scanner.close();

    }

  */
    public void yazdir(){
        // String path=System.getProperty("user.home");
        String absolutePath="src/test/resources/product.txt";
        String secilenUrunBilgisi=secilenUrunBilgisiWebelement.getText().toLowerCase();
        String fiyat=FiyatWebelement.getText().toLowerCase();

        try {
            FileWriter fileWriter=new FileWriter(absolutePath);
            fileWriter.write("Secilen ürün : "+secilenUrunBilgisi+" ");
            fileWriter.write("Fiyatı: "+fiyat);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
