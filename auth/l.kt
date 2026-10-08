package net.mcsgroup.launcher.core.auth

private data class l(username: String, password: String, isAddFlow: Boolean) {
   private java.lang.String a;
   private java.lang.String b;
   private boolean c;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
   }

   fun a(): java.lang.String {
      this.a
   }

   fun b(): java.lang.String {
      this.b
   }

   fun c(): Boolean {
      this.c
   }

   public override fun toString(): String {
      return "PendingMfa(username=${this.a}, password=${this.b}, isAddFlow=${this.c})"
   }

   public override fun hashCode(): Int {
      return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + java.lang.Boolean.hashCode(this.c)
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === var1) {
         return true
      } else {
         return var1 is l && this.a == (var1 as l).a && this.b == (var1 as l).b && this.c == (var1 as l).c
      }
   }
}
