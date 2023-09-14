Feature: Loin
  i want to check user can Login to Shop website

  Scenario Outline: User Login
    Given i entered data user "<email>" ,"<password>"
    Then the User can Login Successfully

  Examples:
      | email         | password |
      | lolo050@gmail.com | Ali@7422 |
