Feature: Successfully Adding a Product to the Cart


  Scenario: Add Product to Cart
    Given John is on the Women's Product Page
    When he chooses the first product on Women's Clothing Page
    And he adds product to the cart with order details:
      | quantity | size | color |
      | 2        | L    | blue  |
    Then notification "Product successfully added to your shopping cart" is shown
    And correct order details are displayed on the cart page:
