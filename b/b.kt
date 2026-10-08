package net.mcsgroup.launcher.core.b

import net.mcsgroup.launcher.core.j.d
import net.mcsgroup.launcher.core.proxy.ProxyRoute

public data class b(routes: List<ProxyRoute>,
   configDirName: String,
   defaultDownloadDir: String,
   registrationUrl: String = ...,
   forgotPasswordUrl: String = ...,
   supportUrl: String = ...
) {
   private java.util.List<d> a;
   private java.lang.String b;
   private java.lang.String c;
   private java.lang.String d;
   private java.lang.String e;
   private java.lang.String f;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
      this.d = var4
      this.e = var5
      this.f = var6
   }

   fun a(): MutableList<d> {
      this.a
   }

   fun b(): java.lang.String {
      this.b
   }

   fun c(): java.lang.String {
      this.c
   }

   fun d(): java.lang.String {
      this.d
   }

   fun e(): java.lang.String {
      this.e
   }

   fun f(): java.lang.String {
      this.f
   }

   public override fun toString(): String {
      return "LauncherConfig(routes=${this.a}, configDirName=${this.b}, defaultDownloadDir=${this.c}, registrationUrl=${this.d}, forgotPasswordUrl=${this.e}, supportUrl=${this.f})"
   }

   public override fun hashCode(): Int {
      return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31
         + this.f.hashCode()
      }

   public override operator fun equals(other: Any?): Boolean {
      label52@
      if (this === var1) {
         return true
      } else {
         return var1 is b
            && this.a == (var1 as b).a
            && this.b == (var1 as b).b
            && this.c == (var1 as b).c
            && this.d == (var1 as b).d
            && this.e == (var1 as b).e
            && this.f == (var1 as b).f
         }
   }
}
