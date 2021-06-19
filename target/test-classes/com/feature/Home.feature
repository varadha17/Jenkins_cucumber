@home
Feature: HomePage

@smoke
Scenario: get login user name
Given get name of the user who logged in

@functional
Scenario: get free account details
Given Get free account details from site

@smoke @functional
Scenario: get Broken Links
Given get broken links from home page
