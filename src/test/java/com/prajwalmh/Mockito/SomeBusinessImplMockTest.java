package com.prajwalmh.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {


    @Mock
    SomeBusinessImpl.DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    void findTheGratestFromAllData_Basic() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5,25,10});
        assertEquals(25, businessImpl.findTheGreatestFromAll());

    }

    @Test
    void findTheGratestFromAllData_Onevalue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{36});
        assertEquals(36,businessImpl.findTheGreatestFromAll());

    }

    @Test
    void findTheGratestFromAllData_EmptySet() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE,businessImpl.findTheGreatestFromAll());

    }


}