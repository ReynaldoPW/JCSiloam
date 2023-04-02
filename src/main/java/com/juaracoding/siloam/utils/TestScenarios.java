package com.juaracoding.siloam.utils;

public enum TestScenarios {
    T1("user ingin melihat data dari tanggal 1 maret sampai 31 maret status pending"),
    T2("User edit dengan menghapus nama");
//    T2("Input username null dan password null"),
//    T3("Input username valid dan password null"),
//    T4("Input username null dan password valid"),
//    T5("Input invalid username(case sensitive) dan password valid"),
//    T6("Input username valid dan password invalid case sensitive"),
//    T7("Input invalid username dan password valid"),
//    T8("Input invalid username dan password valid"),
//    T9("Input username kurang dari 8 atau lebih dari 16 digit dan password valid"),
//    T10("Input username valid dan password kurang dari 8 atau lebih dari 16 digit"),
//    T11("Input username dan password valid"),
//    T12("Sales logout dari web"),
//    T13("Sales Input username null dan password null"),
//    T14("Sales Input username null dan password valid"),
//    T15("Sales Input username valid dan password null"),
//    T16("Sales Input username invalid case sensitive dan password valid"),
//    T17("Sales Input username valid dan password invalid"),
//    T18("Sales Input username invalid dan password valid"),
//    T19("Sales Input username dan password valid"),
//    T20("Sales Input username valid dan password invalid case sensitive"),
//   T21("Sales Input data null nama"),
//    T22("Sales Input data null Nomor Bpjs"),
//    T23("Sales Input data Nomor Bpjs yang sudah terdaftar"),
//    T24("Sales Input data nomor Bpjs kurang dari 13 digit"),
//    T25("Sales Input karakter huruf di fields no Bpjs"),
//    T26("Sales Input data null Nomor KTP"),
//    T27("Sales Input data nomor KTP kurang dari 13 digit"),
//    T28("Sales Input data nomor KTP menggunakan karakter huruf"),
//    T29("Sales Input data null alamat"),
//    T30("Sales tidak mengisi kota KTP null"),
//    T31("Sales tidak mengisi faskes awal null"),
//    T32("Sales tidak mengisi faskes tujuan null"),
//    T33("Sales tidak mengisi alasan null"),
//    T34("Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan sama"),
//    T35("Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan beda");



    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
