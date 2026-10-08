package net.mcsgroup.launcher.core.h

import java.nio.ByteBuffer
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.ArrayList
import java.util.Locale
import net.mcsgroup.launcher.core.auth.i
import net.mcsgroup.launcher.core.auth.n
import net.mcsgroup.launcher.core.auth.s
import net.mcsgroup.launcher.core.clients.f
import net.mcsgroup.launcher.core.clients.g
import net.mcsgroup.launcher.core.clients.j
import net.mcsgroup.launcher.core.k.e
import net.mcsgroup.launcher.core.k.k
import net.mcsgroup.launcher.proto.ClientInfo
import net.mcsgroup.launcher.proto.ClientProfile
import net.mcsgroup.launcher.proto.ClientTag
import net.mcsgroup.launcher.proto.FightMode
import net.mcsgroup.launcher.proto.FileChunk
import net.mcsgroup.launcher.proto.FileNode
import net.mcsgroup.launcher.proto.FileTreeResponse
import net.mcsgroup.launcher.proto.GetFallbackNodeResponse
import net.mcsgroup.launcher.proto.IntegrityMode
import net.mcsgroup.launcher.proto.LoginResponse
import net.mcsgroup.launcher.proto.ModInfo
import net.mcsgroup.launcher.proto.Platform
import net.mcsgroup.launcher.proto.PlayerProfile

private DateTimeFormatter a = DateTimeFormatter.ofPattern("dd.MM.yyyy");

fun a(var0: LoginResponse): i {
   val var10000: i
   if (var0.hasSessionData()) {
      val var10004: java.lang.String = var0.getSessionData().getId()
      val var10005: PlayerProfile = var0.getSessionData().getProfile()
      var10000 = i.b(s(var10004, a(var10005)))
   } else if (var0.hasMfaRequired()) {
      var10000 = i.a.a
   } else {
      if (!var0.hasTotp()) {
         throw IllegalStateException("LoginResponse has neither session_data, mfa_required or totp".toString())
      }

      var10000 = i.c.a
   }

   var10000
}

fun a(var0: PlayerProfile): n {
   val var10002: java.lang.String = var0.getUuid()
   val var10003: java.lang.String = var0.getUsername()
   val var10004: java.lang.String = var0.getSkinUrl()
   n(var10002, var10003, var10004)
}

fun a(var0: ClientInfo): net.mcsgroup.launcher.core.clients.a {
   val var1: Int = var0.getId()
   var var10000: java.lang.String = var0.getTitle()
   var10000 = var0.getVersion()
   var10000 = var0.getDescription()
   var10000 = var0.getAboutUrl()
   val var29: FightMode = var0.getFightMode()
   val var6: g = a(var29)
   val var9: java.lang.CharSequence = var0.getWipeDate()
   var10000 = if (var9.length() == 0) null else var9
   var10000 = if (var10000 as java.lang.String != null) a(var10000) else null
   val var33: ClientTag = var0.getTag()
   val var8: f = a(var33)
   val var21: Int = var0.getOnline()
   val var34: java.util.List = var0.getModsList()
   val var13: java.lang.Iterable = var34
   val var14: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var34, 10))

   for (var17 in var13) {
      val var18: ModInfo = var17 as ModInfo
      var14.add(a(var18))
   }

   net.mcsgroup.launcher.core.clients.a(
      var1, var10000, var10000, var10000, var10000, var6, var10000, var8, var0.getIsTest(), var21, var14 as MutableList<net.mcsgroup.launcher.core.clients.a.b>
   )
}

fun a(var0: ModInfo): net.mcsgroup.launcher.core.clients.a.b {
   var var10000: java.util.List = var0.getTagsList()
   val var3: java.lang.Iterable = var10000
   val var4: java.util.Collection = ArrayList()

   for (var9 in var3) {
      val var12: java.lang.String = var9 as java.lang.String

      var var15: Any
      try {
         val var23: java.lang.String = var12.toUpperCase(Locale.ROOT)
         var15 = Result.constructor_impl/* $VF was: constructor-impl */(net.mcsgroup.launcher.core.clients.a.c.valueOf(var23))
      } catch (var22: java.lang.Throwable) {
         var15 = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var22))
      }

      val var24: net.mcsgroup.launcher.core.clients.a.c = (if (isFailure) null else var15) as net.mcsgroup.launcher.core.clients.a.c
      if (var24 != null) {
         var4.add(var24)
      }
   }

   var10000 = var4 as java.util.List
   val var10001: Int = var0.getSort()
   val var10002: java.lang.String = var0.getName()
   net.mcsgroup.launcher.core.clients.a.b(var10000, var10001, var10002)
}

