```
package org.nirvana.scala

object SingletonCode {

  private var counter = 0

  def create(): Int = {
    counter += 1
    counter
  }
}


```

```
Classfile /Users/zhongcheng/workingcopy/jvm-bytecode-insight/target/classes/org/nirvana/scala/SingletonCode.class
  Last modified Feb 13, 2019; size 688 bytes
  MD5 checksum d5bf8b2e04734cbfe7445e508fac62ce
  Compiled from "SingletonCode.scala"
public final class org.nirvana.scala.SingletonCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/scala/SingletonCode
   #2 = Class              #1             // org/nirvana/scala/SingletonCode
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               SingletonCode.scala
   #6 = Utf8               Lscala/reflect/ScalaSignature;
   #7 = Utf8               bytes
   #8 = Utf8               %:Qa\t=1Q!\tIAQGeAqAGA%1C I\t\r\n)9\")5N\4mKR|gnQ8eK*BCg
                                                                                   G.1\tqA\5smtMC\ry'oZ!\t!D\t5N\4mKR|gnQ8eKNa\t)Yi!%q#:L(+4\rqJg.?)yaB2pk:$XM]
                        9AA#H=U1!8u-w.8uKJ|F%Z9\"C
                                                  #\tSCV]&bB\rHq\nC2pk:$XM\r\rX-;f)a
   #9 = Utf8               create
  #10 = Utf8               ()I
  #11 = Utf8               org/nirvana/scala/SingletonCode$
  #12 = Class              #11            // org/nirvana/scala/SingletonCode$
  #13 = Utf8               MODULE$
  #14 = Utf8               Lorg/nirvana/scala/SingletonCode$;
  #15 = NameAndType        #13:#14        // MODULE$:Lorg/nirvana/scala/SingletonCode$;
  #16 = Fieldref           #12.#15        // org/nirvana/scala/SingletonCode$.MODULE$:Lorg/nirvana/scala/SingletonCode$;
  #17 = NameAndType        #9:#10         // create:()I
  #18 = Methodref          #12.#17        // org/nirvana/scala/SingletonCode$.create:()I
  #19 = Utf8               Code
  #20 = Utf8               SourceFile
  #21 = Utf8               RuntimeVisibleAnnotations
  #22 = Utf8               ScalaSig
{
  public static int create();
    descriptor: ()I
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field org/nirvana/scala/SingletonCode$.MODULE$:Lorg/nirvana/scala/SingletonCode$;
         3: invokevirtual #18                 // Method org/nirvana/scala/SingletonCode$.create:()I
         6: ireturn
}
SourceFile: "SingletonCode.scala"
RuntimeVisibleAnnotations:
  0: #6(#7=s#8)
Error: unknown attribute
  ScalaSig: length = 0x3
   05 00 00
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-bytecode-insight/target/classes/org/nirvana/scala/SingletonCode$.class
  Last modified Feb 13, 2019; size 791 bytes
  MD5 checksum 23d82e51af94c2bcd1ee4270d01a1bc7
  Compiled from "SingletonCode.scala"
public final class org.nirvana.scala.SingletonCode$
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/scala/SingletonCode$
   #2 = Class              #1             // org/nirvana/scala/SingletonCode$
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               SingletonCode.scala
   #6 = Utf8               MODULE$
   #7 = Utf8               Lorg/nirvana/scala/SingletonCode$;
   #8 = Utf8               counter
   #9 = Utf8               I
  #10 = Utf8               <clinit>
  #11 = Utf8               ()V
  #12 = Utf8               <init>
  #13 = NameAndType        #12:#11        // "<init>":()V
  #14 = Methodref          #2.#13         // org/nirvana/scala/SingletonCode$."<init>":()V
  #15 = Utf8               ()I
  #16 = NameAndType        #8:#9          // counter:I
  #17 = Fieldref           #2.#16         // org/nirvana/scala/SingletonCode$.counter:I
  #18 = Utf8               this
  #19 = Utf8               counter_$eq
  #20 = Utf8               (I)V
  #21 = Utf8               x$1
  #22 = Utf8               create
  #23 = NameAndType        #8:#15         // counter:()I
  #24 = Methodref          #2.#23         // org/nirvana/scala/SingletonCode$.counter:()I
  #25 = NameAndType        #19:#20        // counter_$eq:(I)V
  #26 = Methodref          #2.#25         // org/nirvana/scala/SingletonCode$.counter_$eq:(I)V
  #27 = Methodref          #4.#13         // java/lang/Object."<init>":()V
  #28 = NameAndType        #6:#7          // MODULE$:Lorg/nirvana/scala/SingletonCode$;
  #29 = Fieldref           #2.#28         // org/nirvana/scala/SingletonCode$.MODULE$:Lorg/nirvana/scala/SingletonCode$;
  #30 = Utf8               Code
  #31 = Utf8               LineNumberTable
  #32 = Utf8               LocalVariableTable
  #33 = Utf8               MethodParameters
  #34 = Utf8               SourceFile
  #35 = Utf8               ScalaInlineInfo
  #36 = Utf8               Scala
{
  public static org.nirvana.scala.SingletonCode$ MODULE$;
    descriptor: Lorg/nirvana/scala/SingletonCode$;
    flags: ACC_PUBLIC, ACC_STATIC

  private int counter;
    descriptor: I
    flags: ACC_PRIVATE

  public static {};
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: new           #2                  // class org/nirvana/scala/SingletonCode$
         3: invokespecial #14                 // Method "<init>":()V
         6: return

  private int counter();
    descriptor: ()I
    flags: ACC_PRIVATE
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field counter:I
         4: ireturn
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/SingletonCode$;

  private void counter_$eq(int);
    descriptor: (I)V
    flags: ACC_PRIVATE
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #17                 // Field counter:I
         5: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lorg/nirvana/scala/SingletonCode$;
            0       6     1   x$1   I
    MethodParameters:
      Name                           Flags
      x$1                            final

  public int create();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokespecial #24                 // Method counter:()I
         5: iconst_1
         6: iadd
         7: invokespecial #26                 // Method counter_$eq:(I)V
        10: aload_0
        11: invokespecial #24                 // Method counter:()I
        14: ireturn
      LineNumberTable:
        line 8: 0
        line 9: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lorg/nirvana/scala/SingletonCode$;

  private org.nirvana.scala.SingletonCode$();
    descriptor: ()V
    flags: ACC_PRIVATE
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #27                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: putstatic     #29                 // Field MODULE$:Lorg/nirvana/scala/SingletonCode$;
         8: aload_0
         9: iconst_0
        10: putfield      #17                 // Field counter:I
        13: return
      LineNumberTable:
        line 11: 0
        line 5: 8
        line 3: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lorg/nirvana/scala/SingletonCode$;
}
SourceFile: "SingletonCode.scala"
Error: unknown attribute
  ScalaInlineInfo: length = 0x18
   01 01 00 04 00 0C 00 0B 01 00 08 00 0F 01 00 13
   00 14 01 00 16 00 0F 01
Error: unknown attribute
  Scala: length = 0x0
```