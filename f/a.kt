package net.mcsgroup.launcher.core.f

import androidx.c.aa
import androidx.c.ab
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.Transferable
import java.awt.datatransfer.UnsupportedFlavorException
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import java.util.ArrayList
import java.util.LinkedHashSet
import kotlin.coroutines.Continuation
import kotlin.coroutines.intrinsics.IntrinsicsKt
import kotlin.coroutines.jvm.internal.ContinuationImpl
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.i
import kotlinx.coroutines.a.ae
import kotlinx.coroutines.a.ai
import kotlinx.coroutines.a.ak
import kotlinx.coroutines.a.g
import kotlinx.coroutines.a.v

public class a : aa {
   private b a;
   private net.mcsgroup.launcher.core.settings.d b;
   private v<java.util.Set<e>> c;
   private v<java.util.Set<java.lang.Long>> d;
   private v<java.lang.Boolean> e;
   private Integer f;
   private ai<java.util.List<d>> g;
   private ai<c> h;

   fun a(var1: b, var2: net.mcsgroup.launcher.core.settings.d) {
      this.a = var1
      this.b = var2
      this.c = ak.a(CollectionsKt.toSet(net.mcsgroup.launcher.core.f.e.a()))
      this.d = ak.a(SetsKt.emptySet())
      this.e = ak.a(false)
      this.g = kotlinx.coroutines.a.g.a(kotlinx.coroutines.a.g.b(this.a.a(), this.c, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as (Int?, MutableSet<e>?, Continuation<? super java.util.List<d>>?) -> Any), ab.a(this), ae.a.a(ae.a, 5000L, 0L, 2, null), CollectionsKt.emptyList())
      this.h = kotlinx.coroutines.a.g.a(kotlinx.coroutines.a.g.a(this.a.a(), this.c, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as (Int?, MutableSet<e>?, Continuation<in c>?) -> Any), ab.a(this), ae.a.a(ae.a, 5000L, 0L, 2, null), c(0, 0, 0, 0, 15, null))
      i.a(ab.a(this), null, null, {
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function2, 3, null)
   }

   fun a(): ai<java.util.Set<e>> {
      this.c as ai
   }

   fun d(): ai<java.util.Set<java.lang.Long>> {
      this.d as ai
   }

   fun e(): ai<java.lang.Boolean> {
      this.e as ai
   }

   fun f(): ai<java.util.List<d>> {
      this.g
   }

   fun g(): ai<c> {
      this.h
   }

   fun a(var1: e) {
      this.c.b(if (this.c.c() as java.util.Set == SetsKt.setOf(var1)) CollectionsKt.toSet(net.mcsgroup.launcher.core.f.e.a()) else SetsKt.setOf(var1))
   }

   fun h() {
      this.c.b(CollectionsKt.toSet(net.mcsgroup.launcher.core.f.e.a()))
   }

   fun a(var1: Int) {
      val var10000: d = CollectionsKt.getOrNull(this.g.c(), var1)
      if (var10000 != null) {
         this.f = var1
         this.d.b(SetsKt.setOf(var10000.a()))
         this.e.b(false)
      }
   }

   fun b(var1: Int) {
      val var2: java.util.List = this.g.c()
      if (!var2.isEmpty()) {
         val var3: Int = if (this.f != null) this.f else var1
         val var4: Int = RangesKt.coerceIn(Math.min(var3, var1), CollectionsKt.getIndices(var2))
         val var5: Int = RangesKt.coerceIn(Math.max(var3, var1), CollectionsKt.getIndices(var2))
         val var10000: v = this.d
         val var6: java.lang.Iterable = var2.subList(var4, var5 + 1)
         val var7: java.util.Collection = LinkedHashSet()

         for (var10 in var6) {
            var7.add((var10 as d).a())
         }

         var10000.b(var7)
         this.e.b(false)
      }
   }

   fun i() {
      val var1: java.util.List = this.g.c()
      val var3: java.lang.Iterable = var1
      val var4: java.util.Collection = LinkedHashSet()

      for (var7 in var3) {
         var4.add((var7 as d).a())
      }

      val var2: java.util.Set = var4 as java.util.Set
      this.d.b(var4 as MutableSet<java.lang.Long>)
      val var12: Int = 0
      val var13: Int = var12.intValue()
      this.f = if (!var1.isEmpty()) var12 else null
      this.e.b(this.a(var2))
   }

   fun j(): java.lang.String {
      val var3: java.lang.Iterable = this.g.c()
      val var4: java.util.Collection = ArrayList()

      for (var7 in var3) {
         if (this.d.c().contains((var7 as d).a())) {
            var4.add(var7)
         }
      }

      CollectionsKt.joinToString$default(var4 as java.util.List, "\n", null, null, 0, null, net/mcsgroup/launcher/core/f/a##Lambda_0_243(), 30, null)
   }

   fun a(var1: net.mcsgroup.launcher.core.clients.d, var2: Continuation<in Unit>) {
      val var10002: Path = Paths.get("crash-reports")
      val var10000: Any = this.a(var1, var10002, var2)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun b(var1: net.mcsgroup.launcher.core.clients.d, var2: Continuation<in Unit>) {
      val var10002: Path = Paths.get("logs")
      val var10000: Any = this.a(var1, var10002, var2)
      if (var10000 === IntrinsicsKt.getCOROUTINE_SUSPENDED()) var10000 else Unit.INSTANCE
   }

   fun a(var1: MutableList<d>) {
      var var3: java.util.Set = var1
      val var4: java.util.Collection = LinkedHashSet()

      for (var7 in var3) {
         var4.add((var7 as d).a())
      }

      var3 = if (this.e.c()) var4 as java.util.Set else CollectionsKt.intersect(this.d.c(), var4)
      this.d.b(var3)
      this.e.b(this.a(var3))
      if (var3.isEmpty()) {
         this.f = null
      }
   }

   fun a(var1: MutableSet<java.lang.Long>): Boolean {
      val var3: java.lang.Iterable = this.a.c()
      val var4: java.util.Collection = LinkedHashSet()

      for (var7 in var3) {
         var4.add((var7 as d).a())
      }

      !var1.isEmpty() && var1 == var4 as java.util.Set
   }

   @JvmStatic
   fun a(var0: d): java.lang.CharSequence {
      var0.g() as java.lang.CharSequence
   }

   private class a(files: List<File>) : Transferable {
      private java.util.List<File> a;

      init {
         this.a = var1
      }

      public override fun getTransferDataFlavors(): Array<DataFlavor> {
         val var1: Array<DataFlavor> = arrayOfNulls(1)
         val var10002: DataFlavor = DataFlavor.javaFileListFlavor
         var1[0] = var10002
         return var1
      }

      public override fun isDataFlavorSupported(flavor: DataFlavor): Boolean {
         return var1 == DataFlavor.javaFileListFlavor
      }

      public override fun getTransferData(flavor: DataFlavor): Any {
         if (!this.isDataFlavorSupported(var1)) {
            throw UnsupportedFlavorException(var1)
         } else {
            return this.a
         }
      }
   }
}
