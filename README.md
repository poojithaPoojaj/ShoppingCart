# ShoppingCart project

## Description
 This Project about to design a shopping cart 
* There are items that could be purchased - Apple, Milk, and NewsPaper
* These items could be added to the shopping cart
* The customer has an e-wallet
* Customer purchases items and pays by e-wallet
* Wallet Provider is offering a discount of 5% if the cost of cost is >= 100
* The shop is running with an offer to buy 2 liters of milk and get 1 free.
## Installations:
* Java JDK
* Gradle
* Git
## Used Dependencies:
* TestNg
## Information About Project:
### Logic Code (Dev)
#### 1.E-wallet
        * Wallet - It Contains All the Wallets 
        * WalletDetails - It Contains Individual Wallet Information
        * WalletOffers - It Contains All the Available Wallet Related Offers
#### 2.Shop
        It Contains all items availble in the shop and its related costs along with offers and discounts from Shop
#### 3.Bill
        Calculate the Bill for the Brought items and along with Applied Shop and Wallet Offers
#### 4.ShoppingCart
        All the Items We Brought wil added To this Cart
#### 5.Validator
         All Valid's wil check here like valid password and userName For Wallet
#### 6.Exceptions
         All Custom Exceptions We Can add here
### Tests (Tester)
#### 1.BillTest
        This Contains All the Bill related tests like
        1.setCostAndCheckTotalCost()
        2.setCostAndCheckIndividualItemCost()
        3.setCostAndCheckBillWithAnyDiscounts()
        4.calculateTotalItemsWithOffersOnItems()
#### 2.Ewallet-WalletTest
         This Contains All the Wallet Related tests like
         1. userShouldBeAbleToCreateWallet()
         2. userShouldNotAbleToCreateNullAsUserNameForWallet()
         3. userShouldNotAbleToCreateWalletWithUserNameAsEmpty()
         4. userShouldNotAbleToCreateWalletWithExistingUserName()
         5. userShouldAbleToCreatePasswordMoreThanFourAndLessThan8Digits()
         6. userShouldNotAbleToCreatePasswordLessThanFourDigits()
         7. userShouldNotAbleToCreateWalletWithZeroAmount()
#### 3.ShoppingCartTest
         This Contains all the Shopping Cart Related test
          1. addItemsCheckTotalOfAllItems()
          2. addItemsAndCheckTotalOfIndividualItems()
# Authors
_**poojitha**
       
