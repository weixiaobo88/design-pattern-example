package com.example.designpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void should_be_equal_given_two_signle_instance() {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();

        assertEquals(s1, s2);
    }
}