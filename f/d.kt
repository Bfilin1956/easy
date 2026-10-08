package net.mcsgroup.launcher.core.f

public data class d {
   private long a;
   private java.lang.String b;
   private e c;
   private java.lang.String d;
   private java.lang.String e;
   private java.lang.String f;
   private java.lang.String g;

   fun d(var1: Long, var3: java.lang.String, var4: e, var5: java.lang.String, var6: java.lang.String, var7: java.lang.String, var8: java.lang.String) {
      this.a = var1
      this.b = var3
      this.c = var4
      this.d = var5
      this.e = var6
      this.f = var7
      this.g = var8
   }

   fun a(): Long {
      this.a
   }

   fun b(): java.lang.String {
      this.b
   }

   fun c(): e {
      this.c
   }

   fun d(): java.lang.String {
      this.d
   }

   fun e(): java.lang.String {
      this.e
   }

   fun f(): java.lang.String {
      this.f
   }

   fun g(): java.lang.String {
      this.g
   }

   public override fun toString(): String {
      return "LogEntry(id=${this.a}, time=${this.b}, level=${this.c}, source=${this.d}, message=${this.e}, stackTrace=${this.f}, raw=${this.g})"
   }

   public override fun hashCode(): Int {
      return (
               ((((java.lang.Long.hashCode(this.a) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31
                  + (if (this.f == null) 0 else this.f.hashCode())
            )
            * 31
         + this.g.hashCode()
      }

   public override operator fun equals(other: Any?): Boolean {
      label58@
      if (this === var1) {
         return true
      } else {
         return var1 is d
            && this.a == (var1 as d).a
            && this.b == (var1 as d).b
            && this.c === (var1 as d).c
            && this.d == (var1 as d).d
            && this.e == (var1 as d).e
            && this.f == (var1 as d).f
            && this.g == (var1 as d).g
         }
   }
}
