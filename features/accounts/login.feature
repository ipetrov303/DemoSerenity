# new feature
# Tags: optional

Feature: Login

  Background:
    Given John is on the login page

  Scenario: Successful Declarative Login
    When John logs in with:
      | email            | password   |
      | johngo@fsdfs.coy | password13 |
    Then Johngo is logged in successfully

  Scenario Outline: Unsuccessful Login
    When John logs in with:
      | email   | password   |
      | <email> | <password> |
    Then error "<error_message>" message should display on login page

    Examples:
      | email            | password   | error_message             |
      | johngo@fsdfs.coy | parola     | Authentication failed     |
      |                  | password13 | An email address required |
      | eqweq@dwa.we     | 12431      | Authentication failed     |
