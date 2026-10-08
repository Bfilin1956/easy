package net.mcsgroup.launcher.core.clients

import net.mcsgroup.launcher.core.clients.ClientInfo.ModTag

public data class a {
   @JvmStatic
   public net.mcsgroup.launcher.core.clients.a.a a = net.mcsgroup.launcher.core.clients.a.a(null);
   private int b;
   private java.lang.String c;
   private java.lang.String d;
   private java.lang.String e;
   private java.lang.String f;
   private g g;
   private java.lang.String h;
   private f i;
   private boolean j;
   private int k;
   private java.util.List<net.mcsgroup.launcher.core.clients.a.b> l;

   fun a(
      var1: Int,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: g,
      var7: java.lang.String,
      var8: f,
      var9: Boolean,
      var10: Int,
      var11: MutableList<net.mcsgroup.launcher.core.clients.a.b>
   ) {
      this.b = var1
      this.c = var2
      this.d = var3
      this.e = var4
      this.f = var5
      this.g = var6
      this.h = var7
      this.i = var8
      this.j = var9
      this.k = var10
      this.l = var11
   }

   fun a(): Int {
      this.b
   }

   fun b(): java.lang.String {
      this.c
   }

   fun c(): java.lang.String {
      this.d
   }

   fun d(): java.lang.String {
      this.e
   }

   fun e(): java.lang.String {
      this.f
   }

   fun f(): g {
      this.g
   }

   fun g(): java.lang.String {
      this.h
   }

   fun h(): f {
      this.i
   }

   fun i(): Boolean {
      this.j
   }

   fun j(): Int {
      this.k
   }

   fun k(): MutableList<net.mcsgroup.launcher.core.clients.a.b> {
      this.l
   }

   public override fun toString(): String {
      return "ClientInfo(id=${this.b}, title=${this.c}, version=${this.d}, description=${this.e}, aboutUrl=${this.f}, fightMode=${this.g}, wipeDate=${this.h}, tag=${this.i}, isTest=${this.j}, online=${this.k}, mods=${this.l})"
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     ((Integer.hashCode(this.b) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31
                                                                        + this.e.hashCode()
                                                                  )
                                                                  * 31
                                                               + this.f.hashCode()
                                                         )
                                                         * 31
                                                      + this.g.hashCode()
                                                )
                                                * 31
                                             + (if (this.h == null) 0 else this.h.hashCode())
                                       )
                                       * 31
                                    + this.i.hashCode()
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.j)
                     )
                     * 31
                  + Integer.hashCode(this.k)
            )
            * 31
         + this.l.hashCode()
      }

   public override operator fun equals(other: Any?): Boolean {
      label82@
      if (this === var1) {
         return true
      } else {
         return var1 is net.mcsgroup.launcher.core.clients.a
            && this.b == (var1 as net.mcsgroup.launcher.core.clients.a).b
            && this.c == (var1 as net.mcsgroup.launcher.core.clients.a).c
            && this.d == (var1 as net.mcsgroup.launcher.core.clients.a).d
            && this.e == (var1 as net.mcsgroup.launcher.core.clients.a).e
            && this.f == (var1 as net.mcsgroup.launcher.core.clients.a).f
            && this.g === (var1 as net.mcsgroup.launcher.core.clients.a).g
            && this.h == (var1 as net.mcsgroup.launcher.core.clients.a).h
            && this.i === (var1 as net.mcsgroup.launcher.core.clients.a).i
            && this.j == (var1 as net.mcsgroup.launcher.core.clients.a).j
            && this.k == (var1 as net.mcsgroup.launcher.core.clients.a).k
            && this.l == (var1 as net.mcsgroup.launcher.core.clients.a).l
         }
   }

   public companion object a {
      fun a(var1: Int): net.mcsgroup.launcher.core.clients.a {
         net.mcsgroup.launcher.core.clients.a(
            var1,
            "Server Name",
            "0.0.0",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam.",
            null,
            net.mcsgroup.launcher.core.clients.g.a,
            "01.01.2026",
            net.mcsgroup.launcher.core.clients.f.a,
            false,
            100,
            null,
            1296,
            null
         )
      }
   }

   public data class b(tags: List<ModTag>? = CollectionsKt.emptyList(), sort: Int = 0, name: String = "") {
      private java.util.List<net.mcsgroup.launcher.core.clients.a.c> a;
      private int b;
      private java.lang.String c;

      init {
         this.a = var1
         this.b = var2
         this.c = var3
      }

      fun a(): MutableList<net.mcsgroup.launcher.core.clients.a.c> {
         this.a
      }

      fun b(): java.lang.String {
         this.c
      }

      public override fun toString(): String {
         return "ModInfo(tags=${this.a}, sort=${this.b}, name=${this.c})"
      }

      public override fun hashCode(): Int {
         return ((if (this.a == null) 0 else this.a.hashCode()) * 31 + Integer.hashCode(this.b)) * 31 + this.c.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label34@
         if (this === var1) {
            return true
         } else {
            return var1 is net.mcsgroup.launcher.core.clients.a.b
               && this.a == (var1 as net.mcsgroup.launcher.core.clients.a.b).a
               && this.b == (var1 as net.mcsgroup.launcher.core.clients.a.b).b
               && this.c == (var1 as net.mcsgroup.launcher.core.clients.a.b).c
            }
      }

      fun b() {
         this(null, 0, null, 7, null)
      }
   }

   public enum class c {
      a,
      b;
   }
}
