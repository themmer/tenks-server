package com.tenks;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class TenksGuiceServletConfig extends GuiceServletContextListener {

  @Override
  protected Injector getInjector() {
    System.out.println("Loading up Guice");
    return Guice.createInjector(new TenksApplicationModule());
  }
}