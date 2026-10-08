package net.mcsgroup.launcher.core.auth

public sealed interface q {
   public data class a(username: String, password: String) : q {
      private java.lang.String a;
      private java.lang.String b;

      init {
         this.a = var1
         this.b = var2
      }

      fun a(): java.lang.String {
         this.a
      }

      fun b(): java.lang.String {
         this.b
      }

      public override fun toString(): String {
         return "RequiresMfa(username=${this.a}, password=${this.b})"
      }

      public override fun hashCode(): Int {
         return this.a.hashCode() * 31 + this.b.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label28@
         if (this === var1) {
            return true
         } else {
            return var1 is q.a && this.a == (var1 as q.a).a && this.b == (var1 as q.a).b
         }
      }
   }

   public data class b(username: String) : q {
      private java.lang.String a;

      init {
         this.a = var1
      }

      fun a(): java.lang.String {
         this.a
      }

      public override fun toString(): String {
         return "RequiresPassword(username=${this.a})"
      }

      public override fun hashCode(): Int {
         return this.a.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === var1) {
            return true
         } else {
            return var1 is q.b && this.a == (var1 as q.b).a
         }
      }
   }

   public data class c(username: String, password: String) : q {
      private java.lang.String a;
      private java.lang.String b;

      init {
         this.a = var1
         this.b = var2
      }

      fun a(): java.lang.String {
         this.a
      }

      fun b(): java.lang.String {
         this.b
      }

      public override fun toString(): String {
         return "RequiresTotp(username=${this.a}, password=${this.b})"
      }

      public override fun hashCode(): Int {
         return this.a.hashCode() * 31 + this.b.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label28@
         if (this === var1) {
            return true
         } else {
            return var1 is q.c && this.a == (var1 as q.c).a && this.b == (var1 as q.c).b
         }
      }
   }

   public data class d : q {
      private n a;

      fun d(var1: n) {
         this.a = var1
      }

      public override fun toString(): String {
         return "Success(player=${this.a})"
      }

      public override fun hashCode(): Int {
         return this.a.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === var1) {
            return true
         } else {
            return var1 is q.d && this.a == (var1 as q.d).a
         }
      }
   }
}
