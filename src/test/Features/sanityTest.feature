Feature: Working with Test WebPage (Bondora)

Scenario: login to web site
    Given web site login page
    When logged
    Then user should be redirected to personal page

Scenario: check name, surname, acc number and add a new language
    Given logged web page
    When name and surname should be the same like in ApplicationSetting file
    And acc number should be the same like in ApplicationSetting file
    And set a filter to country form
    Then user able to add a new language