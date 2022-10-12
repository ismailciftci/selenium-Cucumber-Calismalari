Feature: TC Verify Test Cases


   @practiceTC07
   Scenario: TC_07_Test_Cases

    Given Tarayıcıyı başlatarak "http://automationexercise.com" url'sine gidin
    Then Ana sayfanın başarıyla görünür olduğunu doğrulayın
    And Test Case buttonu na tıklayın
    Then Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın
    And İlgili sayfanın ekran görüntüsünü alın

      #Given :verildiğinde demek,
      #When : --zaman ,given dan sonra yazılır.
      #Then : genelde aseertion yapıldıgında kullanılır.
      #And :tekrarlayan adımlarda kullanılır