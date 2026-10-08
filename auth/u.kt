package net.mcsgroup.launcher.core.auth

public data class u(code: String = "", invalidCode: Boolean = false, submitting: Boolean = false) {
   private java.lang.String a;
   private boolean b;
   private boolean c;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
   }

   fun a(): java.lang.String {
      this.a
   }

   fun b(): Boolean {
      this.b
   }

   fun c(): Boolean {
      this.c
   }

   fun a(var1: java.lang.String, var2: Boolean, var3: Boolean): u {
      u(var1, var2, var3)
   }

   public override fun toString(): String {
      return "TotpState(code=${this.a}, invalidCode=${this.b}, submitting=${this.c})"
   }

   public override fun hashCode(): Int {
      return (this.a.hashCode() * 31 + java.lang.Boolean.hashCode(this.b)) * 31 + java.lang.Boolean.hashCode(this.c)
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === var1) {
         return true
      } else {
         return var1 is u && this.a == (var1 as u).a && this.b == (var1 as u).b && this.c == (var1 as u).c
      }
   }

   fun u() {
      this(null, false, false, 7, null)
   }
}
