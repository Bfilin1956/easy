package net.mcsgroup.launcher.core.a

import java.io.File
import java.net.URI
import java.nio.file.Path

public object b {
   @JvmStatic
   private Regex b = Regex("(?i)\\b(session(?:[-_ ]?id)?|access[-_ ]?token|token|password|pass)\\s*=\\s*(\"[^\"]*\"|'[^']*'|[^\\s,;]+)");
   @JvmStatic
   private Regex c = Regex("(?i)(--?(?:session(?:[-_ ]?id)?|access[-_ ]?token|token|password|pass))\\s+(\"[^\"]*\"|'[^']*'|[^\\s,;]+)");
   @JvmStatic
   private Regex d = Regex("(?i)([\"'](?:session(?:[-_ ]?id)?|access[-_ ]?token|token|password|pass)[\"']\\s*:\\s*)(\"[^\"]*\"|'[^']*'|[^,}\\s]+)");
   @JvmStatic
   private Regex e = Regex("(?i)\\b(authorization\\s*:\\s*)([^\\r\\n]+)");
   @JvmStatic
   private Regex f = Regex("(?i)\\b((?:session(?:[-_ ]?id)?|access[-_ ]?token|token|password|pass)\\s*:\\s*)([^\\r\\n]+)");
   @JvmStatic
   private Regex g = Regex("https?://[^\\s)]+");
   @JvmStatic
   private Regex h = Regex("(?i)\\b[0-9a-f]{16,}\\b");

   fun a(var1: Path): java.lang.String {
      this.a(var1.toString())
   }

   fun a(var1: java.lang.String): java.lang.String {
      var var10000: java.lang.String = System.getProperty("user.home")
      if (var10000 == null) {
         var10000 = ""
      }

      val var3: java.lang.String = StringsKt.replace$default(var1, File.separatorChar, '/', false, 4, null)
      val var4: java.lang.String = StringsKt.replace$default(var10000, File.separatorChar, '/', false, 4, null)
      this.g(if (!StringsKt.isBlank(var4) && StringsKt.startsWith$default(var3, var4, false, 2, null)) "~${StringsKt.removePrefix(var3, var4)}" else var3)
   }

   fun b(var1: java.lang.String): java.lang.String {
      if (var1 == null || StringsKt.isBlank(var1)) {
         "none"
      } else {
         if (var1.length() <= 8) var1 else "${StringsKt.take(var1, 8)}..."
      }
   }

   fun c(var1: java.lang.String): java.lang.String {
      if (var1 == null || StringsKt.isBlank(var1)) {
         "none"
      } else {
         val var3: b = this

         var var4: Any
         try {
            var4 = var3
            var4 = Result.constructor_impl/* $VF was: constructor-impl */(URI(var1).getHost())
         } catch (var7: java.lang.Throwable) {
            var4 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var7))
         }

         val var8: java.lang.String = (if (isFailure) null else var4) as java.lang.String
         if (var8 != null) {
            val var10: java.lang.String = if (!StringsKt.isBlank(var8)) var8 else null
            if (var10 != null) {
               var10
            }
         }

         StringsKt.substringBefore$default(
            StringsKt.substringBefore$default(StringsKt.substringAfter(var1, "://", var1), '/', null, 2, null), '?', null, 2, null
         )
      }
   }

   fun a(var1: java.lang.Throwable): java.lang.String {
      if (var1 == null) {
         "none"
      } else {
         var var10000: java.lang.String = (var1.getClass()::class).simpleName
         if (var10000 == null) {
            var10000 = var1.getClass().getSimpleName()
         }

         run label26@{
            var10000 = var1.getMessage()
            if (var10000 != null) {
               var10000 = this.d(var10000)
               if (var10000 != null) {
                  return@label26
               }
            }

            var10000 = "no message"
         }

         "$var10000: $var10000"
      }
   }

   fun a(var1: net.mcsgroup.launcher.core.j.d): java.lang.String {
      "${var1.a()}/${var1.b()}"
   }

   fun d(var1: java.lang.String): java.lang.String {
      var var10000: java.lang.String = System.getProperty("user.home")
      if (var10000 == null) {
         var10000 = ""
      }

      val var3: java.lang.String = StringsKt.replace$default(var10000, File.separatorChar, '/', false, 4, null)
      this.g(
         this.f(
            this.e(
               if (!StringsKt.isBlank(var3))
                  StringsKt.replace$default(StringsKt.replace$default(var1, var10000, "~", false, 4, null), var3, "~", false, 4, null)
                  else
                  var1
            )
         )
      )
   }

   fun e(var1: java.lang.String): java.lang.String {
      f.replace(
         e.replace(
            d.replace(
               c.replace(b.replace(var1, net/mcsgroup/launcher/core/a/b##Lambda_4_170()), net/mcsgroup/launcher/core/a/b##Lambda_5_170()),
               net/mcsgroup/launcher/core/a/b##Lambda_6_170()
            ),
            net/mcsgroup/launcher/core/a/b##Lambda_7_170()
         ),
         net/mcsgroup/launcher/core/a/b##Lambda_8_170()
      )
   }

   fun f(var1: java.lang.String): java.lang.String {
      g.replace(var1, net/mcsgroup/launcher/core/a/b##Lambda_9_170())
   }

   fun g(var1: java.lang.String): java.lang.String {
      h.replace(var1, net/mcsgroup/launcher/core/a/b##Lambda_10_170())
   }

   @JvmStatic
   fun a(var0: MatchResult): java.lang.CharSequence {
      ("${var0.groupValues.get(1)} <redacted>") as java.lang.CharSequence
   }

   @JvmStatic
   fun b(var0: MatchResult): java.lang.CharSequence {
      ("${var0.groupValues.get(1)}<redacted>") as java.lang.CharSequence
   }

   @JvmStatic
   fun c(var0: MatchResult): java.lang.CharSequence {
      ("${var0.groupValues.get(1)}<redacted>") as java.lang.CharSequence
   }

   @JvmStatic
   fun d(var0: MatchResult): java.lang.CharSequence {
      ("${var0.groupValues.get(1)}<redacted>") as java.lang.CharSequence
   }

   @JvmStatic
   fun e(var0: MatchResult): java.lang.CharSequence {
      ("${var0.groupValues.get(1)}=<redacted>") as java.lang.CharSequence
   }

   @JvmStatic
   fun f(var0: MatchResult): java.lang.CharSequence {
      val var1: java.lang.String = var0.value
      ("${StringsKt.substringBefore(var1, "://", "https")}://${a.c(var1)}/<redacted>") as java.lang.CharSequence
   }

   @JvmStatic
   fun g(var0: MatchResult): java.lang.CharSequence {
      a.b(var0.value) as java.lang.CharSequence
   }
}
