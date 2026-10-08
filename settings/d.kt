package net.mcsgroup.launcher.core.settings

import java.io.File
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.coroutines.jvm.internal.ContinuationImpl
import kotlin.jvm.functions.Function1
import kotlinx.coroutines.a.e
import kotlinx.coroutines.a.g
import net.mcsgroup.launcher.core.clients.ClientOverride

public class d {
   private io.github.a.a.c<SettingsData> a;
   private e<SettingsData> b;

   fun d(var1: io.github.a.a.c<SettingsData>) {
      this.a = var1
      this.b = g.d(g.b(this.a.b()), {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as (SettingsData?, Continuation<in Unit>?) -> Any)
   }

   fun a(): e<SettingsData> {
      this.b
   }

   fun a(var1: SettingsData, var2: Continuation<in Unit>) {
      this.a(var1.b())
      val var10000: Any = this.a.a(var1, var2)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun a(var1: (SettingsData?) -> SettingsData, var2: Continuation<in Unit>) {
      val var10000: Any = this.a.a(var1.net/mcsgroup/launcher/core/settings/d##Lambda_0_118(var1, this), var2)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun a(var1: Int, var2: Continuation<in Unit>) {
      val var10000: Any = this.a(var1, net/mcsgroup/launcher/core/settings/d##Lambda_1_114(), var2)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun b(var1: Int, var2: Continuation<in Unit>) {
      val var10000: Any = this.a.a(var1.net/mcsgroup/launcher/core/settings/d##Lambda_2_115(var1), var2)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun a(var1: Int, var2: (ClientOverride?) -> ClientOverride, var3: Continuation<in Unit>) {
      val var10000: Any = this.a.a(var1.net/mcsgroup/launcher/core/settings/d##Lambda_3_116(var1, var2), var3)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun a(var1: java.lang.String) {
      val var2: File = File(var1)
      if (!var2.exists()) {
         var2.mkdirs()
      }
   }

   @JvmStatic
   fun a(var0: Function1, var1: d, var2: SettingsData): SettingsData {
      if (var2 != null) {
         val var10000: SettingsData = var0(var2) as SettingsData
         if (var10000 != null) {
            var1.a(var10000.b())
            var10000
         }
      }

      null
   }

   @JvmStatic
   fun a(var0: ClientOverride): ClientOverride {
      ClientOverride.a(var0, !var0.a(), null, 2, null)
   }

   @JvmStatic
   fun a(var0: Int, var1: SettingsData): SettingsData {
      if (var1 != null) SettingsData.a(var1, 0, null, false, false, false, var0, null, null, 223, null) else null
   }

   @JvmStatic
   fun a(var0: Int, var1: Function1, var2: SettingsData): SettingsData {
      if (var2 == null) {
         var2
      } else {
         var var10000: ClientOverride = var2.g().get(var0)
         if (var10000 == null) {
            var10000 = ClientOverride(false, null, 3, null)
         }

         SettingsData.a(var2, 0, null, false, false, false, null, MapsKt.plus(var2.g(), var0 to var1(var10000)), null, 191, null)
      }
   }
}
