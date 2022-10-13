Feature: US011 Class Work

  Scenario Outline:  TC01_kullanici_sutun_basligi_ile_liste_alabilmeli
    Given kullanici "guruUrl" ana sayfasinda
    Then "<basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Close (Rs) |
      | % Change           |

  Scenario: Kullanici sayfayi kapatir
    Given sayfayi kapatir

