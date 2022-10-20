// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers.javascript {

  // @LINE:5
  class ReverseFooController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def doThing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FooController.doThing",
      """
        function(thing0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foo/thing" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("thing", thing0)])})
        }
      """
    )
  
  }


}
