package net.mcsgroup.launcher.core.auth

import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.coroutines.jvm.internal.SpillingKt

// $VF: Class flags could not be determined
internal class `b$d$1`<T> : kotlinx.coroutines.a.f {
   fun `b$d$1`(var1: kotlinx.coroutines.a.f) {
      this.a = var1
   }

   override final fun emit(var1: Any, var2: Continuation) {
      var var3: b$d$1$1
      run label25@{
         if (var2 is b$d$1$1) {
            var3 = var2 as b$d$1$1
            if (((var2 as b$d$1$1).b and Integer.MIN_VALUE) != 0) {
               var3.b -= Integer.MIN_VALUE
               return@label25
            }
         }

         var3 = b$d$1$1(this, var2)
      }

      val var4: Any = var3.a
val var5: Any = IntrinsicsKt.getCOROUTINE_SUSPENDED()
      when (var3.b) {
         0 -> {
            ResultKt.throwOnFailure(var4)
            val var17: kotlinx.coroutines.a.f = this.a
            val var10: kotlinx.coroutines.a.f = this.a
            val var11: Continuation = var3
            val var10001: java.lang.String = (var1 as AccountData).b()
            var3.c = SpillingKt.nullOutSpilledVariable(var1)
            var3.e = SpillingKt.nullOutSpilledVariable(var3)
            var3.f = SpillingKt.nullOutSpilledVariable(var1)
            var3.g = SpillingKt.nullOutSpilledVariable(var17)
            var3.h = 0
            var3.b = 1
            if (var10.emit(var10001, var3) === var5) {
               var5
            }
         }
         1 -> {
            val var9: Int = var3.h
            val var8: kotlinx.coroutines.a.f = var3.g as kotlinx.coroutines.a.f
            val var7: Any = var3.f
            val var6: b$d$1$1 = var3.e as b$d$1$1
            var1 = var3.c
            ResultKt.throwOnFailure(var4)
         }
         else -> throw IllegalStateException("call to 'resume' before 'invoke' with coroutine")
      }

      Unit.INSTANCE
   }
}
