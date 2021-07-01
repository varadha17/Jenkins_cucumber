@login
Feature: Validate Login Page

@smoke
Scenario: Check Username and password is valid and it should land into homepage
Given Send valid username and password

@smoke @functional
Scenario: getBrokenLinks
Given Get Broken Links
 