package com.spring.basics.springin5steps.basic;

import com.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.assertEquals;

// load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXMLConfigTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int res = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(res, 3);
    }

}