

  Feature: Check the login page with invlaid credential

    Scenario: user in the login page
      Given usr open the login page
      When user enter the invalid username and password
      Then user can see the error message

