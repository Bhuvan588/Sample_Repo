Feature: Order Processing

Scenario: Receive order

Given warehouse receives order "ORD1"
When system allocates container
And robot retrieves container
Then order should move to packing station