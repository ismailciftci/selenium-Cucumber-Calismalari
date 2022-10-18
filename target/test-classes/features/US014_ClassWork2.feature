
@web
Feature: US014 Class Work

  Scenario: Kullanici ve Url Testi
    Given kullanici "webUrl" ana sayfasinda
    Then kullanici Login Portala kadar asagi iner
    And kullanici Login Portala tiklar
    And kullanici 2 saniye bekler
    And kullanici diger windowa gecer
    And kullanici 2 saniye bekler
    And kullanici "username" kutusuna bilgileri girer
    And kullanici 2 saniye bekler
    And kullanici "password" bolumune bilgileri girer
    And kullanici 2 saniye bekler
    And kullanici login butonuna basar
    And kullanici 2 saniye bekler
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    And kullanici 2 saniye bekler
    And kullanici Ok diyerek Popup'i kapatir
    And kullanici 2 saniye bekler
    And kullanici ilk sayfaya geri doner
    And kullanici 2 saniye bekler
    And kullanici ilk sayfaya donuldugunu test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir