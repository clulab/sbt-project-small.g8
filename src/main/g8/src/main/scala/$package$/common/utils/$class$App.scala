package $package$.common.utils

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory

trait $class$ConfiguredApp extends Configured {
  // This is used instead of load so that no default references or default overrides are involved.
  // In other words, the values you are looking for had better be in this file (resource).
  // This line doesn't work if there is a leading / in the resource name.  I tried.
  lazy val config = ConfigFactory.parseResourcesAnySyntax(BuildUtils.pkgToDir("$package$") + "/apps")

  def getConf: Config = config
}

trait $class$App extends App with Logging with $class$ConfiguredApp
