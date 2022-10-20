// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseFooController FooController = new controllers.ReverseFooController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseFooController FooController = new controllers.javascript.ReverseFooController(RoutesPrefix.byNamePrefix());
  }

}
