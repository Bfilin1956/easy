package net.mcsgroup.launcher.core.auth

public data class n(uuid: String, username: String, skinUrl: String) {
   private java.lang.String a;
   private java.lang.String b;
   private java.lang.String c;

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

   fun c(): java.lang.String {
      this.c
   }

   public override fun toString(): String {
      return "Player(uuid=${this.a}, username=${this.b}, skinUrl=${this.c})"
   }

   public override fun hashCode(): Int {
      return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === var1) {
         return true
      } else {
         return var1 is n && this.a == (var1 as n).a && this.b == (var1 as n).b && this.c == (var1 as n).c
      }
   }
}
