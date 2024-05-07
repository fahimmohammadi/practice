@smoke
Feature: Create new account functionality test

  Scenario: create valid new account


    When Click on Sign In Button
    When Click on Create New Account button
    When Fill Create Account form "fahim" "fahimkhanmohammad12i@gmail.com" "King078564!@#"
    When Click on sign up button
    Then Validate Error message "this email is already exist, please use another email address"