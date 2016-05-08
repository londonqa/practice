@all @menulinks
Feature:Menu Links

	Background:
	Given open firefox browser
	When i open the url
	Then website loaded
	
	Scenario:1 Top menu links	
	When i click right hand sign in link
	Then corresponding  sign in page loaded
	When i click right hand register link
	Then corresponding  register page loaded
	When i click right hand support link
	Then corresponding  support page loaded
	When i click right hand contact link
	Then corresponding  contact page loaded
	
	Scenario:2 Left hand menu links
	When click left hand home link
	Then corresponding home page should be loaded
	When click left hand flights link
	Then corresponding flights page should be loaded
	When click left hand hotels link
	Then corresponding hotels page should be loaded
	When click left hand car rentals link
    Then corresponding car rentals page should be loaded
    When click left hand cruises link
    Then corresponding cruises page should be loaded
    When click left hand destinations link
    Then corresponding destinations page should be loaded
    When click left hand vacations link
    Then corresponding vacations page should be loaded
    