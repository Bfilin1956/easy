package net.mcsgroup.launcher.core.k

import kotlinx.coroutines.a.ai
import kotlinx.coroutines.a.ak
import kotlinx.coroutines.a.v

public class l {
   private v<java.lang.Double> a = ak.a(0.0);
   private v<java.lang.Double> b = ak.a(0.0);
   private long c;

   fun a(): ai<java.lang.Double> {
      this.a as ai
   }

   fun b(): ai<java.lang.Double> {
      this.b as ai
   }

   fun a(var1: Long, var3: Long) {
      if (this.c == 0L) {
         this.c = System.currentTimeMillis()
      }

      val var5: Double = (System.currentTimeMillis() - this.c) / 1000.0
      val var7: Double = if (var5 > 0.0) var1 / var5 else 0.0
      this.a.b(if (var5 > 0.0) (double)var1 / var5 else 0.0)
      this.b.b(if (var7 > 0.0) (double)(var3 - var1) / var7 else 0.0)
   }

   fun c() {
      this.c = 0L
      this.a.b(0.0)
      this.b.b(0.0)
   }
}
