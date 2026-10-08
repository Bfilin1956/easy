package net.mcsgroup.launcher.core.h

import io.grpc.NameResolver
import io.grpc.NameResolverProvider
import io.grpc.NameResolver.Args
import java.net.URI
import net.mcsgroup.launcher.core.j.f
import net.mcsgroup.launcher.core.proxy.ServerAddress

public class c(servers: List<ServerAddress>) : NameResolverProvider {
   @JvmStatic
   public c.a a = c.a(null);
   private java.util.List<f> b;

   init {
      this.b = var1
      if (this.b.isEmpty()) {
         throw IllegalArgumentException("At least one server must be configured".toString())
      }
   }

   protected override fun isAvailable(): Boolean {
      return true
   }

   protected override fun priority(): Int {
      return 5
   }

   public override fun getDefaultScheme(): String {
      return "launcher"
   }

   public override fun newNameResolver(targetUri: URI, args: Args): NameResolver? {
      return if (!(var1.getScheme() == "launcher")) null else b(this.b)
   }

   public companion object a
}
