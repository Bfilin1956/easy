package net.mcsgroup.launcher.core.d

import java.nio.file.Path

public sealed interface b {
   public object a : net.mcsgroup.launcher.core.d.b

   public object b : net.mcsgroup.launcher.core.d.b

   public object c : net.mcsgroup.launcher.core.d.b

   public class d(diagnosticsDir: Path) : net.mcsgroup.launcher.core.d.b {
      private Path a;

      init {
         this.a = var1
      }

      fun a(): Path {
         this.a
      }
   }

   public object e : net.mcsgroup.launcher.core.d.b

   public object f : net.mcsgroup.launcher.core.d.b

   public object g : net.mcsgroup.launcher.core.d.b
}
