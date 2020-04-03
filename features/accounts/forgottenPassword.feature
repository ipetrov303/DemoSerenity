Feature: Forgotten Password

  Background:
    Given John is on the forgotten password page

  Scenario: Successful Reset Of Password
    When John submits password reset request with "johngo@fsdfs.coy" email
    Then success message "A confirmation email has been sent to your address:" should be displayed

  Scenario Outline: Unsuccessful Reset Of Password
    When John submits password reset request with "<email>" email
    Then error message "<error_message>" should be displayed

    Examples:
      | email             | error_message                                          |
      | nosuchmail@bg.ht  | There is no account registered for this email address. |
      | nosuchmail@@bg.ht | Invalid email address                                  |
      |                   | Invalid email address                                  |