Feature: First Rest Assured test POST 


Scenario: Test my POST request test 
Given  user hit the post request with "Tom" name
Then user validate followind data
	|param			|Value			|
	|id					|notNull		|
	|statusCode	|201			|