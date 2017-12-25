
```
package org.nirvana.kotlin

data class DataClassCode(val name: String = "", val age: Int = 0)
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/DataClassCode.class
  Last modified Feb 13, 2018; size 2761 bytes
  MD5 checksum 08571b3582a23fa6960fdacf38456004
  Compiled from "DataClassCode.kt"
public final class org.nirvana.kotlin.DataClassCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/kotlin/DataClassCode
    #2 = Class              #1            // org/nirvana/kotlin/DataClassCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               name
    #6 = Utf8               Ljava/lang/String;
    #7 = Utf8               Lorg/jetbrains/annotations/NotNull;
    #8 = Utf8               getName
    #9 = Utf8               ()Ljava/lang/String;
   #10 = NameAndType        #5:#6         // name:Ljava/lang/String;
   #11 = Fieldref           #2.#10        // org/nirvana/kotlin/DataClassCode.name:Ljava/lang/String;
   #12 = Utf8               this
   #13 = Utf8               Lorg/nirvana/kotlin/DataClassCode;
   #14 = Utf8               age
   #15 = Utf8               I
   #16 = Utf8               getAge
   #17 = Utf8               ()I
   #18 = NameAndType        #14:#15       // age:I
   #19 = Fieldref           #2.#18        // org/nirvana/kotlin/DataClassCode.age:I
   #20 = Utf8               <init>
   #21 = Utf8               (Ljava/lang/String;I)V
   #22 = String             #5            // name
   #23 = Utf8               kotlin/jvm/internal/Intrinsics
   #24 = Class              #23           // kotlin/jvm/internal/Intrinsics
   #25 = Utf8               checkParameterIsNotNull
   #26 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #27 = NameAndType        #25:#26       // checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #28 = Methodref          #24.#27       // kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #29 = Utf8               ()V
   #30 = NameAndType        #20:#29       // "<init>":()V
   #31 = Methodref          #4.#30        // java/lang/Object."<init>":()V
   #32 = Utf8               (Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #33 = Utf8
   #34 = String             #33           //
   #35 = NameAndType        #20:#21       // "<init>":(Ljava/lang/String;I)V
   #36 = Methodref          #2.#35        // org/nirvana/kotlin/DataClassCode."<init>":(Ljava/lang/String;I)V
   #37 = NameAndType        #20:#32       // "<init>":(Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #38 = Methodref          #2.#37        // org/nirvana/kotlin/DataClassCode."<init>":(Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
   #39 = Utf8               component1
   #40 = Utf8               component2
   #41 = Utf8               copy
   #42 = Utf8               (Ljava/lang/String;I)Lorg/nirvana/kotlin/DataClassCode;
   #43 = Utf8               copy$default
   #44 = Utf8               (Lorg/nirvana/kotlin/DataClassCode;Ljava/lang/String;IILjava/lang/Object;)Lorg/nirvana/kotlin/DataClassCode;
   #45 = NameAndType        #41:#42       // copy:(Ljava/lang/String;I)Lorg/nirvana/kotlin/DataClassCode;
   #46 = Methodref          #2.#45        // org/nirvana/kotlin/DataClassCode.copy:(Ljava/lang/String;I)Lorg/nirvana/kotlin/DataClassCode;
   #47 = Utf8               toString
   #48 = Utf8               java/lang/StringBuilder
   #49 = Class              #48           // java/lang/StringBuilder
   #50 = Methodref          #49.#30       // java/lang/StringBuilder."<init>":()V
   #51 = Utf8               DataClassCode(name=
   #52 = String             #51           // DataClassCode(name=
   #53 = Utf8               append
   #54 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #55 = NameAndType        #53:#54       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #56 = Methodref          #49.#55       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #57 = Utf8               , age=
   #58 = String             #57           // , age=
   #59 = Utf8               (I)Ljava/lang/StringBuilder;
   #60 = NameAndType        #53:#59       // append:(I)Ljava/lang/StringBuilder;
   #61 = Methodref          #49.#60       // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
   #62 = Utf8               )
   #63 = String             #62           // )
   #64 = NameAndType        #47:#9        // toString:()Ljava/lang/String;
   #65 = Methodref          #49.#64       // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #66 = Utf8               hashCode
   #67 = NameAndType        #66:#17       // hashCode:()I
   #68 = Methodref          #4.#67        // java/lang/Object.hashCode:()I
   #69 = Utf8               java/lang/Integer
   #70 = Class              #69           // java/lang/Integer
   #71 = Utf8               (I)I
   #72 = NameAndType        #66:#71       // hashCode:(I)I
   #73 = Methodref          #70.#72       // java/lang/Integer.hashCode:(I)I
   #74 = Utf8               java/lang/String
   #75 = Class              #74           // java/lang/String
   #76 = Utf8               equals
   #77 = Utf8               (Ljava/lang/Object;)Z
   #78 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #79 = Utf8               areEqual
   #80 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #81 = NameAndType        #79:#80       // areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #82 = Methodref          #24.#81       // kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #83 = Utf8               Lkotlin/Metadata;
   #84 = Utf8               mv
   #85 = Integer            1
   #86 = Integer            13
   #87 = Utf8               bv
   #88 = Integer            0
   #89 = Integer            3
   #90 = Utf8               k
   #91 = Utf8               d1
   #92 = Utf8                \n\n\n\n\n\\\t\n
                                             0¢J\t
                                                  0HÆJ\t
                                                        0HÆJ\r0HÆJ00HÖJ\t0HÖJ\t0HÖR0R0\\t\n¨
   #93 = Utf8               d2
   #94 = Utf8               other
   #95 = Utf8               jvm-class-insight
   #96 = Utf8               DataClassCode.kt
   #97 = Utf8               RuntimeInvisibleAnnotations
   #98 = Utf8               Code
   #99 = Utf8               LineNumberTable
  #100 = Utf8               LocalVariableTable
  #101 = Utf8               RuntimeInvisibleParameterAnnotations
  #102 = Utf8               StackMapTable
  #103 = Utf8               SourceFile
  #104 = Utf8               RuntimeVisibleAnnotations
{
  private final java.lang.String name;
    descriptor: Ljava/lang/String;
    flags: ACC_PRIVATE, ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #7()

  private final int age;
    descriptor: I
    flags: ACC_PRIVATE, ACC_FINAL

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #11                 // Field name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/DataClassCode;
    RuntimeInvisibleAnnotations:
      0: #7()

  public final int getAge();
    descriptor: ()I
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field age:I
         4: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/DataClassCode;

  public org.nirvana.kotlin.DataClassCode(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: ldc           #22                 // String name
         3: invokestatic  #28                 // Method kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
         6: aload_0
         7: invokespecial #31                 // Method java/lang/Object."<init>":()V
        10: aload_0
        11: aload_1
        12: putfield      #11                 // Field name:Ljava/lang/String;
        15: aload_0
        16: iload_2
        17: putfield      #19                 // Field age:I
        20: return
      LineNumberTable:
        line 3: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lorg/nirvana/kotlin/DataClassCode;
            0      21     1  name   Ljava/lang/String;
            0      21     2   age   I
    RuntimeInvisibleParameterAnnotations:
      0:
        0: #7()
      1:

  public org.nirvana.kotlin.DataClassCode(java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker);
    descriptor: (Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_1
         2: iand
         3: ifeq          9
         6: ldc           #34                 // String
         8: astore_1
         9: iload_3
        10: iconst_2
        11: iand
        12: ifeq          17
        15: iconst_0
        16: istore_2
        17: aload_0
        18: aload_1
        19: iload_2
        20: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        23: return
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 7 /* same */
      LineNumberTable:
        line 3: 6

  public org.nirvana.kotlin.DataClassCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: aconst_null
         2: iconst_0
         3: iconst_3
         4: aconst_null
         5: invokespecial #38                 // Method "<init>":(Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
         8: return

  public final java.lang.String component1();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #11                 // Field name:Ljava/lang/String;
         4: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/DataClassCode;
    RuntimeInvisibleAnnotations:
      0: #7()

  public final int component2();
    descriptor: ()I
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field age:I
         4: ireturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/DataClassCode;

  public final org.nirvana.kotlin.DataClassCode copy(java.lang.String, int);
    descriptor: (Ljava/lang/String;I)Lorg/nirvana/kotlin/DataClassCode;
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=3
         0: aload_1
         1: ldc           #22                 // String name
         3: invokestatic  #28                 // Method kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
         6: new           #2                  // class org/nirvana/kotlin/DataClassCode
         9: dup
        10: aload_1
        11: iload_2
        12: invokespecial #36                 // Method "<init>":(Ljava/lang/String;I)V
        15: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lorg/nirvana/kotlin/DataClassCode;
            0      16     1  name   Ljava/lang/String;
            0      16     2   age   I
    RuntimeInvisibleAnnotations:
      0: #7()
    RuntimeInvisibleParameterAnnotations:
      0:
        0: #7()
      1:

  public static org.nirvana.kotlin.DataClassCode copy$default(org.nirvana.kotlin.DataClassCode, java.lang.String, int, int, java.lang.Object);
    descriptor: (Lorg/nirvana/kotlin/DataClassCode;Ljava/lang/String;IILjava/lang/Object;)Lorg/nirvana/kotlin/DataClassCode;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=5
         0: iload_3
         1: iconst_1
         2: iand
         3: ifeq          11
         6: aload_0
         7: getfield      #11                 // Field name:Ljava/lang/String;
        10: astore_1
        11: iload_3
        12: iconst_2
        13: iand
        14: ifeq          22
        17: aload_0
        18: getfield      #19                 // Field age:I
        21: istore_2
        22: aload_0
        23: aload_1
        24: iload_2
        25: invokevirtual #46                 // Method copy:(Ljava/lang/String;I)Lorg/nirvana/kotlin/DataClassCode;
        28: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 10 /* same */
    RuntimeInvisibleAnnotations:
      0: #7()

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: new           #49                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #50                 // Method java/lang/StringBuilder."<init>":()V
         7: ldc           #52                 // String DataClassCode(name=
         9: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        12: aload_0
        13: getfield      #11                 // Field name:Ljava/lang/String;
        16: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        19: ldc           #58                 // String , age=
        21: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        24: aload_0
        25: getfield      #19                 // Field age:I
        28: invokevirtual #61                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        31: ldc           #63                 // String )
        33: invokevirtual #56                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        36: invokevirtual #65                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        39: areturn
    RuntimeInvisibleAnnotations:
      0: #7()

  public int hashCode();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #11                 // Field name:Ljava/lang/String;
         4: dup
         5: ifnull        14
         8: invokevirtual #68                 // Method java/lang/Object.hashCode:()I
        11: goto          16
        14: pop
        15: iconst_0
        16: bipush        31
        18: imul
        19: aload_0
        20: getfield      #19                 // Field age:I
        23: invokestatic  #73                 // Method java/lang/Integer.hashCode:(I)I
        26: iadd
        27: ireturn
      StackMapTable: number_of_entries = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpeq     50
         5: aload_1
         6: instanceof    #2                  // class org/nirvana/kotlin/DataClassCode
         9: ifeq          52
        12: aload_1
        13: checkcast     #2                  // class org/nirvana/kotlin/DataClassCode
        16: astore_2
        17: aload_0
        18: getfield      #11                 // Field name:Ljava/lang/String;
        21: aload_2
        22: getfield      #11                 // Field name:Ljava/lang/String;
        25: invokestatic  #82                 // Method kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        28: ifeq          52
        31: aload_0
        32: getfield      #19                 // Field age:I
        35: aload_2
        36: getfield      #19                 // Field age:I
        39: if_icmpne     46
        42: iconst_1
        43: goto          47
        46: iconst_0
        47: ifeq          52
        50: iconst_1
        51: ireturn
        52: iconst_0
        53: ireturn
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class org/nirvana/kotlin/DataClassCode ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 1 /* same */
    RuntimeInvisibleParameterAnnotations:
      0:
        0: #78()
}
SourceFile: "DataClassCode.kt"
RuntimeVisibleAnnotations:
  0: #83(#84=[I#85,I#85,I#86],#87=[I#85,I#88,I#89],#90=I#85,#91=[s#92],#93=[s#13,s#33,s#5,s#33,s#14,s#33,s#21,s#16,s#17,s#8,s#9,s#39,s#40,s#41,s#76,s#33,s#94,s#66,s#47,s#95])
```