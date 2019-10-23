Feature: Access to the Contacts Orchestrator Solution's (COS) Landing Page
  As a user
  I want to access to the URL address provided for the landing page
  So that I can see the list of the contacts available
  Scenario: App's title is "Contacts Orchestrator Solution"
    Given I access the landing page of COS
    Then the title of the window should be "Contacts Orchestrator Solution"
    And The tab "Contacts" should be selected

    Scenario: Landing page should display all contacts
      Given The "Contacts" tab is selected
      Then I can see the text "Contacts"
      And The contacts data sources should be displayed
      And I can see a table
      And The table has columns "Name", "Phone", "Email", "Source", "Photo" and "Address"
      And I can see the contacts displayed in the table
      And I can see the page options
      And The selected size of the page is 5
      And I can change the size of the page to "5", "10", or "20"

  Scenario: When I change the source of contacts
    Given The source Facebook
    Then I Shuld have just contacts with the source "Facebook"

  Scenario: When I check the list of contacts
      Given I selected the table
      And I have some contacts in the first page of contacts duplicated
      And I click to go to the next page of duplicated
      Then I see duplicated contacts


  Scenario: When I click to change the page, I want to be presented with different contacts
    Given I selected the tab of duplicated free
    And I have some contacts in the first page
    And I click to go to the next page
    And I see different contacts
    Then I should be presented with different contacts

   Scenario: When I select how many contacts i want to see
     Given The number of contacts
     Then I should have the number that i select per page

  Scenario: When I change to the duplicated free tab
    Given I click on the tab
    Given I click on the view details button
    Then I should get the information of the contact selected

