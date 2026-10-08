package net.mcsgroup.launcher.core.settings

public data class b {
   private Integer a;
   private a b;

   fun b(var1: Int, var2: a) {
      this.a = var1
      this.b = var2
   }

   fun a(): Int {
      this.a
   }

   fun b(): a {
      this.b
   }

   public override fun toString(): String {
      return "MemoryInputValidation(memory=${this.a}, error=${this.b})"
   }

   public override fun hashCode(): Int {
      return (if (this.a == null) 0 else this.a.hashCode()) * 31 + (if (this.b == null) 0 else this.b.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === var1) {
         return true
      } else {
         return var1 is b && this.a == (var1 as b).a && this.b === (var1 as b).b
      }
   }
}
