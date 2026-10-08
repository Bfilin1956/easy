package net.mcsgroup.launcher.core.k

public data class e(path: String, size: Long, hash: String?, isDirectory: Boolean) {
   private java.lang.String a;
   private long b;
   private java.lang.String c;
   private boolean d;

   init {
      this.a = var1
      this.b = var2
      this.c = var4
      this.d = var5
   }

   fun a(): java.lang.String {
      this.a
   }

   fun b(): Long {
      this.b
   }

   fun c(): java.lang.String {
      this.c
   }

   fun d(): Boolean {
      this.d
   }

   public override fun toString(): String {
      return "FileNode(path=${this.a}, size=${this.b}, hash=${this.c}, isDirectory=${this.d})"
   }

   public override fun hashCode(): Int {
      return ((this.a.hashCode() * 31 + java.lang.Long.hashCode(this.b)) * 31 + (if (this.c == null) 0 else this.c.hashCode())) * 31
         + java.lang.Boolean.hashCode(this.d)
      }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === var1) {
         return true
      } else {
         return var1 is e && this.a == (var1 as e).a && this.b == (var1 as e).b && this.c == (var1 as e).c && this.d == (var1 as e).d
      }
   }
}
