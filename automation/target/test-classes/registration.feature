@registration
Feature:Registration form

	Scenario:1 Registring user with all fields  Blank Characters
	Given open firefox browser
	When i open the url
	Then website loaded
	When click on register link
	Then page should  display with register header
	When click on Submit
	Then Thank you for registering message is  displayed