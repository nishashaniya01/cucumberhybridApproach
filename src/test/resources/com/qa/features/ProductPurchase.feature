Feature: Buying product from amazon.in website

Scenario Outline: User login and purchase a product from amazon.in

Given User is on homepage
When  User hover to Sign-In option and get signin
And   Search plants pot "<product>" from search bar 
*     Add the product to cart  
*     Proceed to buy the product 
When  User confirms delivery address, payment method and items delivery date
*     Entering "<Fullname>","<Mobilenumber>","<Pincode>","<Housenumber>","<Landmark>","<Town>","<state>" details
#Then  

Examples:

| product | Fullname | Mobilenumber | Pincode | Housenumber | Landmark | Town | state |
| plants pot | shaniya Nisha | 9634517163 | 248001 | H.no 180, swela kala | nothing | Dehradun | UTTRAKHAND |
