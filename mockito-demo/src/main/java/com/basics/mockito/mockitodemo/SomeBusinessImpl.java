package com.basics.mockito.mockitodemo;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findTheGreatest() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int value: data) {
            if(value > greatest) greatest = value;
        }
        return greatest;
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }
}