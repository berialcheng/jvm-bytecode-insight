```
package org.nirvana.kotlin

class NullSafetyCode {
    fun foo(){
        var a: String = "Kotlin"
//        a = null // compilation error

        var b: String? = "abc"
        b = null // ok


        println(b?.length?.hashCode())
        println(a?.length?.hashCode())
    }
}
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/NullSafetyCode.class
  Last modified Feb 13, 2018; size 1124 bytes
  MD5 checksum 3b43174fe00c4ec3438257ede3124737
  Compiled from "NullSafetyCode.kt"
public final class org.nirvana.kotlin.NullSafetyCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/kotlin/NullSafetyCode
   #2 = Class              #1             // org/nirvana/kotlin/NullSafetyCode
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               foo
   #6 = Utf8               ()V
   #7 = Utf8               Kotlin
   #8 = String             #7             // Kotlin
   #9 = Utf8               abc
  #10 = String             #9             // abc
  #11 = Utf8               java/lang/String
  #12 = Class              #11            // java/lang/String
  #13 = Utf8               java/lang/System
  #14 = Class              #13            // java/lang/System
  #15 = Utf8               out
  #16 = Utf8               Ljava/io/PrintStream;
  #17 = NameAndType        #15:#16        // out:Ljava/io/PrintStream;
  #18 = Fieldref           #14.#17        // java/lang/System.out:Ljava/io/PrintStream;
  #19 = Utf8               java/io/PrintStream
  #20 = Class              #19            // java/io/PrintStream
  #21 = Utf8               println
  #22 = Utf8               (Ljava/lang/Object;)V
  #23 = NameAndType        #21:#22        // println:(Ljava/lang/Object;)V
  #24 = Methodref          #20.#23        // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #25 = Utf8               length
  #26 = Utf8               ()I
  #27 = NameAndType        #25:#26        // length:()I
  #28 = Methodref          #12.#27        // java/lang/String.length:()I
  #29 = Utf8               java/lang/Integer
  #30 = Class              #29            // java/lang/Integer
  #31 = Utf8               hashCode
  #32 = Utf8               (I)I
  #33 = NameAndType        #31:#32        // hashCode:(I)I
  #34 = Methodref          #30.#33        // java/lang/Integer.hashCode:(I)I
  #35 = Utf8               (I)V
  #36 = NameAndType        #21:#35        // println:(I)V
  #37 = Methodref          #20.#36        // java/io/PrintStream.println:(I)V
  #38 = Utf8               b
  #39 = Utf8               Ljava/lang/String;
  #40 = Utf8               a
  #41 = Utf8               this
  #42 = Utf8               Lorg/nirvana/kotlin/NullSafetyCode;
  #43 = Utf8               <init>
  #44 = NameAndType        #43:#6         // "<init>":()V
  #45 = Methodref          #4.#44         // java/lang/Object."<init>":()V
  #46 = Utf8               Lkotlin/Metadata;
  #47 = Utf8               mv
  #48 = Integer            1
  #49 = Integer            13
  #50 = Utf8               bv
  #51 = Integer            0
  #52 = Integer            3
  #53 = Utf8               k
  #54 = Utf8               d1
  #55 = Utf8               \n\n\\n\n20B¢J0¨
  #56 = Utf8               d2
  #57 = Utf8
  #58 = Utf8               jvm-class-insight
  #59 = Utf8               NullSafetyCode.kt
  #60 = Utf8               Code
  #61 = Utf8               LineNumberTable
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               SourceFile
  #64 = Utf8               SourceDebugExtension
  #65 = Utf8               RuntimeVisibleAnnotations
{
  public final void foo();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=1
         0: ldc           #8                  // String Kotlin
         2: astore_1
         3: ldc           #10                 // String abc
         5: astore_2
         6: aconst_null
         7: checkcast     #12                 // class java/lang/String
        10: astore_2
        11: aconst_null
        12: astore_3
        13: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
        16: aload_3
        17: invokevirtual #24                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
        20: aload_1
        21: invokevirtual #28                 // Method java/lang/String.length:()I
        24: invokestatic  #34                 // Method java/lang/Integer.hashCode:(I)I
        27: istore_3
        28: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
        31: iload_3
        32: invokevirtual #37                 // Method java/io/PrintStream.println:(I)V
        35: return
      LineNumberTable:
        line 5: 0
        line 8: 3
        line 9: 6
        line 12: 11
        line 13: 20
        line 14: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            6      30     2     b   Ljava/lang/String;
            3      33     1     a   Ljava/lang/String;
            0      36     0  this   Lorg/nirvana/kotlin/NullSafetyCode;

  public org.nirvana.kotlin.NullSafetyCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #45                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/NullSafetyCode;
}
SourceFile: "NullSafetyCode.kt"
SourceDebugExtension:
  SMAP
  NullSafetyCode.kt
  Kotlin
  *S Kotlin
  *F
  + 1 NullSafetyCode.kt
  org/nirvana/kotlin/NullSafetyCode
  *L
  1#1,15:1
  *E
RuntimeVisibleAnnotations:
  0: #46(#47=[I#48,I#48,I#49],#50=[I#48,I#51,I#52],#53=I#48,#54=[s#55],#56=[s#42,s#57,s#6,s#5,s#57,s#58])
```