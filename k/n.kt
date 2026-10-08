package net.mcsgroup.launcher.core.k

import net.mcsgroup.launcher.core.sync.FileNode

public data class n(toDownload: List<FileNode>, toDelete: List<String>, totalDownloadBytes: Long) {
   private java.util.List<e> a;
   private java.util.List<java.lang.String> b;
   private long c;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
   }

   fun a(): MutableList<e> {
      this.a
   }

   fun b(): MutableList<java.lang.String> {
      this.b
   }

   fun c(): Long {
      this.c
   }

   public override fun toString(): String {
      return "SyncDiff(toDownload=${this.a}, toDelete=${this.b}, totalDownloadBytes=${this.c})"
   }

   public override fun hashCode(): Int {
      return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + java.lang.Long.hashCode(this.c)
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
