```
package org.nirvana.scala

case class CaseClassCode(x: Int, y: Int)

```

```
Classfile /Users/zhongcheng/workingcopy/jvm-bytecode-insight/target/classes/org/nirvana/scala/CaseClassCode.class
  Last modified Feb 13, 2018; size 4719 bytes
  MD5 checksum 97d6c588be53e0e47677f51934c0823c
  Compiled from "CaseClassCode.scala"
public class org.nirvana.scala.CaseClassCode implements scala.Product,scala.Serializable
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/scala/CaseClassCode
    #2 = Class              #1            // org/nirvana/scala/CaseClassCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               scala/Product
    #6 = Class              #5            // scala/Product
    #7 = Utf8               scala/Serializable
    #8 = Class              #7            // scala/Serializable
    #9 = Utf8               CaseClassCode.scala
   #10 = Utf8               Lscala/reflect/ScalaSignature;
   #11 = Utf8               bytes
   #12 = Utf8               }a\rB
                                 %\t!
                                     \tc\t)A]!A!BKQ4\tE\t!/!\"6Q!!AmBqACKEIA \t-!C!\"9Q
                                                                                       AA\nib,%\t;\t\t\"_)!!ADqaCCnI\t8\t=!C!a9!/GAha\rE\tiI!\t[J\t\t\"oa(#!AvD\"!%\t)a\tU!#!A\n]!!D\"bgE.Y:t>$WM)1oY1mC*A$]&h/8bqaA8sO1\"M%\"A\t\rRAGK\ra!8z%4C(\tA3EAQe>$Wo;\tRBA$1VM]5bY&TM7fAX#\tzB$\rIe^q\n!_s\naP5oSRtDc9sAqA3!)A&a]!)!'a]!1m9z)\r1DY\n1/d%AA9\nabY8qs\"WMZ1vYR$'FAU\tqiKC!\t*DE\t)e)Av]DWmY6fI*qiI
                                                                                                                           C:tw^1uS>tBA%EE)hn5fG.,GMV1sSt7-ZG>\n3fM,H35(o3vGR&/4jqV\tQ\nO'6\tqJQ#h1(o3vGRL!V(\rM#(/
                                                                  %/z9(o3vGR,E.Z7f]R$\"W.\tJB.$\r\te9.\t\t1/\rAH%MaJ|G-^2uR,'/;peV\tq
                                                                                                                                     EaGbk!E\n!bY8mYG/[8o\t!MJi\r^8s!M\#rkdGCA4k!\t.jG\t9!i\8mKtbh)iAB3rkd7hc\"9Au_N#(/
                                                                          EAA!D\"bgE.Y:t>$W\r8%M!#^
                                                                                                   YLhF
                                                                                                       ]T!_I,h^5nK&!p\nHO]1di+hn;j_:D#A:
\=YrxC-+aC3+a&Av\=\t\tE1B#AB(qi&|gE#c&C\raV;qYCA\n-\ta$'AsK$'+Z:pYZ,GCAA\r!\rq1D;y%AB(cUG
   #13 = Utf8               x
   #14 = Utf8               I
   #15 = Utf8               y
   #16 = Utf8               unapply
   #17 = Utf8               (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option;
   #18 = Utf8               (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option<Lscala/Tuple2<Ljava/lang/Object;Ljava/lang/Object;>;>;
   #19 = Utf8               x$0
   #20 = Utf8               org/nirvana/scala/CaseClassCode$
   #21 = Class              #20           // org/nirvana/scala/CaseClassCode$
   #22 = Utf8               MODULE$
   #23 = Utf8               Lorg/nirvana/scala/CaseClassCode$;
   #24 = NameAndType        #22:#23       // MODULE$:Lorg/nirvana/scala/CaseClassCode$;
   #25 = Fieldref           #21.#24       // org/nirvana/scala/CaseClassCode$.MODULE$:Lorg/nirvana/scala/CaseClassCode$;
   #26 = NameAndType        #16:#17       // unapply:(Lorg/nirvana/scala/CaseClassCode;)Lscala/Option;
   #27 = Methodref          #21.#26       // org/nirvana/scala/CaseClassCode$.unapply:(Lorg/nirvana/scala/CaseClassCode;)Lscala/Option;
   #28 = Utf8               apply
   #29 = Utf8               (II)Lorg/nirvana/scala/CaseClassCode;
   #30 = NameAndType        #28:#29       // apply:(II)Lorg/nirvana/scala/CaseClassCode;
   #31 = Methodref          #21.#30       // org/nirvana/scala/CaseClassCode$.apply:(II)Lorg/nirvana/scala/CaseClassCode;
   #32 = Utf8               tupled
   #33 = Utf8               ()Lscala/Function1;
   #34 = Utf8               ()Lscala/Function1<Lscala/Tuple2<Ljava/lang/Object;Ljava/lang/Object;>;Lorg/nirvana/scala/CaseClassCode;>;
   #35 = NameAndType        #32:#33       // tupled:()Lscala/Function1;
   #36 = Methodref          #21.#35       // org/nirvana/scala/CaseClassCode$.tupled:()Lscala/Function1;
   #37 = Utf8               curried
   #38 = Utf8               ()Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lorg/nirvana/scala/CaseClassCode;>;>;
   #39 = NameAndType        #37:#33       // curried:()Lscala/Function1;
   #40 = Methodref          #21.#39       // org/nirvana/scala/CaseClassCode$.curried:()Lscala/Function1;
   #41 = Utf8               ()I
   #42 = NameAndType        #13:#14       // x:I
   #43 = Fieldref           #2.#42        // org/nirvana/scala/CaseClassCode.x:I
   #44 = Utf8               this
   #45 = Utf8               Lorg/nirvana/scala/CaseClassCode;
   #46 = NameAndType        #15:#14       // y:I
   #47 = Fieldref           #2.#46        // org/nirvana/scala/CaseClassCode.y:I
   #48 = Utf8               copy
   #49 = Utf8               <init>
   #50 = Utf8               (II)V
   #51 = NameAndType        #49:#50       // "<init>":(II)V
   #52 = Methodref          #2.#51        // org/nirvana/scala/CaseClassCode."<init>":(II)V
   #53 = Utf8               copy$default$1
   #54 = NameAndType        #13:#41       // x:()I
   #55 = Methodref          #2.#54        // org/nirvana/scala/CaseClassCode.x:()I
   #56 = Utf8               copy$default$2
   #57 = NameAndType        #15:#41       // y:()I
   #58 = Methodref          #2.#57        // org/nirvana/scala/CaseClassCode.y:()I
   #59 = Utf8               productPrefix
   #60 = Utf8               ()Ljava/lang/String;
   #61 = Utf8               CaseClassCode
   #62 = String             #61           // CaseClassCode
   #63 = Utf8               productArity
   #64 = Utf8               productElement
   #65 = Utf8               (I)Ljava/lang/Object;
   #66 = Utf8               x$1
   #67 = Utf8               scala/runtime/BoxesRunTime
   #68 = Class              #67           // scala/runtime/BoxesRunTime
   #69 = Utf8               boxToInteger
   #70 = Utf8               (I)Ljava/lang/Integer;
   #71 = NameAndType        #69:#70       // boxToInteger:(I)Ljava/lang/Integer;
   #72 = Methodref          #68.#71       // scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
   #73 = Utf8               java/lang/IndexOutOfBoundsException
   #74 = Class              #73           // java/lang/IndexOutOfBoundsException
   #75 = Utf8               toString
   #76 = NameAndType        #75:#60       // toString:()Ljava/lang/String;
   #77 = Methodref          #4.#76        // java/lang/Object.toString:()Ljava/lang/String;
   #78 = Utf8               (Ljava/lang/String;)V
   #79 = NameAndType        #49:#78       // "<init>":(Ljava/lang/String;)V
   #80 = Methodref          #74.#79       // java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
   #81 = Utf8               java/lang/Integer
   #82 = Class              #81           // java/lang/Integer
   #83 = Utf8               productIterator
   #84 = Utf8               ()Lscala/collection/Iterator;
   #85 = Utf8               ()Lscala/collection/Iterator<Ljava/lang/Object;>;
   #86 = Utf8               scala/runtime/ScalaRunTime$
   #87 = Class              #86           // scala/runtime/ScalaRunTime$
   #88 = Utf8               Lscala/runtime/ScalaRunTime$;
   #89 = NameAndType        #22:#88       // MODULE$:Lscala/runtime/ScalaRunTime$;
   #90 = Fieldref           #87.#89       // scala/runtime/ScalaRunTime$.MODULE$:Lscala/runtime/ScalaRunTime$;
   #91 = Utf8               typedProductIterator
   #92 = Utf8               (Lscala/Product;)Lscala/collection/Iterator;
   #93 = NameAndType        #91:#92       // typedProductIterator:(Lscala/Product;)Lscala/collection/Iterator;
   #94 = Methodref          #87.#93       // scala/runtime/ScalaRunTime$.typedProductIterator:(Lscala/Product;)Lscala/collection/Iterator;
   #95 = Utf8               canEqual
   #96 = Utf8               (Ljava/lang/Object;)Z
   #97 = Utf8               Ljava/lang/Object;
   #98 = Utf8               hashCode
   #99 = Integer            -889275714
  #100 = Utf8               scala/runtime/Statics
  #101 = Class              #100          // scala/runtime/Statics
  #102 = Utf8               mix
  #103 = Utf8               (II)I
  #104 = NameAndType        #102:#103     // mix:(II)I
  #105 = Methodref          #101.#104     // scala/runtime/Statics.mix:(II)I
  #106 = Utf8               finalizeHash
  #107 = NameAndType        #106:#103     // finalizeHash:(II)I
  #108 = Methodref          #101.#107     // scala/runtime/Statics.finalizeHash:(II)I
  #109 = Utf8               _toString
  #110 = Utf8               (Lscala/Product;)Ljava/lang/String;
  #111 = NameAndType        #109:#110     // _toString:(Lscala/Product;)Ljava/lang/String;
  #112 = Methodref          #87.#111      // scala/runtime/ScalaRunTime$._toString:(Lscala/Product;)Ljava/lang/String;
  #113 = Utf8               equals
  #114 = NameAndType        #95:#96       // canEqual:(Ljava/lang/Object;)Z
  #115 = Methodref          #2.#114       // org/nirvana/scala/CaseClassCode.canEqual:(Ljava/lang/Object;)Z
  #116 = Utf8               ()V
  #117 = NameAndType        #49:#116      // "<init>":()V
  #118 = Methodref          #4.#117       // java/lang/Object."<init>":()V
  #119 = Utf8               $init$
  #120 = Utf8               (Lscala/Product;)V
  #121 = NameAndType        #119:#120     // $init$:(Lscala/Product;)V
  #122 = InterfaceMethodref #6.#121       // scala/Product.$init$:(Lscala/Product;)V
  #123 = Utf8               Code
  #124 = Utf8               Signature
  #125 = Utf8               MethodParameters
  #126 = Utf8               LineNumberTable
  #127 = Utf8               LocalVariableTable
  #128 = Utf8               StackMapTable
  #129 = Utf8               SourceFile
  #130 = Utf8               RuntimeVisibleAnnotations
  #131 = Utf8               ScalaInlineInfo
  #132 = Utf8               ScalaSig
{
  private final int x;
    descriptor: I
    flags: ACC_PRIVATE, ACC_FINAL

  private final int y;
    descriptor: I
    flags: ACC_PRIVATE, ACC_FINAL

  public static scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> unapply(org.nirvana.scala.CaseClassCode);
    descriptor: (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #25                 // Field org/nirvana/scala/CaseClassCode$.MODULE$:Lorg/nirvana/scala/CaseClassCode$;
         3: aload_0
         4: invokevirtual #27                 // Method org/nirvana/scala/CaseClassCode$.unapply:(Lorg/nirvana/scala/CaseClassCode;)Lscala/Option;
         7: areturn
    Signature: #18                          // (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option<Lscala/Tuple2<Ljava/lang/Object;Ljava/lang/Object;>;>;
    MethodParameters:
      Name                           Flags
      x$0                            final

  public static org.nirvana.scala.CaseClassCode apply(int, int);
    descriptor: (II)Lorg/nirvana/scala/CaseClassCode;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=2
         0: getstatic     #25                 // Field org/nirvana/scala/CaseClassCode$.MODULE$:Lorg/nirvana/scala/CaseClassCode$;
         3: iload_0
         4: iload_1
         5: invokevirtual #31                 // Method org/nirvana/scala/CaseClassCode$.apply:(II)Lorg/nirvana/scala/CaseClassCode;
         8: areturn
    MethodParameters:
      Name                           Flags
      x                              final
      y                              final

  public static scala.Function1<scala.Tuple2<java.lang.Object, java.lang.Object>, org.nirvana.scala.CaseClassCode> tupled();
    descriptor: ()Lscala/Function1;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #25                 // Field org/nirvana/scala/CaseClassCode$.MODULE$:Lorg/nirvana/scala/CaseClassCode$;
         3: invokevirtual #36                 // Method org/nirvana/scala/CaseClassCode$.tupled:()Lscala/Function1;
         6: areturn
    Signature: #34                          // ()Lscala/Function1<Lscala/Tuple2<Ljava/lang/Object;Ljava/lang/Object;>;Lorg/nirvana/scala/CaseClassCode;>;

  public static scala.Function1<java.lang.Object, scala.Function1<java.lang.Object, org.nirvana.scala.CaseClassCode>> curried();
    descriptor: ()Lscala/Function1;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #25                 // Field org/nirvana/scala/CaseClassCode$.MODULE$:Lorg/nirvana/scala/CaseClassCode$;
         3: invokevirtual #40                 // Method org/nirvana/scala/CaseClassCode$.curried:()Lscala/Function1;
         6: areturn
    Signature: #38                          // ()Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lorg/nirvana/scala/CaseClassCode;>;>;

  public int x();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #43                 // Field x:I
         4: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/CaseClassCode;

  public int y();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field y:I
         4: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/CaseClassCode;

  public org.nirvana.scala.CaseClassCode copy(int, int);
    descriptor: (II)Lorg/nirvana/scala/CaseClassCode;
    flags: ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: new           #2                  // class org/nirvana/scala/CaseClassCode
         3: dup
         4: iload_1
         5: iload_2
         6: invokespecial #52                 // Method "<init>":(II)V
         9: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lorg/nirvana/scala/CaseClassCode;
            0      10     1     x   I
            0      10     2     y   I
    MethodParameters:
      Name                           Flags
      x                              final
      y                              final

  public int copy$default$1();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #55                 // Method x:()I
         4: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/CaseClassCode;

  public int copy$default$2();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #58                 // Method y:()I
         4: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/CaseClassCode;

  public java.lang.String productPrefix();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #62                 // String CaseClassCode
         2: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lorg/nirvana/scala/CaseClassCode;

  public int productArity();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_2
         1: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lorg/nirvana/scala/CaseClassCode;

  public java.lang.Object productElement(int);
    descriptor: (I)Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: iload_1
         1: istore_2
         2: iload_2
         3: tableswitch   { // 0 to 1
                       0: 24
                       1: 34
                 default: 44
            }
        24: aload_0
        25: invokevirtual #55                 // Method x:()I
        28: invokestatic  #72                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
        31: goto          59
        34: aload_0
        35: invokevirtual #58                 // Method y:()I
        38: invokestatic  #72                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
        41: goto          59
        44: new           #74                 // class java/lang/IndexOutOfBoundsException
        47: dup
        48: iload_1
        49: invokestatic  #72                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
        52: invokevirtual #77                 // Method java/lang/Object.toString:()Ljava/lang/String;
        55: invokespecial #80                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
        58: athrow
        59: areturn
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Integer ]
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lorg/nirvana/scala/CaseClassCode;
            0      60     1   x$1   I
    MethodParameters:
      Name                           Flags
      x$1                            final

  public scala.collection.Iterator<java.lang.Object> productIterator();
    descriptor: ()Lscala/collection/Iterator;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #90                 // Field scala/runtime/ScalaRunTime$.MODULE$:Lscala/runtime/ScalaRunTime$;
         3: aload_0
         4: invokevirtual #94                 // Method scala/runtime/ScalaRunTime$.typedProductIterator:(Lscala/Product;)Lscala/collection/Iterator;
         7: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lorg/nirvana/scala/CaseClassCode;
    Signature: #85                          // ()Lscala/collection/Iterator<Ljava/lang/Object;>;

  public boolean canEqual(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: instanceof    #2                  // class org/nirvana/scala/CaseClassCode
         4: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/CaseClassCode;
            0       5     1   x$1   Ljava/lang/Object;
    MethodParameters:
      Name                           Flags
      x$1                            final

  public int hashCode();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: ldc           #99                 // int -889275714
         2: istore_1
         3: iload_1
         4: aload_0
         5: invokevirtual #55                 // Method x:()I
         8: invokestatic  #105                // Method scala/runtime/Statics.mix:(II)I
        11: istore_1
        12: iload_1
        13: aload_0
        14: invokevirtual #58                 // Method y:()I
        17: invokestatic  #105                // Method scala/runtime/Statics.mix:(II)I
        20: istore_1
        21: iload_1
        22: iconst_2
        23: invokestatic  #108                // Method scala/runtime/Statics.finalizeHash:(II)I
        26: ireturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lorg/nirvana/scala/CaseClassCode;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #90                 // Field scala/runtime/ScalaRunTime$.MODULE$:Lscala/runtime/ScalaRunTime$;
         3: aload_0
         4: invokevirtual #112                // Method scala/runtime/ScalaRunTime$._toString:(Lscala/Product;)Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lorg/nirvana/scala/CaseClassCode;

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: aload_1
         2: if_acmpeq     78
         5: aload_1
         6: astore_3
         7: aload_3
         8: instanceof    #2                  // class org/nirvana/scala/CaseClassCode
        11: ifeq          19
        14: iconst_1
        15: istore_2
        16: goto          27
        19: goto          22
        22: iconst_0
        23: istore_2
        24: goto          27
        27: iload_2
        28: ifeq          82
        31: aload_1
        32: checkcast     #2                  // class org/nirvana/scala/CaseClassCode
        35: astore        4
        37: aload_0
        38: invokevirtual #55                 // Method x:()I
        41: aload         4
        43: invokevirtual #55                 // Method x:()I
        46: if_icmpne     74
        49: aload_0
        50: invokevirtual #58                 // Method y:()I
        53: aload         4
        55: invokevirtual #58                 // Method y:()I
        58: if_icmpne     74
        61: aload         4
        63: aload_0
        64: invokevirtual #115                // Method canEqual:(Ljava/lang/Object;)Z
        67: ifeq          74
        70: iconst_1
        71: goto          75
        74: iconst_0
        75: ifeq          82
        78: iconst_1
        79: goto          83
        82: iconst_0
        83: ireturn
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ top, class java/lang/Object ]
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class org/nirvana/scala/CaseClassCode, class java/lang/Object, int, class java/lang/Object ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ class org/nirvana/scala/CaseClassCode ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 2
        frame_type = 253 /* append */
          offset_delta = 3
          locals = [ int, class java/lang/Object ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class org/nirvana/scala/CaseClassCode, class java/lang/Object ]
          stack = [ int ]
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lorg/nirvana/scala/CaseClassCode;
            0      84     1   x$1   Ljava/lang/Object;
    MethodParameters:
      Name                           Flags
      x$1                            final

  public org.nirvana.scala.CaseClassCode(int, int);
    descriptor: (II)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #43                 // Field x:I
         5: aload_0
         6: iload_2
         7: putfield      #47                 // Field y:I
        10: aload_0
        11: invokespecial #118                // Method java/lang/Object."<init>":()V
        14: aload_0
        15: invokestatic  #122                // InterfaceMethod scala/Product.$init$:(Lscala/Product;)V
        18: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lorg/nirvana/scala/CaseClassCode;
            0      19     1     x   I
            0      19     2     y   I
    MethodParameters:
      Name                           Flags
      x                              final
      y                              final
}
SourceFile: "CaseClassCode.scala"
RuntimeVisibleAnnotations:
  0: #10(#11=s#12)
Error: unknown attribute
  ScalaInlineInfo: length = 0x4A
   01 00 00 0E 00 31 00 32 00 00 5F 00 60 00 00 35
   00 29 00 00 38 00 29 00 00 30 00 1D 00 00 71 00
   60 00 00 62 00 29 00 00 3F 00 29 00 00 40 00 41
   00 00 53 00 54 00 00 3B 00 3C 00 00 4B 00 3C 00
   00 0D 00 29 00 00 0F 00 29 00
Error: unknown attribute
  ScalaSig: length = 0x3
   05 00 00
```


