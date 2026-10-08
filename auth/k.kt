package net.mcsgroup.launcher.core.auth

public data class k(continueEnabled: Boolean, cooldownSeconds: Int, notConfirmed: Boolean = false) {
   private boolean a;
   private int b;
   private boolean c;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
   }

   fun a(): Boolean {
      this.a
   }

   fun b(): Int {
      this.b
   }

   fun c(): Boolean {
      this.c
   }

   fun a(var1: Boolean, var2: Int, var3: Boolean): k {
      k(var1, var2, var3)
   }

   public override fun toString(): String {
      return "MfaState(continueEnabled=${this.a}, cooldownSeconds=${this.b}, notConfirmed=${this.c})"
   }

   public override fun hashCode(): Int {
      return (java.lang.Boolean.hashCode(this.a) * 31 + Integer.hashCode(this.b)) * 31 + java.lang.Boolean.hashCode(this.c)
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === var1) {
         return true
      } else {
         return var1 is k && this.a == (var1 as k).a && this.b == (var1 as k).b && this.c == (var1 as k).c
      }
   }
}
