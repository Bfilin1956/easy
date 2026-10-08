package net.mcsgroup.launcher.core.auth

public sealed interface p {
   public data object a : p {
      public override fun toString(): String {
         return "ActiveRemoved"
      }

      public override fun hashCode(): Int {
         return -1306649129
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is p.a
      }
   }

   public data object b : p {
      public override fun toString(): String {
         return "InactiveRemoved"
      }

      public override fun hashCode(): Int {
         return 532083090
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is p.b
      }
   }

   public data object c : p {
      public override fun toString(): String {
         return "ListEmpty"
      }

      public override fun hashCode(): Int {
         return 1799851308
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is p.c
      }
   }
}
