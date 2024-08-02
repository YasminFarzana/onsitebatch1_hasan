Feature:login
  Background:
    Given Student at talentTEK Homepage

@login @regression @smoke
  Scenario:Student should be able to valid credintials
   And Student enter their valid email address
   And Student enter their valid password
   When Student clicks on Login button From login page
  Then Student should be able to login successfully login

  @login @regression
  Scenario: Student should be not able to invalid email address
    And Student enter their invalid email address
    And Student enter their valid password
    When  Student clicks on Login button From login page
    Then Student should not be able to login successfully login

  @login @regression
  Scenario:Student should be not able to invalid password
     And Student enter their valid email address
    And Student enter their invalid password
    When  Student clicks on Login button From login page
    Then Student should see invalid incorrect email or password error message

  @login @regression
  Scenario:Student should be able to invalid credintials
    And Student enter their invalid email address
    And Student enter their invalid password
    When  Student clicks on Login button From login page
    Then Student should not be able to login successfully login

  @login @regression @smoke @Works
    Scenario Outline: Ensure user able to login in different credintials
      And Student enter their valid email address "<emailValue>"
      And Student enter their valid password "<passwordValue>"
      Examples:
        | email value     | passwordValue |
        | test1@gmail.com | Work12345     |
        | test2@gmail.com | Cat123445     |
        | test3@gmail.com |dog1234545     |