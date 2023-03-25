Feature: Sales input data customer
  Scenario: Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan sama
    Given User sudah login dan berada di home
    When User click menu input
    And User input nama valid
    And User input no bpjs valid
    And User input no ktp valid
    And User input alamat valid
    And User input Kota ktp valid
    And User input faskes awal
    And User input faskes tujuan
    And User click button simpan data
    Then User diarahkan ke halaman upload dokumen

    Scenario: Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan beda
      When User click menu input
      And User input nama valid
      And User input no bpjs valid
      And User input no ktp valid
      And User input alamat valid
      And User input Kota ktp valid
      And User input faskes awal
      And User input faskes tujuan berbeda
      And User input alasan
      And User click button simpan data
      Then User diarahkan ke halaman upload dokumen

      Scenario: Sales Input data null nama
        When User click menu input
        And User input nama null
        And User input no bpjs valid
        And User input no ktp valid
        And User input alamat valid
        And User input Kota ktp valid
        And User input faskes awal
        And User input faskes tujuan
        And User click button simpan data
        Then User mendapatkan message Please fill the fields

        Scenario: Sales Input data null Nomor Bpjs
          When User click menu input
          And User input nama valid
          And User input no bpjs null
          And User input no ktp valid
          And User input alamat valid
          And User input Kota ktp valid
          And User input faskes awal
          And User input faskes tujuan
          And User click button simpan data
          Then User mendapatkan message Please fill the fields

          Scenario: Sales Input data nomor Bpjs kurang dari 13 digit
            When User click menu input
            And User input nama valid
            And User input no bpjs kurang dari 13 digit
            And User input no ktp valid
            And User input alamat valid
            And User input Kota ktp valid
            And User input faskes awal
            And User input faskes tujuan
            And User click button simpan data
            Then User mendapatkan message Please match the requested format

            Scenario: Sales Input karakter huruf di fields no Bpjs
              When User click menu input
              And User input nama valid
              And User input no bpjs dengan huruf
              Then input user bpjs akan terhapus

            Scenario: Sales Input data null Nomor KTP
              When User click menu input
              And User input nama valid
              And User input no bpjs valid
              And User input no ktp null
              And User input alamat valid
              And User input Kota ktp valid
              And User input faskes awal
              And User input faskes tujuan
              And User click button simpan data
              Then User mendapatkan message Please fill the fields

  Scenario: Sales Input data nomor KTP kurang dari 13 digit
    When User click menu input
    And User input nama valid
    And User input no bpjs valid
    And User input no ktp kurang dari 16 digit
    And User input alamat valid
    And User input Kota ktp valid
    And User input faskes awal
    And User input faskes tujuan
    And User click button simpan data
    Then User mendapatkan message Please match the requested format

  Scenario: Sales Input data nomor KTP menggunakan karakter huruf
    When User click menu input
    And User input nama valid
    And User input no bpjs valid
    And User input no ktp menggunakan karakter huruf
    Then input user KTP akan terhapus

  Scenario: Sales Input data null alamat
    When User click menu input
    And User input nama valid
    And User input no bpjs valid
    And User input no ktp valid
    And User input alamat null
    And User input Kota ktp valid
    And User input faskes awal
    And User input faskes tujuan
    And User click button simpan data
    Then User mendapatkan message field alamat harus diisi

  Scenario: Sales tidak mengisi kota KTP null
    When User click menu input
    And User input nama valid
    And User input no bpjs valid
    And User input no ktp valid
    And User input alamat valid
    And User input faskes awal
    And User input faskes tujuan berbeda
    And User input alasan
    And User click button simpan data
    Then User mendapat message kota ktp harus diisi

  Scenario: Sales tidak mengisi faskes awal null
    When User click menu input
    And User input nama valid
    And User input no bpjs valid
    And User input no ktp valid
    And User input alamat valid
    And User input Kota ktp valid
    And User input faskes awal null
    And User input faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User mendapatkan message Please fill the fields

  Scenario: Sales tidak mengisi faskes tujuan null
    When User click menu input
    And User input nama valid
    And User input no bpjs valid
    And User input no ktp valid
    And User input alamat valid
    And User input faskes awal
    And User input alasan
    And User click button simpan data
    Then User mendapat message faskes tujuan harus diisi

    Scenario: Sales tidak mengisi alasan null
      When User click menu input
      And User input nama valid
      And User input no bpjs valid
      And User input no ktp valid
      And User input alamat valid
      And User input Kota ktp valid
      And User input faskes awal
      And User input faskes tujuan berbeda
      And User input alasan null
      And User click button simpan data
      Then User mendapatkan message field alasan harus diisi




