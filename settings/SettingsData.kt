package net.mcsgroup.launcher.core.settings

import net.mcsgroup.launcher.core.clients.ClientOverride

public data class SettingsData(selectedMemory: Int = 0,
   downloadDir: String,
   debugMode: Boolean = false,
   minimizeOnLaunch: Boolean = false,
   backgroundGlow: Boolean = true,
   lastPlayedClientId: Int? = null,
   clientSettings: Map<Int, ClientOverride> = MapsKt.emptyMap(),
   proxyRouteId: String? = null
) {
   @JvmStatic
   public SettingsData.a Companion = SettingsData.a(null);
   private int a;
   private java.lang.String b;
   private boolean c;
   private boolean d;
   private boolean e;
   private Integer f;
   private java.util.Map<Integer, ClientOverride> g;
   private java.lang.String h;
   @JvmStatic
   private Lazy<kotlinx.c.b<Object>>[] i = arrayOf(
      null,
      null,
      null,
      null,
      null,
      null,
      LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, net/mcsgroup/launcher/core/settings/SettingsData##Lambda_1_116()),
      null
   );

   init {
      this.a = var1
      this.b = var2
      this.c = var3
      this.d = var4
      this.e = var5
      this.f = var6
      this.g = var7
      this.h = var8
   }

   fun a(): Int {
      this.a
   }

   fun b(): java.lang.String {
      this.b
   }

   fun c(): Boolean {
      this.c
   }

   fun d(): Boolean {
      this.d
   }

   fun e(): Boolean {
      this.e
   }

   fun f(): Int {
      this.f
   }

   fun g(): MutableMap<Int, ClientOverride> {
      this.g
   }

   fun h(): java.lang.String {
      this.h
   }

   fun a(
      var1: Int, var2: java.lang.String, var3: Boolean, var4: Boolean, var5: Boolean, var6: Int, var7: MutableMap<Int, ClientOverride>, var8: java.lang.String
   ): SettingsData {
      SettingsData(var1, var2, var3, var4, var5, var6, var7, var8)
   }

   public override fun toString(): String {
      return "SettingsData(selectedMemory=${this.a}, downloadDir=${this.b}, debugMode=${this.c}, minimizeOnLaunch=${this.d}, backgroundGlow=${this.e}, lastPlayedClientId=${this.f}, clientSettings=${this.g}, proxyRouteId=${this.h})"
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          ((Integer.hashCode(this.a) * 31 + this.b.hashCode()) * 31 + java.lang.Boolean.hashCode(this.c)) * 31
                                             + java.lang.Boolean.hashCode(this.d)
                                       )
                                       * 31
                                    + java.lang.Boolean.hashCode(this.e)
                              )
                              * 31
                           + (if (this.f == null) 0 else this.f.hashCode())
                     )
                     * 31
                  + this.g.hashCode()
            )
            * 31
         + (if (this.h == null) 0 else this.h.hashCode())
      }

   public override operator fun equals(other: Any?): Boolean {
      label64@
      if (this === var1) {
         return true
      } else {
         return var1 is SettingsData
            && this.a == (var1 as SettingsData).a
            && this.b == (var1 as SettingsData).b
            && this.c == (var1 as SettingsData).c
            && this.d == (var1 as SettingsData).d
            && this.e == (var1 as SettingsData).e
            && this.f == (var1 as SettingsData).f
            && this.g == (var1 as SettingsData).g
            && this.h == (var1 as SettingsData).h
         }
   }

   public companion object a {
      fun a(): kotlinx.c.b<SettingsData> {
         SettingsData.$serializer.INSTANCE as kotlinx.c.b
      }
   }
}
