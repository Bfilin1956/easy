package net.mcsgroup.launcher.core.clients

public data class b(clients: List<ClientInfo> = CollectionsKt.emptyList(),
   favouriteIds: Set<Int> = SetsKt.emptySet(),
   isLoading: Boolean = true,
   lastPlayedClientId: Int? = null
) {
   private java.util.List<a> a;
   private java.util.Set<Integer> b;
   private boolean c;
   private Integer d;

   init {
      this.a = var1
      this.b = var2
      this.c = var3
      this.d = var4
   }

   fun a(): MutableList<a> {
      this.a
   }

   fun b(): MutableSet<Int> {
      this.b
   }

   fun c(): Boolean {
      this.c
   }

   fun d(): Int {
      this.d
   }

   public override fun toString(): String {
      return "ClientListState(clients=${this.a}, favouriteIds=${this.b}, isLoading=${this.c}, lastPlayedClientId=${this.d})"
   }

   public override fun hashCode(): Int {
      return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + java.lang.Boolean.hashCode(this.c)) * 31 + (if (this.d == null) 0 else this.d.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === var1) {
         return true
      } else {
         return var1 is b && this.a == (var1 as b).a && this.b == (var1 as b).b && this.c == (var1 as b).c && this.d == (var1 as b).d
      }
   }

   fun b() {
      this(null, null, false, null, 15, null)
   }
}
