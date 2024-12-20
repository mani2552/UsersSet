Feature: Validate the General Store App
	Scenario: Validate the Add to Cart Funcionality before and after adding the Price

	Given User launches the General Store App
	When User selects the country India
	And User enters the names
	And User clicks on Lets shop button
	When User picks the price of the product before adding to cart
	And User clicks on Add to cart button
	And User clicks on the cart Icon
	Then User validates the price of the before and after adding to cart
	