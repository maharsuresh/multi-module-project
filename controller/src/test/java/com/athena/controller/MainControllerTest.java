package com.athena.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MainControllerTest {
    MainController m=new MainController();
    @Test
    public void testHello(){
        System.out.println("This is testHello  method.");
        assertEquals("Hello Controller",m.hello());
    }
}
