Feature:  As a user, I should be able to login with correct credentials to different accounts.
And dashboard should be displayed.

  Scenario: user open the main page and click login
    Given user open the main page
    Then user able to see login button and can click

    #@login
  Scenario: user in the login page
    Given user in the login page
    When user enter the valid username and click the next button
    And  user enter the valid password and click the next button
    Then user can see the expected title

#@wip
#Scenario: Check the login page with invalid credential
#  Given user open the login page
#  When user enter the invalid username and password
#  Then user can see error message