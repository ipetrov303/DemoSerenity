Feature: Forgotten Password

  Background:
    Given John is on the forgotten password page

  Scenario: Successful Reset Of Password
    When John submits password reset request with "johngo@fsdfs.coy" email
    Then success message "A confirmation email has been sent to your address:" should be displayed