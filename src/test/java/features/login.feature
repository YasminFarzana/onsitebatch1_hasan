Feature:
  Scenario:Student should be able to valid credintials
  Given :Student at talentTEK Homepage
   And :Student enter their valid email address
   And :Student enter their valid password
   When : Student clicks on Login button From login page
  Then :Student should be able to login successfully login

  Scenario:Student should be not able to invalid email address
    Given :Student at talentTEK Homepage
    And :Student enter their invalid email address
    And :Student enter their valid password
    When : Student clicks on Login button From login page
    Then :Student should not be able to login successfully login

  Scenario:Student should be not able to invalid password
    Given :Student at talentTEK Homepage
    And :Student enter their valid email address
    And :Student enter their invalid password
    When : Student clicks on Login button From login page
    Then :Student should not be able to login successfully login

  Scenario:Student should be able to invalid credintials
    Given :Student at talentTEK Homepage
    And :Student enter their invalid email address
    And :Student enter their invalid password
    When : Student clicks on Login button From login page
    Then :Student should be able to login successfully login