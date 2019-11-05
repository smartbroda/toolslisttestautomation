Feature: Search for course

  Acceptance Criteria:

  * user needs to be able to search for a course

  Scenario: A user searches for a course
    When a user searches for "cucumber"
    Then a course containing the word "cucumber" is displayed