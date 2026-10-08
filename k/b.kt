package net.mcsgroup.launcher.core.k

public data class b(baseUrl: String, nodeId: String) {
   private java.lang.String a;
   private java.lang.String b;

   init {
      this.a = var1
      this.b = var2
   }

   fun a(): java.lang.String {
      this.a
   }

   fun b(): java.lang.String {
      this.b
   }

   public override fun toString(): String {
      return "FallbackNode(baseUrl=${this.a}, nodeId=${this.b})"
   }

   public override fun hashCode(): Int {
      return this.a.hashCode() * 31 + this.b.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === var1) {
         return true
      } else {
         return var1 is b && this.a == (var1 as b).a && this.b == (var1 as b).b
      }
   }
}
