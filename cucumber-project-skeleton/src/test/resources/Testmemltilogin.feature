Feature: Testmeapplogin

This is to check login feature

Scenario Outline: successful login
Given user is in testmeapp login page
When the user provides "<login>" and "<password>"
Then the home page must be displayed to the user
Examples:
|login|password|
|Lalitha|Password123|
|admin|Password456|