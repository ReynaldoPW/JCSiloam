package com.juaracoding.siloam.utils;

public enum TestScenarios {
    T1("Input username dan password valid"),
    T2("Admin logout dari web"),
    T3("Input invalid username(case sensitive) dan password valid"),
    T4("Input username valid dan password invalid case sensitive"),
    T5("Input invalid username dan password valid"),
    T6("Input invalid username dan password valid"),
    T7("Input username null dan password valid"),
    T8("Input username valid dan password null"),
    T9("Input username null dan password null"),
    T10("Input username kurang dari 8 atau lebih dari 16 digit dan password valid"),
    T11("Input username valid dan password kurang dari 8 atau lebih dari 16 digit"),
    T12("Sales Input username dan password valid"),
    T13("Sales logout dari web"),
    T14("Sales Input username invalid case sensitive dan password valid"),
    T15("Sales Input username valid dan password invalid case sensitive"),
    T16("Sales Input username null dan password valid"),
    T17("Sales Input username valid dan password null"),
    T18("Sales Input username null dan password null"),
    T19("Sales Input username valid dan password invalid"),
    T20("Sales Input username invalid dan password valid"),
   T21("Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan sama"),
    T22("Sales input valid data customer yang mempunyai kota ktp dan faskes tujuan beda"),
    T23("Sales Input data null nama"),
    T24("Sales Input data null Nomor Bpjs"),
    T25("Sales Input data nomor Bpjs kurang dari 13 digit"),
    T26("Sales Input karakter huruf di fields no Bpjs"),
    T27("Sales Input data null Nomor KTP"),
    T28("Sales Input data nomor KTP kurang dari 13 digit"),
    T29("Sales Input data nomor KTP menggunakan karakter huruf"),
    T30("Sales Input data null alamat"),
    T31("Sales tidak mengisi kota KTP null"),
    T32("Sales tidak mengisi faskes awal null"),
    T33("Sales tidak mengisi faskes tujuan null"),
    T34("Sales tidak mengisi alasan null");



    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
