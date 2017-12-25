```
package org.nirvana.kotlin

fun foo(){
    var a = 1
    // simple name in template:
    val s1 = "a is $a"
    print(s1)

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)
}

```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/StringInterpolationKt.class
  Last modified Feb 13, 2018; size 1312 bytes
  MD5 checksum a4a5acb0390b27cf8583f27393994966
  Compiled from "StringInterpolation.kt"
public final class org.nirvana.kotlin.StringInterpolationKt
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/kotlin/StringInterpolationKt
   #2 = Class              #1             // org/nirvana/kotlin/StringInterpolationKt
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               foo
   #6 = Utf8               ()V
   #7 = Utf8               java/lang/StringBuilder
   #8 = Class              #7             // java/lang/StringBuilder
   #9 = Utf8               <init>
  #10 = NameAndType        #9:#6          // "<init>":()V
  #11 = Methodref          #8.#10         // java/lang/StringBuilder."<init>":()V
  #12 = Utf8               a is
  #13 = String             #12            // a is
  #14 = Utf8               append
  #15 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #16 = NameAndType        #14:#15        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #17 = Methodref          #8.#16         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #18 = Utf8               (I)Ljava/lang/StringBuilder;
  #19 = NameAndType        #14:#18        // append:(I)Ljava/lang/StringBuilder;
  #20 = Methodref          #8.#19         // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #21 = Utf8               toString
  #22 = Utf8               ()Ljava/lang/String;
  #23 = NameAndType        #21:#22        // toString:()Ljava/lang/String;
  #24 = Methodref          #8.#23         // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #25 = Utf8               java/lang/System
  #26 = Class              #25            // java/lang/System
  #27 = Utf8               out
  #28 = Utf8               Ljava/io/PrintStream;
  #29 = NameAndType        #27:#28        // out:Ljava/io/PrintStream;
  #30 = Fieldref           #26.#29        // java/lang/System.out:Ljava/io/PrintStream;
  #31 = Utf8               java/io/PrintStream
  #32 = Class              #31            // java/io/PrintStream
  #33 = Utf8               print
  #34 = Utf8               (Ljava/lang/Object;)V
  #35 = NameAndType        #33:#34        // print:(Ljava/lang/Object;)V
  #36 = Methodref          #32.#35        // java/io/PrintStream.print:(Ljava/lang/Object;)V
  #37 = Utf8               is
  #38 = String             #37            // is
  #39 = Utf8               was
  #40 = String             #39            // was
  #41 = Utf8               kotlin/text/StringsKt
  #42 = Class              #41            // kotlin/text/StringsKt
  #43 = Utf8               replace$default
  #44 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
  #45 = NameAndType        #43:#44        // replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
  #46 = Methodref          #42.#45        // kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
  #47 = Utf8               , but now is
  #48 = String             #47            // , but now is
  #49 = Utf8               s2
  #50 = Utf8               Ljava/lang/String;
  #51 = Utf8               s1
  #52 = Utf8               a
  #53 = Utf8               I
  #54 = Utf8               Lkotlin/Metadata;
  #55 = Utf8               mv
  #56 = Integer            1
  #57 = Integer            13
  #58 = Utf8               bv
  #59 = Integer            0
  #60 = Integer            3
  #61 = Utf8               k
  #62 = Integer            2
  #63 = Utf8               d1
  #64 = Utf8              \n\n\n0¨
  #65 = Utf8               d2
  #66 = Utf8
  #67 = Utf8               jvm-class-insight
  #68 = Utf8               StringInterpolation.kt
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               SourceFile
  #73 = Utf8               SourceDebugExtension
  #74 = Utf8               RuntimeVisibleAnnotations
{
  public static final void foo();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=7, locals=3, args_size=0
         0: iconst_1
         1: istore_0
         2: new           #8                  // class java/lang/StringBuilder
         5: dup
         6: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
         9: ldc           #13                 // String a is
        11: invokevirtual #17                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        14: iload_0
        15: invokevirtual #20                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        18: invokevirtual #24                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        21: astore_1
        22: getstatic     #30                 // Field java/lang/System.out:Ljava/io/PrintStream;
        25: aload_1
        26: invokevirtual #36                 // Method java/io/PrintStream.print:(Ljava/lang/Object;)V
        29: iconst_2
        30: istore_0
        31: new           #8                  // class java/lang/StringBuilder
        34: dup
        35: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
        38: aload_1
        39: ldc           #38                 // String is
        41: ldc           #40                 // String was
        43: iconst_0
        44: iconst_4
        45: aconst_null
        46: invokestatic  #46                 // Method kotlin/text/StringsKt.replace$default:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        49: invokevirtual #17                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        52: ldc           #48                 // String , but now is
        54: invokevirtual #17                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        57: iload_0
        58: invokevirtual #20                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        61: invokevirtual #24                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        64: astore_2
        65: getstatic     #30                 // Field java/lang/System.out:Ljava/io/PrintStream;
        68: aload_2
        69: invokevirtual #36                 // Method java/io/PrintStream.print:(Ljava/lang/Object;)V
        72: return
      LineNumberTable:
        line 4: 0
        line 6: 2
        line 7: 22
        line 9: 29
        line 11: 31
        line 12: 65
        line 13: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           65       8     2    s2   Ljava/lang/String;
           22      51     1    s1   Ljava/lang/String;
            2      71     0     a   I
}
SourceFile: "StringInterpolation.kt"
SourceDebugExtension:
  SMAP
  StringInterpolation.kt
  Kotlin
  *S Kotlin
  *F
  + 1 StringInterpolation.kt
  org/nirvana/kotlin/StringInterpolationKt
  *L
  1#1,14:1
  *E
RuntimeVisibleAnnotations:
  0: #54(#55=[I#56,I#56,I#57],#58=[I#56,I#59,I#60],#61=I#62,#63=[s#64],#65=[s#5,s#66,s#67])
```