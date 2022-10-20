package controllers

import io.swagger.v3.oas.annotations._
import io.swagger.v3.oas.annotations.media.{Content, Schema}
import io.swagger.v3.oas.annotations.parameters.RequestBody
import io.swagger.v3.oas.annotations.responses.ApiResponse
import models.FooData
import play.api.libs.json._
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

import scala.concurrent.Future

class FooController(cc: ControllerComponents) extends AbstractController(cc) {

  @Operation(
    summary = "Do foo thing",
  )
  def doThing(@RequestBody(description = "FOO THING", required = true) thing: String) = Action.async {
    Future.successful(Ok(Json.toJson(FooData(1, thing))))
  }
}
