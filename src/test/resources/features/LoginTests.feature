Feature:Login Functionality tests

  Background: Test setup navigate to sign in page.
    When Click on Sign In Button
  Scenario: Positive Test. login with valid credentials.


And Enter username "mohammad@Tekschool.com" and password "Password@123"
And click on Login button
Then Validate Account button is displayed


    Scenario Outline: Negative test. Validate invalid username

      And Enter username "<username>" and password "<password>"
      And click on Login button
      Then Validate error message "<errorMessage>"
      Examples:
     | username             | password              | errorMessage |
     | wrongusername@Tekschool.com | password@123   | wrong username or password |
     | mohammadi@Tekschool.com | wrongpass@123      | wrong username or password |
