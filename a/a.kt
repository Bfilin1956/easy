package net.mcsgroup.launcher.core.a

import java.nio.file.Path
import kotlin.io.path.PathsKt

fun a(var0: Path, var1: Path): java.lang.String {
   StringsKt.replace$default(PathsKt.relativeTo(var0, var1).toString(), "\\", "/", false, 4, null)
}

fun a(var0: java.lang.String, var1: java.lang.String): Boolean {
   val var2: java.lang.String = StringsKt.trimEnd(var1, '/')
   var0 == var2 || StringsKt.startsWith$default(var0, "$var2/", false, 2, null)
}
