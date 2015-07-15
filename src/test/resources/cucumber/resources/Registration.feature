Feature: Search Status
Scenario Outline: Regression test
Given user enters <src> as source  and <dest> as destination
When click search
Then user should get <msg> message
Examples:
|src|dest|msg|
|"KP"|"MP"|"Success"|
|"KP"|""|"Unknown"|