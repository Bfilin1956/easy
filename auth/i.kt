package net.mcsgroup.launcher.core.auth

public sealed interface i {
   public data object a : i {
      public override fun toString(): String {
         return "MfaRequired"
      }

      public override fun hashCode(): Int {
         return -904584660
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is i.a
      }
   }

   public data class b : i {
      private s a;

      fun b(var1: s) {
         this.a = var1
      }

      fun a(): s {
         this.a
      }

      public override fun toString(): String {
         return "Success(session=${this.a})"
      }

      public override fun hashCode(): Int {
         return this.a.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === var1) {
            return true
         } else {
            return var1 is i.b && this.a == (var1 as i.b).a
         }
      }
   }

   public data object c : i {
      public override fun toString(): String {
         return "TotpRequired"
      }

      public override fun hashCode(): Int {
         return 893259537
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is i.c
      }
   }
}
