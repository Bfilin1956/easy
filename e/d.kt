package net.mcsgroup.launcher.core.e

public data class d(memory: Int, debugMode: Boolean, downloadDir: String) {
   private int a;
   private boolean b;
   private java.lang.String c;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
   }

   fun a(): Int {
      this.a
   }

   fun b(): Boolean {
      this.b
   }

   fun c(): java.lang.String {
      this.c
   }

   public override fun toString(): String {
      return "LaunchSettings(memory=${this.a}, debugMode=${this.b}, downloadDir=${this.c})"
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.a) * 31 + java.lang.Boolean.hashCode(this.b)) * 31 + this.c.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === var1) {
         return true
      } else {
         return var1 is d && this.a == (var1 as d).a && this.b == (var1 as d).b && this.c == (var1 as d).c
      }
   }
}
