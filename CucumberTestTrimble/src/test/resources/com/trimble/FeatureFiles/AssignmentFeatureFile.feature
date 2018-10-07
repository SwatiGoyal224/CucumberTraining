Feature: Verify Circuit id

  Scenario Outline: Verify Circuit id
    When user hit the get request
    Then user checks at path "<path>" with the "<value>" value

    Examples: 
      | path                                      | value       |
      | MRData.CircuitTable.Circuits.circuitId[0] | albert_park |
      | MRData.CircuitTable.Circuits.circuitId[1] | americas    |