fun a(var0: ClientProfile): net.mcsgroup.launcher.core.clients.d {
   val var10002: Int = var0.getId()
   val var10003: java.lang.String = var0.getVersion()
   val var10004: java.lang.String = var0.getJavaVersion()
   val var10005: Int = net.mcsgroup.launcher.core.settings.c.c(var0.getMinimumRam())
   val var10006: Int = net.mcsgroup.launcher.core.settings.c.c(var0.getRecommendedRam())
   val var10007: java.lang.String = var0.getAssetIndex()
   val var10008: java.lang.String = var0.getClientDir()
   val var10009: java.lang.String = var0.getAssetsDir()
   val var10010: java.lang.String = var0.getMainClass()
   var var10011: java.util.List = var0.getClassPathList()
   var10011 = var10011
   var var10012: java.util.List = var0.getJvmArgsList()
   var10012 = var10012
   var var10013: java.util.List = var0.getClientArgsList()
   var10013 = var10013
   val var10014: IntegrityMode = var0.getIntegrityMode()
   val var4: j = a(var10014)
   var var10015: java.util.List = var0.getUpdatePathsList()
   var10015 = var10015
   var var10016: java.util.List = var0.getVerifyPathsList()
   var10016 = var10016
   var var10017: java.util.List = var0.getExclusionPathsList()
   var10017 = var10017
   val var10018: ByteArray = var0.getSignature().toByteArray()
   net.mcsgroup.launcher.core.clients.d(
      var10002,
      var10003,
      var10004,
      var10005,
      var10006,
      var10007,
      var10008,
      var10009,
      var10010,
      var10011,
      var10012,
      var10013,
      var4,
      var10015,
      var10016,
      var10017,
      var10018
   )
}

fun a(var0: FileNode): e {
   val var10000: e = e
   val var10002: java.lang.String = var0.getPath()
   val var10003: Long = var0.getSize()
   val var10004: java.lang.String
   if (var0.getIsDirectory()) {
      var10004 = null
   } else {
      val var1: ByteArray = var0.getHash().toByteArray()
      var10004 = HexExtensionsKt.toHexString$default(var1, null, 1, null)
   }

   var10000./* $VF: Unable to resugar constructor */<init>(var10002, var10003, var10004, var0.getIsDirectory())
   var10000
}

fun a(var0: FileTreeResponse): net.mcsgroup.launcher.core.k.g {
   val var10000: java.util.List = var0.getFilesList()
   val var3: java.lang.Iterable = var10000
   val var4: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var10000, 10))

   for (var7 in var3) {
      val var8: FileNode = var7 as FileNode
      var4.add(a(var8))
   }

   net.mcsgroup.launcher.core.k.g(var4 as MutableList<e>, if (var0.hasNodeId()) var0.getNodeId() else null, if (var0.hasBaseUrl()) var0.getBaseUrl() else null)
}

fun a(var0: GetFallbackNodeResponse): net.mcsgroup.launcher.core.k.b {
   val var10002: java.lang.String = var0.getBaseUrl()
   val var10003: java.lang.String = var0.getNodeId()
   net.mcsgroup.launcher.core.k.b(var10002, var10003)
}

fun a(var0: FileChunk): net.mcsgroup.launcher.core.k.a {
   val var10002: java.lang.String = var0.getPath()
   val var10003: ByteBuffer = var0.getData().asReadOnlyByteBuffer()
   net.mcsgroup.launcher.core.k.a(var10002, var10003, var0.getData().size(), var0.getIsLast())
}

fun a(var0: FightMode): g {
   var var10000: g
   when (d.a.a[var0.ordinal()]) {
      1 -> var10000 = g.a
      2 -> var10000 = g.b
      3, 4 -> var10000 = g.a
      else -> throw NoWhenBranchMatchedException()
   }

   var10000
}

fun a(var0: ClientTag): f {
   var var10000: f
   when (d.a.b[var0.ordinal()]) {
      1 -> var10000 = f.b
      2 -> var10000 = f.c
      3 -> var10000 = f.d
      4, 5, 6 -> var10000 = f.a
      else -> throw NoWhenBranchMatchedException()
   }

   var10000
}

fun a(var0: IntegrityMode): j {
   var var10000: j
   when (d.a.c[var0.ordinal()]) {
      1 -> var10000 = j.a
      2 -> var10000 = j.b
      3, 4 -> var10000 = j.a
      else -> throw NoWhenBranchMatchedException()
   }

   var10000
}

fun a(var0: java.lang.String): java.lang.String {
   val var10000: java.lang.Long = StringsKt.toLongOrNull(var0)
   if (var10000 != null) Instant.ofEpochSecond(var10000.longValue()).atZone(ZoneId.systemDefault()).format(a) else null
}

fun a(var0: k): Platform {
   var var10000: Platform
   when (d.a.d[var0.ordinal()]) {
      1 -> var10000 = Platform.PLATFORM_WINDOWS_X64
      2 -> var10000 = Platform.PLATFORM_WINDOWS_ARM64
      3 -> var10000 = Platform.PLATFORM_LINUX_X64
      4 -> var10000 = Platform.PLATFORM_LINUX_ARM64
      5 -> var10000 = Platform.PLATFORM_MACOS_X64
      6 -> var10000 = Platform.PLATFORM_MACOS_ARM64
      else -> throw NoWhenBranchMatchedException()
   }

   var10000
}
