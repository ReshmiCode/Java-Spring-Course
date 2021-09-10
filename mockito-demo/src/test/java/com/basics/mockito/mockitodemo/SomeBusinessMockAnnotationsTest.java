package com.basics.mockito.mockitodemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    public void testFindTheGreatest() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 3});
        Assertions.assertEquals(24, businessImpl.findTheGreatest());
    }

    @Test
    public void testFindTheGreatest_ForOneValue() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        int res = businessImpl.findTheGreatest();
        Assertions.assertEquals(15, res);
    }

}