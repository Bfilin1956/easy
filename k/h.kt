package net.mcsgroup.launcher.core.k

import java.nio.file.Path

internal class h(expected: String, computed: String, path: Path) : Exception(
      "Hash mismatch for ${net.mcsgroup.launcher.core.a.b.a.a(var3)}: expected ${net.mcsgroup.launcher.core.a.b.a.b(var1)}, got ${net.mcsgroup.launcher.core.a.b.a
         .b(var2)}"
   ) {
   private Path a;

   init {
      this.a = var3
   }
}
