package net.mcsgroup.launcher.core.auth

public sealed class e protected constructor() : Exception {
   public data object a : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "AgreementRequired"
      }

      public override fun hashCode(): Int {
         return -1850346799
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.a
      }
   }

   public data object b : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "Banned"
      }

      public override fun hashCode(): Int {
         return 1657100566
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.b
      }
   }

   public data object c : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "EmailConfirmationRequired"
      }

      public override fun hashCode(): Int {
         return -349051976
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.c
      }
   }

   public data object d : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "InvalidCredentials"
      }

      public override fun hashCode(): Int {
         return -1334219139
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.d
      }
   }

   public data object e : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "RateLimited"
      }

      public override fun hashCode(): Int {
         return -1704065630
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.e
      }
   }

   public data object f : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "ServerUnavailable"
      }

      public override fun hashCode(): Int {
         return 188675093
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.f
      }
   }

   public data object g : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "SessionExpired"
      }

      public override fun hashCode(): Int {
         return 117123495
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.g
      }
   }

   public data object h : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "UnhandledError"
      }

      public override fun hashCode(): Int {
         return 1873019709
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.h
      }
   }

   public data object i : net.mcsgroup.launcher.core.auth.e() {
      public override fun toString(): String {
         return "UserNotFound"
      }

      public override fun hashCode(): Int {
         return -1865245358
      }

      public override operator fun equals(other: Any?): Boolean {
         return this === var1 || var1 is net.mcsgroup.launcher.core.auth.e.i
      }
   }
}
