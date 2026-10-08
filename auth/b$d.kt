package net.mcsgroup.launcher.core.auth

import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt

// $VF: local visibility outside of methodSupplier
internal class `b$d` : kotlinx.coroutines.a.e<java.lang.String> {
   fun `b$d`(var1: kotlinx.coroutines.a.e) {
      this.a = var1
   }

   override fun collect(var1: kotlinx.coroutines.a.f, var2: Continuation) {
      val var10000: Any = this.a.collect(b$d$1(var1), var2)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }
}
