Feature: Add New Address

  Scenario Outline: Create new address
    Given User is logged in to CodersLab shop
    When User clicks Addresses button
    And User clicks Create new address button
    And User type <alias> in Alias field
    And User type <company> in Company field
    And User type <vat number> in VAT number field
    And User type <address> in Address field
    And User type <codezip/postal code> in CodeZip/Postal Code field
    And User type <city> in City field
    And User type <phone> in Phone field
#    And User selects <country> from Country field
    And User submits form
#    Then User sees information: <Address successfully added!>
    Examples:
      | alias | company | vat number | address    | codezip/postal code | city   | country        | phone     |
      | Janek | Testers | 7615974321 | Wroclawska | 30-133              | Krakow | United Kingdom | 691351789 |
