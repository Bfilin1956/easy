package net.mcsgroup.launcher.core.auth

public data class s {
   private java.lang.String a;
   private n b;

   fun s(var1: java.lang.String, var2: n) {
      this.a = var1
      this.b = var2
   }

   fun a(): java.lang.String {
      this.a
   }

   fun b(): n {
      this.b
   }

   public override fun toString(): String {
      return "Session(sessionId=${this.a}, player=${this.b})"
   }

   public override fun hashCode(): Int {
      return this.a.hashCode() * 31 + this.b.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === var1) {
         return true
      } else {
         return var1 is s && this.a == (var1 as s).a && this.b == (var1 as s).b
      }
   }
}
