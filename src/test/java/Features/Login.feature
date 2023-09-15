Feature: UserLogin
  User can Login to website
  Scenario Outline:
    Given i entered data user "<email>" ,"<password>"
    Then User Login Successfully
    Examples:
      | email                | password |
      | abdallah22@gmail.com | Abd@7422 |