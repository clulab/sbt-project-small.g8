package $package$.common.utils

object BuildUtils {

  def pkgToDir(pkg: String): String = pkg.replace('.', '/')
}
