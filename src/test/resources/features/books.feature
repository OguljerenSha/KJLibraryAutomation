Feature: Student user logged in and should see all web elements on the page

  @wip
  Scenario: Student landed on books page and can see books dropdown
    Given user logs as a student
    When user should land on books page
    Then student should see dropdown value as "10"