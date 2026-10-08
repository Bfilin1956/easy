package net.mcsgroup.launcher.core.clients

public data class ClientOverride(isFavourite: Boolean = false, debugOverride: Boolean? = null) {
   @JvmStatic
   public ClientOverride.a Companion = ClientOverride.a(null);
   private boolean a;
   private java.lang.Boolean b;

   init {
      this.a = var1
      this.b = var2
   }

   fun a(): Boolean {
      this.a
   }

   fun b(): java.lang.Boolean {
      this.b
   }

   fun a(var1: Boolean, var2: java.lang.Boolean): ClientOverride {
      ClientOverride(var1, var2)
   }

   public override fun toString(): String {
      return "ClientOverride(isFavourite=${this.a}, debugOverride=${this.b})"
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.a) * 31 + (if (this.b == null) 0 else this.b.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === var1) {
         return true
      } else {
         return var1 is ClientOverride && this.a == (var1 as ClientOverride).a && this.b == (var1 as ClientOverride).b
      }
   }

   fun ClientOverride() {
      this(false, null, 3, null)
   }

   public companion object a
}
