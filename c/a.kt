package net.mcsgroup.launcher.core.c

import b.k
import b.p
import b.x
import b.y
import io.ktor.a.e.m
import io.ktor.a.e.w
import io.ktor.a.e.a.e
import java.io.File
import java.time.Duration
import java.util.concurrent.TimeUnit
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.b.b.g
import kotlinx.c.e.d
import kotlinx.c.e.n
import kotlinx.coroutines.aj
import kotlinx.coroutines.az
import kotlinx.coroutines.ct
import net.mcsgroup.launcher.core.auth.AccountData
import net.mcsgroup.launcher.core.auth.f
import net.mcsgroup.launcher.core.auth.h
import net.mcsgroup.launcher.core.auth.j
import net.mcsgroup.launcher.core.auth.o
import net.mcsgroup.launcher.core.auth.r
import net.mcsgroup.launcher.core.auth.t
import net.mcsgroup.launcher.core.b.b
import net.mcsgroup.launcher.core.k.i
import net.mcsgroup.launcher.core.settings.SettingsData
import org.koin.b.c
import org.koin.core.definition.BeanDefinition
import org.koin.core.definition.Kind
import org.koin.core.definition.KoinDefinition
import org.koin.core.instance.FactoryInstanceFactory
import org.koin.core.instance.SingleInstanceFactory
import org.koin.core.module.Module
import org.koin.core.parameter.ParametersHolder
import org.koin.core.qualifier.Qualifier
import org.koin.core.registry.ScopeRegistry
import org.koin.core.scope.Scope

