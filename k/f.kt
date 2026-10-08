package net.mcsgroup.launcher.core.k

import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.Path
import java.util.ArrayList
import java.util.Arrays
import java.util.LinkedHashMap
import java.util.stream.Stream
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.jdk7.AutoCloseableKt
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.az
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class f {
   private Logger a = LoggerFactory.getLogger("sync");
   private CoroutineDispatcher b = CoroutineDispatcher.limitedParallelism$default(az.d(), Runtime.getRuntime().availableProcessors(), null, 2, null);

   fun a(
      var1: final Path,
      var2: final MutableList<java.lang.String>,
      var3: final MutableList<java.lang.String>,
      var4: final (Int?, Continuation<in Unit>?) -> Any,
      var5: final (Continuation<in Unit>?) -> Any,
      var6: Continuation<? super java.util.Map<java.lang.String, java.lang.String>>
   ) {
      kotlinx.coroutines.i.a(az.d(), {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, var6)
   }

   fun a(var1: final Path, var2: Continuation<? super java.util.Set<java.lang.String>>) {
      kotlinx.coroutines.i.a(az.d(), {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, var2)
   }

   fun a(var1: final Path, var2: final MutableList<java.lang.String>, var3: final MutableList<java.lang.String>, var4: Continuation<? super java.lang.Boolean>) {
      kotlinx.coroutines.i.a(az.d(), {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, var4)
   }

   fun a(var1: MutableList<e>, var2: MutableMap<java.lang.String, java.lang.String>, var3: net.mcsgroup.launcher.core.clients.j): n {
      var var7: java.lang.Iterable = var1
      val var8: java.util.Collection = ArrayList()

      for (var11 in var7) {
         if (!(var11 as e).d()) {
            var8.add(var11)
         }
      }

      var var27: java.lang.Iterable = var8 as java.util.List
      val var40: java.util.Map = LinkedHashMap(
         RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(var8 as java.util.List, 10)), 16)
      )

      for (var51 in var27) {
         var40.put((var51 as e).a(), var51)
      }

      val var4: java.util.Map = var40
      val var37: java.lang.Iterable = var40.values()
      val var41: java.util.Collection = ArrayList()

      for (var52 in var37) {
         if (!(var2.get((var52 as e).a()) == (var52 as e).c())) {
            var41.add(var52)
         }
      }

      var27 = var41 as java.util.List
      val var10000: java.util.List
      if (var3 === net.mcsgroup.launcher.core.clients.j.a) {
         val var42: java.lang.Iterable = var2.keySet()
         val var45: java.util.Collection = ArrayList()

         for (var57 in var42) {
            if (!var4.containsKey(var57 as java.lang.String)) {
               var45.add(var57)
            }
         }

         var10000 = var45 as java.util.List
      } else {
         var10000 = CollectionsKt.emptyList()
      }

      var7 = var27
      var var39: Long = 0L

      for (var50 in var7) {
         var39 += (var50 as e).b()
      }

      n(var27, var10000, var39)
   }

   fun a(
      var1: MutableList<e>,
      var2: MutableSet<java.lang.String>,
      var3: MutableList<java.lang.String>,
      var4: MutableList<java.lang.String>,
      var5: MutableMap<java.lang.String, java.lang.String>,
      var6: net.mcsgroup.launcher.core.clients.j
   ): n {
      val var10: java.lang.Iterable = var1
      val var11: java.util.Collection = ArrayList()

      for (var14 in var10) {
         if (!(var14 as e).d()) {
            var11.add(var14)
         }
      }

      var var31: java.lang.Iterable = var11 as java.util.List
      val var43: java.util.Map = LinkedHashMap(
         RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(var11 as java.util.List, 10)), 16)
      )

      for (var54 in var31) {
         var43.put((var54 as e).a(), var54)
      }

      var var40: java.lang.Iterable = var43.values()
      val var44: java.util.Collection = ArrayList()

      for (var55 in var40) {
         val var59: e = var55 as e
         val var10000: Boolean
         if (!var2.contains((var55 as e).a())) {
            var10000 = true
         } else if (var6 === net.mcsgroup.launcher.core.clients.j.b) {
            var10000 = false
         } else {
            val var68: java.lang.String = var5.get(var59.a()) as java.lang.String
            var10000 = var68 != null && !(var68 == var59.c())
         }

         if (var10000) {
            var44.add(var55)
         }
      }

      var31 = var44 as java.util.List
      val var35: java.util.Set = var43.keySet()
      val var69: java.util.List
      if (var6 === net.mcsgroup.launcher.core.clients.j.a) {
         val var49: java.lang.Iterable = var2
         val var52: java.util.Collection = ArrayList()

         for (var63 in var49) {
            if (!var35.contains(var63 as java.lang.String) && this.a(var63 as java.lang.String, var3, var4)) {
               var52.add(var63)
            }
         }

         var69 = var52 as java.util.List
      } else {
         var69 = CollectionsKt.emptyList()
      }

      var40 = var31
      var var46: Long = 0L

      for (var57 in var40) {
         var46 += (var57 as e).b()
      }

      n(var31, var69, var46)
   }

   fun a(var1: final Path, var2: final MutableList<java.lang.String>, var3: Continuation<in Unit>) {
      val var10000: Any = kotlinx.coroutines.i.a(az.d(), {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, var3)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun a(var1: Path): d {
      d(var1)
   }

   fun a(var1: Path, var2: MutableList<java.lang.String>, var3: MutableList<java.lang.String>): MutableList<Path> {
      val var10000: java.util.List
      if (var2.isEmpty()) {
         var10000 = CollectionsKt.listOf(var1)
      } else {
         var var7: java.lang.Iterable = var2
         var var8: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10))

         for (var11 in var7) {
            var8.add(var1.resolve(var11 as java.lang.String))
         }

         var7 = var8 as java.util.List
         var8 = ArrayList()

         for (var35 in var7) {
            val var37: Path = var35 as Path
            val var10001: Array<LinkOption> = arrayOfNulls(0)
            if (Files.exists(var37, Arrays.copyOf(var10001, var10001.length))) {
               var8.add(var35)
            }
         }

         var10000 = var8 as java.util.List
      }

      val var28: java.lang.Iterable = var10000
      val var30: java.util.Collection = ArrayList()

      for (var36 in var28) {
         val var14: AutoCloseable = Files.walk(var36 as Path)
         var var15: java.lang.Throwable = null

         var var42: java.util.List
         try {
            var42 = (var14 as Stream)
               .filter(
                  net/mcsgroup/launcher/core/k/f##Lambda_0_187().net/mcsgroup/launcher/core/k/f##Lambda_1_201(net/mcsgroup/launcher/core/k/f##Lambda_0_187())
               )
               .filter(
                  var1.net/mcsgroup/launcher/core/k/f##Lambda_2_189(var1, var3).net/mcsgroup/launcher/core/k/f##Lambda_3_201(
                     var1.net/mcsgroup/launcher/core/k/f##Lambda_2_189(var1, var3)
                  )
               )
               .toList()
            } catch (var21: java.lang.Throwable) {
            var15 = var21
            throw var21
         } finally {
            AutoCloseableKt.closeFinally(var14, var15)
         }

         CollectionsKt.addAll(var30, var42)
      }

      var30 as java.util.List
   }

   fun a(var1: java.lang.String, var2: MutableList<java.lang.String>, var3: MutableList<java.lang.String>): Boolean {
      val var5: java.lang.Iterable = var2
      var var10000: Boolean
      if (var2 is java.util.Collection && (var2 as java.util.Collection).isEmpty()) {
         var10000 = false
      } else {
         val var7: java.util.Iterator = var5.iterator()

         while (true) {
            if (!var7.hasNext()) {
               var10000 = false
               break
            }

            if (net.mcsgroup.launcher.core.a.a.a(var1, var7.next() as java.lang.String)) {
               var10000 = true
               break
            }
         }
      }

      val var13: java.lang.Iterable = var3
      if (var3 is java.util.Collection && (var3 as java.util.Collection).isEmpty()) {
         var10000 = false
      } else {
         val var15: java.util.Iterator = var13.iterator()

         while (true) {
            if (!var15.hasNext()) {
               var10000 = false
               break
            }

            if (net.mcsgroup.launcher.core.a.a.a(var1, var15.next() as java.lang.String)) {
               var10000 = true
               break
            }
         }
      }

      var10000 && !var10000
   }

   @JvmStatic
   fun b(var0: Path): Boolean {
      Files.isRegularFile(var0, LinkOption.NOFOLLOW_LINKS)
   }

   @JvmStatic
   fun a(var0: Function1, var1: Any): Boolean {
      var0(var1)
   }

   @JvmStatic
   fun a(var0: Path, var1: java.util.List, var2: Path): Boolean {
      val var3: java.lang.String = net.mcsgroup.launcher.core.a.a.a(var2, var0)
      val var4: java.lang.Iterable = var1
      var var10000: Boolean
      if (var1 is java.util.Collection && (var1 as java.util.Collection).isEmpty()) {
         var10000 = true
      } else {
         val var6: java.util.Iterator = var4.iterator()

         while (true) {
            if (!var6.hasNext()) {
               var10000 = true
               break
            }

            if (net.mcsgroup.launcher.core.a.a.a(var3, var6.next() as java.lang.String)) {
               var10000 = false
               break
            }
         }
      }

      var10000
   }

   @JvmStatic
   fun b(var0: Function1, var1: Any): Boolean {
      var0(var1)
   }
}
