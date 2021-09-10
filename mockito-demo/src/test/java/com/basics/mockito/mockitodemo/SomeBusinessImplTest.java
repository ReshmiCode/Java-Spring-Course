package com.basics.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class SomeBusinessImplTest {

    @Test
    public void testFindTheGreatest() {
        DataService dataServiceMock = mock(DataService.class);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 3});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int res = businessImpl.findTheGreatest();
        assertEquals(24, res);
    }

    @Test
    public void testFindTheGreatest_ForOneValue() {
        DataService dataServiceMock = mock(DataService.class);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int res = businessImpl.findTheGreatest();
        assertEquals(15, res);
    }

}