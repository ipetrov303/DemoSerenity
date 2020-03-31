Feature: Successfully Adding a Product to the Basket

  Background:
    Given John is on the Women's Product Page

  @debug
  Scenario: Successfully Adding a Product to the Cart
    When John selects first product on Women's Clothing Page
    And John selects preferred option on Product Page:
      | quantity | size | color |
      | 2        | L    | blue  |
    Then John should see a popup window with notification "Product successfully added to your shopping cart"
    When John clicks on the proceed to checkout button
    Then John should be redirected to the cart and see the product and quantities that he selected
      | product                     | quantity | total_price |
      | Faded Short Sleeve T-shirts | 2        | 35.02       |