Feature: To validate the login functionality in fb application

  Scenario: To verify the login with valid username and valid password
    Given user has to be there in fb page
    When user as to fill username and passwords
      | username | passwords |
      | sudhagar | sudha@123 |
      | sarath   |  90800989 |
    And user click the login button
    Then user has to navigate to homepage
