package controllers

import io.swagger.v3.oas.annotations._
import models.FooData
import play.api.libs.json._
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import scala.concurrent.Future

class FooController(cc: ControllerComponents) extends AbstractController(cc) {

  def doThing(thing: String) = Action.async {
    Future.successful(Ok(Json.toJson(FooData(1, thing))))
  }
}
