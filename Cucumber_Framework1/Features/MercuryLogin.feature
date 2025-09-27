@UATTesting
Feature: Mercury Tours login validation
	Scenario: login validation with valid data
	Given initialize browser
	When user login
	Then successful login operation
