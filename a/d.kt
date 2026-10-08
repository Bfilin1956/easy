package net.mcsgroup.launcher.core.a

import java.util.ArrayList
import kotlin.jvm.internal.Intrinsics

fun a(var0: java.lang.String, var1: java.lang.String): Int {
   var var14: java.util.List = StringsKt.split$default(var0, arrayOf("."), false, 0, 6, null)
   val var6: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var14, 10))

   for (var9 in var14) {
      val var36: Int = StringsKt.toIntOrNull(var9 as java.lang.String)
      var6.add(var36 ?: 0)
   }

   val var2: java.util.List = var6 as java.util.List
   val var17: java.lang.Iterable = StringsKt.split$default(var1, arrayOf("."), false, 0, 6, null)
   val var25: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var17, 10))

   for (var32 in var17) {
      val var38: Int = StringsKt.toIntOrNull(var32 as java.lang.String)
      var25.add(var38 ?: 0)
   }

   var14 = var25 as java.util.List
   val var18: Int = Math.max(var2.size(), (var25 as java.util.List).size())

   repeat(var18) { var21 ->
      val var24: Int = ((if (0 <= var21 && var21 < var2.size()) var2.get(var21) else 0) as java.lang.Number).intValue()
      val var27: Int = ((if (0 <= var21 && var21 < var14.size()) var14.get(var21) else 0) as java.lang.Number).intValue()
      if (var24 != var27) {
         Intrinsics.compare(var24, var27)
      }
   }

   0
}
