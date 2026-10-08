package net.mcsgroup.launcher.core.k

import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function1
import net.mcsgroup.launcher.proto.AssetDownloadRequest
import net.mcsgroup.launcher.proto.AssetDownloadRequestKt
import net.mcsgroup.launcher.proto.DownloadRequest
import net.mcsgroup.launcher.proto.DownloadRequestKt
import net.mcsgroup.launcher.proto.JavaDownloadRequest
import net.mcsgroup.launcher.proto.JavaDownloadRequestKt
import net.mcsgroup.launcher.proto.UpdateServiceGrpcKt

public class p {
   private net.mcsgroup.launcher.core.h.a a;

   fun p(var1: net.mcsgroup.launcher.core.h.a) {
      this.a = var1
   }

   fun a(var1: final Int, var2: Continuation<in g>) {
      this.a.a({
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function1, var2)
   }

   fun a(var1: Int, var2: MutableList<java.lang.String>): kotlinx.coroutines.a.e<a> {
      val var10000: UpdateServiceGrpcKt.UpdateServiceCoroutineStub = this.a.g()
      val var10001: DownloadRequestKt.Dsl.Companion = DownloadRequestKt.Dsl.Companion
      val var10002: DownloadRequest.Builder = DownloadRequest.newBuilder()
      val var4: DownloadRequestKt.Dsl = var10001._create(var10002)
      var4.clientId = var1
      var4.addAllPaths(var4.paths, var2)
      p$b(UpdateServiceGrpcKt.UpdateServiceCoroutineStub.downloadFiles$default(var10000, var4._build(), null, 2, null)) as kotlinx.coroutines.a.e
   }

   fun a(var1: final java.lang.String, var2: Continuation<in g>) {
      this.a.a({
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function1, var2)
   }

   fun a(var1: java.lang.String, var2: MutableList<java.lang.String>): kotlinx.coroutines.a.e<a> {
      val var10000: UpdateServiceGrpcKt.UpdateServiceCoroutineStub = this.a.g()
      val var10001: AssetDownloadRequestKt.Dsl.Companion = AssetDownloadRequestKt.Dsl.Companion
      val var10002: AssetDownloadRequest.Builder = AssetDownloadRequest.newBuilder()
      val var4: AssetDownloadRequestKt.Dsl = var10001._create(var10002)
      var4.assetDir = var1
      var4.addAllPaths(var4.paths, var2)
      p$a(UpdateServiceGrpcKt.UpdateServiceCoroutineStub.downloadAssetFiles$default(var10000, var4._build(), null, 2, null)) as kotlinx.coroutines.a.e
   }

   fun a(var1: final java.lang.String, var2: final k, var3: Continuation<in g>) {
      this.a.a({
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function1, var3)
   }

   fun a(var1: java.lang.String, var2: k, var3: MutableList<java.lang.String>): kotlinx.coroutines.a.e<a> {
      val var10000: UpdateServiceGrpcKt.UpdateServiceCoroutineStub = this.a.g()
      val var10001: JavaDownloadRequestKt.Dsl.Companion = JavaDownloadRequestKt.Dsl.Companion
      val var10002: JavaDownloadRequest.Builder = JavaDownloadRequest.newBuilder()
      val var5: JavaDownloadRequestKt.Dsl = var10001._create(var10002)
      var5.javaVersion = var1
      var5.platform = net.mcsgroup.launcher.core.h.d.a(var2)
      var5.addAllPaths(var5.paths, var3)
      p$c(UpdateServiceGrpcKt.UpdateServiceCoroutineStub.downloadJavaFiles$default(var10000, var5._build(), null, 2, null)) as kotlinx.coroutines.a.e
   }

   fun a(var1: final MutableSet<java.lang.String>, var2: final c, var3: Continuation<in b>) {
      this.a.a({
         // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
      } as Function1, var3)
   }
}
