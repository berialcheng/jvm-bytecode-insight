```
package org.nirvana.kotlin

fun getStringLength(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/TypeCheckKt.class
  Last modified Feb 13, 2018; size 1029 bytes
  MD5 checksum 88096fbe19573ac47635865f41ef6b4d
  Compiled from "TypeCheck.kt"
public final class org.nirvana.kotlin.TypeCheckKt
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/kotlin/TypeCheckKt
   #2 = Class              #1             // org/nirvana/kotlin/TypeCheckKt
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               getStringLength
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Integer;
   #7 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #8 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #9 = Utf8               obj
  #10 = String             #9             // obj
  #11 = Utf8               kotlin/jvm/internal/Intrinsics
  #12 = Class              #11            // kotlin/jvm/internal/Intrinsics
  #13 = Utf8               checkParameterIsNotNull
  #14 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
  #15 = NameAndType        #13:#14        // checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #16 = Methodref          #12.#15        // kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
  #17 = Utf8               java/lang/String
  #18 = Class              #17            // java/lang/String
  #19 = Utf8               length
  #20 = Utf8               ()I
  #21 = NameAndType        #19:#20        // length:()I
  #22 = Methodref          #18.#21        // java/lang/String.length:()I
  #23 = Utf8               java/lang/Integer
  #24 = Class              #23            // java/lang/Integer
  #25 = Utf8               valueOf
  #26 = Utf8               (I)Ljava/lang/Integer;
  #27 = NameAndType        #25:#26        // valueOf:(I)Ljava/lang/Integer;
  #28 = Methodref          #24.#27        // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #29 = Utf8               Ljava/lang/Object;
  #30 = Utf8               Lkotlin/Metadata;
  #31 = Utf8               mv
  #32 = Integer            1
  #33 = Integer            13
  #34 = Utf8               bv
  #35 = Integer            0
  #36 = Integer            3
  #37 = Utf8               k
  #38 = Integer            2
  #39 = Utf8               d1
  #40 = Utf8               \n\\n\n\020¢¨
  #41 = Utf8               d2
  #42 = Utf8
  #43 = Utf8               jvm-class-insight
  #44 = Utf8               TypeCheck.kt
  #45 = Utf8               Code
  #46 = Utf8               StackMapTable
  #47 = Utf8               LineNumberTable
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               RuntimeInvisibleAnnotations
  #50 = Utf8               RuntimeInvisibleParameterAnnotations
  #51 = Utf8               SourceFile
  #52 = Utf8               RuntimeVisibleAnnotations
{
  public static final java.lang.Integer getStringLength(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Integer;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc           #10                 // String obj
         3: invokestatic  #16                 // Method kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
         6: aload_0
         7: instanceof    #18                 // class java/lang/String
        10: ifeq          34
        13: aload_0
        14: checkcast     #18                 // class java/lang/String
        17: invokevirtual #22                 // Method java/lang/String.length:()I
        20: ifle          34
        23: aload_0
        24: checkcast     #18                 // class java/lang/String
        27: invokevirtual #22                 // Method java/lang/String.length:()I
        30: invokestatic  #28                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        33: areturn
        34: aconst_null
        35: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */
      LineNumberTable:
        line 5: 6
        line 6: 23
        line 9: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0   obj   Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #7()
    RuntimeInvisibleParameterAnnotations:
      0:
        0: #8()
}
SourceFile: "TypeCheck.kt"
RuntimeVisibleAnnotations:
  0: #30(#31=[I#32,I#32,I#33],#34=[I#32,I#35,I#36],#37=I#38,#39=[s#40],#41=[s#5,s#42,s#9,s#42,s#6,s#43])
```