package net.mcsgroup.launcher.core.k

public sealed interface c {
   public data class a(assetDirectory: String) : net.mcsgroup.launcher.core.k.c {
      private java.lang.String a;

      init {
         this.a = var1
      }

      fun a(): java.lang.String {
         this.a
      }

      public override fun toString(): String {
         return "Asset(assetDirectory=${this.a})"
      }

      public override fun hashCode(): Int {
         return this.a.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === var1) {
            return true
         } else {
            return var1 is net.mcsgroup.launcher.core.k.c.a && this.a == (var1 as net.mcsgroup.launcher.core.k.c.a).a
         }
      }
   }

   public data class b(clientId: Int) : net.mcsgroup.launcher.core.k.c {
      private int a;

      init {
         this.a = var1
      }

      fun a(): Int {
         this.a
      }

      public override fun toString(): String {
         return "Client(clientId=${this.a})"
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.a)
      }

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === var1) {
            return true
         } else {
            return var1 is net.mcsgroup.launcher.core.k.c.b && this.a == (var1 as net.mcsgroup.launcher.core.k.c.b).a
         }
      }
   }

   public data class c : net.mcsgroup.launcher.core.k.c {
      private java.lang.String a;
      private k b;

      fun c(var1: java.lang.String, var2: k) {
         this.a = var1
         this.b = var2
      }

      fun a(): java.lang.String {
         this.a
      }

      fun b(): k {
         this.b
      }

      public override fun toString(): String {
         return "Java(javaVersion=${this.a}, platform=${this.b})"
      }

      public override fun hashCode(): Int {
         return this.a.hashCode() * 31 + this.b.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label28@
         if (this === var1) {
            return true
         } else {
            return var1 is net.mcsgroup.launcher.core.k.c.c
               && this.a == (var1 as net.mcsgroup.launcher.core.k.c.c).a
               && this.b === (var1 as net.mcsgroup.launcher.core.k.c.c).b
            }
      }
   }
}
