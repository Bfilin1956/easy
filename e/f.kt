package net.mcsgroup.launcher.core.e

import java.io.BufferedWriter
import java.io.OutputStream
import java.io.OutputStreamWriter
import java.io.Writer
import java.lang.ProcessBuilder.Redirect
import java.lang.ProcessHandle.Info
import java.util.concurrent.TimeUnit
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class f {
   @JvmStatic
   public f.a a = f.a(null);
   private Logger b = LoggerFactory.getLogger("watchdog");
   @Volatile
   private Function0<Unit> c;
   private Process d;
   private BufferedWriter e;
   @Volatile
   private boolean f;

   fun a(var1: () -> Unit) {
      this.c = var1
   }

   fun a(): Boolean {
      this.d != null && this.d.isAlive()
   }

   fun b() {
      val var1: Info = ProcessHandle.current().info()
      val var2: java.lang.String = var1.command().orElseThrow(net/mcsgroup/launcher/core/e/f##Lambda_0_212())
      val var3: java.util.List = var1.arguments()
         .map(net/mcsgroup/launcher/core/e/f##Lambda_1_223().net/mcsgroup/launcher/core/e/f##Lambda_2_190(net/mcsgroup/launcher/core/e/f##Lambda_1_223()))
         .orElse(null)
         var var10000: java.util.List = var3
      if (var3 == null) {
         var10000 = this.d()
      }

      val var5: Long = ProcessHandle.current().pid()
      val var24: Logger = this.b
      val var7: Array<Any> = arrayOfNulls(4)
      var7[0] = var5
      val var10004: net.mcsgroup.launcher.core.a.b = net.mcsgroup.launcher.core.a.b.a
      var7[1] = var10004.a(var2)
      var7[2] = if (var3 != null) "ProcessHandle.info" else "reconstructed"
      var7[3] = var10000.size()
      var24.info("start parentPid={} javaPath={} argsSource={} argsCount={}", var7)
      val var14: ProcessBuilder = ProcessBuilder(CollectionsKt.plus(CollectionsKt.listOf(var2), var10000))
         .redirectInput(Redirect.PIPE)
         .redirectOutput(Redirect.DISCARD)
         .redirectError(Redirect.DISCARD)
         val var25: java.util.Map = var14.environment()
      net.mcsgroup.launcher.core.i.c.a(var25, net.mcsgroup.launcher.core.i.c.a())
      val var26: java.util.Map = var14.environment()
      var26.put("LAUNCHER_MODE", "watchdog")
      val var27: java.util.Map = var14.environment()
      var27.put("LAUNCHER_PARENT_PID", java.lang.String.valueOf(var5))
      val var28: java.lang.String = System.getProperty("LAUNCHER_LOG_DIR")
      if (var28 != null) {
         val var29: java.util.Map = var14.environment()
         var29.put("LAUNCHER_LOG_DIR", var28)
      }

      val var16: Process = var14.start()

      try {
         val var10001: OutputStream = var16.getOutputStream()
         val var22: Writer = OutputStreamWriter(var10001, Charsets.UTF_8)
         this.e = if (var22 is BufferedWriter) var22 as BufferedWriter else BufferedWriter(var22, 8192)
      } catch (var13: java.lang.Throwable) {
         this.b.warn("failed to obtain stdin writer for watchdog, destroying cause={}", net.mcsgroup.launcher.core.a.b.a.a(var13))
         var16.destroyForcibly()
         throw var13
      }

      this.d = var16
      this.b.info("started watchdog pid={}", var16.pid())
      var16.onExit().thenRun(net/mcsgroup/launcher/core/e/f##Lambda_3_241(this, var16))
   }

   fun a(var1: Long) {
      if (this.e == null) {
         throw IllegalStateException("watchdog not started")
      } else {
         val var3: BufferedWriter = this.e
         this.e.write("PID $var1\n")
         var3.flush()
      }
   }

   fun d(): MutableList<java.lang.String> {
      val var10000: java.lang.String = System.getProperty("java.class.path")
      val var5: java.lang.String = System.getProperty("sun.java.command")
      val var2: java.lang.String = StringsKt.substringBefore$default(var5, " ", null, 2, null)
      if (StringsKt.endsWith$default(var2, ".jar", false, 2, null)) CollectionsKt.listOf("-jar", var2) else CollectionsKt.listOf("-cp", var10000, var2)
   }

   fun c() {
      this.f = true
      this.b.info("stop requested")
      val var1: f = this

      try {
         var var16: f = var1
         if (var1.e != null) {
            var16.e.write("BYE\n")
         }

         if (var16.e != null) {
            var16.e.flush()
         }

         val var10000: Unit
         if (var16.e != null) {
            var16.e.close()
            var10000 = Unit.INSTANCE
         } else {
            var10000 = null
         }

         var16 = (f)Result.constructor_impl/* $VF was: constructor-impl */(var10000)
      } catch (var14: java.lang.Throwable) {
         val var2: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var14))
      }

      this.e = null
      val var15: Process = this.d
      if (this.d != null) {
         val var18: Boolean = this.d.waitFor(2L, TimeUnit.SECONDS)
         if (var15.isAlive()) {
            this.b.warn("watchdog did not exit in {}s, destroying", 2L)
            var15.destroyForcibly()
         } else {
            var var24: Logger = this.b
            var var10002: java.lang.Boolean = var18
            val var19: f = this

            var var4: Any
            try {
               var4 = var19
               var4 = Result.constructor_impl/* $VF was: constructor-impl */(var15.exitValue())
            } catch (var13: java.lang.Throwable) {
               var4 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var13))
            }

            var24 = var24
            var var10001: java.lang.String = "watchdog exited gracefully={} exit={}"
            var10002 = var10002
            val var10003: Any
            if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var4) == null) {
               var10003 = var4
            } else {
               val var12: Int = -1
               var24 = var24
               var10001 = "watchdog exited gracefully={} exit={}"
               var10002 = var10002
               var10003 = var12
            }

            var24.info(var10001, var10002, var10003)
         }
      }

      this.d = null
   }

   @JvmStatic
   fun e(): IllegalStateException {
      IllegalStateException("cannot resolve current java executable")
   }

   @JvmStatic
   fun a(var0: Array<java.lang.String>): java.util.List {
      ArraysKt.toList(var0)
   }

   @JvmStatic
   fun a(var0: Function1, var1: Any): java.util.List {
      var0(var1) as java.util.List
   }

   @JvmStatic
   fun a(var0: f, var1: Process) {
      var var4: Any
      try {
         var4 = Result.constructor_impl/* $VF was: constructor-impl */(var1.exitValue())
      } catch (var6: java.lang.Throwable) {
         var4 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var6))
      }

      val var2: Int = ((if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var4) == null) var4 else -1) as java.lang.Number).intValue()
      if (var0.f) {
         var0.b.info("watchdog exited normally (stopping=true) pid={} exit={}", var1.pid(), var2)
      } else {
         var0.b.warn("watchdog exited UNEXPECTEDLY pid={} exit={}", var1.pid(), var2)
         if (var0.c != null) {
            var0.c()
         }
      }
   }

   public companion object a
}
