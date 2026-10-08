package net.mcsgroup.launcher.core.auth

public data class SavedAccount(username: String, sessionId: String? = null, password: String? = null) {
   @JvmStatic
   public SavedAccount.a Companion = SavedAccount.a(null);
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

   fun a(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): SavedAccount {
      SavedAccount(var1, var2, var3)
   }

   public override fun toString(): String {
      return "SavedAccount(username=${this.a}, sessionId=${this.b}, password=${this.c})"
   }

   public override fun hashCode(): Int {
      return (this.a.hashCode() * 31 + (if (this.b == null) 0 else this.b.hashCode())) * 31 + (if (this.c == null) 0 else this.c.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === var1) {
         return true
      } else {
         return var1 is SavedAccount && this.a == (var1 as SavedAccount).a && this.b == (var1 as SavedAccount).b && this.c == (var1 as SavedAccount).c
      }
   }

   public companion object a
}
