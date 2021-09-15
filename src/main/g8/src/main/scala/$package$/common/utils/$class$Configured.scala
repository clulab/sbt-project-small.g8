package $package$.common.utils

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

trait $class$Configured extends Configured {
  // This line doesn't work if there is a leading / in the resource name.  I tried.
  lazy val config = ConfigFactory.parseResourcesAnySyntax("$class$")

  override def getConf: Config = config
}
