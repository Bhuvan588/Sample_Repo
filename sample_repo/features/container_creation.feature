Feature: Container Creation

Scenario: Create container

Given warehouse system is active
When user creates container "C100"
And container is assigned to location "A1"
Then container should exist in inventory