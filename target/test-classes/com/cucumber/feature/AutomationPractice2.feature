Feature: AutomationPractice End to End Test Case 

@RegressionTest
Scenario: Verify the customer or user is able to Login the Application 
	Given User launch the AutomationPractice application 
	When User Click on SignIn Button in the header 
	And User Enter email Id "abcdef@gmail.com" in SignIn page 
	And User Enter Password "12345" in SignIn page 
	And User Click SignIn button in SignIn page 
	Then User Verify the UserName displayed in the header 
	
	
Scenario Outline: Verify the customer or user is able to Login the Application 
	Given User launch the AutomationPractice application 
	When User Click on SignIn Button in the header 
	And User Enter email Id "<EmailId>" in SignIn page 
	And User Enter Password "<Password>" in SignIn page 
	And User Click SignIn button in SignIn page 
	Then User Verify the UserName displayed in the header 
	
	Examples: 
		|EmailId|Password|
		|12323@gmail.com|12121212|
		|121212@gmail.com|12121212|
		
Scenario: Verify the user is able to select the product based on menu navigation 
	When User click on the Menu navigation in the Header 
	And User Click on the Product Selection in the Menu Navigation 
	And User to view the Product in  the page 
	Then User Verify the product in the given page 
	
Scenario: Verify the user is able to place the order 
	When User able to select the product 
	And User able to click the product which customer want 
	And User able to select the quantity, size and color 
	And User click the proceed to checkout 
	And User verify the delivery address 
	And User click the proceed button 
	Then User verify the product which is selected 
	
Scenario: Verify the user is able to click on payment 
	When User able to select the payment mode on the payment page 
	And User click on the Payment mode which he prefers 
	And User click on the confirm order button 
	Then User verify the order is placed or not 
	
Scenario: Verify the user is able to Logout the Application 
	When  User to click on SignOut button 
	Then User verify the logout session 
	
	
	
	
	
