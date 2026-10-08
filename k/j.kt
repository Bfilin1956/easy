package net.mcsgroup.launcher.core.k

import io.ktor.http.w

internal class j : Exception {
   private w a;

   fun j(var1: w, var2: java.lang.String) {
      super("HTTP $var1 from host=${net.mcsgroup.launcher.core.a.b.a.c(var2)}")
      this.a = var1
   }

   fun a(): w {
      this.a
   }
}
