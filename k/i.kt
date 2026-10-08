package net.mcsgroup.launcher.core.k

import io.ktor.http.u
import java.io.Closeable
import java.io.InputStream
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.NoSuchFileException
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.jvm.functions.Function2
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class i {
   private io.ktor.a.a a;
   private Logger b;

   fun i(var1: io.ktor.a.a) {
      this.a = var1
      this.b = LoggerFactory.getLogger("cdn-client")
   }

   fun a(var1: Path, var2: Long): Long {
      var var4: Long
      try {
         var4 = Files.size(var1)
         val var10000: Long
         if (var4 > var2) {
            Files.delete(var1)
            var10000 = 0L
         } else {
            var10000 = var4
         }

         var4 = var10000
      } catch (var7: NoSuchFileException) {
         var4 = 0L
      }

      var4
   }

   fun a(
      var1: final java.lang.String,
      var2: final Path,
      var3: final Long,
      var5: final net.mcsgroup.launcher.core.i.a,
      var6: final (java.lang.Long?, Continuation<in Unit>?) -> Any,
      var7: Continuation<in Unit>
   ) {
      val var13: io.ktor.a.a = this.a
      val var14: io.ktor.a.f.d = io.ktor.a.f.d()
      io.ktor.a.f.f.a(var14, var1)
      if (var3 > 0L) {
         io.ktor.a.f.l.a(var14, io.ktor.http.p.a.n(), "bytes=$var3-")
      }

      io.ktor.a.f.l.a(var14, io.ktor.http.p.a.c(), "identity")
      var14.a(u.a.a())
      val var10000: Any = io.ktor.a.g.g(var14, var13).a({
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, var7)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun a(var1: Path, var2: net.mcsgroup.launcher.core.i.a, var3: Long) {
      val var5: ByteArray = ByteArray(262144)
      var var12: Long = 0L
      var12 = var3
      val var6: Closeable = Files.newInputStream(var1)
      var var7: java.lang.Throwable = null

      try {
         val var8: InputStream = var6 as InputStream

         while (var12 > 0L) {
            val var11: Int = var8.read(var5, 0, (int)Math.min((long)var5.length, var12))
            if (var11 == -1) {
               return@run
            }

            var2.a(var5, 0, var11)
            var12 -= var11
         }
      } catch (var16: java.lang.Throwable) {
         var7 = var16
         throw var16
      } finally {
         CloseableKt.closeFinally(var6, var7)
      }
   }

   fun a(var1: Path, var2: Path, var3: java.lang.String, var4: java.lang.String) {
      if (!(var4 == var3)) {
         Files.delete(var1)
         throw h(var3, var4, var2)
      } else {
         try {
            Files.move(var1, var2, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE)
         } catch (var8: AtomicMoveNotSupportedException) {
            Files.move(var1, var2, StandardCopyOption.REPLACE_EXISTING)
         }
      }
   }
}
