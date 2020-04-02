$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/addNewAddress.feature");
formatter.feature({
  "name": "Add New Address",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create new address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks Addresses button",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks Create new address button",
  "keyword": "And "
});
formatter.step({
  "name": "User type \u003calias\u003e in Alias field",
  "keyword": "And "
});
formatter.step({
  "name": "User type \u003ccompany\u003e in Company field",
  "keyword": "And "
});
formatter.step({
  "name": "User type \u003cvat number\u003e in VAT number field",
  "keyword": "And "
});
formatter.step({
  "name": "User type \u003caddress\u003e in Address field",
  "keyword": "And "
});
formatter.step({
  "name": "User type \u003ccodezip/postal code\u003e in CodeZip/Postal Code field",
  "keyword": "And "
});
formatter.step({
  "name": "User type \u003ccity\u003e in City field",
  "keyword": "And "
});
formatter.step({
  "name": "User type \u003cphone\u003e in Phone field",
  "keyword": "And "
});
formatter.step({
  "name": "User submits form",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "alias",
        "company",
        "vat number",
        "address",
        "codezip/postal code",
        "city",
        "country",
        "phone"
      ]
    },
    {
      "cells": [
        "Janek",
        "Testers",
        "7615974321",
        "Wroclawska",
        "30-133",
        "Krakow",
        "United Kingdom",
        "691351789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create new address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateNewAddressTest.userIsLoggedInToCodersLabShop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Addresses button",
  "keyword": "When "
});
formatter.match({
  "location": "CreateNewAddressTest.userClicksAddressesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Create new address button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userClicksCreateNewAddressButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type Janek in Alias field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userTypeAliasInAliasField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type Testers in Company field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userTypeCompanyInCompanyField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type 7615974321 in VAT number field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userTypeVatNumberInVATNumberField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type Wroclawska in Address field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userTypeAddressInAddressField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type 30-133 in CodeZip/Postal Code field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userTypeCodezipPostalCodeInCodeZipPostalCodeField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type Krakow in City field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userTypeCityInCityField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type 691351789 in Phone field",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userTypePhoneInPhoneField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User submits form",
  "keyword": "And "
});
formatter.match({
  "location": "CreateNewAddressTest.userSubmitsForm()"
});
formatter.result({
  "status": "passed"
});
});