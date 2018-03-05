```
package org.nirvana.scala

class TupleCode {

  def main(args: Array[String]): Unit = {
    val ingredient = ("Sugar" , 25)

    println(ingredient._1) // Sugar
    println(ingredient._2) // 25

    val (name, quantity) = ingredient
    println(name) // Sugar
    println(quantity) // 25

    val numPairs = List((2, 5), (3, -7), (20, 56))
    for ((a, b) <- numPairs) {
      println (a * b)
    }
  }

}



```

```
Classfile /Users/zhongcheng/workingcopy/jvm-bytecode-insight/target/classes/org/nirvana/scala/TupleCode.class
  Last modified Feb 13, 2019; size 3921 bytes
  MD5 checksum 6b4fd4845ff686a2fc7c83048c8d1196
  Compiled from "TupleCode.scala"
public class org.nirvana.scala.TupleCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/scala/TupleCode
    #2 = Class              #1            // org/nirvana/scala/TupleCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               TupleCode.scala
    #6 = Utf8               Lscala/reflect/ScalaSignature;
    #7 = Utf8               bytes
    #8 = Utf8               )2Aa!)C%!)QC-\tIA+9mK{G-
                                                    \tQa]2bYT!a9L'O^1oC*\t\"ApeaAQbD)\tQ!\t1I\=SK
                                                                                                 aP5oSRtD#A\nQQ\"\t5
                                                                                                                    N
                                                                                                                     /i\"!\r\neq!B+oSRDQaAq\tA!:hgBQ\"H\nyq!!B!seC(\t\tS#5\t1E%1AH]8pizJ!A\\rAX\rZ3g\tAFTiJLgnM9
    #9 = Utf8               java/lang/invoke/MethodHandles$Lookup
   #10 = Class              #9            // java/lang/invoke/MethodHandles$Lookup
   #11 = Utf8               java/lang/invoke/MethodHandles
   #12 = Class              #11           // java/lang/invoke/MethodHandles
   #13 = Utf8               Lookup
   #14 = Utf8               main
   #15 = Utf8               ([Ljava/lang/String;)V
   #16 = Utf8               args
   #17 = Utf8               scala/Tuple2
   #18 = Class              #17           // scala/Tuple2
   #19 = Utf8               Sugar
   #20 = String             #19           // Sugar
   #21 = Utf8               scala/runtime/BoxesRunTime
   #22 = Class              #21           // scala/runtime/BoxesRunTime
   #23 = Utf8               boxToInteger
   #24 = Utf8               (I)Ljava/lang/Integer;
   #25 = NameAndType        #23:#24       // boxToInteger:(I)Ljava/lang/Integer;
   #26 = Methodref          #22.#25       // scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
   #27 = Utf8               <init>
   #28 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
   #29 = NameAndType        #27:#28       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #30 = Methodref          #18.#29       // scala/Tuple2."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #31 = Utf8               scala/Predef$
   #32 = Class              #31           // scala/Predef$
   #33 = Utf8               MODULE$
   #34 = Utf8               Lscala/Predef$;
   #35 = NameAndType        #33:#34       // MODULE$:Lscala/Predef$;
   #36 = Fieldref           #32.#35       // scala/Predef$.MODULE$:Lscala/Predef$;
   #37 = Utf8               _1
   #38 = Utf8               ()Ljava/lang/Object;
   #39 = NameAndType        #37:#38       // _1:()Ljava/lang/Object;
   #40 = Methodref          #18.#39       // scala/Tuple2._1:()Ljava/lang/Object;
   #41 = Utf8               println
   #42 = Utf8               (Ljava/lang/Object;)V
   #43 = NameAndType        #41:#42       // println:(Ljava/lang/Object;)V
   #44 = Methodref          #32.#43       // scala/Predef$.println:(Ljava/lang/Object;)V
   #45 = Utf8               _2$mcI$sp
   #46 = Utf8               ()I
   #47 = NameAndType        #45:#46       // _2$mcI$sp:()I
   #48 = Methodref          #18.#47       // scala/Tuple2._2$mcI$sp:()I
   #49 = Utf8               java/lang/String
   #50 = Class              #49           // java/lang/String
   #51 = Utf8               scala/MatchError
   #52 = Class              #51           // scala/MatchError
   #53 = NameAndType        #27:#42       // "<init>":(Ljava/lang/Object;)V
   #54 = Methodref          #52.#53       // scala/MatchError."<init>":(Ljava/lang/Object;)V
   #55 = Utf8               scala/collection/immutable/$colon$colon
   #56 = Class              #55           // scala/collection/immutable/$colon$colon
   #57 = Utf8               scala/Tuple2$mcII$sp
   #58 = Class              #57           // scala/Tuple2$mcII$sp
   #59 = Utf8               (II)V
   #60 = NameAndType        #27:#59       // "<init>":(II)V
   #61 = Methodref          #58.#60       // scala/Tuple2$mcII$sp."<init>":(II)V
   #62 = Utf8               scala/collection/immutable/Nil$
   #63 = Class              #62           // scala/collection/immutable/Nil$
   #64 = Utf8               Lscala/collection/immutable/Nil$;
   #65 = NameAndType        #33:#64       // MODULE$:Lscala/collection/immutable/Nil$;
   #66 = Fieldref           #63.#65       // scala/collection/immutable/Nil$.MODULE$:Lscala/collection/immutable/Nil$;
   #67 = Utf8               (Ljava/lang/Object;Lscala/collection/immutable/List;)V
   #68 = NameAndType        #27:#67       // "<init>":(Ljava/lang/Object;Lscala/collection/immutable/List;)V
   #69 = Methodref          #56.#68       // scala/collection/immutable/$colon$colon."<init>":(Ljava/lang/Object;Lscala/collection/immutable/List;)V
   #70 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #71 = MethodType         #70           //  (Ljava/lang/Object;)Ljava/lang/Object;
   #72 = Utf8               $anonfun$main$1$adapted
   #73 = Utf8               (Lscala/Tuple2;)Ljava/lang/Object;
   #74 = NameAndType        #72:#73       // $anonfun$main$1$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
   #75 = Methodref          #2.#74        // org/nirvana/scala/TupleCode.$anonfun$main$1$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
   #76 = MethodHandle       #6:#75        // invokestatic org/nirvana/scala/TupleCode.$anonfun$main$1$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
   #77 = MethodType         #73           //  (Lscala/Tuple2;)Ljava/lang/Object;
   #78 = Integer            7
   #79 = Integer            1
   #80 = Utf8               scala/Serializable
   #81 = Class              #80           // scala/Serializable
   #82 = Utf8               java/lang/invoke/LambdaMetafactory
   #83 = Class              #82           // java/lang/invoke/LambdaMetafactory
   #84 = Utf8               altMetafactory
   #85 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #86 = NameAndType        #84:#85       // altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #87 = Methodref          #83.#86       // java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #88 = MethodHandle       #6:#87        // invokestatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #89 = Utf8               apply
   #90 = Utf8               ()Lscala/Function1;
   #91 = NameAndType        #89:#90       // apply:()Lscala/Function1;
   #92 = InvokeDynamic      #0:#91        // #0:apply:()Lscala/Function1;
   #93 = Utf8               scala/collection/immutable/List
   #94 = Class              #93           // scala/collection/immutable/List
   #95 = Utf8               withFilter
   #96 = Utf8               (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
   #97 = NameAndType        #95:#96       // withFilter:(Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
   #98 = Methodref          #94.#97       // scala/collection/immutable/List.withFilter:(Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
   #99 = Utf8               $anonfun$main$2$adapted
  #100 = NameAndType        #99:#73       // $anonfun$main$2$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
  #101 = Methodref          #2.#100       // org/nirvana/scala/TupleCode.$anonfun$main$2$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
  #102 = MethodHandle       #6:#101       // invokestatic org/nirvana/scala/TupleCode.$anonfun$main$2$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
  #103 = InvokeDynamic      #1:#91        // #1:apply:()Lscala/Function1;
  #104 = Utf8               scala/collection/generic/FilterMonadic
  #105 = Class              #104          // scala/collection/generic/FilterMonadic
  #106 = Utf8               foreach
  #107 = Utf8               (Lscala/Function1;)V
  #108 = NameAndType        #106:#107     // foreach:(Lscala/Function1;)V
  #109 = InterfaceMethodref #105.#108     // scala/collection/generic/FilterMonadic.foreach:(Lscala/Function1;)V
  #110 = Utf8               name
  #111 = Utf8               Ljava/lang/String;
  #112 = Utf8               quantity
  #113 = Utf8               I
  #114 = Utf8               ingredient
  #115 = Utf8               Lscala/Tuple2;
  #116 = Utf8               numPairs
  #117 = Utf8               Lscala/collection/immutable/List;
  #118 = Utf8               this
  #119 = Utf8               Lorg/nirvana/scala/TupleCode;
  #120 = Utf8               [Ljava/lang/String;
  #121 = Class              #120          // "[Ljava/lang/String;"
  #122 = Utf8               $anonfun$main$1
  #123 = Utf8               (Lscala/Tuple2;)Z
  #124 = Utf8               check$ifrefutable$1
  #125 = Utf8               $anonfun$main$2
  #126 = Utf8               (Lscala/Tuple2;)V
  #127 = Utf8               x$2
  #128 = Utf8               _1$mcI$sp
  #129 = NameAndType        #128:#46      // _1$mcI$sp:()I
  #130 = Methodref          #18.#129      // scala/Tuple2._1$mcI$sp:()I
  #131 = Utf8               scala/runtime/BoxedUnit
  #132 = Class              #131          // scala/runtime/BoxedUnit
  #133 = Utf8               UNIT
  #134 = Utf8               Lscala/runtime/BoxedUnit;
  #135 = NameAndType        #133:#134     // UNIT:Lscala/runtime/BoxedUnit;
  #136 = Fieldref           #132.#135     // scala/runtime/BoxedUnit.UNIT:Lscala/runtime/BoxedUnit;
  #137 = Utf8               a
  #138 = Utf8               b
  #139 = Utf8               ()V
  #140 = NameAndType        #27:#139      // "<init>":()V
  #141 = Methodref          #4.#140       // java/lang/Object."<init>":()V
  #142 = NameAndType        #122:#123     // $anonfun$main$1:(Lscala/Tuple2;)Z
  #143 = Methodref          #2.#142       // org/nirvana/scala/TupleCode.$anonfun$main$1:(Lscala/Tuple2;)Z
  #144 = Utf8               boxToBoolean
  #145 = Utf8               (Z)Ljava/lang/Boolean;
  #146 = NameAndType        #144:#145     // boxToBoolean:(Z)Ljava/lang/Boolean;
  #147 = Methodref          #22.#146      // scala/runtime/BoxesRunTime.boxToBoolean:(Z)Ljava/lang/Boolean;
  #148 = NameAndType        #125:#126     // $anonfun$main$2:(Lscala/Tuple2;)V
  #149 = Methodref          #2.#148       // org/nirvana/scala/TupleCode.$anonfun$main$2:(Lscala/Tuple2;)V
  #150 = Utf8               $deserializeLambda$
  #151 = Utf8               (Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #152 = Utf8               scala/runtime/LambdaDeserialize
  #153 = Class              #152          // scala/runtime/LambdaDeserialize
  #154 = Utf8               bootstrap
  #155 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #156 = NameAndType        #154:#155     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #157 = Methodref          #153.#156     // scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #158 = MethodHandle       #6:#157       // invokestatic scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #159 = Utf8               lambdaDeserialize
  #160 = NameAndType        #159:#151     // lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #161 = InvokeDynamic      #2:#160       // #2:lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #162 = Utf8               Code
  #163 = Utf8               StackMapTable
  #164 = Utf8               LineNumberTable
  #165 = Utf8               LocalVariableTable
  #166 = Utf8               MethodParameters
  #167 = Utf8               InnerClasses
  #168 = Utf8               SourceFile
  #169 = Utf8               RuntimeVisibleAnnotations
  #170 = Utf8               BootstrapMethods
  #171 = Utf8               ScalaInlineInfo
  #172 = Utf8               ScalaSig
{
  public void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC
    Code:
      stack=12, locals=11, args_size=2
         0: new           #18                 // class scala/Tuple2
         3: dup
         4: ldc           #20                 // String Sugar
         6: bipush        25
         8: invokestatic  #26                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
        11: invokespecial #30                 // Method scala/Tuple2."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
        14: astore_3
        15: getstatic     #36                 // Field scala/Predef$.MODULE$:Lscala/Predef$;
        18: aload_3
        19: invokevirtual #40                 // Method scala/Tuple2._1:()Ljava/lang/Object;
        22: invokevirtual #44                 // Method scala/Predef$.println:(Ljava/lang/Object;)V
        25: getstatic     #36                 // Field scala/Predef$.MODULE$:Lscala/Predef$;
        28: aload_3
        29: invokevirtual #48                 // Method scala/Tuple2._2$mcI$sp:()I
        32: invokestatic  #26                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
        35: invokevirtual #44                 // Method scala/Predef$.println:(Ljava/lang/Object;)V
        38: aload_3
        39: astore        5
        41: aload         5
        43: ifnull        81
        46: aload         5
        48: invokevirtual #40                 // Method scala/Tuple2._1:()Ljava/lang/Object;
        51: checkcast     #50                 // class java/lang/String
        54: astore        6
        56: aload         5
        58: invokevirtual #48                 // Method scala/Tuple2._2$mcI$sp:()I
        61: istore        7
        63: new           #18                 // class scala/Tuple2
        66: dup
        67: aload         6
        69: iload         7
        71: invokestatic  #26                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
        74: invokespecial #30                 // Method scala/Tuple2."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
        77: astore_2
        78: goto          94
        81: goto          84
        84: new           #52                 // class scala/MatchError
        87: dup
        88: aload         5
        90: invokespecial #54                 // Method scala/MatchError."<init>":(Ljava/lang/Object;)V
        93: athrow
        94: aload_2
        95: astore        4
        97: aload         4
        99: invokevirtual #40                 // Method scala/Tuple2._1:()Ljava/lang/Object;
       102: checkcast     #50                 // class java/lang/String
       105: astore        8
       107: aload         4
       109: invokevirtual #48                 // Method scala/Tuple2._2$mcI$sp:()I
       112: istore        9
       114: getstatic     #36                 // Field scala/Predef$.MODULE$:Lscala/Predef$;
       117: aload         8
       119: invokevirtual #44                 // Method scala/Predef$.println:(Ljava/lang/Object;)V
       122: getstatic     #36                 // Field scala/Predef$.MODULE$:Lscala/Predef$;
       125: iload         9
       127: invokestatic  #26                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
       130: invokevirtual #44                 // Method scala/Predef$.println:(Ljava/lang/Object;)V
       133: new           #56                 // class scala/collection/immutable/$colon$colon
       136: dup
       137: new           #58                 // class scala/Tuple2$mcII$sp
       140: dup
       141: iconst_2
       142: iconst_5
       143: invokespecial #61                 // Method scala/Tuple2$mcII$sp."<init>":(II)V
       146: new           #56                 // class scala/collection/immutable/$colon$colon
       149: dup
       150: new           #58                 // class scala/Tuple2$mcII$sp
       153: dup
       154: iconst_3
       155: bipush        -7
       157: invokespecial #61                 // Method scala/Tuple2$mcII$sp."<init>":(II)V
       160: new           #56                 // class scala/collection/immutable/$colon$colon
       163: dup
       164: new           #58                 // class scala/Tuple2$mcII$sp
       167: dup
       168: bipush        20
       170: bipush        56
       172: invokespecial #61                 // Method scala/Tuple2$mcII$sp."<init>":(II)V
       175: getstatic     #66                 // Field scala/collection/immutable/Nil$.MODULE$:Lscala/collection/immutable/Nil$;
       178: invokespecial #69                 // Method scala/collection/immutable/$colon$colon."<init>":(Ljava/lang/Object;Lscala/collection/immutable/List;)V
       181: invokespecial #69                 // Method scala/collection/immutable/$colon$colon."<init>":(Ljava/lang/Object;Lscala/collection/immutable/List;)V
       184: invokespecial #69                 // Method scala/collection/immutable/$colon$colon."<init>":(Ljava/lang/Object;Lscala/collection/immutable/List;)V
       187: astore        10
       189: aload         10
       191: invokedynamic #92,  0             // InvokeDynamic #0:apply:()Lscala/Function1;
       196: invokevirtual #98                 // Method scala/collection/immutable/List.withFilter:(Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
       199: invokedynamic #103,  0            // InvokeDynamic #1:apply:()Lscala/Function1;
       204: invokeinterface #109,  2          // InterfaceMethod scala/collection/generic/FilterMonadic.foreach:(Lscala/Function1;)V
       209: return
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 81
          locals = [ class org/nirvana/scala/TupleCode, class "[Ljava/lang/String;", top, class scala/Tuple2, top, class scala/Tuple2 ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class org/nirvana/scala/TupleCode, class "[Ljava/lang/String;", class scala/Tuple2, class scala/Tuple2, top, class scala/Tuple2, class java/lang/String, int ]
          stack = []
      LineNumberTable:
        line 6: 0
        line 8: 15
        line 9: 25
        line 11: 38
        line 12: 114
        line 13: 122
        line 15: 133
        line 16: 189
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      27     6  name   Ljava/lang/String;
           61      20     7 quantity   I
           14     195     3 ingredient   Lscala/Tuple2;
          105     104     8  name   Ljava/lang/String;
          112      97     9 quantity   I
          187      22    10 numPairs   Lscala/collection/immutable/List;
            0     210     0  this   Lorg/nirvana/scala/TupleCode;
            0     210     1  args   [Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      args                           final

  public static final boolean $anonfun$main$1(scala.Tuple2);
    descriptor: (Lscala/Tuple2;)Z
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: astore_2
         2: aload_2
         3: ifnull        11
         6: iconst_1
         7: istore_1
         8: goto          19
        11: goto          14
        14: iconst_0
        15: istore_1
        16: goto          19
        19: iload_1
        20: ireturn
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 11
          locals = [ top, class scala/Tuple2 ]
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class scala/Tuple2, int, class scala/Tuple2 ]
          stack = []
      LineNumberTable:
        line 16: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0 check$ifrefutable$1   Lscala/Tuple2;
    MethodParameters:
      Name                           Flags
      check$ifrefutable$1            final

  public static final void $anonfun$main$2(scala.Tuple2);
    descriptor: (Lscala/Tuple2;)V
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=3, locals=5, args_size=1
         0: aload_0
         1: astore_2
         2: aload_2
         3: ifnull        37
         6: aload_2
         7: invokevirtual #130                // Method scala/Tuple2._1$mcI$sp:()I
        10: istore_3
        11: aload_2
        12: invokevirtual #48                 // Method scala/Tuple2._2$mcI$sp:()I
        15: istore        4
        17: getstatic     #36                 // Field scala/Predef$.MODULE$:Lscala/Predef$;
        20: iload_3
        21: iload         4
        23: imul
        24: invokestatic  #26                 // Method scala/runtime/BoxesRunTime.boxToInteger:(I)Ljava/lang/Integer;
        27: invokevirtual #44                 // Method scala/Predef$.println:(Ljava/lang/Object;)V
        30: getstatic     #136                // Field scala/runtime/BoxedUnit.UNIT:Lscala/runtime/BoxedUnit;
        33: astore_1
        34: goto          49
        37: goto          40
        40: new           #52                 // class scala/MatchError
        43: dup
        44: aload_2
        45: invokespecial #54                 // Method scala/MatchError."<init>":(Ljava/lang/Object;)V
        48: athrow
        49: return
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ top, class scala/Tuple2 ]
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class scala/Tuple2, class scala/runtime/BoxedUnit, class scala/Tuple2, int, int ]
          stack = []
      LineNumberTable:
        line 16: 0
        line 17: 17
        line 16: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           10      27     3     a   I
           15      22     4     b   I
            0      50     0   x$2   Lscala/Tuple2;
    MethodParameters:
      Name                           Flags
      x$2                            final

  public org.nirvana.scala.TupleCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #141                // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 21: 0
        line 3: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/TupleCode;

  public static final java.lang.Object $anonfun$main$1$adapted(scala.Tuple2);
    descriptor: (Lscala/Tuple2;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #143                // Method $anonfun$main$1:(Lscala/Tuple2;)Z
         4: invokestatic  #147                // Method scala/runtime/BoxesRunTime.boxToBoolean:(Z)Ljava/lang/Boolean;
         7: areturn
      LineNumberTable:
        line 16: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0 check$ifrefutable$1   Lscala/Tuple2;
    MethodParameters:
      Name                           Flags
      check$ifrefutable$1            final

  public static final java.lang.Object $anonfun$main$2$adapted(scala.Tuple2);
    descriptor: (Lscala/Tuple2;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #149                // Method $anonfun$main$2:(Lscala/Tuple2;)V
         4: getstatic     #136                // Field scala/runtime/BoxedUnit.UNIT:Lscala/runtime/BoxedUnit;
         7: areturn
      LineNumberTable:
        line 16: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0   x$2   Lscala/Tuple2;
    MethodParameters:
      Name                           Flags
      x$2                            final

  private static java.lang.Object $deserializeLambda$(java.lang.invoke.SerializedLambda);
    descriptor: (Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #161,  0            // InvokeDynamic #2:lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
         6: areturn
}
InnerClasses:
     public static final #13= #10 of #12; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
SourceFile: "TupleCode.scala"
RuntimeVisibleAnnotations:
  0: #6(#7=s#8)
BootstrapMethods:
  0: #88 invokestatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #71 (Ljava/lang/Object;)Ljava/lang/Object;
      #76 invokestatic org/nirvana/scala/TupleCode.$anonfun$main$1$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
      #77 (Lscala/Tuple2;)Ljava/lang/Object;
      #78 7
      #79 1
      #81 scala/Serializable
      #79 1
      #77 (Lscala/Tuple2;)Ljava/lang/Object;
  1: #88 invokestatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #71 (Ljava/lang/Object;)Ljava/lang/Object;
      #102 invokestatic org/nirvana/scala/TupleCode.$anonfun$main$2$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
      #77 (Lscala/Tuple2;)Ljava/lang/Object;
      #78 7
      #79 1
      #81 scala/Serializable
      #79 1
      #77 (Lscala/Tuple2;)Ljava/lang/Object;
  2: #158 invokestatic scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #76 invokestatic org/nirvana/scala/TupleCode.$anonfun$main$1$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
      #102 invokestatic org/nirvana/scala/TupleCode.$anonfun$main$2$adapted:(Lscala/Tuple2;)Ljava/lang/Object;
Error: unknown attribute
  ScalaInlineInfo: length = 0x22
   01 00 00 06 00 48 00 49 01 00 7A 00 7B 01 00 63
   00 49 01 00 7D 00 7E 01 00 1B 00 8B 00 00 0E 00
   0F 00
Error: unknown attribute
  ScalaSig: length = 0x3
   05 00 00
```