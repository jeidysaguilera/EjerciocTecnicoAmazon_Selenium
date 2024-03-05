Feature: Test de Busqueda en Amazon

  Scenario: Como cliente cuando hago una busqueda con alexa,quiero ver si la tercera opcion, en la segunda pagina esta disponible
    para la compra y si puede ser agregada al carrito.

    Given el usuario navega a www.amazon.com
    And Busca por "Alexa"
    And navega a la segunda pagina
    And selecciona el tercer elemento
    Then Verifica que puede agregar al carrito de compra