fun a(var0: b): Module {
   c.a(false, var0.net/mcsgroup/launcher/core/c/a##Lambda_0_430(var0), 1, null)
}

fun a(var0: x.a): Unit {
   var0.a(CollectionsKt.listOf(y.e, y.c))
   var0.a(k(64, 5L, TimeUnit.MINUTES))
   val var5: p = p()
   var5.a(64)
   var5.b(32)
   var0.a(var5)
   val var10001: Duration = Duration.ofSeconds(30L)
   var0.a(var10001)
   var0.a(true)
   var0.b(true)
   Unit.INSTANCE
}

fun a(var0: w): Unit {
   var0.b(10000L)
   var0.c(60000L)
   var0.a(null)
   Unit.INSTANCE
}

fun a(var0: io.ktor.a.c.a.c): Unit {
   var0.a(net/mcsgroup/launcher/core/c/a##Lambda_1_426())
   Unit.INSTANCE
}

fun a(var0: io.ktor.a.b): Unit {
   var0.a(io.ktor.a.e.x.a() as m<? extends w, e<w>>, net/mcsgroup/launcher/core/c/a##Lambda_2_426())
   var0.a(net/mcsgroup/launcher/core/c/a##Lambda_3_426())
   Unit.INSTANCE
}

fun a(var0: d): Unit {
   var0.c(true)
   var0.b(false)
   Unit.INSTANCE
}

fun a(var0: b, var1: Scope, var2: ParametersHolder): b {
   var0
}

fun a(var0: Scope, var1: ParametersHolder): h {
   h(
      var0.get(net.mcsgroup.launcher.core.auth.b::class, null, null),
      var0.get(net.mcsgroup.launcher.core.g.a::class, null, null),
      var0.get(net.mcsgroup.launcher.core.h.a::class, null, null)
   )
}

fun b(var0: b, var1: final Scope, var2: ParametersHolder): net.mcsgroup.launcher.core.h.a {
   val var3: net.mcsgroup.launcher.core.h.a = net.mcsgroup.launcher.core.h.a(net.mcsgroup.launcher.core.j.c.a(var0.a()))
   var3.a({
      // $VF: Could not decompile lambda - root function was not found. Is this a suspend lambda?
   } as (Continuation<in Unit>?) -> Any)
   var3
}

fun b(var0: Scope, var1: ParametersHolder): f {
   f(var0.get(net.mcsgroup.launcher.core.h.a::class, null, null))
}

fun c(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.i.d {
   net.mcsgroup.launcher.core.i.d()
}

fun d(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.clients.e {
   net.mcsgroup.launcher.core.clients.e(
      var0.get(net.mcsgroup.launcher.core.h.a::class, null, null), var0.get(net.mcsgroup.launcher.core.i.d::class, null, null)
   )
}

fun e(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.k.p {
   net.mcsgroup.launcher.core.k.p(var0.get(net.mcsgroup.launcher.core.h.a::class, null, null))
}

fun f(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.k.f {
   net.mcsgroup.launcher.core.k.f()
}

fun g(var0: Scope, var1: ParametersHolder): io.ktor.a.a {
   io.ktor.a.c.a(io.ktor.a.c.a.a.a, net/mcsgroup/launcher/core/c/a##Lambda_4_426())
}

fun h(var0: Scope, var1: ParametersHolder): i {
   i(var0.get(io.ktor.a.a::class, null, null))
}

fun a(var0: kotlinx.b.b.f, var1: File, var2: b, var3: Scope, var4: ParametersHolder): net.mcsgroup.launcher.core.settings.d {
   val var12: kotlinx.b.b.f = kotlinx.b.b.h.a(var0, "settings.json")
   val var10005: java.lang.String = FilesKt.resolve(var1, var2.c()).getPath()
   val var6: SettingsData = SettingsData(0, var10005, false, false, false, null, null, null, 253, null)
   val var8: kotlinx.c.e.b = io.github.a.a.b.a()
   val var10: kotlinx.b.b.f = g.a("$var12.temp")
   var8.b()
   net.mcsgroup.launcher.core.settings.d(io.github.a.a.c<>(var6, true, io.github.a.a.a.a<>(var12, var10, var8, SettingsData.Companion.a())))
}

fun a(var0: kotlinx.b.b.f, var1: Scope, var2: ParametersHolder): net.mcsgroup.launcher.core.auth.b {
   val var3: kotlinx.c.e.b = n.a(null, net/mcsgroup/launcher/core/c/a##Lambda_5_426(), 1, null)
   val var11: kotlinx.b.b.f = kotlinx.b.b.h.a(var0, "accounts.json")
   val var5: AccountData = AccountData(null, null, 3, null)
   val var9: kotlinx.b.b.f = g.a("$var11.temp")
   var3.b()
   net.mcsgroup.launcher.core.auth.b(io.github.a.a.c<>(var5, true, io.github.a.a.a.a<>(var11, var9, var3, AccountData.Companion.a())))
}

fun i(var0: Scope, var1: ParametersHolder): j {
   j(var0.get(f::class, null, null))
}

fun j(var0: Scope, var1: ParametersHolder): r {
   r(
      var0.get(net.mcsgroup.launcher.core.auth.b::class, null, null),
      var0.get(f::class, null, null),
      var0.get(net.mcsgroup.launcher.core.h.a::class, null, null)
   )
}

fun k(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.auth.d {
   net.mcsgroup.launcher.core.auth.d(var0.get(f::class, null, null), var0.get(net.mcsgroup.launcher.core.auth.b::class, null, null))
}

fun l(var0: Scope, var1: ParametersHolder): o {
   o(
      var0.get(net.mcsgroup.launcher.core.auth.b::class, null, null),
      var0.get(j::class, null, null),
      var0.get(net.mcsgroup.launcher.core.h.a::class, null, null)
   )
}

fun m(var0: Scope, var1: ParametersHolder): t {
   t(
      var0.get(net.mcsgroup.launcher.core.auth.b::class, null, null),
      var0.get(r::class, null, null),
      var0.get(net.mcsgroup.launcher.core.h.a::class, null, null)
   )
}

fun n(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.auth.g {
   net.mcsgroup.launcher.core.auth.g(var0.get(net.mcsgroup.launcher.core.auth.b::class, null, null), var0.get(r::class, null, null))
}

fun o(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.clients.i {
   net.mcsgroup.launcher.core.clients.i(var0.get(net.mcsgroup.launcher.core.clients.e::class, null, null))
}

fun p(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.clients.h {
   net.mcsgroup.launcher.core.clients.h(var0.get(net.mcsgroup.launcher.core.clients.e::class, null, null))
}

fun q(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.d.a {
   net.mcsgroup.launcher.core.d.a(
      var0.get(net.mcsgroup.launcher.core.settings.d::class, null, null), var0.get(net.mcsgroup.launcher.core.clients.h::class, null, null)
   )
}

fun r(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.j.g {
   net.mcsgroup.launcher.core.j.g(
      var0.get(net.mcsgroup.launcher.core.h.a::class, null, null),
      var0.get(net.mcsgroup.launcher.core.settings.d::class, null, null),
      var0.get(b::class, null, null)
   )
}

fun s(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.k.m {
   net.mcsgroup.launcher.core.k.m(
      var0.get(net.mcsgroup.launcher.core.k.p::class, null, null), var0.get(i::class, null, null), var0.get(net.mcsgroup.launcher.core.k.f::class, null, null)
   )
}

fun t(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.e.c {
   net.mcsgroup.launcher.core.e.c()
}

fun u(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.f.b {
   net.mcsgroup.launcher.core.f.b(0, null, 3, null)
}

fun v(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.e.b {
   net.mcsgroup.launcher.core.e.b()
}

fun w(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.e.f {
   net.mcsgroup.launcher.core.e.f()
}

fun x(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.j.a {
   net.mcsgroup.launcher.core.j.a()
}

fun y(var0: Scope, var1: ParametersHolder): net.mcsgroup.launcher.core.g.a {
   net.mcsgroup.launcher.core.g.a(aj.a(ct.a(null, 1, null).plus(az.a())), var0.get(b::class, null, null))
}

fun a(var0: b, var1: Module): Unit {
   var var5: Function2 = var0.net/mcsgroup/launcher/core/c/a##Lambda_6_431(var0)
   var var7: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var var9: Kind = Kind.Singleton
   var var13: SingleInstanceFactory = SingleInstanceFactory(BeanDefinition(var7, b::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   val var37: Function2 = net/mcsgroup/launcher/core/c/a##Lambda_7_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   val var205: Kind = Kind.Factory
   val var14: FactoryInstanceFactory = FactoryInstanceFactory(BeanDefinition(var7, h::class, null, var37, var205, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var14)
   KoinDefinition(var1, var14)
   var5 = var0.net/mcsgroup/launcher/core/c/a##Lambda_8_431(var0)
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, net.mcsgroup.launcher.core.h.a::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   var5 = net/mcsgroup/launcher/core/c/a##Lambda_9_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, f::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   var5 = net/mcsgroup/launcher/core/c/a##Lambda_10_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, net.mcsgroup.launcher.core.i.d::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   var5 = net/mcsgroup/launcher/core/c/a##Lambda_11_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, net.mcsgroup.launcher.core.clients.e::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   var5 = net/mcsgroup/launcher/core/c/a##Lambda_12_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, net.mcsgroup.launcher.core.k.p::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   var5 = net/mcsgroup/launcher/core/c/a##Lambda_13_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, net.mcsgroup.launcher.core.k.f::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   var5 = net/mcsgroup/launcher/core/c/a##Lambda_14_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, io.ktor.a.a::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   var5 = net/mcsgroup/launcher/core/c/a##Lambda_15_427()
   var7 = ScopeRegistry.Companion.rootScopeQualifier
   var9 = Kind.Singleton
   var13 = SingleInstanceFactory(BeanDefinition(var7, i::class, null, var5, var9, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var13)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var13)
   }

   KoinDefinition(var1, var13)
   val var26: File = File(System.getProperty("user.home"))
   val var10000: java.lang.String = FilesKt.resolve(var26, var0.b()).getPath()
   val var36: kotlinx.b.b.f = g.a(var10000)
   kotlinx.b.b.b.a(kotlinx.b.b.c.a, var36, false, 2, null)
   val var130: Function2 = var36.net/mcsgroup/launcher/core/c/a##Lambda_16_429(var36, var26, var0)
   val var186: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var var242: Kind = Kind.Singleton
   var var15: SingleInstanceFactory = SingleInstanceFactory(
      BeanDefinition(var186, net.mcsgroup.launcher.core.settings.d::class, null, var130, var242, CollectionsKt.emptyList())
   )
   var1.indexPrimaryType(var15)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var15)
   }

   KoinDefinition(var1, var15)
   val var131: Function2 = var36.net/mcsgroup/launcher/core/c/a##Lambda_17_428(var36)
   val var187: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var242 = Kind.Singleton
   var15 = SingleInstanceFactory(BeanDefinition(var187, net.mcsgroup.launcher.core.auth.b::class, null, var131, var242, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var15)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var15)
   }

   KoinDefinition(var1, var15)
   var var104: Function2 = net/mcsgroup/launcher/core/c/a##Lambda_18_427()
   val var188: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var var272: Kind = Kind.Factory
   var var16: FactoryInstanceFactory = FactoryInstanceFactory(BeanDefinition(var188, j::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_19_427()
   val var189: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var189, r::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_20_427()
   val var190: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var190, net.mcsgroup.launcher.core.auth.d::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_21_427()
   val var191: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var191, o::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_22_427()
   val var192: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var192, t::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_23_427()
   val var193: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var193, net.mcsgroup.launcher.core.auth.g::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_24_427()
   val var194: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var194, net.mcsgroup.launcher.core.clients.i::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_25_427()
   val var195: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var195, net.mcsgroup.launcher.core.clients.h::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_26_427()
   val var196: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var196, net.mcsgroup.launcher.core.d.a::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_27_427()
   val var197: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var197, net.mcsgroup.launcher.core.j.g::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_28_427()
   val var198: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var198, net.mcsgroup.launcher.core.k.m::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_29_427()
   val var199: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var199, net.mcsgroup.launcher.core.e.c::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   val var144: Function2 = net/mcsgroup/launcher/core/c/a##Lambda_30_427()
   val var200: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var242 = Kind.Singleton
   var15 = SingleInstanceFactory(BeanDefinition(var200, net.mcsgroup.launcher.core.f.b::class, null, var144, var242, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var15)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var15)
   }

   KoinDefinition(var1, var15)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_31_427()
   val var201: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var201, net.mcsgroup.launcher.core.e.b::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   var104 = net/mcsgroup/launcher/core/c/a##Lambda_32_427()
   val var202: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var272 = Kind.Factory
   var16 = FactoryInstanceFactory(BeanDefinition(var202, net.mcsgroup.launcher.core.e.f::class, null, var104, var272, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var16)
   KoinDefinition(var1, var16)
   val var147: Function2 = net/mcsgroup/launcher/core/c/a##Lambda_33_427()
   val var203: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var242 = Kind.Singleton
   var15 = SingleInstanceFactory(BeanDefinition(var203, net.mcsgroup.launcher.core.j.a::class, null, var147, var242, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var15)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var15)
   }

   KoinDefinition(var1, var15)
   val var148: Function2 = net/mcsgroup/launcher/core/c/a##Lambda_34_427()
   val var204: Qualifier = ScopeRegistry.Companion.rootScopeQualifier
   var242 = Kind.Singleton
   var15 = SingleInstanceFactory(BeanDefinition(var204, net.mcsgroup.launcher.core.g.a::class, null, var148, var242, CollectionsKt.emptyList()))
   var1.indexPrimaryType(var15)
   if (var1._createdAtStart) {
      var1.prepareForCreationAtStart(var15)
   }

   KoinDefinition(var1, var15)
   Unit.INSTANCE
}