```
Classfile /Users/zhongcheng/workingcopy/jvm-bytecode-insight/target/classes/org/nirvana/scala/CaseClassCode$.class
  Last modified Feb 13, 2018; size 1896 bytes
  MD5 checksum 1a688d87d258d1bf732cc99ec981af26
  Compiled from "CaseClassCode.scala"
public final class org.nirvana.scala.CaseClassCode$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.nirvana.scala.CaseClassCode> implements scala.Serializable
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/scala/CaseClassCode$
   #2 = Class              #1             // org/nirvana/scala/CaseClassCode$
   #3 = Utf8               Lscala/runtime/AbstractFunction2<Ljava/lang/Object;Ljava/lang/Object;Lorg/nirvana/scala/CaseClassCode;>;Lscala/Serializable;
   #4 = Utf8               scala/runtime/AbstractFunction2
   #5 = Class              #4             // scala/runtime/AbstractFunction2
   #6 = Utf8               scala/Serializable
   #7 = Class              #6             // scala/Serializable
   #8 = Utf8               CaseClassCode.scala
   #9 = Utf8               MODULE$
  #10 = Utf8               Lorg/nirvana/scala/CaseClassCode$;
  #11 = Utf8               <clinit>
  #12 = Utf8               ()V
  #13 = Utf8               <init>
  #14 = NameAndType        #13:#12        // "<init>":()V
  #15 = Methodref          #2.#14         // org/nirvana/scala/CaseClassCode$."<init>":()V
  #16 = Utf8               toString
  #17 = Utf8               ()Ljava/lang/String;
  #18 = Utf8               CaseClassCode
  #19 = String             #18            // CaseClassCode
  #20 = Utf8               this
  #21 = Utf8               apply
  #22 = Utf8               (II)Lorg/nirvana/scala/CaseClassCode;
  #23 = Utf8               x
  #24 = Utf8               y
  #25 = Utf8               org/nirvana/scala/CaseClassCode
  #26 = Class              #25            // org/nirvana/scala/CaseClassCode
  #27 = Utf8               (II)V
  #28 = NameAndType        #13:#27        // "<init>":(II)V
  #29 = Methodref          #26.#28        // org/nirvana/scala/CaseClassCode."<init>":(II)V
  #30 = Utf8               I
  #31 = Utf8               unapply
  #32 = Utf8               (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option;
  #33 = Utf8               (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option<Lscala/Tuple2<Ljava/lang/Object;Ljava/lang/Object;>;>;
  #34 = Utf8               x$0
  #35 = Utf8               scala/None$
  #36 = Class              #35            // scala/None$
  #37 = Utf8               Lscala/None$;
  #38 = NameAndType        #9:#37         // MODULE$:Lscala/None$;
  #39 = Fieldref           #36.#38        // scala/None$.MODULE$:Lscala/None$;
  #40 = Utf8               scala/Some
  #41 = Class              #40            // scala/Some
  #42 = Utf8               scala/Tuple2$mcII$sp
  #43 = Class              #42            // scala/Tuple2$mcII$sp
  #44 = Utf8               ()I
  #45 = NameAndType        #23:#44        // x:()I
  #46 = Methodref          #26.#45        // org/nirvana/scala/CaseClassCode.x:()I
  #47 = NameAndType        #24:#44        // y:()I
  #48 = Methodref          #26.#47        // org/nirvana/scala/CaseClassCode.y:()I
  #49 = Methodref          #43.#28        // scala/Tuple2$mcII$sp."<init>":(II)V
  #50 = Utf8               (Ljava/lang/Object;)V
  #51 = NameAndType        #13:#50        // "<init>":(Ljava/lang/Object;)V
  #52 = Methodref          #41.#51        // scala/Some."<init>":(Ljava/lang/Object;)V
  #53 = Utf8               Lorg/nirvana/scala/CaseClassCode;
  #54 = Utf8               scala/Option
  #55 = Class              #54            // scala/Option
  #56 = Utf8               readResolve
  #57 = Utf8               ()Ljava/lang/Object;
  #58 = NameAndType        #9:#10         // MODULE$:Lorg/nirvana/scala/CaseClassCode$;
  #59 = Fieldref           #2.#58         // org/nirvana/scala/CaseClassCode$.MODULE$:Lorg/nirvana/scala/CaseClassCode$;
  #60 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #61 = Utf8               v1
  #62 = Utf8               v2
  #63 = Utf8               scala/runtime/BoxesRunTime
  #64 = Class              #63            // scala/runtime/BoxesRunTime
  #65 = Utf8               unboxToInt
  #66 = Utf8               (Ljava/lang/Object;)I
  #67 = NameAndType        #65:#66        // unboxToInt:(Ljava/lang/Object;)I
  #68 = Methodref          #64.#67        // scala/runtime/BoxesRunTime.unboxToInt:(Ljava/lang/Object;)I
  #69 = NameAndType        #21:#22        // apply:(II)Lorg/nirvana/scala/CaseClassCode;
  #70 = Methodref          #2.#69         // org/nirvana/scala/CaseClassCode$.apply:(II)Lorg/nirvana/scala/CaseClassCode;
  #71 = Utf8               Ljava/lang/Object;
  #72 = Methodref          #5.#14         // scala/runtime/AbstractFunction2."<init>":()V
  #73 = Utf8               Code
  #74 = Utf8               LineNumberTable
  #75 = Utf8               LocalVariableTable
  #76 = Utf8               MethodParameters
  #77 = Utf8               StackMapTable
  #78 = Utf8               Signature
  #79 = Utf8               SourceFile
  #80 = Utf8               ScalaInlineInfo
  #81 = Utf8               Scala
{
  public static org.nirvana.scala.CaseClassCode$ MODULE$;
    descriptor: Lorg/nirvana/scala/CaseClassCode$;
    flags: ACC_PUBLIC, ACC_STATIC

  public static {};
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: new           #2                  // class org/nirvana/scala/CaseClassCode$
         3: invokespecial #15                 // Method "<init>":()V
         6: return

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #19                 // String CaseClassCode
         2: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lorg/nirvana/scala/CaseClassCode$;

  public org.nirvana.scala.CaseClassCode apply(int, int);
    descriptor: (II)Lorg/nirvana/scala/CaseClassCode;
    flags: ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: new           #26                 // class org/nirvana/scala/CaseClassCode
         3: dup
         4: iload_1
         5: iload_2
         6: invokespecial #29                 // Method org/nirvana/scala/CaseClassCode."<init>":(II)V
         9: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lorg/nirvana/scala/CaseClassCode$;
            0      10     1     x   I
            0      10     2     y   I
    MethodParameters:
      Name                           Flags
      x                              final
      y                              final

  public scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> unapply(org.nirvana.scala.CaseClassCode);
    descriptor: (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option;
    flags: ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     10
         4: getstatic     #39                 // Field scala/None$.MODULE$:Lscala/None$;
         7: goto          32
        10: new           #41                 // class scala/Some
        13: dup
        14: new           #43                 // class scala/Tuple2$mcII$sp
        17: dup
        18: aload_1
        19: invokevirtual #46                 // Method org/nirvana/scala/CaseClassCode.x:()I
        22: aload_1
        23: invokevirtual #48                 // Method org/nirvana/scala/CaseClassCode.y:()I
        26: invokespecial #49                 // Method scala/Tuple2$mcII$sp."<init>":(II)V
        29: invokespecial #52                 // Method scala/Some."<init>":(Ljava/lang/Object;)V
        32: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 10 /* same */
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ class scala/Option ]
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lorg/nirvana/scala/CaseClassCode$;
            0      33     1   x$0   Lorg/nirvana/scala/CaseClassCode;
    Signature: #33                          // (Lorg/nirvana/scala/CaseClassCode;)Lscala/Option<Lscala/Tuple2<Ljava/lang/Object;Ljava/lang/Object;>;>;
    MethodParameters:
      Name                           Flags
      x$0                            final

  private java.lang.Object readResolve();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PRIVATE
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #59                 // Field MODULE$:Lorg/nirvana/scala/CaseClassCode$;
         3: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lorg/nirvana/scala/CaseClassCode$;

  public java.lang.Object apply(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: invokestatic  #68                 // Method scala/runtime/BoxesRunTime.unboxToInt:(Ljava/lang/Object;)I
         5: aload_2
         6: invokestatic  #68                 // Method scala/runtime/BoxesRunTime.unboxToInt:(Ljava/lang/Object;)I
         9: invokevirtual #70                 // Method apply:(II)Lorg/nirvana/scala/CaseClassCode;
        12: areturn
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lorg/nirvana/scala/CaseClassCode$;
            0      13     1    v1   Ljava/lang/Object;
            0      13     2    v2   Ljava/lang/Object;
    MethodParameters:
      Name                           Flags
      v1                             final
      v2                             final

  private org.nirvana.scala.CaseClassCode$();
    descriptor: ()V
    flags: ACC_PRIVATE
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #72                 // Method scala/runtime/AbstractFunction2."<init>":()V
         4: aload_0
         5: putstatic     #59                 // Field MODULE$:Lorg/nirvana/scala/CaseClassCode$;
         8: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lorg/nirvana/scala/CaseClassCode$;
}
Signature: #3                           // Lscala/runtime/AbstractFunction2<Ljava/lang/Object;Ljava/lang/Object;Lorg/nirvana/scala/CaseClassCode;>;Lscala/Serializable;
SourceFile: "CaseClassCode.scala"
Error: unknown attribute
  ScalaInlineInfo: length = 0x22
   01 01 00 06 00 0D 00 0C 01 00 15 00 16 01 00 15
   00 3C 01 00 38 00 39 01 00 10 00 11 01 00 1F 00
   20 01
Error: unknown attribute
  Scala: length = 0x0

```