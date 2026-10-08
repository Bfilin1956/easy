package net.mcsgroup.launcher.core.a

import java.io.BufferedInputStream
import java.io.Closeable
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

fun a(var0: File, var1: File, var2: ZipOutputStream, var3: java.lang.String) {
   var var10000: java.lang.String
   run label145@{
      if (var3 != null) {
         val var5: java.lang.String = StringsKt.trim(var3, '/')
         if (var5 != null) {
            var10000 = if (!StringsKt.isBlank(var5)) var5 else null
            return@label145
         }
      }

      var10000 = null
   }

   val var4: java.lang.String = var10000

   for (var9 in if (var1.isFile()) SequencesKt.sequenceOf(var1) else FilesKt.walkTopDown(var1)) {
      val var10: File = var9 as File
      var var12: java.lang.String = if (var1.isFile()) (var9 as File).getName() else var0.toPath().relativize((var9 as File).toPath()).toString()
      val var13: java.lang.String = StringsKt.replace$default(var12, File.separatorChar, '/', false, 4, null)
      val var14: StringBuilder = StringBuilder()
      if (var4 != null) {
         var14.append(var4)
         if (var13.length() > 0) {
            var14.append('/')
         }
      }

      var14.append(var13)
      if (var10.isDirectory() && !StringsKt.endsWith$default(var14, '/', false, 2, null)) {
         var14.append('/')
      }

      var12 = var14.toString()
      if (var12.length() != 0) {
         var2.putNextEntry(ZipEntry(var12))
         if (var10.isFile()) {
            val var29: InputStream = FileInputStream(var10)
            val var30: Closeable = if (var29 is BufferedInputStream) var29 as BufferedInputStream else BufferedInputStream(var29, 8192)
            var var32: java.lang.Throwable = null

            try {
               val var34: Long = ByteStreamsKt.copyTo$default(var30 as BufferedInputStream, var2, 0, 2, null)
            } catch (var21: java.lang.Throwable) {
               var32 = var21
               throw var21
            } finally {
               CloseableKt.closeFinally(var30, var32)
            }
         }

         var2.closeEntry()
      }
   }
}
