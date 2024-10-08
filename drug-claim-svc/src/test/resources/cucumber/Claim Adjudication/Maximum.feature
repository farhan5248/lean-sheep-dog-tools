Feature: Maximum

  Most the customer pays during the policy period, like a year.
  Once this max is reached the insurer pays 100%.
  Does this mean deductibles don't matter at that point, like is the maximum supposed to be a cap on deductibles?
  That's what I'm interpreting it as for now

  @unit
  Scenario: No Maximum

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
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Maximum | Provider |
          | 123456789   | 80.0         | 2345 | 10.0       | 100.0     | 0.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 20.0          | 80.0      |

  @unit
  Scenario: Low Maximum

    The maximum is less than the deductible so only $5 out of the $10 will count

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
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Maximum | Provider |
          | 123456789   | 80.0         | 2345 | 10.0       | 100.0     | 5.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 24.0          | 76.0      |

  @unit @component
  Scenario: High Maximum

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
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Maximum | Provider |
          | 123456789   | 80.0         | 2345 | 10.0       | 100.0     | 15.0    | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 28.0          | 72.0      |

