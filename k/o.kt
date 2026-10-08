package net.mcsgroup.launcher.core.k

public sealed class o protected constructor() {
   public data object a : o() {
      public override fun toString(): String {
         return "Checking"
      }

      public override fun hashCode(): Int {
         return 364037321
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is o.a
      }
   }

   public data class b(checked: Int, total: Int) : o() {
      private int a;
      private int b;

      init {
         this.a = var1
         this.b = var2
      }

      fun a(): Int {
         this.a
      }

      fun b(): Int {
         this.b
      }

      public override fun toString(): String {
         return "Comparing(checked=${this.a}, total=${this.b})"
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.a) * 31 + Integer.hashCode(this.b)
      }

      public override operator fun equals(other: Any?): Boolean {
         label28@
         if (this === var1) {
            return true
         } else {
            return var1 is o.b && this.a == (var1 as o.b).a && this.b == (var1 as o.b).b
         }
      }
   }

   public data class c(totalFiles: Int, updatedFiles: Int, verifyHashes: Map<String, String>) : o() {
      private int a;
      private int b;
      private java.util.Map<java.lang.String, java.lang.String> c;

      init {
         this.a = var1
         this.b = var2
         this.c = var3
      }

      fun a(): Int {
         this.a
      }

      fun b(): Int {
         this.b
      }

      fun c(): MutableMap<java.lang.String, java.lang.String> {
         this.c
      }

      public override fun toString(): String {
         return "Done(totalFiles=${this.a}, updatedFiles=${this.b}, verifyHashes=${this.c})"
      }

      public override fun hashCode(): Int {
         return (Integer.hashCode(this.a) * 31 + Integer.hashCode(this.b)) * 31 + this.c.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label34@
         if (this === var1) {
            return true
         } else {
            return var1 is o.c && this.a == (var1 as o.c).a && this.b == (var1 as o.c).b && this.c == (var1 as o.c).c
         }
      }
   }

   public data class d(downloadedBytes: Long, totalBytes: Long, currentFile: String) : o() {
      private long a;
      private long b;
      private java.lang.String c;

      init {
         this.a = var1
         this.b = var3
         this.c = var5
      }

      fun a(): Long {
         this.a
      }

      fun b(): Long {
         this.b
      }

      public override fun toString(): String {
         return "Downloading(downloadedBytes=${this.a}, totalBytes=${this.b}, currentFile=${this.c})"
      }

      public override fun hashCode(): Int {
         return (java.lang.Long.hashCode(this.a) * 31 + java.lang.Long.hashCode(this.b)) * 31 + this.c.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label34@
         if (this === var1) {
            return true
         } else {
            return var1 is o.d && this.a == (var1 as o.d).a && this.b == (var1 as o.d).b && this.c == (var1 as o.d).c
         }
      }
   }

   public data object e : o() {
      public override fun toString(): String {
         return "Error"
      }

      public override fun hashCode(): Int {
         return 1287012729
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is o.e
      }
   }

   public data class f(downloadBytes: Long, requiredBytes: Long, systemReserveBytes: Long, usableBytes: Long) : o() {
      private long a;
      private long b;
      private long c;
      private long d;
      private long e;

      init {
         this.a = var1
         this.b = var3
         this.c = var5
         this.d = var7
         this.e = RangesKt.coerceAtLeast(this.b - this.d, 0L)
      }

      fun a(): Long {
         this.a
      }

      fun b(): Long {
         this.b
      }

      fun c(): Long {
         this.c
      }

      fun d(): Long {
         this.d
      }

      fun e(): Long {
         this.e
      }

      public override fun toString(): String {
         return "InsufficientDiskSpace(downloadBytes=${this.a}, requiredBytes=${this.b}, systemReserveBytes=${this.c}, usableBytes=${this.d})"
      }

      public override fun hashCode(): Int {
         return ((java.lang.Long.hashCode(this.a) * 31 + java.lang.Long.hashCode(this.b)) * 31 + java.lang.Long.hashCode(this.c)) * 31
            + java.lang.Long.hashCode(this.d)
         }

      public override operator fun equals(other: Any?): Boolean {
         label40@
         if (this === var1) {
            return true
         } else {
            return var1 is o.f && this.a == (var1 as o.f).a && this.b == (var1 as o.f).b && this.c == (var1 as o.f).c && this.d == (var1 as o.f).d
         }
      }
   }
}
