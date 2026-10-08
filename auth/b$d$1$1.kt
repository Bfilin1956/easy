package net.mcsgroup.launcher.core.auth

import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.ContinuationImpl
import kotlin.coroutines.jvm.internal.DebugMetadata

// $VF: Class flags could not be determined
@DebugMetadata(f = "AccountStore.kt", l = [50], nl = [49], i = [0, 0, 0, 0, 0], s = ["L$0", "L$1", "L$2", "L$3", "I$0"], n = ["value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"], m = "emit", c = "net.mcsgroup.launcher.core.auth.AccountStore$getActiveUsername$$inlined$map$1$2", v = 2)
internal class `b$d$1$1` : ContinuationImpl {
   open int b;
   open Object c;
   open Object e;
   open Object f;
   open Object g;
   open int h;

   fun `b$d$1$1`(var1: b$d$1, var2: Continuation) {
      super(var2)
      this.d = var1
   }

   override final fun invokeSuspend(var1: Any) {
      this.a = var1
      this.b |= Integer.MIN_VALUE
      this.d.emit(null, this)
   }
}
