package com.juaracoding.siloam.utils;

public enum TestScenarios {
    T1("Input username dan password valid"),
    T2("Input invalid username dan password valid"),
    T3("Input username valid dan password invalid"),
    T4("Input invalid username dan password valid"),
    T5("Input invalid username dan password valid"),
    T6("Input username null dan password valid"),
    T7("Input username valid dan password null"),
    T8("Input username null dan password null"),
    T9("Input username kurang dari 8 atau lebih dari 16 digit dan password valid"),
    T10("Input username valid dan password kurang dari 8 atau lebih dari 16 digit"),
    T11("Sales Input username dan password valid"),
    T12("Sales Input username invalid case sensitive dan password valid"),
    T13("Sales Input username valid dan password invalid case sensitive"),
    T14("Sales Input username null dan password valid"),
    T15("Sales Input username valid dan password null"),
    T16("Sales Input username null dan password null"),
    T17("Sales Input username valid dan password invalid"),
    T18("Sales Input username invalid dan password valid");



    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
