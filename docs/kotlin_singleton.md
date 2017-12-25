```
package org.nirvana.kotlin

object SingletonCode {
    fun foo(){
        print("single")
    }
}
```


```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/SingletonCode.class
  Last modified Feb 13, 2018; size 1003 bytes
  MD5 checksum 4e96b12fd82e4366247b10f99b4bac4c
  Compiled from "SingletonCode.kt"
public final class org.nirvana.kotlin.SingletonCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/kotlin/SingletonCode
   #2 = Class              #1             // org/nirvana/kotlin/SingletonCode
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               foo
   #6 = Utf8               ()V
   #7 = Utf8               single
   #8 = String             #7             // single
   #9 = Utf8               java/lang/System
  #10 = Class              #9             // java/lang/System
  #11 = Utf8               out
  #12 = Utf8               Ljava/io/PrintStream;
  #13 = NameAndType        #11:#12        // out:Ljava/io/PrintStream;
  #14 = Fieldref           #10.#13        // java/lang/System.out:Ljava/io/PrintStream;
  #15 = Utf8               java/io/PrintStream
  #16 = Class              #15            // java/io/PrintStream
  #17 = Utf8               print
  #18 = Utf8               (Ljava/lang/Object;)V
  #19 = NameAndType        #17:#18        // print:(Ljava/lang/Object;)V
  #20 = Methodref          #16.#19        // java/io/PrintStream.print:(Ljava/lang/Object;)V
  #21 = Utf8               this
  #22 = Utf8               Lorg/nirvana/kotlin/SingletonCode;
  #23 = Utf8               <init>
  #24 = NameAndType        #23:#6         // "<init>":()V
  #25 = Methodref          #4.#24         // java/lang/Object."<init>":()V
  #26 = Utf8               INSTANCE
  #27 = Utf8               <clinit>
  #28 = Utf8               Lkotlin/Metadata;
  #29 = Utf8               mv
  #30 = Integer            1
  #31 = Integer            13
  #32 = Utf8               bv
  #33 = Integer            0
  #34 = Integer            3
  #35 = Utf8               k
  #36 = Utf8               d1
  #37 = Utf8               \n\n\\n\Æ20¢J0¨
  #38 = Utf8               d2
  #39 = Utf8
  #40 = Utf8               jvm-class-insight
  #41 = Methodref          #2.#24         // org/nirvana/kotlin/SingletonCode."<init>":()V
  #42 = NameAndType        #26:#22        // INSTANCE:Lorg/nirvana/kotlin/SingletonCode;
  #43 = Fieldref           #2.#42         // org/nirvana/kotlin/SingletonCode.INSTANCE:Lorg/nirvana/kotlin/SingletonCode;
  #44 = Utf8               SingletonCode.kt
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               LocalVariableTable
  #48 = Utf8               SourceFile
  #49 = Utf8               SourceDebugExtension
  #50 = Utf8               RuntimeVisibleAnnotations
{
  public static final org.nirvana.kotlin.SingletonCode INSTANCE;
    descriptor: Lorg/nirvana/kotlin/SingletonCode;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public final void foo();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: ldc           #8                  // String single
         2: astore_1
         3: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
         6: aload_1
         7: invokevirtual #20                 // Method java/io/PrintStream.print:(Ljava/lang/Object;)V
        10: return
      LineNumberTable:
        line 5: 0
        line 6: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lorg/nirvana/kotlin/SingletonCode;

  private org.nirvana.kotlin.SingletonCode();
    descriptor: ()V
    flags: ACC_PRIVATE
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #25                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/SingletonCode;

  static {};
    descriptor: ()V
    flags: ACC_STATIC
    Code:
      stack=2, locals=1, args_size=0
         0: new           #2                  // class org/nirvana/kotlin/SingletonCode
         3: dup
         4: invokespecial #41                 // Method "<init>":()V
         7: astore_0
         8: aload_0
         9: putstatic     #43                 // Field INSTANCE:Lorg/nirvana/kotlin/SingletonCode;
        12: return
      LineNumberTable:
        line 3: 0
}
SourceFile: "SingletonCode.kt"
SourceDebugExtension:
  SMAP
  SingletonCode.kt
  Kotlin
  *S Kotlin
  *F
  + 1 SingletonCode.kt
  org/nirvana/kotlin/SingletonCode
  *L
  1#1,7:1
  *E
RuntimeVisibleAnnotations:
  0: #28(#29=[I#30,I#30,I#31],#32=[I#30,I#33,I#34],#35=I#30,#36=[s#37],#38=[s#22,s#39,s#6,s#5,s#39,s#40])
```