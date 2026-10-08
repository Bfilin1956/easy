package net.mcsgroup.launcher.core.e

import java.io.Closeable
import java.io.File
import java.lang.ProcessBuilder.Redirect
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.NoSuchFileException
import java.nio.file.Path
import java.nio.file.attribute.PosixFilePermission
import java.util.ArrayList
import java.util.Arrays
import java.util.jar.Attributes
import java.util.jar.JarOutputStream
import java.util.jar.Manifest
import java.util.jar.Attributes.Name
import kotlinx.c.e.i
import kotlinx.c.e.t
import net.mcsgroup.launcher.core.auth.s
import net.mcsgroup.launcher.core.k.k
import org.slf4j.Logger
import org.slf4j.LoggerFactory

public class c {
   private Logger a = LoggerFactory.getLogger("launch");

   fun a(var1: net.mcsgroup.launcher.core.clients.d, var2: s, var3: d, var4: k, var5: net.mcsgroup.launcher.core.j.d, var6: Boolean): a {
      val var7: java.lang.String = File.pathSeparator
      val var8: java.lang.String = var1.b()
      val var9: Path = Path.of(var3.c())
      val var10: Path = var9.resolve("clients").resolve(var1.g())
      val var11: Path = var9.resolve("assets").resolve(var1.h())
      val var12: Path = var9.resolve("java").resolve(var1.c()).resolve("bin").resolve(var4.d())
      this.a(var12)
      this.a.info("java executable prepared path={} exists={}", net.mcsgroup.launcher.core.a.b.a.a(var12), Files.exists(var12))
      val var13: Path = var9.resolve("java").resolve(var1.c()).resolve("lib").resolve("jspawnhelper")
      val var10001: Array<LinkOption> = arrayOfNulls(0)
      if (Files.exists(var13, Arrays.copyOf(var10001, var10001.length))) {
         this.a(var13)
      }

      val var14: java.util.List = this.a(var10, var1.j())
      val var16: java.util.List = CollectionsKt.createListBuilder()
      var var17: java.util.List = var16
      var16.add(var12.toString())
      var16.add("-XX:HeapDumpPath=ThisTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump")
      if (var3.a() > 0) {
         var16.add("-Xms${var3.a()}m")
         var16.add("-Xmx${var3.a()}m")
      }

      var16.add("-Djava.library.path=${var10.resolve("natives")}")
      if (var4.b() && this.a(var8, var14)) {
         var16.add("-XstartOnFirstThread")
      }

      if (net.mcsgroup.launcher.core.a.d.a(var8, "1.6") < 0) {
         var16.add("-Dminecraft.applet.TargetDirectory=$var10")
      }

      val var20: java.lang.String = "${if (var5.e()) "http" else "https"}://${var5.d()}"
      val var22: java.util.Map = MapsKt.mapOf(
         "minecraft.api.env" to "CUSTOM",
         "minecraft.api.auth" to var20,
         "minecraft.api.auth.host" to "$var20/sessionserver",
         "minecraft.api.account.host" to "$var20/sessionserver",
         "minecraft.api.session.host" to "$var20/sessionserver",
         "minecraft.api.services.host" to "$var20/sessionserver"
      )
      val var23: java.lang.Iterable = var22.keySet()
      val var26: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var23, 10))

      for (var29 in var23) {
         var26.add("-D${var29 as java.lang.String}=")
      }

      val var44: java.util.List = var26 as java.util.List

      for (var49 in var1.k()) {
         val var51: java.lang.String = StringsKt.replace$default(var49, "${cp_separator}", var7, false, 4, null)
         val var53: java.lang.Iterable = var44
         var var10000: Boolean
         if (var44 is java.util.Collection && (var44 as java.util.Collection).isEmpty()) {
            var10000 = true
         } else {
            val var57: java.util.Iterator = var53.iterator()

            while (true) {
               if (!var57.hasNext()) {
                  var10000 = true
                  break
               }

               if (StringsKt.startsWith$default(var51, var57.next() as java.lang.String, false, 2, null)) {
                  var10000 = false
                  break
               }
            }
         }

         if (var10000 && !this.b(var51)) {
            var17.add(var51)
         }
      }

      if (!var6) {
         var17.add("-XX:+DisableAttachMechanism")
      }

      for (var54 in var22.entrySet()) {
         var17.add("-D${var54.getKey() as java.lang.String}=${var54.getValue() as java.lang.String}")
      }

      val var48: java.lang.String = this.a(var14, var7)
      if (var48.length() > 0) {
         var17.add("-cp")
         var17.add(var48)
      }

      var17.add(var1.i())
      var17.addAll(this.a(var8, var2))
      var17.addAll(this.a(var8, var10, var11, var1.f()))
      var17.addAll(var1.l())
      val var15: java.util.List = CollectionsKt.build(var16)
      var var34: java.lang.String = "direct"
      val var64: java.util.List
      if (var4.a()) {
         if (this.c(var1.c())) {
            val var36: Path = this.a(CollectionsKt.drop(var15, 1))
            var34 = "arg-file"
            var64 = CollectionsKt.listOf(CollectionsKt.first(var15), "@$var36")
         } else {
            val var37: java.util.List = this.b(var15)
            if (this.c(var37) <= 32000) {
               var34 = "windows-direct"
               var64 = var37
            } else {
               var34 = "pathing-jar"
               var64 = this.b(this.d(var15))
            }
         }
      } else {
         var64 = var15
      }

      var17 = var64
      this.a
         .info(
            "game process start prepared profile={} version={} javaVersion={} memory={} debugMode={} strategy={} argsCount={} classPathEntries={}",
            var1.a(),
            var8,
            var1.c(),
            var3.a(),
            var3.b(),
            var34,
            var15.size(),
            var1.j().size()
         )

      var var42: Process
      try {
         val var41: ProcessBuilder = ProcessBuilder(var17)
            .directory(var10.toFile())
            .redirectErrorStream(true)
            .redirectOutput(if (var3.b()) Redirect.PIPE else Redirect.DISCARD)
            val var66: java.util.Map = var41.environment()
         net.mcsgroup.launcher.core.i.c.a(var66, var4)
         var42 = var41.start()
      } catch (var33: java.lang.Throwable) {
         this.a.warn("game process start failed strategy={} cause={}", var34, net.mcsgroup.launcher.core.a.b.a.a(var33))
         throw var33
      }

      this.a.info("game process start succeeded strategy={}", var34)
      a(var42)
   }

   fun a(var1: java.lang.String, var2: s): MutableList<java.lang.String> {
      val var3: java.util.List = CollectionsKt.createListBuilder()
      if (net.mcsgroup.launcher.core.a.d.a(var1, "1.7.2") >= 0) {
         var3.addAll(CollectionsKt.listOf("--username", var2.b().b()))
         var3.addAll(CollectionsKt.listOf("--uuid", StringsKt.replace$default(var2.b().a(), "-", "", false, 4, null)))
         var3.addAll(CollectionsKt.listOf("--accessToken", var2.a()))
         if (net.mcsgroup.launcher.core.a.d.a(var1, "1.7.3") >= 0) {
            var3.addAll(CollectionsKt.listOf("--userProperties", this.a(var2)))
         }

         if (net.mcsgroup.launcher.core.a.d.a(var1, "1.7.4") >= 0) {
            var3.addAll(CollectionsKt.listOf("--userType", "mojang"))
         }
      } else if (net.mcsgroup.launcher.core.a.d.a(var1, "1.6") >= 0) {
         var3.addAll(CollectionsKt.listOf("--username", var2.b().b()))
         var3.addAll(CollectionsKt.listOf("--session", var2.a()))
      } else {
         var3.add(var2.b().b())
         var3.add(var2.a())
      }

      CollectionsKt.build(var3)
   }

   fun a(var1: java.lang.String, var2: Path, var3: Path, var4: java.lang.String): MutableList<java.lang.String> {
      val var5: java.util.List = CollectionsKt.createListBuilder()
      var5.addAll(CollectionsKt.listOf("--version", var1))
      var5.addAll(CollectionsKt.listOf("--gameDir", var2.toString()))
      var5.addAll(CollectionsKt.listOf("--assetsDir", var3.toString()))
      if (net.mcsgroup.launcher.core.a.d.a(var1, "1.7.3") >= 0) {
         var5.addAll(CollectionsKt.listOf("--assetIndex", var4))
      }

      var5.addAll(CollectionsKt.listOf("--resourcePackDir", var2.resolve("resourcepacks").toString()))
      CollectionsKt.build(var5)
   }

   fun a(var1: Path, var2: MutableList<java.lang.String>): MutableList<java.lang.String> {
      val var5: java.lang.Iterable = var2
      val var6: java.util.Collection = ArrayList()

      for (var9 in var5) {
         val var12: Path = var1.resolve(var9 as java.lang.String)
         val var14: java.util.List
         if (Files.isDirectory(var12)) {
            val var10000: File = var12.toFile()
            var14 = SequencesKt.toList(
               SequencesKt.map(
                  SequencesKt.filter(FilesKt.walkTopDown(var10000), net/mcsgroup/launcher/core/e/c##Lambda_9_460()),
                  net/mcsgroup/launcher/core/e/c##Lambda_10_460()
               )
            )
         } else {
            var14 = CollectionsKt.listOf(var12.toString())
         }

         CollectionsKt.addAll(var6, var14)
      }

      CollectionsKt.distinct(var6 as java.util.List)
   }

   fun a(var1: MutableList<java.lang.String>, var2: java.lang.String): java.lang.String {
      CollectionsKt.joinToString$default(var1, var2, null, null, 0, null, null, 62, null)
   }

   fun a(var1: java.lang.String, var2: MutableList<java.lang.String>): Boolean {
      if (net.mcsgroup.launcher.core.a.d.a(var1, "1.12.2") != 0) {
         if (net.mcsgroup.launcher.core.a.d.a(var1, "1.13") >= 0) {
            true
         }

         val var3: java.lang.Iterable = var2
         var var10000: Boolean
         if (var2 is java.util.Collection && (var2 as java.util.Collection).isEmpty()) {
            var10000 = false
         } else {
            val var5: java.util.Iterator = var3.iterator()

            while (true) {
               if (!var5.hasNext()) {
                  var10000 = false
                  break
               }

               if (this.a(var5.next() as java.lang.String)) {
                  var10000 = true
                  break
               }
            }
         }

         if (var10000) {
            true
         }
      }

      false
   }

   fun a(var1: java.lang.String): Boolean {
      val var2: Int = Math.max(StringsKt.lastIndexOf$default(var1, '/', 0, false, 6, null), StringsKt.lastIndexOf$default(var1, '\\', 0, false, 6, null)) + 1
      StringsKt.endsWith$default(var1, ".jar", false, 2, null)
         && StringsKt.startsWith$default(var1, "lwjgl-", var2, false, 4, null)
         && StringsKt.indexOf$default(var1, "-3.", var2 + 5, false, 4, null) >= 0
      }

   fun a(var1: Path) {
      try {
         Files.setPosixFilePermissions(
            var1,
            SetsKt.setOf(
               PosixFilePermission.OWNER_READ,
               PosixFilePermission.OWNER_WRITE,
               PosixFilePermission.OWNER_EXECUTE,
               PosixFilePermission.GROUP_READ,
               PosixFilePermission.GROUP_EXECUTE,
               PosixFilePermission.OTHERS_READ,
               PosixFilePermission.OTHERS_EXECUTE
            )
         )
      } catch (var4: UnsupportedOperationException) {
      } catch (var5: NoSuchFileException) {
      }
   }

   fun a(var1: s): java.lang.String {
      val var2: java.lang.String = var1.b().c()
      t(
            MapsKt.mapOf(
               "skinURL" to kotlinx.c.e.c(CollectionsKt.listOf(i.a(var2))),
               "cloakURL" to kotlinx.c.e.c(CollectionsKt.listOf(i.a(StringsKt.replace$default(var2, "MinecraftSkins", "MinecraftCloaks", false, 4, null))))
            )
         )
         .toString()
      }

   fun b(var1: java.lang.String): Boolean {
      var1 == "-XX:+DisableAttachMechanism" || var1 == "-XX:-DisableAttachMechanism"
   }

   fun a(var1: MutableList<java.lang.String>): Path {
      val var2: Path = Files.createTempFile("mc-launch-", ".args")
      var2.toFile().deleteOnExit()
      val var4: c = this

      var var5: Any
      try {
         var5 = var4
         var var10000: java.lang.String = System.getProperty("native.encoding")
         if (var10000 == null) {
            var10000 = System.getProperty("sun.jnu.encoding")
            if (var10000 == null) {
               var10000 = "UTF-8"
            }
         }

         var5 = Result.constructor_impl/* $VF was: constructor-impl */(Charset.forName(var10000))
      } catch (var8: java.lang.Throwable) {
         var5 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var8))
      }

      Files.writeString(
         var2,
         CollectionsKt.joinToString$default(var1, "\n", null, null, 0, null, net/mcsgroup/launcher/core/e/c##Lambda_11_460(), 30, null),
         (if (Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(var5) == null) var5 else Charset.defaultCharset()) as Charset
      )
      var2
   }

   fun c(var1: java.lang.String): Boolean {
      val var10000: Int = StringsKt.toIntOrNull(StringsKt.substringBefore$default(var1, '-', null, 2, null))
      var10000 == null || var10000 >= 9
   }

   fun b(var1: MutableList<java.lang.String>): MutableList<java.lang.String> {
      val var10000: java.util.Collection = CollectionsKt.listOf(CollectionsKt.first(var1))
      val var2: java.lang.Iterable = CollectionsKt.drop(var1, 1)
      val var5: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var2, 10))

      for (var8 in var2) {
         var5.add(this.d(var8 as java.lang.String))
      }

      CollectionsKt.plus(var10000, var5 as java.util.List)
   }

   fun c(var1: MutableList<java.lang.String>): Int {
      val var2: java.lang.Iterable = var1
      var var3: Int = 0

      for (var5 in var2) {
         var3 += (var5 as java.lang.String).length()
      }

      var3 + CollectionsKt.getLastIndex(var1)
   }

   fun d(var1: MutableList<java.lang.String>): MutableList<java.lang.String> {
      var var5: Int = 0
      val var6: java.util.Iterator = var1.iterator()

      var var10000: Int
      while (true) {
         if (!var6.hasNext()) {
            var10000 = -1
            break
         }

         val var8: java.lang.String = var6.next() as java.lang.String
         if (var8 == "-cp" || var8 == "-classpath") {
            var10000 = var5
            break
         }

         var5++
      }

      if (var10000 >= 0 && var10000 + 1 < var1.size()) {
         val var10: Path = this.e(var1.get(var10000 + 1) as java.lang.String)
         val var11: java.util.List = CollectionsKt.toMutableList(var1)
         var11.set(var10000 + 1, var10.toString())
         var11
      } else {
         var1
      }
   }

   fun d(var1: java.lang.String): java.lang.String {
      val var2: java.lang.CharSequence = var1
      var var4: Int = 0

      var var10000: Boolean
      while (true) {
         if (var4 >= var2.length()) {
            var10000 = true
            break
         }

         val var6: Char = var2.charAt(var4)
         if (var6 == '"' || var6 == ' ' || var6 == '\t') {
            var10000 = false
            break
         }

         var4++
      }

      if (var10000) {
         var1
      } else {
         val var9: StringBuilder = StringBuilder(var1.length() + 2)
         val var10: StringBuilder = var9
         var9.append('"')
         var var12: Int = 0

         while (var12 < var1.length()) {
            var var13: Int = 0

            while (var12 < var1.length() && var1.charAt(var12) == '\\') {
               var13++
               var12++
            }

            if (var12 == var1.length()) {
               var10.append(StringsKt.repeat("\\", var13 * 2))
            } else if (var1.charAt(var12) == '"') {
               var10.append(StringsKt.repeat("\\", var13 * 2 + 1))
               var10.append('"')
               var12++
            } else {
               var10.append(StringsKt.repeat("\\", var13))
               var10.append(var1.charAt(var12))
               var12++
            }
         }

         var10.append('"')
         var9.toString()
      }
   }

   fun e(var1: java.lang.String): Path {
      val var2: Path = Files.createTempFile("mc-cp-", ".jar")
      var2.toFile().deleteOnExit()
      val var10000: java.lang.CharSequence = var1
      val var4: Array<java.lang.String> = arrayOfNulls(1)
      val var10003: java.lang.String = File.pathSeparator
      var4[0] = var10003
      val var6: java.lang.Iterable = StringsKt.split$default(var10000, var4, false, 0, 6, null)
      val var7: java.util.Collection = ArrayList()

      for (var10 in var6) {
         if ((var10 as java.lang.String).length() > 0) {
            var7.add(var10)
         }
      }

      val var3: java.lang.String = CollectionsKt.joinToString$default(
         var7 as java.util.List, " ", null, null, 0, null, net/mcsgroup/launcher/core/e/c##Lambda_12_460(), 30, null
      )
      val var19: Manifest = Manifest()
      val var30: Attributes = var19.getMainAttributes()
      var30.put(Name.MANIFEST_VERSION, "1.0")
      val var31: Attributes = var19.getMainAttributes()
      var31.put(Name.CLASS_PATH, var3)
      val var20: Closeable = JarOutputStream(Files.newOutputStream(var2), var19)
      var var22: java.lang.Throwable = null

      try {
         val var24: JarOutputStream = var20 as JarOutputStream
      } catch (var15: java.lang.Throwable) {
         var22 = var15
         throw var15
      } finally {
         CloseableKt.closeFinally(var20, var22)
      }

      var2
   }

   @JvmStatic
   fun a(var0: File): Boolean {
      var0.isFile() && (FilesKt.getExtension(var0) == "jar" || FilesKt.getExtension(var0) == "zip")
   }

   @JvmStatic
   fun b(var0: File): java.lang.String {
      var0.toString()
   }

   @JvmStatic
   fun f(var0: java.lang.String): java.lang.CharSequence {
      ("\"${StringsKt.replace$default(StringsKt.replace$default(var0, "\\", "\\\\", false, 4, null), "\"", "\\\"", false, 4, null)}\"") as java.lang.CharSequence
   }

   @JvmStatic
   fun g(var0: java.lang.String): java.lang.CharSequence {
      val var10000: java.lang.String = Path.of(var0).toUri().toASCIIString()
      var10000 as java.lang.CharSequence
   }
}
