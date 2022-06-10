Feature: Testinium Task
  @wip
  Scenario: Task Steps
    Given "URL" sitesi açılır
    When Arama kutucuğuna 'bilgisayar' kelimesi girilir
    And Arama sonuçları sayfasından 2.sayfa açılır
    And 2.sayfanın açıldığı kontrol edilir
    And Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir
    And Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır
    And Seçilen ürün sepete eklenir
    Then Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır
    Then Adet arttırılarak ürün adedinin "2" olduğu doğrulanır
    Then Ürün sepetten silinerek sepetin boş olduğu kontrol edilir