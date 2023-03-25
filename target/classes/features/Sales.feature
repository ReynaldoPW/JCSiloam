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