package net.mcsgroup.launcher.core.settings

import java.util.LinkedHashMap
import kotlin.math.MathKt
import net.mcsgroup.launcher.core.clients.ClientOverride

fun a(var0: SettingsData): MutableSet<Int> {
   val var3: java.util.Map = var0.g()
   val var4: java.util.Map = LinkedHashMap()

   for (var7 in var3.entrySet()) {
      if ((var7.getValue() as ClientOverride).a()) {
         var4.put(var7.getKey(), var7.getValue())
      }
   }

   var4.keySet()
}

fun a(var0: Int): Int {
   MathKt.roundToInt((double)var0 * RangesKt.coerceIn(0.75 + (double)RangesKt.coerceAtLeast(var0 - 4, 0) / 28.0 * 0.15, 0.75, 0.9)) / 2 * 2
}

fun b(var0: Int): Int {
   a(var0) * 1024
}

fun c(var0: Int): Int {
   if (var0 == 0) 0 else (if (1 <= var0 && var0 < 129) var0 * 1024 else (if (var0 >= 1024) var0 else 0))
}

fun a(var0: java.lang.String, var1: Int): b {
   if (StringsKt.isBlank(var0)) {
      b(null, a.a)
   } else {
      val var10000: Int = StringsKt.toIntOrNull(var0)
      if (var10000 != null) {
         val var2: Int = var10000
         if (var2 < 1024) b(null, a.c) else (if (var2 > var1) b(null, a.d) else b(var2, null))
      } else {
         b(null, a.b)
      }
   }
}

fun a(var0: SettingsData, var1: Int, var2: Int, var3: Int, var4: Int): net.mcsgroup.launcher.core.e.d {
   var var17: Boolean
   var var10000: Int
   run label35@{
      val var5: ClientOverride = var0.g().get(var1)
      val var6: Int = b(var4)
      val var7: Int = RangesKt.coerceAtLeast(c(var2), 1024)
      val var8: Int = RangesKt.coerceAtLeast(c(var3), 1024)
      val var9: Int = c(var0.a())
      val var10: Int = Math.min(Math.max(var7, var8), var6)
      val var11: Int = var9
      val var12: Int = var11.intValue()
      var10000 = if ((if (var12 > 0) var11 else null) != null) if (var12 > 0) var11 else null else var10
      if (var5 != null) {
         val var10001: java.lang.Boolean = var5.b()
         if (var10001 != null) {
            var17 = var10001
            return@label35
         }
      }

      var17 = var0.c()
   }

   net.mcsgroup.launcher.core.e.d(var10000, var17, var0.b())
}
