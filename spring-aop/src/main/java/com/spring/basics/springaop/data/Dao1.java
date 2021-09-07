package com.spring.basics.springaop.data;

import com.spring.basics.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething() {
        return "Doa1";
    }
}
