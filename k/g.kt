package net.mcsgroup.launcher.core.k

import net.mcsgroup.launcher.core.sync.FileNode

public data class g(files: List<FileNode>, nodeId: String?, baseUrl: String?) {
   private java.util.List<e> a;
   private java.lang.String b;
   private java.lang.String c;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
   }

   fun a(): MutableList<e> {
      this.a
   }

   fun b(): java.lang.String {
      this.b
   }

   fun c(): java.lang.String {
      this.c
   }

   public override fun toString(): String {
      return "FileTree(files=${this.a}, nodeId=${this.b}, baseUrl=${this.c})"
   }

   public override fun hashCode(): Int {
      return (this.a.hashCode() * 31 + (if (this.b == null) 0 else this.b.hashCode())) * 31 + (if (this.c == null) 0 else this.c.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === var1) {
         return true
      } else {
         return var1 is g && this.a == (var1 as g).a && this.b == (var1 as g).b && this.c == (var1 as g).c
      }
   }
}
