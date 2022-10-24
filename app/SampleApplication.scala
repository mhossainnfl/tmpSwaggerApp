import controllers.{Assets, AssetsModule, FooController, routes}
import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext}
import play.api.ApplicationLoader.Context
import play.api.mvc.EssentialFilter
import play.api.routing.Router

// generated
import router.Routes
abstract class SampleApplication(context: Context) extends BuiltInComponentsFromContext(context) {
	override def httpFilters: Seq[EssentialFilter] = Nil

	lazy val fooController: FooController = new FooController(controllerComponents)

	override def router: Router = {
		new Routes(httpErrorHandler, fooController, "/")
	}
}

class SampleApplicationLoader extends ApplicationLoader {
	override def load(context: Context): Application = {
		(new SampleApplication(context) {}).application

	}
}