package com.tenks.server.rest;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.JerseyTestNg;

/**
 * Created by Tim on 8/24/2015.
 */
public class ResourceTest extends JerseyTest {
    static {
        System.setProperty("jersey.test.containerFactory", "com.sun.jersey.test.framework.spi.container.inmemory.InMemoryTestContainerFactory");
    }
}
