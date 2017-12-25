```
package org.nirvana.groovy

class MetaCode {

    String name
    String sayHello( toWhom ){ "Hello $toWhom" }

    def main(){
        MetaCode.metaClass.invokeMethod = { String name, args ->
            "$name() called with $args"
        }
    }
}
```


```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/groovy/MetaCode.class
  Last modified Feb 13, 2018; size 3741 bytes
  MD5 checksum 6bebb6c17ce4416ad4ad71afba811b12
  Compiled from "MetaCode.groovy"
public class org.nirvana.groovy.MetaCode implements groovy.lang.GroovyObject
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/groovy/MetaCode
    #2 = Class              #1            // org/nirvana/groovy/MetaCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               groovy/lang/GroovyObject
    #6 = Class              #5            // groovy/lang/GroovyObject
    #7 = Utf8               MetaCode.groovy
    #8 = Utf8               name
    #9 = Utf8               Ljava/lang/String;
   #10 = Utf8               $staticClassInfo
   #11 = Utf8               Lorg/codehaus/groovy/reflection/ClassInfo;
   #12 = Utf8               __$stMC
   #13 = Utf8               Z
   #14 = Utf8               metaClass
   #15 = Utf8               Lgroovy/lang/MetaClass;
   #16 = Utf8               <init>
   #17 = Utf8               ()V
   #18 = Utf8               $getCallSiteArray
   #19 = Utf8               ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #20 = NameAndType        #18:#19       // $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #21 = Methodref          #2.#20        // org/nirvana/groovy/MetaCode.$getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #22 = NameAndType        #16:#17       // "<init>":()V
   #23 = Methodref          #4.#22        // java/lang/Object."<init>":()V
   #24 = Utf8               $getStaticMetaClass
   #25 = Utf8               ()Lgroovy/lang/MetaClass;
   #26 = NameAndType        #24:#25       // $getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #27 = Methodref          #2.#26        // org/nirvana/groovy/MetaCode.$getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #28 = NameAndType        #14:#15       // metaClass:Lgroovy/lang/MetaClass;
   #29 = Fieldref           #2.#28        // org/nirvana/groovy/MetaCode.metaClass:Lgroovy/lang/MetaClass;
   #30 = Utf8               this
   #31 = Utf8               Lorg/nirvana/groovy/MetaCode;
   #32 = Utf8               sayHello
   #33 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #34 = Utf8               org/codehaus/groovy/runtime/GStringImpl
   #35 = Class              #34           // org/codehaus/groovy/runtime/GStringImpl
   #36 = Utf8               java/lang/String
   #37 = Class              #36           // java/lang/String
   #38 = Utf8               Hello
   #39 = String             #38           // Hello
   #40 = Utf8
   #41 = String             #40           //
   #42 = Utf8               ([Ljava/lang/Object;[Ljava/lang/String;)V
   #43 = NameAndType        #16:#42       // "<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
   #44 = Methodref          #35.#43       // org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
   #45 = Utf8               org/codehaus/groovy/runtime/typehandling/ShortTypeHandling
   #46 = Class              #45           // org/codehaus/groovy/runtime/typehandling/ShortTypeHandling
   #47 = Utf8               castToString
   #48 = NameAndType        #47:#33       // castToString:(Ljava/lang/Object;)Ljava/lang/String;
   #49 = Methodref          #46.#48       // org/codehaus/groovy/runtime/typehandling/ShortTypeHandling.castToString:(Ljava/lang/Object;)Ljava/lang/String;
   #50 = Utf8               toWhom
   #51 = Utf8               Ljava/lang/Object;
   #52 = Utf8               java/lang/Throwable
   #53 = Class              #52           // java/lang/Throwable
   #54 = Utf8               main
   #55 = Utf8               ()Ljava/lang/Object;
   #56 = Utf8               org/nirvana/groovy/MetaCode$_main_closure1
   #57 = Class              #56           // org/nirvana/groovy/MetaCode$_main_closure1
   #58 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
   #59 = NameAndType        #16:#58       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #60 = Methodref          #57.#59       // org/nirvana/groovy/MetaCode$_main_closure1."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #61 = Integer            0
   #62 = Utf8               org/codehaus/groovy/runtime/callsite/CallSite
   #63 = Class              #62           // org/codehaus/groovy/runtime/callsite/CallSite
   #64 = Utf8               callGetProperty
   #65 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #66 = NameAndType        #64:#65       // callGetProperty:(Ljava/lang/Object;)Ljava/lang/Object;
   #67 = InterfaceMethodref #63.#66       // org/codehaus/groovy/runtime/callsite/CallSite.callGetProperty:(Ljava/lang/Object;)Ljava/lang/Object;
   #68 = Utf8               invokeMethod
   #69 = String             #68           // invokeMethod
   #70 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #71 = Class              #70           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #72 = Utf8               setProperty
   #73 = Utf8               (Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V
   #74 = NameAndType        #72:#73       // setProperty:(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V
   #75 = Methodref          #71.#74       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.setProperty:(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V
   #76 = Utf8               getClass
   #77 = Utf8               ()Ljava/lang/Class;
   #78 = NameAndType        #76:#77       // getClass:()Ljava/lang/Class;
   #79 = Methodref          #4.#78        // java/lang/Object.getClass:()Ljava/lang/Class;
   #80 = Utf8               initMetaClass
   #81 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #82 = NameAndType        #80:#81       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #83 = Methodref          #71.#82       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #84 = NameAndType        #10:#11       // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #85 = Fieldref           #2.#84        // org/nirvana/groovy/MetaCode.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #86 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #87 = Class              #86           // org/codehaus/groovy/reflection/ClassInfo
   #88 = Utf8               getClassInfo
   #89 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #90 = NameAndType        #88:#89       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #91 = Methodref          #87.#90       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #92 = Utf8               getMetaClass
   #93 = NameAndType        #92:#25       // getMetaClass:()Lgroovy/lang/MetaClass;
   #94 = Methodref          #87.#93       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #95 = Utf8               Lgroovy/transform/Generated;
   #96 = Utf8               Lgroovy/transform/Internal;
   #97 = Utf8               groovy/lang/MetaClass
   #98 = Class              #97           // groovy/lang/MetaClass
   #99 = Utf8               setMetaClass
  #100 = Utf8               (Lgroovy/lang/MetaClass;)V
  #101 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #102 = Methodref          #2.#93        // org/nirvana/groovy/MetaCode.getMetaClass:()Lgroovy/lang/MetaClass;
  #103 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #104 = NameAndType        #68:#103      // invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #105 = InterfaceMethodref #98.#104      // groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #106 = Utf8               getProperty
  #107 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
  #108 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #109 = NameAndType        #106:#108     // getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #110 = InterfaceMethodref #98.#109      // groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #111 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #112 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #113 = NameAndType        #72:#112      // setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #114 = InterfaceMethodref #98.#113      // groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #115 = Utf8               getName
  #116 = Utf8               ()Ljava/lang/String;
  #117 = NameAndType        #8:#9         // name:Ljava/lang/String;
  #118 = Fieldref           #2.#117       // org/nirvana/groovy/MetaCode.name:Ljava/lang/String;
  #119 = Utf8               setName
  #120 = Utf8               (Ljava/lang/String;)V
  #121 = Utf8               $callSiteArray
  #122 = Utf8               Ljava/lang/ref/SoftReference;
  #123 = Utf8               $createCallSiteArray_1
  #124 = Utf8               ([Ljava/lang/String;)V
  #125 = String             #14           // metaClass
  #126 = Utf8               $createCallSiteArray
  #127 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #128 = Integer            1
  #129 = NameAndType        #123:#124     // $createCallSiteArray_1:([Ljava/lang/String;)V
  #130 = Methodref          #2.#129       // org/nirvana/groovy/MetaCode.$createCallSiteArray_1:([Ljava/lang/String;)V
  #131 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
  #132 = Class              #131          // org/codehaus/groovy/runtime/callsite/CallSiteArray
  #133 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
  #134 = NameAndType        #16:#133      // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #135 = Methodref          #132.#134     // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #136 = NameAndType        #121:#122     // $callSiteArray:Ljava/lang/ref/SoftReference;
  #137 = Fieldref           #2.#136       // org/nirvana/groovy/MetaCode.$callSiteArray:Ljava/lang/ref/SoftReference;
  #138 = Utf8               java/lang/ref/SoftReference
  #139 = Class              #138          // java/lang/ref/SoftReference
  #140 = Utf8               get
  #141 = NameAndType        #140:#55      // get:()Ljava/lang/Object;
  #142 = Methodref          #139.#141     // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
  #143 = NameAndType        #126:#127     // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #144 = Methodref          #2.#143       // org/nirvana/groovy/MetaCode.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #145 = Utf8               (Ljava/lang/Object;)V
  #146 = NameAndType        #16:#145      // "<init>":(Ljava/lang/Object;)V
  #147 = Methodref          #139.#146     // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
  #148 = Utf8               array
  #149 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #150 = NameAndType        #148:#149     // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #151 = Fieldref           #132.#150     // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #152 = Utf8               _main_closure1
  #153 = Utf8               Code
  #154 = Utf8               LocalVariableTable
  #155 = Utf8               StackMapTable
  #156 = Utf8               LineNumberTable
  #157 = Utf8               RuntimeVisibleAnnotations
  #158 = Utf8               InnerClasses
  #159 = Utf8               SourceFile
{
  private java.lang.String name;
    descriptor: Ljava/lang/String;
    flags: ACC_PRIVATE

  private static org.codehaus.groovy.reflection.ClassInfo $staticClassInfo;
    descriptor: Lorg/codehaus/groovy/reflection/ClassInfo;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC

  public static transient boolean __$stMC;
    descriptor: Z
    flags: ACC_PUBLIC, ACC_STATIC, ACC_TRANSIENT, ACC_SYNTHETIC

  private transient groovy.lang.MetaClass metaClass;
    descriptor: Lgroovy/lang/MetaClass;
    flags: ACC_PRIVATE, ACC_TRANSIENT, ACC_SYNTHETIC

  private static java.lang.ref.SoftReference $callSiteArray;
    descriptor: Ljava/lang/ref/SoftReference;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC

  public org.nirvana.groovy.MetaCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: invokestatic  #21                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_1
         4: aload_0
         5: invokespecial #23                 // Method java/lang/Object."<init>":()V
         8: aload_0
         9: invokevirtual #27                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
        12: astore_2
        13: aload_2
        14: aload_0
        15: swap
        16: putfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
        19: aload_2
        20: pop
        21: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lorg/nirvana/groovy/MetaCode;

  public java.lang.String sayHello(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=2
         0: invokestatic  #21                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_2
         4: new           #35                 // class org/codehaus/groovy/runtime/GStringImpl
         7: dup
         8: iconst_1
         9: anewarray     #4                  // class java/lang/Object
        12: dup
        13: iconst_0
        14: aload_1
        15: aastore
        16: iconst_2
        17: anewarray     #37                 // class java/lang/String
        20: dup
        21: iconst_0
        22: ldc           #39                 // String Hello
        24: aastore
        25: dup
        26: iconst_1
        27: ldc           #41                 // String
        29: aastore
        30: invokespecial #44                 // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        33: invokestatic  #49                 // Method org/codehaus/groovy/runtime/typehandling/ShortTypeHandling.castToString:(Ljava/lang/Object;)Ljava/lang/String;
        36: checkcast     #37                 // class java/lang/String
        39: areturn
        40: nop
        41: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 6: 4
        line 6: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lorg/nirvana/groovy/MetaCode;
            0      40     1 toWhom   Ljava/lang/Object;

  public java.lang.Object main();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: invokestatic  #21                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_1
         4: new           #57                 // class org/nirvana/groovy/MetaCode$_main_closure1
         7: dup
         8: aload_0
         9: aload_0
        10: invokespecial #60                 // Method org/nirvana/groovy/MetaCode$_main_closure1."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
        13: astore_2
        14: aload_2
        15: aconst_null
        16: aload_1
        17: ldc           #61                 // int 0
        19: aaload
        20: ldc           #2                  // class org/nirvana/groovy/MetaCode
        22: invokeinterface #67,  2           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.callGetProperty:(Ljava/lang/Object;)Ljava/lang/Object;
        27: ldc           #69                 // String invokeMethod
        29: checkcast     #37                 // class java/lang/String
        32: invokestatic  #75                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.setProperty:(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V
        35: aload_2
        36: areturn
        37: nop
        38: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 9: 4
        line 12: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lorg/nirvana/groovy/MetaCode;

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #79                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/nirvana/groovy/MetaCode
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #83                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #85                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #79                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #91                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #85                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #94                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
        38: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class org/codehaus/groovy/reflection/ClassInfo ]

  public groovy.lang.MetaClass getMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
         4: dup
         5: ifnull        9
         8: areturn
         9: pop
        10: aload_0
        11: dup
        12: invokevirtual #27                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
        15: putfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
        18: aload_0
        19: getfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
        22: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class groovy/lang/MetaClass ]
    RuntimeVisibleAnnotations:
      0: #95()
      1: #96()

  public void setMetaClass(groovy.lang.MetaClass);
    descriptor: (Lgroovy/lang/MetaClass;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
         5: return
    RuntimeVisibleAnnotations:
      0: #95()
      1: #96()

  public java.lang.Object invokeMethod(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #102                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #105,  4          // InterfaceMethod groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
        12: areturn
    RuntimeVisibleAnnotations:
      0: #95()
      1: #96()

  public java.lang.Object getProperty(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #102                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: invokeinterface #110,  3          // InterfaceMethod groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        11: areturn
    RuntimeVisibleAnnotations:
      0: #95()
      1: #96()

  public void setProperty(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #102                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #114,  4          // InterfaceMethod groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        12: return
    RuntimeVisibleAnnotations:
      0: #95()
      1: #96()

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #118                // Field name:Ljava/lang/String;
         4: areturn
    RuntimeVisibleAnnotations:
      0: #95()

  public void setName(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #118                // Field name:Ljava/lang/String;
         5: return
    RuntimeVisibleAnnotations:
      0: #95()

  private static void $createCallSiteArray_1(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #61                 // int 0
         3: ldc           #125                // String metaClass
         5: aastore
         6: return

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #128                // int 1
         2: anewarray     #37                 // class java/lang/String
         5: astore_0
         6: aload_0
         7: invokestatic  #130                // Method $createCallSiteArray_1:([Ljava/lang/String;)V
        10: new           #132                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        13: dup
        14: ldc           #2                  // class org/nirvana/groovy/MetaCode
        16: aload_0
        17: invokespecial #135                // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        20: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #137                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #137                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #142                // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #132                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #144                // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #139                // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #147                // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #137                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #151                // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/codehaus/groovy/runtime/callsite/CallSiteArray ]
}
InnerClasses:
     public final #152= #57; //_main_closure1=class org/nirvana/groovy/MetaCode$_main_closure1
SourceFile: "MetaCode.groovy"
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/groovy/MetaCode$_main_closure1.class
  Last modified Feb 13, 2018; size 2643 bytes
  MD5 checksum 4c69ca8810d761651a7378f6babd1817
  Compiled from "MetaCode.groovy"
public final class org.nirvana.groovy.MetaCode$_main_closure1 extends groovy.lang.Closure implements org.codehaus.groovy.runtime.GeneratedClosure
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/groovy/MetaCode$_main_closure1
    #2 = Class              #1            // org/nirvana/groovy/MetaCode$_main_closure1
    #3 = Utf8               groovy/lang/Closure
    #4 = Class              #3            // groovy/lang/Closure
    #5 = Utf8               org/codehaus/groovy/runtime/GeneratedClosure
    #6 = Class              #5            // org/codehaus/groovy/runtime/GeneratedClosure
    #7 = Utf8               MetaCode.groovy
    #8 = Utf8               org/nirvana/groovy/MetaCode
    #9 = Class              #8            // org/nirvana/groovy/MetaCode
   #10 = Utf8               main
   #11 = Utf8               ()Ljava/lang/Object;
   #12 = NameAndType        #10:#11       // main:()Ljava/lang/Object;
   #13 = Utf8               $staticClassInfo
   #14 = Utf8               Lorg/codehaus/groovy/reflection/ClassInfo;
   #15 = Utf8               __$stMC
   #16 = Utf8               Z
   #17 = Utf8               <init>
   #18 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
   #19 = Utf8               $getCallSiteArray
   #20 = Utf8               ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #21 = NameAndType        #19:#20       // $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #22 = Methodref          #2.#21        // org/nirvana/groovy/MetaCode$_main_closure1.$getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #23 = NameAndType        #17:#18       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #24 = Methodref          #4.#23        // groovy/lang/Closure."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #25 = Utf8               this
   #26 = Utf8               Lorg/nirvana/groovy/MetaCode$_main_closure1;
   #27 = Utf8               _outerInstance
   #28 = Utf8               Ljava/lang/Object;
   #29 = Utf8               _thisObject
   #30 = Utf8               doCall
   #31 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
   #32 = Utf8               org/codehaus/groovy/runtime/GStringImpl
   #33 = Class              #32           // org/codehaus/groovy/runtime/GStringImpl
   #34 = Utf8               java/lang/Object
   #35 = Class              #34           // java/lang/Object
   #36 = Utf8               java/lang/String
   #37 = Class              #36           // java/lang/String
   #38 = Utf8
   #39 = String             #38           //
   #40 = Utf8               () called with
   #41 = String             #40           // () called with
   #42 = Utf8               ([Ljava/lang/Object;[Ljava/lang/String;)V
   #43 = NameAndType        #17:#42       // "<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
   #44 = Methodref          #33.#43       // org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
   #45 = Utf8               name
   #46 = Utf8               Ljava/lang/String;
   #47 = Utf8               args
   #48 = Utf8               java/lang/Throwable
   #49 = Class              #48           // java/lang/Throwable
   #50 = Utf8               call
   #51 = Integer            0
   #52 = Utf8               org/codehaus/groovy/runtime/callsite/CallSite
   #53 = Class              #52           // org/codehaus/groovy/runtime/callsite/CallSite
   #54 = Utf8               callCurrent
   #55 = Utf8               (Lgroovy/lang/GroovyObject;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #56 = NameAndType        #54:#55       // callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #57 = InterfaceMethodref #53.#56       // org/codehaus/groovy/runtime/callsite/CallSite.callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #58 = Utf8               $getStaticMetaClass
   #59 = Utf8               ()Lgroovy/lang/MetaClass;
   #60 = Utf8               getClass
   #61 = Utf8               ()Ljava/lang/Class;
   #62 = NameAndType        #60:#61       // getClass:()Ljava/lang/Class;
   #63 = Methodref          #35.#62       // java/lang/Object.getClass:()Ljava/lang/Class;
   #64 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #65 = Class              #64           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #66 = Utf8               initMetaClass
   #67 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #68 = NameAndType        #66:#67       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #69 = Methodref          #65.#68       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #70 = NameAndType        #13:#14       // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #71 = Fieldref           #2.#70        // org/nirvana/groovy/MetaCode$_main_closure1.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #72 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #73 = Class              #72           // org/codehaus/groovy/reflection/ClassInfo
   #74 = Utf8               getClassInfo
   #75 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #76 = NameAndType        #74:#75       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #77 = Methodref          #73.#76       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #78 = Utf8               getMetaClass
   #79 = NameAndType        #78:#59       // getMetaClass:()Lgroovy/lang/MetaClass;
   #80 = Methodref          #73.#79       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #81 = Utf8               $callSiteArray
   #82 = Utf8               Ljava/lang/ref/SoftReference;
   #83 = Utf8               $createCallSiteArray_1
   #84 = Utf8               ([Ljava/lang/String;)V
   #85 = String             #30           // doCall
   #86 = Utf8               $createCallSiteArray
   #87 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #88 = Integer            1
   #89 = NameAndType        #83:#84       // $createCallSiteArray_1:([Ljava/lang/String;)V
   #90 = Methodref          #2.#89        // org/nirvana/groovy/MetaCode$_main_closure1.$createCallSiteArray_1:([Ljava/lang/String;)V
   #91 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
   #92 = Class              #91           // org/codehaus/groovy/runtime/callsite/CallSiteArray
   #93 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
   #94 = NameAndType        #17:#93       // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #95 = Methodref          #92.#94       // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #96 = NameAndType        #81:#82       // $callSiteArray:Ljava/lang/ref/SoftReference;
   #97 = Fieldref           #2.#96        // org/nirvana/groovy/MetaCode$_main_closure1.$callSiteArray:Ljava/lang/ref/SoftReference;
   #98 = Utf8               java/lang/ref/SoftReference
   #99 = Class              #98           // java/lang/ref/SoftReference
  #100 = Utf8               get
  #101 = NameAndType        #100:#11      // get:()Ljava/lang/Object;
  #102 = Methodref          #99.#101      // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
  #103 = NameAndType        #86:#87       // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #104 = Methodref          #2.#103       // org/nirvana/groovy/MetaCode$_main_closure1.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #105 = Utf8               (Ljava/lang/Object;)V
  #106 = NameAndType        #17:#105      // "<init>":(Ljava/lang/Object;)V
  #107 = Methodref          #99.#106      // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
  #108 = Utf8               array
  #109 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #110 = NameAndType        #108:#109     // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #111 = Fieldref           #92.#110      // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #112 = Utf8               _main_closure1
  #113 = Utf8               Code
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               StackMapTable
  #116 = Utf8               LineNumberTable
  #117 = Utf8               InnerClasses
  #118 = Utf8               EnclosingMethod
  #119 = Utf8               SourceFile
{
  private static org.codehaus.groovy.reflection.ClassInfo $staticClassInfo;
    descriptor: Lorg/codehaus/groovy/reflection/ClassInfo;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC

  public static transient boolean __$stMC;
    descriptor: Z
    flags: ACC_PUBLIC, ACC_STATIC, ACC_TRANSIENT, ACC_SYNTHETIC

  private static java.lang.ref.SoftReference $callSiteArray;
    descriptor: Ljava/lang/ref/SoftReference;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC

  public org.nirvana.groovy.MetaCode$_main_closure1(java.lang.Object, java.lang.Object);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)V
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_3
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokespecial #24                 // Method groovy/lang/Closure."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
        10: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lorg/nirvana/groovy/MetaCode$_main_closure1;
            0      10     1 _outerInstance   Ljava/lang/Object;
            0      10     2 _thisObject   Ljava/lang/Object;

  public java.lang.Object doCall(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_3
         4: new           #33                 // class org/codehaus/groovy/runtime/GStringImpl
         7: dup
         8: iconst_2
         9: anewarray     #35                 // class java/lang/Object
        12: dup
        13: iconst_0
        14: aload_1
        15: aastore
        16: dup
        17: iconst_1
        18: aload_2
        19: aastore
        20: iconst_3
        21: anewarray     #37                 // class java/lang/String
        24: dup
        25: iconst_0
        26: ldc           #39                 // String
        28: aastore
        29: dup
        30: iconst_1
        31: ldc           #41                 // String () called with
        33: aastore
        34: dup
        35: iconst_2
        36: ldc           #39                 // String
        38: aastore
        39: invokespecial #44                 // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        42: areturn
        43: nop
        44: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 10: 4
        line 11: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lorg/nirvana/groovy/MetaCode$_main_closure1;
            0      43     1  name   Ljava/lang/String;
            0      43     2  args   Ljava/lang/Object;

  public java.lang.Object call(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_3
         4: aload_3
         5: ldc           #51                 // int 0
         7: aaload
         8: aload_0
         9: aload_1
        10: aload_2
        11: invokeinterface #57,  4           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        16: areturn
        17: nop
        18: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = []
          stack = [ class java/lang/Throwable ]
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lorg/nirvana/groovy/MetaCode$_main_closure1;
            0      17     1  name   Ljava/lang/String;
            0      17     2  args   Ljava/lang/Object;

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #63                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/nirvana/groovy/MetaCode$_main_closure1
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #69                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #71                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #63                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #77                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #71                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #80                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
        38: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class org/codehaus/groovy/reflection/ClassInfo ]

  private static void $createCallSiteArray_1(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #51                 // int 0
         3: ldc           #85                 // String doCall
         5: aastore
         6: return

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #88                 // int 1
         2: anewarray     #37                 // class java/lang/String
         5: astore_0
         6: aload_0
         7: invokestatic  #90                 // Method $createCallSiteArray_1:([Ljava/lang/String;)V
        10: new           #92                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        13: dup
        14: ldc           #2                  // class org/nirvana/groovy/MetaCode$_main_closure1
        16: aload_0
        17: invokespecial #95                 // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        20: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #97                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #97                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #102                // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #92                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #104                // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #99                 // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #107                // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #97                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #111                // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/codehaus/groovy/runtime/callsite/CallSiteArray ]
}
InnerClasses:
     public final #112= #2; //_main_closure1=class org/nirvana/groovy/MetaCode$_main_closure1
EnclosingMethod: #9.#12                 // org.nirvana.groovy.MetaCode.main
SourceFile: "MetaCode.groovy"
```