Feature: Deductible

  Amount paid out of pocket each year before any claims are paid.
  Need
  a field for drug cost
  a field for deductible
  a field for Co-Insurance
  a field for insurer pays
  a field for paid out of pocket
  No Deductible
  Middle Deductible
  High Deductible

  @unit
  Scenario: No Deductible

    Given The Admin application, DIN page is created as follows
          | DIN  | Drug Cost |
          | 2345 | 100.0     |
      And The Admin application, Provider page is created as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is created as follows
          | Certificate |
          | 123456789   |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 80.0         | 2345 | 0.0        | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 20.0          | 80.0      |

  @unit
  Scenario: Low Deductible

    Given The Admin application, DIN page is created as follows
          | DIN  | Drug Cost |
          | 2345 | 100.0     |
      And The Admin application, Provider page is created as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is created as follows
          | Certificate |
          | 123456789   |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 80.0         | 2345 | 10.0       | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 28.0          | 72.0      |

  @unit @component
  Scenario: High Deductible

    Given The Admin application, DIN page is created as follows
          | DIN  | Drug Cost |
          | 2345 | 100.0     |
      And The Admin application, Provider page is created as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is created as follows
          | Certificate |
          | 123456789   |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 80.0         | 2345 | 100.0      | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 100.0         | 0.0       |

