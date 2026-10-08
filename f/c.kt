package net.mcsgroup.launcher.core.f

public data class c(total: Int = 0, info: Int = 0, warn: Int = 0, error: Int = 0) {
   private int a;
   private int b;
   private int c;
   private int d;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
      this.d = var4
   }

   fun a(): Int {
      this.a
   }

   fun b(): Int {
      this.b
   }

   fun c(): Int {
      this.c
   }

   fun d(): Int {
      this.d
   }

   public override fun toString(): String {
      return "LogCounts(total=${this.a}, info=${this.b}, warn=${this.c}, error=${this.d})"
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.a) * 31 + Integer.hashCode(this.b)) * 31 + Integer.hashCode(this.c)) * 31 + Integer.hashCode(this.d)
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === var1) {
         return true
      } else {
         return var1 is c && this.a == (var1 as c).a && this.b == (var1 as c).b && this.c == (var1 as c).c && this.d == (var1 as c).d
      }
   }

   fun c() {
      this(0, 0, 0, 0, 15, null)
   }
}
