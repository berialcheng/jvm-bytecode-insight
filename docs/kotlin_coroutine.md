```
package org.nirvana.kotlin

import kotlinx.coroutines.*

class CoroutineCode {

    fun main(args : Array<String>){
        println("Start")

        // Start a coroutine
        GlobalScope.launch {
            delay(1000)
            println("Hello")
        }

        Thread.sleep(2000) // wait for 2 seconds
        println("Stop")
    }
}
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/CoroutineCode.class
  Last modified Feb 13, 2018; size 1883 bytes
  MD5 checksum 22f23139924ed210c0edf37107497f03
  Compiled from "CoroutineCode.kt"
public final class org.nirvana.kotlin.CoroutineCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/kotlin/CoroutineCode
   #2 = Class              #1             // org/nirvana/kotlin/CoroutineCode
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               main
   #6 = Utf8               ([Ljava/lang/String;)V
   #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #8 = Utf8               args
   #9 = String             #8             // args
  #10 = Utf8               kotlin/jvm/internal/Intrinsics
  #11 = Class              #10            // kotlin/jvm/internal/Intrinsics
  #12 = Utf8               checkParameterIsNotNull
  #13 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #14 = NameAndType        #12:#13        // checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #15 = Methodref          #11.#14        // kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #16 = Utf8               Start
  #17 = String             #16            // Start
  #18 = Utf8               java/lang/System
  #19 = Class              #18            // java/lang/System
  #20 = Utf8               out
  #21 = Utf8               Ljava/io/PrintStream;
  #22 = NameAndType        #20:#21        // out:Ljava/io/PrintStream;
  #23 = Fieldref           #19.#22        // java/lang/System.out:Ljava/io/PrintStream;
  #24 = Utf8               java/io/PrintStream
  #25 = Class              #24            // java/io/PrintStream
  #26 = Utf8               println
  #27 = Utf8               (Ljava/lang/Object;)V
  #28 = NameAndType        #26:#27        // println:(Ljava/lang/Object;)V
  #29 = Methodref          #25.#28        // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #30 = Utf8               kotlinx/coroutines/GlobalScope
  #31 = Class              #30            // kotlinx/coroutines/GlobalScope
  #32 = Utf8               INSTANCE
  #33 = Utf8               Lkotlinx/coroutines/GlobalScope;
  #34 = NameAndType        #32:#33        // INSTANCE:Lkotlinx/coroutines/GlobalScope;
  #35 = Fieldref           #31.#34        // kotlinx/coroutines/GlobalScope.INSTANCE:Lkotlinx/coroutines/GlobalScope;
  #36 = Utf8               kotlinx/coroutines/CoroutineScope
  #37 = Class              #36            // kotlinx/coroutines/CoroutineScope
  #38 = Utf8               org/nirvana/kotlin/CoroutineCode$main$1
  #39 = Class              #38            // org/nirvana/kotlin/CoroutineCode$main$1
  #40 = Utf8               <init>
  #41 = Utf8               (Lkotlin/coroutines/Continuation;)V
  #42 = NameAndType        #40:#41        // "<init>":(Lkotlin/coroutines/Continuation;)V
  #43 = Methodref          #39.#42        // org/nirvana/kotlin/CoroutineCode$main$1."<init>":(Lkotlin/coroutines/Continuation;)V
  #44 = Utf8               kotlin/jvm/functions/Function2
  #45 = Class              #44            // kotlin/jvm/functions/Function2
  #46 = Utf8               kotlinx/coroutines/BuildersKt
  #47 = Class              #46            // kotlinx/coroutines/BuildersKt
  #48 = Utf8               launch$default
  #49 = Utf8               (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
  #50 = NameAndType        #48:#49        // launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
  #51 = Methodref          #47.#50        // kotlinx/coroutines/BuildersKt.launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
  #52 = Long               2000l
  #54 = Utf8               java/lang/Thread
  #55 = Class              #54            // java/lang/Thread
  #56 = Utf8               sleep
  #57 = Utf8               (J)V
  #58 = NameAndType        #56:#57        // sleep:(J)V
  #59 = Methodref          #55.#58        // java/lang/Thread.sleep:(J)V
  #60 = Utf8               Stop
  #61 = String             #60            // Stop
  #62 = Utf8               this
  #63 = Utf8               Lorg/nirvana/kotlin/CoroutineCode;
  #64 = Utf8               [Ljava/lang/String;
  #65 = Utf8               ()V
  #66 = NameAndType        #40:#65        // "<init>":()V
  #67 = Methodref          #4.#66         // java/lang/Object."<init>":()V
  #68 = Utf8               Lkotlin/Metadata;
  #69 = Utf8               mv
  #70 = Integer            1
  #71 = Integer            13
  #72 = Utf8               bv
  #73 = Integer            0
  #74 = Integer            3
  #75 = Utf8               k
  #76 = Utf8               d1
  #77 = Utf8               \n\n\\n\n\n\n\20B¢J02
                                               00¨\t
  #78 = Utf8               d2
  #79 = Utf8
  #80 = Utf8               jvm-class-insight
  #81 = Utf8               CoroutineCode.kt
  #82 = Utf8               Code
  #83 = Utf8               LineNumberTable
  #84 = Utf8               LocalVariableTable
  #85 = Utf8               RuntimeInvisibleParameterAnnotations
  #86 = Utf8               InnerClasses
  #87 = Utf8               SourceFile
  #88 = Utf8               SourceDebugExtension
  #89 = Utf8               RuntimeVisibleAnnotations
{
  public final void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=2
         0: aload_1
         1: ldc           #9                  // String args
         3: invokestatic  #15                 // Method kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
         6: ldc           #17                 // String Start
         8: astore_2
         9: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
        12: aload_2
        13: invokevirtual #29                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        16: getstatic     #35                 // Field kotlinx/coroutines/GlobalScope.INSTANCE:Lkotlinx/coroutines/GlobalScope;
        19: checkcast     #37                 // class kotlinx/coroutines/CoroutineScope
        22: aconst_null
        23: aconst_null
        24: new           #39                 // class org/nirvana/kotlin/CoroutineCode$main$1
        27: dup
        28: aconst_null
        29: invokespecial #43                 // Method org/nirvana/kotlin/CoroutineCode$main$1."<init>":(Lkotlin/coroutines/Continuation;)V
        32: checkcast     #45                 // class kotlin/jvm/functions/Function2
        35: iconst_3
        36: aconst_null
        37: invokestatic  #51                 // Method kotlinx/coroutines/BuildersKt.launch$default:(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
        40: pop
        41: ldc2_w        #52                 // long 2000l
        44: invokestatic  #59                 // Method java/lang/Thread.sleep:(J)V
        47: ldc           #61                 // String Stop
        49: astore_2
        50: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
        53: aload_2
        54: invokevirtual #29                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        57: return
      LineNumberTable:
        line 8: 6
        line 11: 16
        line 16: 41
        line 17: 47
        line 18: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lorg/nirvana/kotlin/CoroutineCode;
            0      58     1  args   [Ljava/lang/String;
    RuntimeInvisibleParameterAnnotations:
      0:
        0: #7()

  public org.nirvana.kotlin.CoroutineCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #67                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/CoroutineCode;
}
InnerClasses:
     static final #39; //class org/nirvana/kotlin/CoroutineCode$main$1
SourceFile: "CoroutineCode.kt"
SourceDebugExtension:
  SMAP
  CoroutineCode.kt
  Kotlin
  *S Kotlin
  *F
  + 1 CoroutineCode.kt
  org/nirvana/kotlin/CoroutineCode
  *L
  1#1,19:1
  *E
RuntimeVisibleAnnotations:
  0: #68(#69=[I#70,I#70,I#71],#72=[I#70,I#73,I#74],#75=I#70,#76=[s#77],#78=[s#63,s#79,s#65,s#5,s#79,s#8,s#79,s#79,s#6,s#80])
```