package net.mcsgroup.launcher.core.clients

import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class e {
   private net.mcsgroup.launcher.core.h.a a;
   private net.mcsgroup.launcher.core.i.d b;
   private Logger c;

   fun e(var1: net.mcsgroup.launcher.core.h.a, var2: net.mcsgroup.launcher.core.i.d) {
      this.a = var1
      this.b = var2
      this.c = LoggerFactory.getLogger("client")
   }

   fun a(var1: Continuation<? super java.util.List<a>>) {
      this.a.a({
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function1, var1)
   }

   fun a(var1: final Int, var2: Continuation<in d>) {
      this.a.a({
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function1, var2)
   }
}
