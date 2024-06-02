package com.spring.basics.spring_in_5_steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public int[] getData() {
        return new int[] {5, 89, 100, 75, 97};
    }
}
