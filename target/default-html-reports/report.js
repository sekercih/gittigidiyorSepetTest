$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/task.feature");
formatter.feature({
  "name": "Testinium Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Task Steps",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "\"URL\" sitesi açılır",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.sitesiAçılır(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Arama kutucuğuna \u0027bilgisayar\u0027 kelimesi girilir",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.arama_kutucuğuna_kelimesi_girilir(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Arama sonuçları sayfasından 2.sayfa açılır",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.arama_sonuçları_sayfasından_sayfa_açılır(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "2.sayfanın açıldığı kontrol edilir",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.sayfanın_açıldığı_kontrol_edilir(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.sonuca_göre_sergilenen_ürünlerden_rastgele_bir_ürün_seçilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.seçilen_ürünün_ürün_bilgisi_ve_tutar_bilgisi_txt_dosyasına_yazılır()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seçilen ürün sepete eklenir",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.seçilen_ürün_sepete_eklenir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.ürün_sayfasındaki_fiyat_ile_sepette_yer_alan_ürün_fiyatının_doğruluğu_karşılaştırılır()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat stepdefinitions.StepDefinitions.ürün_sayfasındaki_fiyat_ile_sepette_yer_alan_ürün_fiyatının_doğruluğu_karşılaştırılır(StepDefinitions.java:120)\r\n\tat ✽.Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır(file:///C:/Users/Mehmet/Desktop/gittigidiyor/src/test/resources/features/task.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Adet arttırılarak ürün adedinin \"2\" olduğu doğrulanır",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.adetArttırılarakÜrünAdedininOlduğuDoğrulanır(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Ürün sepetten silinerek sepetin boş olduğu kontrol edilir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StepDefinitions.ürün_sepetten_silinerek_sepetin_boş_olduğu_kontrol_edilir()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});