@Feature
Feature: Title of the feature
I want to use this tamplate for my feature file
@TC-1 
Scenario Outline: Sum of Two numbers
Given Get the value <a> and <b>
When Add a and b
Then Verify the addition with <sum>

Examples:
| a | b  | sum  |
|100| 50 | 150  |
|100| 150| 250  |
|100| 10 | 110  |
|100| 20 | 120  |
|100| 00 | 100  |
|100| 20 | 120  |
|100| 30 | 130  |
|100| 50 | 150  |
|100| 250| 350  |
|100| 10 | 100  |
|100| 150 | 250 |
