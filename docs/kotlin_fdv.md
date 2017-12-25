```
package org.nirvana.kotlin

val b = 2

fun foo(a: Int = 0, b: String = "default"): String {
    println(a)
    return b
}
```


```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/FunctionDefaultValuesKt.class
  Last modified Feb 13, 2018; size 1524 bytes
  MD5 checksum 1a510e84226669492f78d8dd0024a9c5
  Compiled from "FunctionDefaultValues.kt"
public final class org.nirvana.kotlin.FunctionDefaultValuesKt
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/kotlin/FunctionDefaultValuesKt
   #2 = Class              #1             // org/nirvana/kotlin/FunctionDefaultValuesKt
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               b
   #6 = Utf8               I
   #7 = Integer            2
   #8 = Utf8               getB
   #9 = Utf8               ()I
  #10 = NameAndType        #5:#6          // b:I
  #11 = Fieldref           #2.#10         // org/nirvana/kotlin/FunctionDefaultValuesKt.b:I
  #12 = Utf8               foo
  #13 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
  #14 = Utf8               Lorg/jetbrains/annotations/NotNull;
  #15 = String             #5             // b
  #16 = Utf8               kotlin/jvm/internal/Intrinsics
  #17 = Class              #16            // kotlin/jvm/internal/Intrinsics
  #18 = Utf8               checkParameterIsNotNull
  #19 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #20 = NameAndType        #18:#19        // checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #21 = Methodref          #17.#20        // kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #22 = Utf8               java/lang/System
  #23 = Class              #22            // java/lang/System
  #24 = Utf8               out
  #25 = Utf8               Ljava/io/PrintStream;
  #26 = NameAndType        #24:#25        // out:Ljava/io/PrintStream;
  #27 = Fieldref           #23.#26        // java/lang/System.out:Ljava/io/PrintStream;
  #28 = Utf8               java/io/PrintStream
  #29 = Class              #28            // java/io/PrintStream
  #30 = Utf8               println
  #31 = Utf8               (I)V
  #32 = NameAndType        #30:#31        // println:(I)V
  #33 = Methodref          #29.#32        // java/io/PrintStream.println:(I)V
  #34 = Utf8               a
  #35 = Utf8               Ljava/lang/String;
  #36 = Utf8               foo$default
  #37 = Utf8               (ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
  #38 = Utf8               default
  #39 = String             #38            // default
  #40 = NameAndType        #12:#13        // foo:(ILjava/lang/String;)Ljava/lang/String;
  #41 = Methodref          #2.#40         // org/nirvana/kotlin/FunctionDefaultValuesKt.foo:(ILjava/lang/String;)Ljava/lang/String;
  #42 = Utf8               <clinit>
  #43 = Utf8               ()V
  #44 = Utf8               Lkotlin/Metadata;
  #45 = Utf8               mv
  #46 = Integer            1
  #47 = Integer            13
  #48 = Utf8               bv
  #49 = Integer            0
  #50 = Integer            3
  #51 = Utf8               k
  #52 = Utf8               d1
  #53 = Utf8               \n\\\n\0\"0XD\¨
  #54 = Utf8               d2
  #55 = Utf8
  #56 = Utf8               jvm-class-insight
  #57 = Utf8               FunctionDefaultValues.kt
  #58 = Utf8               ConstantValue
  #59 = Utf8               Code
  #60 = Utf8               LineNumberTable
  #61 = Utf8               LocalVariableTable
  #62 = Utf8               RuntimeInvisibleAnnotations
  #63 = Utf8               RuntimeInvisibleParameterAnnotations
  #64 = Utf8               StackMapTable
  #65 = Utf8               SourceFile
  #66 = Utf8               SourceDebugExtension
  #67 = Utf8               RuntimeVisibleAnnotations
{
  private static final int b;
    descriptor: I
    flags: ACC_PRIVATE, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int getB();
    descriptor: ()I
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #11                 // Field b:I
         3: ireturn
      LineNumberTable:
        line 3: 0

  public static final java.lang.String foo(int, java.lang.String);
    descriptor: (ILjava/lang/String;)Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ldc           #15                 // String b
         3: invokestatic  #21                 // Method kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
         6: getstatic     #27                 // Field java/lang/System.out:Ljava/io/PrintStream;
         9: iload_0
        10: invokevirtual #33                 // Method java/io/PrintStream.println:(I)V
        13: aload_1
        14: areturn
      LineNumberTable:
        line 6: 6
        line 7: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0     a   I
            0      15     1     b   Ljava/lang/String;
    RuntimeInvisibleAnnotations:
      0: #14()
    RuntimeInvisibleParameterAnnotations:
      0:
      1:
        0: #14()

  public static java.lang.String foo$default(int, java.lang.String, int, java.lang.Object);
    descriptor: (ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=4, args_size=4
         0: iload_2
         1: iconst_1
         2: iand
         3: ifeq          8
         6: iconst_0
         7: istore_0
         8: iload_2
         9: iconst_2
        10: iand
        11: ifeq          17
        14: ldc           #39                 // String default
        16: astore_1
        17: iload_0
        18: aload_1
        19: invokestatic  #41                 // Method foo:(ILjava/lang/String;)Ljava/lang/String;
        22: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 8 /* same */
      LineNumberTable:
        line 5: 6
    RuntimeInvisibleAnnotations:
      0: #14()

  static {};
    descriptor: ()V
    flags: ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_2
         1: putstatic     #11                 // Field b:I
         4: return
      LineNumberTable:
        line 3: 0
}
SourceFile: "FunctionDefaultValues.kt"
SourceDebugExtension:
  SMAP
  FunctionDefaultValues.kt
  Kotlin
  *S Kotlin
  *F
  + 1 FunctionDefaultValues.kt
  org/nirvana/kotlin/FunctionDefaultValuesKt
  *L
  1#1,8:1
  *E
RuntimeVisibleAnnotations:
  0: #44(#45=[I#46,I#46,I#47],#48=[I#46,I#49,I#50],#51=I#7,#52=[s#53],#54=[s#5,s#55,s#8,s#9,s#12,s#55,s#34,s#56])
```