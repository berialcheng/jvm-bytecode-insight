```
package org.nirvana.scala

trait TraitCode {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}



```

```
Classfile /Users/zhongcheng/workingcopy/jvm-bytecode-insight/target/classes/org/nirvana/scala/TraitCode.class
  Last modified Feb 13, 2019; size 1345 bytes
  MD5 checksum 6a1b58b536915275fd9661dd10a54520
  Compiled from "TraitCode.scala"
public interface org.nirvana.scala.TraitCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
Constant pool:
   #1 = Utf8               org/nirvana/scala/TraitCode
   #2 = Class              #1             // org/nirvana/scala/TraitCode
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               TraitCode.scala
   #6 = Utf8               Lscala/reflect/ScalaSignature;
   #7 = Utf8               bytes
   #8 = Utf8               2qa1C!CqCAUeLGoQ8eK*QABg
                                                   G.!\tqA\5smtMC\n\ry'oZ'\tA5\taBC\tbBB]fVMZI%tM\"!
                                                                                                    \nUq!B+oSR
                                                                                                              Qa:fKR$\"a\r\t
                                                                                                                            e\t9
                                                                                                                                W.\t7\truqQ\"
      }QAs_h\t\tc1K]3eKL!a\t\rM#(/
   #9 = Utf8               greet$
  #10 = Utf8               (Lorg/nirvana/scala/TraitCode;Ljava/lang/String;)V
  #11 = Utf8               $this
  #12 = Utf8               name
  #13 = Utf8               greet
  #14 = Utf8               (Ljava/lang/String;)V
  #15 = NameAndType        #13:#14        // greet:(Ljava/lang/String;)V
  #16 = InterfaceMethodref #2.#15         // org/nirvana/scala/TraitCode.greet:(Ljava/lang/String;)V
  #17 = Utf8               Lorg/nirvana/scala/TraitCode;
  #18 = Utf8               Ljava/lang/String;
  #19 = Utf8               scala/Predef$
  #20 = Class              #19            // scala/Predef$
  #21 = Utf8               MODULE$
  #22 = Utf8               Lscala/Predef$;
  #23 = NameAndType        #21:#22        // MODULE$:Lscala/Predef$;
  #24 = Fieldref           #20.#23        // scala/Predef$.MODULE$:Lscala/Predef$;
  #25 = Utf8               java/lang/StringBuilder
  #26 = Class              #25            // java/lang/StringBuilder
  #27 = Integer            8
  #28 = Utf8               <init>
  #29 = Utf8               (I)V
  #30 = NameAndType        #28:#29        // "<init>":(I)V
  #31 = Methodref          #26.#30        // java/lang/StringBuilder."<init>":(I)V
  #32 = Utf8               Hello,
  #33 = String             #32            // Hello,
  #34 = Utf8               append
  #35 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #36 = NameAndType        #34:#35        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #37 = Methodref          #26.#36        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #38 = Utf8               !
  #39 = String             #38            // !
  #40 = Utf8               toString
  #41 = Utf8               ()Ljava/lang/String;
  #42 = NameAndType        #40:#41        // toString:()Ljava/lang/String;
  #43 = Methodref          #26.#42        // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #44 = Utf8               println
  #45 = Utf8               (Ljava/lang/Object;)V
  #46 = NameAndType        #44:#45        // println:(Ljava/lang/Object;)V
  #47 = Methodref          #20.#46        // scala/Predef$.println:(Ljava/lang/Object;)V
  #48 = Utf8               this
  #49 = Utf8               $init$
  #50 = Utf8               (Lorg/nirvana/scala/TraitCode;)V
  #51 = Utf8               Code
  #52 = Utf8               LineNumberTable
  #53 = Utf8               LocalVariableTable
  #54 = Utf8               MethodParameters
  #55 = Utf8               SourceFile
  #56 = Utf8               RuntimeVisibleAnnotations
  #57 = Utf8               ScalaInlineInfo
  #58 = Utf8               ScalaSig
{
  public static void greet$(org.nirvana.scala.TraitCode, java.lang.String);
    descriptor: (Lorg/nirvana/scala/TraitCode;Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #16                 // InterfaceMethod greet:(Ljava/lang/String;)V
         5: return
      LineNumberTable:
        line 4: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0 $this   Lorg/nirvana/scala/TraitCode;
            0       6     1  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      $this                          final synthetic
      name                           final

  public void greet(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: getstatic     #24                 // Field scala/Predef$.MODULE$:Lscala/Predef$;
         3: new           #26                 // class java/lang/StringBuilder
         6: dup
         7: ldc           #27                 // int 8
         9: invokespecial #31                 // Method java/lang/StringBuilder."<init>":(I)V
        12: ldc           #33                 // String Hello,
        14: invokevirtual #37                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        17: aload_1
        18: invokevirtual #37                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        21: ldc           #39                 // String !
        23: invokevirtual #37                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        26: invokevirtual #43                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        29: invokevirtual #47                 // Method scala/Predef$.println:(Ljava/lang/Object;)V
        32: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lorg/nirvana/scala/TraitCode;
            0      33     1  name   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      name                           final

  public static void $init$(org.nirvana.scala.TraitCode);
    descriptor: (Lorg/nirvana/scala/TraitCode;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0 $this   Lorg/nirvana/scala/TraitCode;
    MethodParameters:
      Name                           Flags
      $this                          final synthetic
}
SourceFile: "TraitCode.scala"
RuntimeVisibleAnnotations:
  0: #6(#7=s#8)
Error: unknown attribute
  ScalaInlineInfo: length = 0x13
   01 00 00 03 00 31 00 32 01 00 09 00 0A 01 00 0D
   00 0E 00
Error: unknown attribute
  ScalaSig: length = 0x3
   05 00 00
```