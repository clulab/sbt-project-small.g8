package $package$.apps

import $package$.$class$
import $package$.common.utils.$class$App

object HelloWorldApp extends $class$App {
  val appMessage = args.lift(0).getOrElse(getArgString("apps.HelloWorldApp.message", Some("App message not found!")))
  logger.info(appMessage)

  val $class;format="decap"$ = $class$()
  val classMessage = $class;format="decap"$.getArgString("$class$.message", Some("Class message not found!"))
  logger.info(classMessage)
}
