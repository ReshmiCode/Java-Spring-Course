package com.spring.basics.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.basics.springaop.data.Dao2;

@Service
public class Business2 {
    @Autowired
    private Dao2 doa2;

    public String calculateSomething() {
        // business logic
        return doa2.retrieveSomething();
    }
}
