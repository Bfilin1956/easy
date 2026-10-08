package net.mcsgroup.launcher.core.clients

import androidx.c.aa
import androidx.c.ab
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.a.ae
import kotlinx.coroutines.a.ai
import kotlinx.coroutines.a.ak
import kotlinx.coroutines.a.v
import net.mcsgroup.launcher.core.settings.SettingsData
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class c : aa {
   private i a;
   private net.mcsgroup.launcher.core.settings.d b;
   private net.mcsgroup.launcher.core.h.a c;
   private net.mcsgroup.launcher.core.j.a d;
   private net.mcsgroup.launcher.core.g.a e;
   private Logger f;
   private v<java.util.List<a>> g;
   private v<java.lang.Boolean> h;
   private ai<b> i;

   fun c(
      var1: i,
      var2: net.mcsgroup.launcher.core.settings.d,
      var3: net.mcsgroup.launcher.core.h.a,
      var4: net.mcsgroup.launcher.core.j.a,
      var5: net.mcsgroup.launcher.core.g.a
   ) {
      this.a = var1
      this.b = var2
      this.c = var3
      this.d = var4
      this.e = var5
      this.f = LoggerFactory.getLogger("client-list")
      this.g = ak.a(CollectionsKt.emptyList())
      this.h = ak.a(true)
      kotlinx.coroutines.i.a(ab.a(this), null, null, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, 3, null)
      this.i = kotlinx.coroutines.a.g.a(kotlinx.coroutines.a.g.a(this.g, this.b.a(), this.h, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as (MutableList<a>?, SettingsData?, java.lang.Boolean?, Continuation<in b>?) -> Any), ab.a(this), ae.a.a(), b(null, null, false, null, 15, null))
   }

   fun a(): ai<b> {
      this.i
   }

   fun d() {
      kotlinx.coroutines.i.a(ab.a(this), null, null, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, 3, null)
   }

   fun a(var1: final Int) {
      kotlinx.coroutines.i.a(ab.a(this), null, null, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, 3, null)
   }
}
