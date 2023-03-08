package com.prajwalmh.Mockito;

import javax.swing.*;

public class SomeBusinessImpl {


    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public SomeBusinessImpl() {

    }

    public int findTheGreatestFromAll(){
        int[] data = dataService.retrieveAllData();
        int greatestValue=Integer.MIN_VALUE;
        for(int value:data){
            if(value>greatestValue){
                greatestValue=value;
            }
        }
        return greatestValue;
    }



    interface DataService{
        int[] retrieveAllData();
    }
}
