package com.spring.basics.springaop.business;

import com.spring.basics.springaop.aspect.TrackTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.basics.springaop.data.Dao1;

@Service
public class Business1 {
    @Autowired
    private Dao1 doa1;

    @TrackTime
    public String calculateSomething() {
        // business logic
        return doa1.retrieveSomething();
    }
}
