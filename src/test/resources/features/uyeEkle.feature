@Task
Feature:User should be able to add new candidate

  Scenario:user should be able to add new uye
    Given the user in login page
    And the user logged in "erbay.1012@gmail.com" and "Test1234"
    When user should be able join uye ekle
    And  user should be able to click yeni liste button
    And user should be able to write a "Test1"
    And user should be able to click kaydet button
    And user should be able to click uye ekle and form ile ekle
    Then user should be able to add new uye and verify new uye
      | ad    | ahmet       |
      | soyad | erbay       |
      | email | d@gmail.com |



