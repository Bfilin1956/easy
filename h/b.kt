package net.mcsgroup.launcher.core.h

import io.grpc.Attributes
import io.grpc.EquivalentAddressGroup
import io.grpc.NameResolver
import io.grpc.StatusOr
import io.grpc.NameResolver.Listener2
import java.net.InetSocketAddress
import java.util.ArrayList
import net.mcsgroup.launcher.core.j.f
import net.mcsgroup.launcher.core.proxy.ServerAddress

internal class b(servers: List<ServerAddress>) : NameResolver {
   private java.util.List<f> a;

   init {
      this.a = var1
   }

   public override fun getServiceAuthority(): String {
      return CollectionsKt.first(this.a).a()
   }

   public override fun start(listener: Listener2) {
      val var5: java.lang.Iterable = this.a
      val var6: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(this.a, 10))

      for (var9 in var5) {
         val var12: java.lang.String = (var9 as f).b()
         var6.add(
            EquivalentAddressGroup(
               InetSocketAddress(var12, (var9 as f).c()), Attributes.newBuilder().set(EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE, var12).build()
            )
         )
      }

      var1.onResult(NameResolver.ResolutionResult.newBuilder().setAddressesOrError(StatusOr.fromValue(var6 as MutableList<EquivalentAddressGroup>)).build())
   }

   public override fun shutdown() {
   }
}
