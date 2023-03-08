package com.prajwalmh.Mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void findTheGratestFromAllData_Basic(){
        DataServiceStub1 dataServiceStub=new DataServiceStub1();
        SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);
        int largest= businessImpl.findTheGreatestFromAll();
        assertEquals(25,largest);

    }

    @Test
    void findTheGratestFromAllData_OneValue(){
        DataServiceStub2 dataServiceStub=new DataServiceStub2();
        SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);
        int largest= businessImpl.findTheGreatestFromAll();
        assertEquals(5,largest);

    }

}
class DataServiceStub1 implements SomeBusinessImpl.DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{5,25,10};
    }
}

class DataServiceStub2 implements SomeBusinessImpl.DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{5};
    }
}