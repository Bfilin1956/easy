package net.mcsgroup.launcher.core.a

import java.io.File

public object c {
   fun a(var1: java.lang.String) {
      val var3: File = FilesKt.resolve(FilesKt.resolve(File(System.getProperty("user.home")), var1), "logs")
      var3.mkdirs()
      System.setProperty("LAUNCHER_LOG_DIR", var3.getAbsolutePath())
   }
}
