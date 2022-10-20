package models

import io.swagger.v3.oas.annotations.media.Schema
import play.api.libs.json._

case class FooData(id: Int, name: String)

@Schema(description = "foo doo")
object FooData {
  implicit val format: Format[FooData] = Json.format
}