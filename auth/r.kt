package net.mcsgroup.launcher.core.auth

import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.ContinuationImpl

public class r {
   private b a;
   private f b;
   private net.mcsgroup.launcher.core.h.a c;

   fun r(var1: b, var2: f, var3: net.mcsgroup.launcher.core.h.a) {
      this.a = var1
      this.b = var2
      this.c = var3
   }

   fun a(var1: SavedAccount, var2: Continuation<in q>) {
      label16@
      if (var1.c() != null) {
         this.a(var1.a(), var1.c(), var2)
      } else {
         val var10000: java.lang.String = var1.b()
         if (var10000 == null) q.b(var1.a()) else this.b(var1.a(), var10000, var2)
      }
   }

   @JvmStatic
   fun a(var0: SavedAccount): SavedAccount {
      SavedAccount.a(var0, null, null, null, 3, null)
   }

   @JvmStatic
   fun b(var0: SavedAccount): SavedAccount {
      SavedAccount.a(var0, null, null, null, 5, null)
   }
}
