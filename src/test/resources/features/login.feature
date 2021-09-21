@task
Feature:Customer should be able to log in

  Background:
    Given the user in login page

  Scenario:Login with valid credentials
    When the user logged in "erbay.1012@gmail.com" and "Test1234"
    Then the user should see the urunlerimiz

  Scenario:Login with invalid credentials both invalid
    When the user logged "blabla@gmail.com" and "1234Test"
    Then the user should be able to see Username and password did not match

  Scenario:Login with invalid credentials invalid username valid password
    When the user logged in "invalid@gmail.com" and "password"
    Then the user should be able to see Username and password did not match

  Scenario:Login with invalid credentials valid username invalid password
    When the user logged in "erbay.1012@gmail.com" and "12345678"
    Then the user should be able to see Username and password did not match

  Scenario Outline: Login with empty username or password
    When the user can not logged in as "<username>" and "<password>" and display warning
    Examples:
      | username        | password |
      | user1@gmail.com |          |
      |                 | User123  |
      |                 |          |