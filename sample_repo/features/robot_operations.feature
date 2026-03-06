Feature: Robot Operations

Scenario: Robot moves container

Given container "C100" exists
When robot moves to location "A1"
And robot lifts container with weight 25
Then robot should deliver container to station