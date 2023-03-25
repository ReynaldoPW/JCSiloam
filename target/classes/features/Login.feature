Feature: Login Admin Sales
  Scenario: Input username dan password valid
    Given Admin membuka browser dan url
    When Admin input username yang terdaftar
    And Admin input password yang terdaftar
    And Admin menekan button login
    Then Admin diarahkan ke halaman home
    And Admin logout dari web

    Scenario: Admin logout dari web
      When Admin sudah login dan berada di home
      And Admin menekan button logout
      Then Admin diarahkan ke halaman url

  Scenario: Input invalid username(case sensitive) dan password valid
    When Admin input username yang invalid
    And Admin input password yang terdaftar
    And Admin menekan button login
    Then Admin mendapatkan message Wrong username or password

  Scenario: Input username valid dan password invalid
    When Admin logout dari web
    And Admin input username yang terdaftar
    And Admin input password yang invalid
    And Admin menekan button login
    Then Admin mendapatkan message Wrong username or password

  Scenario: Input invalid username dan password valid
    When Admin input username yang invalid Admin
    And Admin input password yang terdaftar
    And Admin menekan button login
    Then Admin mendapatkan message Wrong username or password

  Scenario: Input invalid username dan password valid
    When Admin input username yang terdaftar
    And Admin input password yang invalid admin123
    And Admin menekan button login
    Then Admin mendapatkan message Wrong username or password

  Scenario: Input username null dan password valid
    When Admin input username null
    And Admin input password yang invalid admin123
    And Admin menekan button login
    Then Admin mendapatkan message Please fill the fields

  Scenario: Input username valid dan password null
    When Admin input username yang terdaftar
    And Admin input password null
    And Admin menekan button login
    Then Admin mendapatkan message Please fill the fields

  Scenario: Input username null dan password null
    When Admin input username null
    And Admin input password null
    And Admin menekan button login
    Then Admin mendapatkan message Please fill the fields

  Scenario: Input username kurang dari 8 atau lebih dari 16 digit dan password valid
    When Admin input username kurang dari 8 atau lebih dari 16 digit
    And Admin input password yang terdaftar
    And Admin menekan button login
    Then Admin mendapatkan message Wrong username or password

  Scenario: Input username valid dan password kurang dari 8 atau lebih dari 16 digit
    When Admin input username yang terdaftar
    And Admin input password yang kurang dari 8 atau lebih dari 16 digit
    And Admin menekan button login
    Then Admin mendapatkan message Wrong username or password

  Scenario: Sales Input username dan password valid
    When User input username yang terdaftar
    And User input password yang terdaftar
    And User menekan button login
    Then User diarahkan ke halaman home
    And User logout dari web

  Scenario: Sales logout dari web
    When User sudah login dan berada di home
    And User menekan button logout
    Then User diarahkan ke halaman url

  Scenario: Sales Input username invalid case sensitive dan password valid
    When User input username yang invalid case sensitive
    And User input password yang terdaftar
    And User menekan button login
    Then User mendapatkan message Wrong username or password


  Scenario: Sales Input username valid dan password invalid case sensitive
    When User input username yang terdaftar
    And User input password yang invalid case sensitive
    And User menekan button login
    Then User mendapatkan message Wrong username or password

  Scenario: Sales Input username null dan password valid
    And User menekan button logout
    When User input username null
    And User input password yang terdaftar
    And User menekan button login
    Then User mendapatkan message Please fill the fields

  Scenario: Sales Input username valid dan password null
    When User input username yang terdaftar
    And User input password null
    And User menekan button login
    Then User mendapatkan message Please fill the fields

  Scenario: Sales Input username null dan password null
    When User input username null
    And User input password null
    And User menekan button login
    Then User mendapatkan message Please fill the fields

  Scenario: Sales Input username valid dan password invalid
    When User input username yang terdaftar
    And User input password yang invalid
    And User menekan button login
    Then User mendapatkan message Wrong username or password

  Scenario: Sales Input username invalid dan password valid
    When User input username yang invalid
    And User input password yang terdaftar
    And User menekan button login
    Then User mendapatkan message Wrong username or password

