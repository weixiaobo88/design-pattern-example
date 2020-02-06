package com.example.designpattern.singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoadBalancerTest {
    private LoadBalancer balancer1, balancer2, balancer3, balancer4;

    @Before
    public void setUp() throws Exception {
        balancer1 = LoadBalancer.getInstance();
        balancer2 = LoadBalancer.getInstance();
        balancer3 = LoadBalancer.getInstance();
        balancer4 = LoadBalancer.getInstance();
    }

    @Test
    public void should_be_equal_given_multiple_balancer_instance() {
        assertEquals(balancer1, balancer2);
        assertEquals(balancer2, balancer3);
        assertEquals(balancer3, balancer4);
    }
}