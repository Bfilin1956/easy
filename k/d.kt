package net.mcsgroup.launcher.core.k

import java.io.Closeable
import java.nio.channels.FileChannel
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption

public class d(baseDir: Path) : Closeable {
   private Path a;
   private FileChannel b;
   private java.lang.String c;

   init {
      this.a = var1
   }

   fun a(var1: a) {
      if (!(var1.a() == this.c)) {
         if (this.b != null) {
            this.b.close()
         }

         val var2: Path = this.a.resolve(var1.a())
         val var10000: Path = var2.getParent()
         if (var10000 != null) {
            Files.createDirectories(var10000)
         }

         this.b = FileChannel.open(var2, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
         this.c = var1.a()
      }

      if (this.b == null) {
         throw IllegalArgumentException("Channel must be open when writing chunk".toString())
      } else {
         this.b.write(var1.b())
         if (var1.d()) {
            if (this.b != null) {
               this.b.close()
            }

            this.b = null
            this.c = null
         }
      }
   }

   public override fun close() {
      if (this.b != null) {
         this.b.close()
      }
   }
}
