
```
package org.nirvana.java;

import java.util.Arrays;

public class LambdaCode {

    static int clz_field = 1;

    public static void main(String[] args) {
        Arrays.asList( "a", "b", "c", "d")
            .forEach(e -> {
                clz_field++;
                System.out.println(e + clz_field);
            });

        Arrays.asList( "e", "f", "g", "h")
            .stream().map(String::toUpperCase);

        CustomAction<String> a = m -> m.toUpperCase();
        a.apply("t");
    }

    interface CustomAction<T> {
        void apply(T m);
    }
}

```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/java/LambdaCode$CustomAction.class
  Last modified Feb 13, 2018; size 330 bytes
  MD5 checksum 3d45f4ceede488aa1606e51321d93e21
  Compiled from "LambdaCode.java"
interface org.nirvana.java.LambdaCode$CustomAction<T extends java.lang.Object>
  minor version: 0
  major version: 52
  flags: ACC_INTERFACE, ACC_ABSTRACT
Constant pool:
   #1 = Class              #2             // org/nirvana/java/LambdaCode$CustomAction
   #2 = Utf8               org/nirvana/java/LambdaCode$CustomAction
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               apply
   #6 = Utf8               (Ljava/lang/Object;)V
   #7 = Utf8               Signature
   #8 = Utf8               (TT;)V
   #9 = Utf8               SourceFile
  #10 = Utf8               LambdaCode.java
  #11 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;
  #12 = Utf8               InnerClasses
  #13 = Class              #14            // org/nirvana/java/LambdaCode
  #14 = Utf8               org/nirvana/java/LambdaCode
  #15 = Utf8               CustomAction
{
  public abstract void apply(T);
    descriptor: (Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_ABSTRACT
    Signature: #8                           // (TT;)V
}
SourceFile: "LambdaCode.java"
Signature: #11                          // <T:Ljava/lang/Object;>Ljava/lang/Object;
InnerClasses:
     static #15= #1 of #13; //CustomAction=class org/nirvana/java/LambdaCode$CustomAction of class org/nirvana/java/LambdaCode
 zhongcheng@Pyramid  ~/workingcopy/jvm-class-insight  javap -v -p target.classes.org.nirvana.java.LambdaCode
Warning: Binary file target.classes.org.nirvana.java.LambdaCode contains org.nirvana.java.LambdaCode
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/java/LambdaCode.class
  Last modified Feb 13, 2018; size 2582 bytes
  MD5 checksum 61413c9cdf79674ddaebb6a9cad6735a
  Compiled from "LambdaCode.java"
public class org.nirvana.java.LambdaCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Class              #2            // org/nirvana/java/LambdaCode
    #2 = Utf8               org/nirvana/java/LambdaCode
    #3 = Class              #4            // java/lang/Object
    #4 = Utf8               java/lang/Object
    #5 = Utf8               clz_field
    #6 = Utf8               I
    #7 = Utf8               <clinit>
    #8 = Utf8               ()V
    #9 = Utf8               Code
   #10 = Fieldref           #1.#11        // org/nirvana/java/LambdaCode.clz_field:I
   #11 = NameAndType        #5:#6         // clz_field:I
   #12 = Utf8               LineNumberTable
   #13 = Utf8               LocalVariableTable
   #14 = Utf8               <init>
   #15 = Methodref          #3.#16        // java/lang/Object."<init>":()V
   #16 = NameAndType        #14:#8        // "<init>":()V
   #17 = Utf8               this
   #18 = Utf8               Lorg/nirvana/java/LambdaCode;
   #19 = Utf8               main
   #20 = Utf8               ([Ljava/lang/String;)V
   #21 = Class              #22           // java/lang/String
   #22 = Utf8               java/lang/String
   #23 = String             #24           // a
   #24 = Utf8               a
   #25 = String             #26           // b
   #26 = Utf8               b
   #27 = String             #28           // c
   #28 = Utf8               c
   #29 = String             #30           // d
   #30 = Utf8               d
   #31 = Methodref          #32.#34       // java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
   #32 = Class              #33           // java/util/Arrays
   #33 = Utf8               java/util/Arrays
   #34 = NameAndType        #35:#36       // asList:([Ljava/lang/Object;)Ljava/util/List;
   #35 = Utf8               asList
   #36 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #37 = InvokeDynamic      #0:#38        // #0:accept:()Ljava/util/function/Consumer;
   #38 = NameAndType        #39:#40       // accept:()Ljava/util/function/Consumer;
   #39 = Utf8               accept
   #40 = Utf8               ()Ljava/util/function/Consumer;
   #41 = InterfaceMethodref #42.#44       // java/util/List.forEach:(Ljava/util/function/Consumer;)V
   #42 = Class              #43           // java/util/List
   #43 = Utf8               java/util/List
   #44 = NameAndType        #45:#46       // forEach:(Ljava/util/function/Consumer;)V
   #45 = Utf8               forEach
   #46 = Utf8               (Ljava/util/function/Consumer;)V
   #47 = String             #48           // e
   #48 = Utf8               e
   #49 = String             #50           // f
   #50 = Utf8               f
   #51 = String             #52           // g
   #52 = Utf8               g
   #53 = String             #54           // h
   #54 = Utf8               h
   #55 = InterfaceMethodref #42.#56       // java/util/List.stream:()Ljava/util/stream/Stream;
   #56 = NameAndType        #57:#58       // stream:()Ljava/util/stream/Stream;
   #57 = Utf8               stream
   #58 = Utf8               ()Ljava/util/stream/Stream;
   #59 = InvokeDynamic      #1:#60        // #1:apply:()Ljava/util/function/Function;
   #60 = NameAndType        #61:#62       // apply:()Ljava/util/function/Function;
   #61 = Utf8               apply
   #62 = Utf8               ()Ljava/util/function/Function;
   #63 = InterfaceMethodref #64.#66       // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #64 = Class              #65           // java/util/stream/Stream
   #65 = Utf8               java/util/stream/Stream
   #66 = NameAndType        #67:#68       // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #67 = Utf8               map
   #68 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
   #69 = InvokeDynamic      #2:#70        // #2:apply:()Lorg/nirvana/java/LambdaCode$CustomAction;
   #70 = NameAndType        #61:#71       // apply:()Lorg/nirvana/java/LambdaCode$CustomAction;
   #71 = Utf8               ()Lorg/nirvana/java/LambdaCode$CustomAction;
   #72 = String             #73           // t
   #73 = Utf8               t
   #74 = InterfaceMethodref #75.#77       // org/nirvana/java/LambdaCode$CustomAction.apply:(Ljava/lang/Object;)V
   #75 = Class              #76           // org/nirvana/java/LambdaCode$CustomAction
   #76 = Utf8               org/nirvana/java/LambdaCode$CustomAction
   #77 = NameAndType        #61:#78       // apply:(Ljava/lang/Object;)V
   #78 = Utf8               (Ljava/lang/Object;)V
   #79 = Utf8               args
   #80 = Utf8               [Ljava/lang/String;
   #81 = Utf8               Lorg/nirvana/java/LambdaCode$CustomAction;
   #82 = Utf8               LocalVariableTypeTable
   #83 = Utf8               Lorg/nirvana/java/LambdaCode$CustomAction<Ljava/lang/String;>;
   #84 = Utf8               lambda$0
   #85 = Utf8               (Ljava/lang/String;)V
   #86 = Fieldref           #87.#89       // java/lang/System.out:Ljava/io/PrintStream;
   #87 = Class              #88           // java/lang/System
   #88 = Utf8               java/lang/System
   #89 = NameAndType        #90:#91       // out:Ljava/io/PrintStream;
   #90 = Utf8               out
   #91 = Utf8               Ljava/io/PrintStream;
   #92 = Class              #93           // java/lang/StringBuilder
   #93 = Utf8               java/lang/StringBuilder
   #94 = Methodref          #21.#95       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #95 = NameAndType        #96:#97       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #96 = Utf8               valueOf
   #97 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #98 = Methodref          #92.#99       // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
   #99 = NameAndType        #14:#85       // "<init>":(Ljava/lang/String;)V
  #100 = Methodref          #92.#101      // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
  #101 = NameAndType        #102:#103     // append:(I)Ljava/lang/StringBuilder;
  #102 = Utf8               append
  #103 = Utf8               (I)Ljava/lang/StringBuilder;
  #104 = Methodref          #92.#105      // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #105 = NameAndType        #106:#107     // toString:()Ljava/lang/String;
  #106 = Utf8               toString
  #107 = Utf8               ()Ljava/lang/String;
  #108 = Methodref          #109.#111     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #109 = Class              #110          // java/io/PrintStream
  #110 = Utf8               java/io/PrintStream
  #111 = NameAndType        #112:#85      // println:(Ljava/lang/String;)V
  #112 = Utf8               println
  #113 = Utf8               Ljava/lang/String;
  #114 = Utf8               lambda$2
  #115 = Methodref          #21.#116      // java/lang/String.toUpperCase:()Ljava/lang/String;
  #116 = NameAndType        #117:#107     // toUpperCase:()Ljava/lang/String;
  #117 = Utf8               toUpperCase
  #118 = Utf8               m
  #119 = Utf8               SourceFile
  #120 = Utf8               LambdaCode.java
  #121 = Utf8               BootstrapMethods
  #122 = Methodref          #123.#125     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #123 = Class              #124          // java/lang/invoke/LambdaMetafactory
  #124 = Utf8               java/lang/invoke/LambdaMetafactory
  #125 = NameAndType        #126:#127     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #126 = Utf8               metafactory
  #127 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #128 = MethodHandle       #6:#122       // invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #129 = MethodType         #78           //  (Ljava/lang/Object;)V
  #130 = Methodref          #1.#131       // org/nirvana/java/LambdaCode.lambda$0:(Ljava/lang/String;)V
  #131 = NameAndType        #84:#85       // lambda$0:(Ljava/lang/String;)V
  #132 = MethodHandle       #6:#130       // invokestatic org/nirvana/java/LambdaCode.lambda$0:(Ljava/lang/String;)V
  #133 = MethodType         #85           //  (Ljava/lang/String;)V
  #134 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #135 = MethodType         #134          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #136 = MethodHandle       #5:#115       // invokevirtual java/lang/String.toUpperCase:()Ljava/lang/String;
  #137 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #138 = MethodType         #137          //  (Ljava/lang/String;)Ljava/lang/String;
  #139 = MethodType         #78           //  (Ljava/lang/Object;)V
  #140 = Methodref          #1.#141       // org/nirvana/java/LambdaCode.lambda$2:(Ljava/lang/String;)V
  #141 = NameAndType        #114:#85      // lambda$2:(Ljava/lang/String;)V
  #142 = MethodHandle       #6:#140       // invokestatic org/nirvana/java/LambdaCode.lambda$2:(Ljava/lang/String;)V
  #143 = MethodType         #85           //  (Ljava/lang/String;)V
  #144 = Utf8               InnerClasses
  #145 = Class              #146          // java/lang/invoke/MethodHandles$Lookup
  #146 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #147 = Class              #148          // java/lang/invoke/MethodHandles
  #148 = Utf8               java/lang/invoke/MethodHandles
  #149 = Utf8               Lookup
  #150 = Utf8               CustomAction
{
  static int clz_field;
    descriptor: I
    flags: ACC_STATIC

  static {};
    descriptor: ()V
    flags: ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_1
         1: putstatic     #10                 // Field clz_field:I
         4: return
      LineNumberTable:
        line 7: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature

  public org.nirvana.java.LambdaCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #15                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/java/LambdaCode;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=2, args_size=1
         0: iconst_4
         1: anewarray     #21                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #23                 // String a
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #25                 // String b
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #27                 // String c
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #29                 // String d
        23: aastore
        24: invokestatic  #31                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        27: invokedynamic #37,  0             // InvokeDynamic #0:accept:()Ljava/util/function/Consumer;
        32: invokeinterface #41,  2           // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
        37: iconst_4
        38: anewarray     #21                 // class java/lang/String
        41: dup
        42: iconst_0
        43: ldc           #47                 // String e
        45: aastore
        46: dup
        47: iconst_1
        48: ldc           #49                 // String f
        50: aastore
        51: dup
        52: iconst_2
        53: ldc           #51                 // String g
        55: aastore
        56: dup
        57: iconst_3
        58: ldc           #53                 // String h
        60: aastore
        61: invokestatic  #31                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        64: invokeinterface #55,  1           // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        69: invokedynamic #59,  0             // InvokeDynamic #1:apply:()Ljava/util/function/Function;
        74: invokeinterface #63,  2           // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        79: pop
        80: invokedynamic #69,  0             // InvokeDynamic #2:apply:()Lorg/nirvana/java/LambdaCode$CustomAction;
        85: astore_1
        86: aload_1
        87: ldc           #72                 // String t
        89: invokeinterface #74,  2           // InterfaceMethod org/nirvana/java/LambdaCode$CustomAction.apply:(Ljava/lang/Object;)V
        94: return
      LineNumberTable:
        line 10: 0
        line 11: 27
        line 16: 37
        line 17: 64
        line 19: 80
        line 20: 86
        line 21: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      95     0  args   [Ljava/lang/String;
           86       9     1     a   Lorg/nirvana/java/LambdaCode$CustomAction;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           86       9     1     a   Lorg/nirvana/java/LambdaCode$CustomAction<Ljava/lang/String;>;

  private static void lambda$0(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=1
         0: getstatic     #10                 // Field clz_field:I
         3: iconst_1
         4: iadd
         5: putstatic     #10                 // Field clz_field:I
         8: getstatic     #86                 // Field java/lang/System.out:Ljava/io/PrintStream;
        11: new           #92                 // class java/lang/StringBuilder
        14: dup
        15: aload_0
        16: invokestatic  #94                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        19: invokespecial #98                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
        22: getstatic     #10                 // Field clz_field:I
        25: invokevirtual #100                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        28: invokevirtual #104                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        31: invokevirtual #108                // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        34: return
      LineNumberTable:
        line 12: 0
        line 13: 8
        line 14: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0     e   Ljava/lang/String;

  private static void lambda$2(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #115                // Method java/lang/String.toUpperCase:()Ljava/lang/String;
         4: return
      LineNumberTable:
        line 19: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0     m   Ljava/lang/String;
}
SourceFile: "LambdaCode.java"
BootstrapMethods:
  0: #128 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #129 (Ljava/lang/Object;)V
      #132 invokestatic org/nirvana/java/LambdaCode.lambda$0:(Ljava/lang/String;)V
      #133 (Ljava/lang/String;)V
  1: #128 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #135 (Ljava/lang/Object;)Ljava/lang/Object;
      #136 invokevirtual java/lang/String.toUpperCase:()Ljava/lang/String;
      #138 (Ljava/lang/String;)Ljava/lang/String;
  2: #128 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #139 (Ljava/lang/Object;)V
      #142 invokestatic org/nirvana/java/LambdaCode.lambda$2:(Ljava/lang/String;)V
      #143 (Ljava/lang/String;)V
InnerClasses:
     public static final #149= #145 of #147; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
     static #150= #75 of #1; //CustomAction=class org/nirvana/java/LambdaCode$CustomAction of class org/nirvana/java/LambdaCode
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/java/LambdaCode$CustomAction.class
  Last modified Feb 13, 2018; size 330 bytes
  MD5 checksum 3d45f4ceede488aa1606e51321d93e21
  Compiled from "LambdaCode.java"
interface org.nirvana.java.LambdaCode$CustomAction<T extends java.lang.Object>
  minor version: 0
  major version: 52
  flags: ACC_INTERFACE, ACC_ABSTRACT
Constant pool:
   #1 = Class              #2             // org/nirvana/java/LambdaCode$CustomAction
   #2 = Utf8               org/nirvana/java/LambdaCode$CustomAction
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               apply
   #6 = Utf8               (Ljava/lang/Object;)V
   #7 = Utf8               Signature
   #8 = Utf8               (TT;)V
   #9 = Utf8               SourceFile
  #10 = Utf8               LambdaCode.java
  #11 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;
  #12 = Utf8               InnerClasses
  #13 = Class              #14            // org/nirvana/java/LambdaCode
  #14 = Utf8               org/nirvana/java/LambdaCode
  #15 = Utf8               CustomAction
{
  public abstract void apply(T);
    descriptor: (Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_ABSTRACT
    Signature: #8                           // (TT;)V
}
SourceFile: "LambdaCode.java"
Signature: #11                          // <T:Ljava/lang/Object;>Ljava/lang/Object;
InnerClasses:
     static #15= #1 of #13; //CustomAction=class org/nirvana/java/LambdaCode$CustomAction of class org/nirvana/java/LambdaCode
```

The BootstrapMethods attribute is a variable-length attribute in the attributes table of a ClassFile structure (§4.1). The BootstrapMethods attribute records bootstrap method specifiers referenced by invokedynamic instructions (§invokedynamic).

There must be exactly one BootstrapMethods attribute in the attributes table of a ClassFile structure if the constant_pool table of the ClassFile structure has at least one CONSTANT_InvokeDynamic_info entry

invokedynamic
  -> BootstrapMethods #0
    -> LambdaMetafactory.metafactory;)Ljava/lang/invoke/CallSite
      -> invokeinterface

