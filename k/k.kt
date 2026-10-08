package net.mcsgroup.launcher.core.k

public enum class k {
   a,
   b,
   c,
   d,
   e,
   f;

   fun a(): Boolean {
      this === a || this === b
   }

   fun b(): Boolean {
      this === e || this === f
   }

   fun c(): java.lang.String {
      if (this.a()) "Windows" else (if (this.b()) "Mac OS X" else "Linux")
   }

   fun d(): java.lang.String {
      if (this.a()) "java.exe" else "java"
   }
}
