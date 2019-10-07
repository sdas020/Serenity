@CabBook
Feature: I want to book adhoc cab in cognizant portal

  @AdhocCab
  Scenario Outline: Book cab in cognizant portal
    Given Open one cognizant portal
    When Book the cab with "<departure_place>","<Destination_place>"
    And validate the cab booking procedure with "<departure_place>","<Destination_place>"

    Examples: 
      | departure_place             | Destination_place |
      | Navallur-Ags Bus Stop       | CHN-CRC           |
     