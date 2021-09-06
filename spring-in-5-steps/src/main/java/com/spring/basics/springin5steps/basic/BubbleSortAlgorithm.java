package com.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
    public int [] sort(int [] numbers) {
        // logic for bubble sort
        return numbers;
    }
}
