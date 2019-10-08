@GUItesting
Feature: I want to check the UI alignment of the web page

  @GUItestingIntro
  Scenario Outline: Testing the UI alignment of the page
    Given Navigate to the page
    When Provide the valid details with "<departure_City>","<Destination_place>","<Onward_date>","<Return_date>","<text>"
    And validate the web page

    Examples: 
      | departure_City | Destination_place | Onward_date | Return_date | text                                    |
      | Bangalore      | Chennai           | 29-Sep-2019 | 30-Sep-2019 | Track your bus live with the redBus app |
      #| Chennai        | Bangalore         | 15-Aug-2018  | 20-Aug-2018 |Track your bus live with the redBus app|
