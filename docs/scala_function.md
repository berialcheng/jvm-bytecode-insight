```
package org.nirvana.scala

class FunctionCode {

  //Functions that accept functions
  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  //Functions that return functions
  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

}


```

```
Classfile /Users/zhongcheng/workingcopy/jvm-bytecode-insight/target/classes/org/nirvana/scala/FunctionCode.class
  Last modified Feb 13, 2018; size 3601 bytes
  MD5 checksum ba5585b87e04978e169cc7be9640cafc
  Compiled from "FunctionCode.scala"
public class org.nirvana.scala.FunctionCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/scala/FunctionCode
    #2 = Class              #1            // org/nirvana/scala/FunctionCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               FunctionCode.scala
    #6 = Utf8               Lscala/reflect/ScalaSignature;
    #7 = Utf8               bytes
    #8 = Utf8               \t3AB!)!C'!)aC/!)aC_\taa)8di&|gnQ8eK*aaBg
                                                                     G.%\tqA\5smtMC
                                                                                   \ry'oZ'\tQ!5\tqBC\t\trBB]fVMZy%t Q\"!\t:p[>$n8a9ECr!AGmqR\"
       uYAs_>$h(C\ts\"AqC\mZ3\n\t#'jgRT!9)B!u.2mK\")Fa1A1/7be&,7C+1&A\tqe>lw^5p]+hn;j_:BA%I%Qf\n\rVt7\r^5p]F\n!\":mVLGZ3s)\r\tE4gMe=BR;oGRLwNQBdBAh\t9tC=Q(Atg2\"A \n}z!a\"p_2,M\raM
           OC6,                              I>l-
    #9 = Utf8               java/lang/invoke/MethodHandles$Lookup
   #10 = Class              #9            // java/lang/invoke/MethodHandles$Lookup
   #11 = Utf8               java/lang/invoke/MethodHandles
   #12 = Class              #11           // java/lang/invoke/MethodHandles
   #13 = Utf8               Lookup
   #14 = Utf8               promotion
   #15 = Utf8               (Lscala/collection/immutable/List;Lscala/Function1;)Lscala/collection/immutable/List;
   #16 = Utf8               (Lscala/collection/immutable/List<Ljava/lang/Object;>;Lscala/Function1<Ljava/lang/Object;Ljava/lang/Object;>;)Lscala/collection/immutable/List<Ljava/lang/Object;>;
   #17 = Utf8               salaries
   #18 = Utf8               promotionFunction
   #19 = Utf8               scala/collection/immutable/List$
   #20 = Class              #19           // scala/collection/immutable/List$
   #21 = Utf8               MODULE$
   #22 = Utf8               Lscala/collection/immutable/List$;
   #23 = NameAndType        #21:#22       // MODULE$:Lscala/collection/immutable/List$;
   #24 = Fieldref           #20.#23       // scala/collection/immutable/List$.MODULE$:Lscala/collection/immutable/List$;
   #25 = Utf8               canBuildFrom
   #26 = Utf8               ()Lscala/collection/generic/CanBuildFrom;
   #27 = NameAndType        #25:#26       // canBuildFrom:()Lscala/collection/generic/CanBuildFrom;
   #28 = Methodref          #20.#27       // scala/collection/immutable/List$.canBuildFrom:()Lscala/collection/generic/CanBuildFrom;
   #29 = Utf8               scala/collection/immutable/List
   #30 = Class              #29           // scala/collection/immutable/List
   #31 = Utf8               map
   #32 = Utf8               (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
   #33 = NameAndType        #31:#32       // map:(Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
   #34 = Methodref          #30.#33       // scala/collection/immutable/List.map:(Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
   #35 = Utf8               this
   #36 = Utf8               Lorg/nirvana/scala/FunctionCode;
   #37 = Utf8               Lscala/collection/immutable/List;
   #38 = Utf8               Lscala/Function1;
   #39 = Utf8               urlBuilder
   #40 = Utf8               (ZLjava/lang/String;)Lscala/Function2;
   #41 = Utf8               (ZLjava/lang/String;)Lscala/Function2<Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;>;
   #42 = Utf8               ssl
   #43 = Utf8               domainName
   #44 = Utf8               https://
   #45 = String             #44           // https://
   #46 = Utf8               http://
   #47 = String             #46           // http://
   #48 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #49 = MethodType         #48           //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #50 = Utf8               $anonfun$urlBuilder$1
   #51 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #52 = NameAndType        #50:#51       // $anonfun$urlBuilder$1:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #53 = Methodref          #2.#52        // org/nirvana/scala/FunctionCode.$anonfun$urlBuilder$1:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #54 = MethodHandle       #6:#53        // invokestatic org/nirvana/scala/FunctionCode.$anonfun$urlBuilder$1:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #55 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #56 = MethodType         #55           //  (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #57 = Integer            7
   #58 = Integer            1
   #59 = Utf8               scala/Serializable
   #60 = Class              #59           // scala/Serializable
   #61 = Utf8               java/lang/invoke/LambdaMetafactory
   #62 = Class              #61           // java/lang/invoke/LambdaMetafactory
   #63 = Utf8               altMetafactory
   #64 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #65 = NameAndType        #63:#64       // altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #66 = Methodref          #62.#65       // java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #67 = MethodHandle       #6:#66        // invokestatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #68 = Utf8               apply
   #69 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Lscala/Function2;
   #70 = NameAndType        #68:#69       // apply:(Ljava/lang/String;Ljava/lang/String;)Lscala/Function2;
   #71 = InvokeDynamic      #0:#70        // #0:apply:(Ljava/lang/String;Ljava/lang/String;)Lscala/Function2;
   #72 = Utf8               schema
   #73 = Utf8               Ljava/lang/String;
   #74 = Utf8               Z
   #75 = Utf8               java/lang/String
   #76 = Class              #75           // java/lang/String
   #77 = Utf8               schema$1
   #78 = Utf8               domainName$1
   #79 = Utf8               endpoint
   #80 = Utf8               query
   #81 = Utf8               java/lang/StringBuilder
   #82 = Class              #81           // java/lang/StringBuilder
   #83 = Integer            2
   #84 = Utf8               <init>
   #85 = Utf8               (I)V
   #86 = NameAndType        #84:#85       // "<init>":(I)V
   #87 = Methodref          #82.#86       // java/lang/StringBuilder."<init>":(I)V
   #88 = Utf8               append
   #89 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #90 = NameAndType        #88:#89       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #91 = Methodref          #82.#90       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #92 = Utf8               /
   #93 = String             #92           // /
   #94 = Utf8               ?
   #95 = String             #94           // ?
   #96 = Utf8               toString
   #97 = Utf8               ()Ljava/lang/String;
   #98 = NameAndType        #96:#97       // toString:()Ljava/lang/String;
   #99 = Methodref          #82.#98       // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #100 = Utf8               ()V
  #101 = NameAndType        #84:#100      // "<init>":()V
  #102 = Methodref          #4.#101       // java/lang/Object."<init>":()V
  #103 = Utf8               $deserializeLambda$
  #104 = Utf8               (Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #105 = Utf8               scala/runtime/LambdaDeserialize
  #106 = Class              #105          // scala/runtime/LambdaDeserialize
  #107 = Utf8               bootstrap
  #108 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #109 = NameAndType        #107:#108     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #110 = Methodref          #106.#109     // scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #111 = MethodHandle       #6:#110       // invokestatic scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
  #112 = Utf8               lambdaDeserialize
  #113 = NameAndType        #112:#104     // lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #114 = InvokeDynamic      #1:#113       // #1:lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
  #115 = Utf8               Code
  #116 = Utf8               LineNumberTable
  #117 = Utf8               LocalVariableTable
  #118 = Utf8               Signature
  #119 = Utf8               MethodParameters
  #120 = Utf8               StackMapTable
  #121 = Utf8               InnerClasses
  #122 = Utf8               SourceFile
  #123 = Utf8               RuntimeVisibleAnnotations
  #124 = Utf8               BootstrapMethods
  #125 = Utf8               ScalaInlineInfo
  #126 = Utf8               ScalaSig
{
  private scala.collection.immutable.List<java.lang.Object> promotion(scala.collection.immutable.List<java.lang.Object>, scala.Function1<java.lang.Object, java.lang.Object>);
    descriptor: (Lscala/collection/immutable/List;Lscala/Function1;)Lscala/collection/immutable/List;
    flags: ACC_PRIVATE
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: aload_2
         2: getstatic     #24                 // Field scala/collection/immutable/List$.MODULE$:Lscala/collection/immutable/List$;
         5: invokevirtual #28                 // Method scala/collection/immutable/List$.canBuildFrom:()Lscala/collection/generic/CanBuildFrom;
         8: invokevirtual #34                 // Method scala/collection/immutable/List.map:(Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
        11: checkcast     #30                 // class scala/collection/immutable/List
        14: areturn
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lorg/nirvana/scala/FunctionCode;
            0      15     1 salaries   Lscala/collection/immutable/List;
            0      15     2 promotionFunction   Lscala/Function1;
    Signature: #16                          // (Lscala/collection/immutable/List<Ljava/lang/Object;>;Lscala/Function1<Ljava/lang/Object;Ljava/lang/Object;>;)Lscala/collection/immutable/List<Ljava/lang/Object;>;
    MethodParameters:
      Name                           Flags
      salaries                       final
      promotionFunction              final

  public scala.Function2<java.lang.String, java.lang.String, java.lang.String> urlBuilder(boolean, java.lang.String);
    descriptor: (ZLjava/lang/String;)Lscala/Function2;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=3
         0: iload_1
         1: ifeq          9
         4: ldc           #45                 // String https://
         6: goto          11
         9: ldc           #47                 // String http://
        11: astore_3
        12: aload_3
        13: aload_2
        14: invokedynamic #71,  0             // InvokeDynamic #0:apply:(Ljava/lang/String;Ljava/lang/String;)Lscala/Function2;
        19: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
      LineNumberTable:
        line 9: 0
        line 10: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11       8     3 schema   Ljava/lang/String;
            0      20     0  this   Lorg/nirvana/scala/FunctionCode;
            0      20     1   ssl   Z
            0      20     2 domainName   Ljava/lang/String;
    Signature: #41                          // (ZLjava/lang/String;)Lscala/Function2<Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;>;
    MethodParameters:
      Name                           Flags
      ssl                            final
      domainName                     final

  public static final java.lang.String $anonfun$urlBuilder$1(java.lang.String, java.lang.String, java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC, ACC_FINAL, ACC_SYNTHETIC
    Code:
      stack=3, locals=4, args_size=4
         0: new           #82                 // class java/lang/StringBuilder
         3: dup
         4: ldc           #83                 // int 2
         6: invokespecial #87                 // Method java/lang/StringBuilder."<init>":(I)V
         9: aload_0
        10: invokevirtual #91                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        13: aload_1
        14: invokevirtual #91                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        17: ldc           #93                 // String /
        19: invokevirtual #91                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        22: aload_2
        23: invokevirtual #91                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        26: ldc           #95                 // String ?
        28: invokevirtual #91                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        31: aload_3
        32: invokevirtual #91                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        35: invokevirtual #99                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        38: areturn
      LineNumberTable:
        line 10: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0 schema$1   Ljava/lang/String;
            0      39     1 domainName$1   Ljava/lang/String;
            0      39     2 endpoint   Ljava/lang/String;
            0      39     3 query   Ljava/lang/String;
    MethodParameters:
      Name                           Flags
      schema$1                       final
      domainName$1                   final
      endpoint                       final
      query                          final

  public org.nirvana.scala.FunctionCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #102                // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 13: 0
        line 3: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/scala/FunctionCode;

  private static java.lang.Object $deserializeLambda$(java.lang.invoke.SerializedLambda);
    descriptor: (Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokedynamic #114,  0            // InvokeDynamic #1:lambdaDeserialize:(Ljava/lang/invoke/SerializedLambda;)Ljava/lang/Object;
         6: areturn
}
InnerClasses:
     public static final #13= #10 of #12; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
SourceFile: "FunctionCode.scala"
RuntimeVisibleAnnotations:
  0: #6(#7=s#8)
BootstrapMethods:
  0: #67 invokestatic java/lang/invoke/LambdaMetafactory.altMetafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #49 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #54 invokestatic org/nirvana/scala/FunctionCode.$anonfun$urlBuilder$1:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      #56 (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      #57 7
      #58 1
      #60 scala/Serializable
      #58 1
      #56 (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  1: #111 invokestatic scala/runtime/LambdaDeserialize.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #54 invokestatic org/nirvana/scala/FunctionCode.$anonfun$urlBuilder$1:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
Error: unknown attribute
  ScalaInlineInfo: length = 0x18
   01 00 00 04 00 32 00 33 01 00 54 00 64 00 00 0E
   00 0F 01 00 27 00 28 00
Error: unknown attribute
  ScalaSig: length = 0x3
   05 00 00
```
