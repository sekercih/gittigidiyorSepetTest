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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"sp-subTitle\"]\"}\n  (Session info: chrome\u003d102.0.5005.115)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.4\u0027, revision: \u0027535d840ee2\u0027\nSystem info: host: \u0027DESKTOP-9ONR3K3\u0027, ip: \u0027192.168.240.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [946aec6bc3f9317d76031b2f7681f9d0, findElement {using\u003dxpath, value\u003d//*[@id\u003d\"sp-subTitle\"]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.115, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\Mehmet\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:11626}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:11626/devtoo..., se:cdpVersion: 102.0.5005.115, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 946aec6bc3f9317d76031b2f7681f9d0\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.getText(Unknown Source)\r\n\tat stepdefinitions.StepDefinitions.ürün_sayfasındaki_fiyat_ile_sepette_yer_alan_ürün_fiyatının_doğruluğu_karşılaştırılır(StepDefinitions.java:122)\r\n\tat ✽.Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır(file:///C:/Users/Mehmet/Desktop/gittigidiyor/src/test/resources/features/task.feature:11)\r\n",
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