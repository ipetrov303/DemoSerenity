Feature: Successfully Adding a Product to the Basket

  @debug
  Scenario: Successfully Adding a Product to the Cart
    Given John is on the Women's Product Page
    And he chooses the first product on Women's Clothing Page
    When John adds the product with his preferences to the cart:
      | quantity | size | color |
      | 2        | L    | blue  |
    Then notification "Product successfully added to your shopping cart" is shown
    When John clicks on the proceed to checkout button
    Then John is redirected to the cart where summary for his purchase is shown:
      | product                     | quantity | total_price |
      | Faded Short Sleeve T-shirts | 2        | 35.02       |