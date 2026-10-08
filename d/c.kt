package net.mcsgroup.launcher.core.d

import androidx.c.aa
import androidx.c.ab
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.bx
import kotlinx.coroutines.i
import kotlinx.coroutines.a.ai
import kotlinx.coroutines.a.ak
import kotlinx.coroutines.a.v

public class c : aa {
   private a a;
   private bx b;
   private v<b> c;

   fun c(var1: a) {
      this.a = var1
      this.c = ak.a(null)
   }

   fun a(): ai<b> {
      this.c as ai
   }

   fun a(var1: final net.mcsgroup.launcher.core.clients.a) {
      this.d()
      this.b = i.a(ab.a(this), null, null, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, 3, null)
   }

   fun d() {
      if (this.b != null) {
         bx.a.a(this.b, null, 1, null)
      }

      this.b = null
      this.c.b(null)
   }
}
