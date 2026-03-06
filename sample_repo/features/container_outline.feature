Feature: Parameterized container creation

Scenario Outline: Create containers

When user creates container "<containerId>"
Then container "<containerId>" should exist

Examples:
| containerId |
| C300 |
| C301 |