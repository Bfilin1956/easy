package net.mcsgroup.launcher.core.e

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.concurrent.atomic.AtomicReference
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public object g {
   @JvmStatic
   private Logger b = LoggerFactory.getLogger("watchdog-child");

   fun a() {
      val var1: Long = ProcessHandle.current().pid()
      val var3: java.lang.String = System.getenv("LAUNCHER_PARENT_PID")
      val var4: java.lang.Long = if (var3 != null) StringsKt.toLongOrNull(var3) else null
      if (var4 == null) {
         b.error("EXIT_BAD_ENV pid={} LAUNCHER_PARENT_PID={}", var1, var3)
         System.exit(2)
         throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
      } else {
         val var5: ProcessHandle = ProcessHandle.current().parent().orElse(null)
         if (var5 == null) {
            b.error("EXIT_NO_PARENT pid={} expectedParent={}", var1, var4)
            System.exit(3)
            throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
         } else if (var5.pid() != var4) {
            b.error("EXIT_WRONG_PARENT pid={} actualParent={} expectedParent={}", var1, var5.pid(), var4)
            System.exit(4)
            throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
         } else {
            b.info("watchdog ready pid={} parentPid={}", var1, var4)
            val var6: AtomicReference = AtomicReference(null)
            var5.onExit().thenRun(var4.net/mcsgroup/launcher/core/e/g##Lambda_0_125(var4, var6))
            val var7: BufferedReader = BufferedReader(InputStreamReader(System.in))

            while (true) {
               val var8: java.lang.String = var7.readLine()
               if (var8 == null) {
                  b.warn("EXIT_EOF — parent closed stdin")
                  val var14: g = this

                  try {
                     var var15: g = var14
                     val var18: ProcessHandle = var6.get() as ProcessHandle
                     var15 = (g)Result.constructor_impl/* $VF was: constructor-impl */(if (var18 != null) var18.destroyForcibly() else null)
                  } catch (var12: java.lang.Throwable) {
                     val var10: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var12))
                  }

                  System.exit(5)
                  throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
               }

               if (StringsKt.startsWith$default(var8, "PID ", false, 2, null)) {
                  val var10000: java.lang.Long = StringsKt.toLongOrNull(StringsKt.trim(StringsKt.removePrefix(var8, "PID ")).toString())
                  if (var10000 != null) {
                     val var9: Long = var10000
                     val var11: ProcessHandle = ProcessHandle.of(var9).orElse(null)
                     if (var11 == null) {
                        b.error("EXIT_GAME_MISSING gamePid={}", var9)
                        System.exit(6)
                        throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
                     }

                     b.info("watching game pid={}", var9)
                     var6.set(var11)
                  }
               } else if (var8 == "BYE") {
                  b.info("EXIT_GRACEFUL — received BYE")
                  System.exit(0)
                  throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
               }
            }
         }
      }
   }

   @JvmStatic
   fun a(var0: java.lang.Long, var1: AtomicReference) {
      b.warn("EXIT_PARENT_DIED parentPid={}", var0)
      val var2: g = a

      try {
         val var10000: ProcessHandle = var1.get() as ProcessHandle
         val var6: Any = Result.constructor_impl/* $VF was: constructor-impl */(if (var10000 != null) var10000.destroyForcibly() else null)
      } catch (var5: java.lang.Throwable) {
         val var3: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var5))
      }

      System.exit(1)
      throw RuntimeException("System.exit returned normally, while it was supposed to halt JVM.")
   }
}
