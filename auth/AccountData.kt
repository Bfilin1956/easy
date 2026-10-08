package net.mcsgroup.launcher.core.auth

public data class AccountData(accounts: List<SavedAccount> = CollectionsKt.emptyList(), activeUsername: String? = null) {
   @JvmStatic
   public AccountData.a Companion = AccountData.a(null);
   private java.util.List<SavedAccount> a;
   private java.lang.String b;
   @JvmStatic
   private Lazy<kotlinx.c.b<Object>>[] c = arrayOf(
      LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, net/mcsgroup/launcher/core/auth/AccountData##Lambda_1_92()),
      null
   );

   init {
      this.a = var1
      this.b = var2
   }

   fun a(): MutableList<SavedAccount> {
      this.a
   }

   fun b(): java.lang.String {
      this.b
   }

   fun a(var1: MutableList<SavedAccount>, var2: java.lang.String): AccountData {
      AccountData(var1, var2)
   }

   public override fun toString(): String {
      return "AccountData(accounts=${this.a}, activeUsername=${this.b})"
   }

   public override fun hashCode(): Int {
      return this.a.hashCode() * 31 + (if (this.b == null) 0 else this.b.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === var1) {
         return true
      } else {
         return var1 is AccountData && this.a == (var1 as AccountData).a && this.b == (var1 as AccountData).b
      }
   }

   fun AccountData() {
      this(null, null, 3, null)
   }

   public companion object a {
      fun a(): kotlinx.c.b<AccountData> {
         AccountData.$serializer.INSTANCE as kotlinx.c.b
      }
   }
}
