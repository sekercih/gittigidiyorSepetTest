package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.BasketPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log4j;
import utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;


public class StepDefinitions {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();
    BasketPage basketPage = new BasketPage();
   static String secilenUrunBasligi,secilenUrunAltBasligi,fiyat;


    @Given("{string} sitesi açılır")
    public void sitesiAçılır(String URL) {
        Driver.getDriver().get(ConfigReader.get(URL));
        Log4j.info("Opening Page : " + ConfigReader.get(URL));

    }

    @When("Arama kutucuğuna {string} kelimesi girilir")
    public void arama_kutucuğuna_kelimesi_girilir(String bilgisayar) {

        homePage.searchInput.sendKeys(bilgisayar);
        Log4j.info("Arama kutucuğuna " + bilgisayar + " kelimesi girilir.");
        ReusableMethods.waitForClickablility(homePage.bulButton, 5).click();
        //searchPage.refreshPage();
        ReusableMethods.waitForClickablility(homePage.closeCookies, 5).click();
        bilgisayar = bilgisayar.substring(0, 1).toUpperCase() + bilgisayar.substring(1);
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith(bilgisayar));
    }

    @When("Arama sonuçları sayfasından {int}.sayfa açılır")
    public void arama_sonuçları_sayfasından_sayfa_açılır(int page) {
        ReusableMethods.scrollToElement(searchPage.ikinciSayfa);
       // ReusableMethods.waitForVisibility(searchPage.ikinciSayfa,5);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithJS(searchPage.ikinciSayfa);
      //  searchPage.ikinciSayfa.click();
        Log4j.info("Arama sonuçları sayfasından " + page + ". sayfa açılır");
        ReusableMethods.waitFor(2);

        //searchPage.getSearchPageElement(page).click();
        //searchPage.refreshPage();

    }

    @When("{int}.sayfanın açıldığı kontrol edilir")
    public void sayfanın_açıldığı_kontrol_edilir(int page) {
        String ikincisayfa= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(ikincisayfa.endsWith(String.valueOf(page)));

    }

    @When("Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir")
    public void sonuca_göre_sergilenen_ürünlerden_rastgele_bir_ürün_seçilir() {
        ReusableMethods.waitFor(2);
        searchPage.clickRandomProduct();
        Log4j.info("Sonuca göre 2. sayfadan rastgele bir ürün sectik");
    }

    @When("Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır")
    public void seçilen_ürünün_ürün_bilgisi_ve_tutar_bilgisi_txt_dosyasına_yazılır() {
        ReusableMethods.waitFor(2);
      // productPage.writeProductInfoToTxtFile();
        basketPage.yazdir();

             Log4j.info("secilen ürünün etiketini ve Fiyatını dosyaya yazdırdık");

    }

    @When("Seçilen ürün sepete eklenir")
    public void seçilen_ürün_sepete_eklenir() {

        ReusableMethods.waitFor(2);

        secilenUrunBasligi=productPage.producTitleOne.getText().toLowerCase();
        secilenUrunAltBasligi=basketPage.secilenUrunBilgisiWebelement.getText().toLowerCase();
        fiyat=basketPage.FiyatWebelement.getText().toLowerCase();

      productPage.addToBasket();
        Log4j.info("Seçilen ürünü sepete ekliyoruz");

    }

    @Then("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır")
    public void ürün_sayfasındaki_fiyat_ile_sepette_yer_alan_ürün_fiyatının_doğruluğu_karşılaştırılır() throws FileNotFoundException {
        ReusableMethods.waitForClickablility(homePage.Sepetim, 10);
        ReusableMethods.clickWithJS(homePage.Sepetim);
        ReusableMethods.waitFor(2);
        //basketPage.compareProductInformation();
        String actualUrunTitle = basketPage.productName.getText().toLowerCase();
        String actualUrunFiyat = basketPage.productPrice.getText().toLowerCase();
        actualUrunTitle = actualUrunTitle.replaceAll("&QUOT;", "\"");
        System.out.println("ürün karşılaşması"+"actualUrunTitle"+"actualUrunFiyat");

        System.out.println(secilenUrunBasligi+"\n"+secilenUrunAltBasligi + "\n" + actualUrunTitle);
        System.out.println(fiyat + "\n" + actualUrunFiyat);
        if (actualUrunTitle.equals(secilenUrunBasligi)) {
            Assert.assertTrue(actualUrunTitle.contains(secilenUrunBasligi));

        } else {
            Assert.assertTrue(actualUrunTitle.contains(secilenUrunAltBasligi));
        }
        Assert.assertTrue(actualUrunFiyat.contains(fiyat));
        Log4j.info("Ürün sayfasındaki fiyat ile sepetteki ürün fiyatinin doğrulugu karşilasilastirdik");
    }
    @Then("Adet arttırılarak ürün adedinin {string} olduğu doğrulanır")
    public void adetArttırılarakÜrünAdedininOlduğuDoğrulanır(String sayi) {
        ReusableMethods.waitFor(2);
       try{
            basketPage.selectAmount(sayi);
            int actual = Integer.parseInt(basketPage.dropdownElement.getAttribute("value"));
            Assert.assertEquals(actual, sayi);
            Log4j.info("Ürün sayisi arttırılarak ürün adedinin " + sayi + " olduğu doğrulanır");
        }catch (NoSuchElementException e){
           Log4j.info("Secilen üründen "+sayi+" adet stokta yoktur");
       }
    }
    @Then("Ürün sepetten silinerek sepetin boş olduğu kontrol edilir")
    public void ürün_sepetten_silinerek_sepetin_boş_olduğu_kontrol_edilir() {
        ReusableMethods.waitFor(2);
        basketPage.delete.click();
        ReusableMethods.waitForVisibility(basketPage.emptyText, 10);
        String text = "Sepetinizde ürün bulunmamaktadır.";
        Assert.assertEquals(basketPage.emptyText.getText(), text);
        ReusableMethods.waitFor(3);
        Log4j.info("Ürün sepetten silinerek sepetin boş olduğu kontrol edilir");

    }

}
