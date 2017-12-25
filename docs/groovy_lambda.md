```
package org.nirvana.groovy



class LambdaCode {
    def main(){
        Runnable run = { println 'run' }
        list.each { println it } // or list.each(this.&println)
    }
}
```


```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/groovy/LambdaCode.class
  Last modified Feb 13, 2018; size 3288 bytes
  MD5 checksum 1fbadc8832c07137609e43b9a7d41c23
  Compiled from "LambdaCode.groovy"
public class org.nirvana.groovy.LambdaCode implements groovy.lang.GroovyObject
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/groovy/LambdaCode
    #2 = Class              #1            // org/nirvana/groovy/LambdaCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               groovy/lang/GroovyObject
    #6 = Class              #5            // groovy/lang/GroovyObject
    #7 = Utf8               LambdaCode.groovy
    #8 = Utf8               $staticClassInfo
    #9 = Utf8               Lorg/codehaus/groovy/reflection/ClassInfo;
   #10 = Utf8               __$stMC
   #11 = Utf8               Z
   #12 = Utf8               metaClass
   #13 = Utf8               Lgroovy/lang/MetaClass;
   #14 = Utf8               <init>
   #15 = Utf8               ()V
   #16 = Utf8               $getCallSiteArray
   #17 = Utf8               ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #18 = NameAndType        #16:#17       // $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #19 = Methodref          #2.#18        // org/nirvana/groovy/LambdaCode.$getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #20 = NameAndType        #14:#15       // "<init>":()V
   #21 = Methodref          #4.#20        // java/lang/Object."<init>":()V
   #22 = Utf8               $getStaticMetaClass
   #23 = Utf8               ()Lgroovy/lang/MetaClass;
   #24 = NameAndType        #22:#23       // $getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #25 = Methodref          #2.#24        // org/nirvana/groovy/LambdaCode.$getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #26 = NameAndType        #12:#13       // metaClass:Lgroovy/lang/MetaClass;
   #27 = Fieldref           #2.#26        // org/nirvana/groovy/LambdaCode.metaClass:Lgroovy/lang/MetaClass;
   #28 = Utf8               this
   #29 = Utf8               Lorg/nirvana/groovy/LambdaCode;
   #30 = Utf8               main
   #31 = Utf8               ()Ljava/lang/Object;
   #32 = Utf8               org/nirvana/groovy/LambdaCode$_main_closure1
   #33 = Class              #32           // org/nirvana/groovy/LambdaCode$_main_closure1
   #34 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
   #35 = NameAndType        #14:#34       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #36 = Methodref          #33.#35       // org/nirvana/groovy/LambdaCode$_main_closure1."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #37 = Integer            0
   #38 = Integer            1
   #39 = Utf8               org/codehaus/groovy/runtime/callsite/CallSite
   #40 = Class              #39           // org/codehaus/groovy/runtime/callsite/CallSite
   #41 = Utf8               callGroovyObjectGetProperty
   #42 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #43 = NameAndType        #41:#42       // callGroovyObjectGetProperty:(Ljava/lang/Object;)Ljava/lang/Object;
   #44 = InterfaceMethodref #40.#43       // org/codehaus/groovy/runtime/callsite/CallSite.callGroovyObjectGetProperty:(Ljava/lang/Object;)Ljava/lang/Object;
   #45 = Utf8               org/nirvana/groovy/LambdaCode$_main_closure2
   #46 = Class              #45           // org/nirvana/groovy/LambdaCode$_main_closure2
   #47 = Methodref          #46.#35       // org/nirvana/groovy/LambdaCode$_main_closure2."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #48 = Utf8               call
   #49 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #50 = NameAndType        #48:#49       // call:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #51 = InterfaceMethodref #40.#50       // org/codehaus/groovy/runtime/callsite/CallSite.call:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #52 = Utf8               run
   #53 = Utf8               Ljava/lang/Runnable;
   #54 = Utf8               java/lang/Throwable
   #55 = Class              #54           // java/lang/Throwable
   #56 = Utf8               getClass
   #57 = Utf8               ()Ljava/lang/Class;
   #58 = NameAndType        #56:#57       // getClass:()Ljava/lang/Class;
   #59 = Methodref          #4.#58        // java/lang/Object.getClass:()Ljava/lang/Class;
   #60 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #61 = Class              #60           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #62 = Utf8               initMetaClass
   #63 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #64 = NameAndType        #62:#63       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #65 = Methodref          #61.#64       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #66 = NameAndType        #8:#9         // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #67 = Fieldref           #2.#66        // org/nirvana/groovy/LambdaCode.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #68 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #69 = Class              #68           // org/codehaus/groovy/reflection/ClassInfo
   #70 = Utf8               getClassInfo
   #71 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #72 = NameAndType        #70:#71       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #73 = Methodref          #69.#72       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #74 = Utf8               getMetaClass
   #75 = NameAndType        #74:#23       // getMetaClass:()Lgroovy/lang/MetaClass;
   #76 = Methodref          #69.#75       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #77 = Utf8               Lgroovy/transform/Generated;
   #78 = Utf8               Lgroovy/transform/Internal;
   #79 = Utf8               groovy/lang/MetaClass
   #80 = Class              #79           // groovy/lang/MetaClass
   #81 = Utf8               setMetaClass
   #82 = Utf8               (Lgroovy/lang/MetaClass;)V
   #83 = Utf8               invokeMethod
   #84 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
   #85 = Methodref          #2.#75        // org/nirvana/groovy/LambdaCode.getMetaClass:()Lgroovy/lang/MetaClass;
   #86 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
   #87 = NameAndType        #83:#86       // invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
   #88 = InterfaceMethodref #80.#87       // groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
   #89 = Utf8               getProperty
   #90 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
   #91 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
   #92 = NameAndType        #89:#91       // getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
   #93 = InterfaceMethodref #80.#92       // groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
   #94 = Utf8               setProperty
   #95 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
   #96 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
   #97 = NameAndType        #94:#96       // setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
   #98 = InterfaceMethodref #80.#97       // groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
   #99 = Utf8               $callSiteArray
  #100 = Utf8               Ljava/lang/ref/SoftReference;
  #101 = Utf8               $createCallSiteArray_1
  #102 = Utf8               ([Ljava/lang/String;)V
  #103 = Utf8               each
  #104 = String             #103          // each
  #105 = Utf8               list
  #106 = String             #105          // list
  #107 = Utf8               $createCallSiteArray
  #108 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #109 = Integer            2
  #110 = Utf8               java/lang/String
  #111 = Class              #110          // java/lang/String
  #112 = NameAndType        #101:#102     // $createCallSiteArray_1:([Ljava/lang/String;)V
  #113 = Methodref          #2.#112       // org/nirvana/groovy/LambdaCode.$createCallSiteArray_1:([Ljava/lang/String;)V
  #114 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
  #115 = Class              #114          // org/codehaus/groovy/runtime/callsite/CallSiteArray
  #116 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
  #117 = NameAndType        #14:#116      // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #118 = Methodref          #115.#117     // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #119 = NameAndType        #99:#100      // $callSiteArray:Ljava/lang/ref/SoftReference;
  #120 = Fieldref           #2.#119       // org/nirvana/groovy/LambdaCode.$callSiteArray:Ljava/lang/ref/SoftReference;
  #121 = Utf8               java/lang/ref/SoftReference
  #122 = Class              #121          // java/lang/ref/SoftReference
  #123 = Utf8               get
  #124 = NameAndType        #123:#31      // get:()Ljava/lang/Object;
  #125 = Methodref          #122.#124     // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
  #126 = NameAndType        #107:#108     // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #127 = Methodref          #2.#126       // org/nirvana/groovy/LambdaCode.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #128 = Utf8               (Ljava/lang/Object;)V
  #129 = NameAndType        #14:#128      // "<init>":(Ljava/lang/Object;)V
  #130 = Methodref          #122.#129     // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
  #131 = Utf8               array
  #132 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #133 = NameAndType        #131:#132     // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #134 = Fieldref           #115.#133     // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #135 = Utf8               _main_closure1
  #136 = Utf8               _main_closure2
  #137 = Utf8               Code
  #138 = Utf8               LocalVariableTable
  #139 = Utf8               StackMapTable
  #140 = Utf8               LineNumberTable
  #141 = Utf8               RuntimeVisibleAnnotations
  #142 = Utf8               InnerClasses
  #143 = Utf8               SourceFile
{
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

  public org.nirvana.groovy.LambdaCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: invokestatic  #19                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_1
         4: aload_0
         5: invokespecial #21                 // Method java/lang/Object."<init>":()V
         8: aload_0
         9: invokevirtual #25                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
        12: astore_2
        13: aload_2
        14: aload_0
        15: swap
        16: putfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
        19: aload_2
        20: pop
        21: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lorg/nirvana/groovy/LambdaCode;

  public java.lang.Object main();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: invokestatic  #19                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_1
         4: new           #33                 // class org/nirvana/groovy/LambdaCode$_main_closure1
         7: dup
         8: aload_0
         9: aload_0
        10: invokespecial #36                 // Method org/nirvana/groovy/LambdaCode$_main_closure1."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
        13: astore_2
        14: aload_2
        15: pop
        16: aload_1
        17: ldc           #37                 // int 0
        19: aaload
        20: aload_1
        21: ldc           #38                 // int 1
        23: aaload
        24: aload_0
        25: invokeinterface #44,  2           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.callGroovyObjectGetProperty:(Ljava/lang/Object;)Ljava/lang/Object;
        30: new           #46                 // class org/nirvana/groovy/LambdaCode$_main_closure2
        33: dup
        34: aload_0
        35: aload_0
        36: invokespecial #47                 // Method org/nirvana/groovy/LambdaCode$_main_closure2."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
        39: invokeinterface #51,  3           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.call:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        44: areturn
        45: nop
        46: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 45
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 7: 4
        line 8: 16
        line 9: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lorg/nirvana/groovy/LambdaCode;
           14      31     2   run   Ljava/lang/Runnable;

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #59                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/nirvana/groovy/LambdaCode
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #65                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #67                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #59                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #73                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #67                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #76                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
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
         1: getfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
         4: dup
         5: ifnull        9
         8: areturn
         9: pop
        10: aload_0
        11: dup
        12: invokevirtual #25                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
        15: putfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
        18: aload_0
        19: getfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
        22: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class groovy/lang/MetaClass ]
    RuntimeVisibleAnnotations:
      0: #77()
      1: #78()

  public void setMetaClass(groovy.lang.MetaClass);
    descriptor: (Lgroovy/lang/MetaClass;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
         5: return
    RuntimeVisibleAnnotations:
      0: #77()
      1: #78()

  public java.lang.Object invokeMethod(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #85                 // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #88,  4           // InterfaceMethod groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
        12: areturn
    RuntimeVisibleAnnotations:
      0: #77()
      1: #78()

  public java.lang.Object getProperty(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #85                 // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: invokeinterface #93,  3           // InterfaceMethod groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        11: areturn
    RuntimeVisibleAnnotations:
      0: #77()
      1: #78()

  public void setProperty(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #85                 // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #98,  4           // InterfaceMethod groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        12: return
    RuntimeVisibleAnnotations:
      0: #77()
      1: #78()

  private static void $createCallSiteArray_1(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #37                 // int 0
         3: ldc           #104                // String each
         5: aastore
         6: aload_0
         7: ldc           #38                 // int 1
         9: ldc           #106                // String list
        11: aastore
        12: return

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #109                // int 2
         2: anewarray     #111                // class java/lang/String
         5: astore_0
         6: aload_0
         7: invokestatic  #113                // Method $createCallSiteArray_1:([Ljava/lang/String;)V
        10: new           #115                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        13: dup
        14: ldc           #2                  // class org/nirvana/groovy/LambdaCode
        16: aload_0
        17: invokespecial #118                // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        20: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #120                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #120                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #125                // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #115                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #127                // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #122                // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #130                // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #120                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #134                // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/codehaus/groovy/runtime/callsite/CallSiteArray ]
}
InnerClasses:
     public final #135= #33; //_main_closure1=class org/nirvana/groovy/LambdaCode$_main_closure1
     public final #136= #46; //_main_closure2=class org/nirvana/groovy/LambdaCode$_main_closure2
SourceFile: "LambdaCode.groovy"
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/groovy/LambdaCode$_main_closure1.class
  Last modified Feb 13, 2018; size 2489 bytes
  MD5 checksum 828775261d75bae1ad5ef22c2901f729
  Compiled from "LambdaCode.groovy"
public final class org.nirvana.groovy.LambdaCode$_main_closure1 extends groovy.lang.Closure implements org.codehaus.groovy.runtime.GeneratedClosure
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/groovy/LambdaCode$_main_closure1
    #2 = Class              #1            // org/nirvana/groovy/LambdaCode$_main_closure1
    #3 = Utf8               groovy/lang/Closure
    #4 = Class              #3            // groovy/lang/Closure
    #5 = Utf8               org/codehaus/groovy/runtime/GeneratedClosure
    #6 = Class              #5            // org/codehaus/groovy/runtime/GeneratedClosure
    #7 = Utf8               LambdaCode.groovy
    #8 = Utf8               org/nirvana/groovy/LambdaCode
    #9 = Class              #8            // org/nirvana/groovy/LambdaCode
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
   #22 = Methodref          #2.#21        // org/nirvana/groovy/LambdaCode$_main_closure1.$getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #23 = NameAndType        #17:#18       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #24 = Methodref          #4.#23        // groovy/lang/Closure."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #25 = Utf8               this
   #26 = Utf8               Lorg/nirvana/groovy/LambdaCode$_main_closure1;
   #27 = Utf8               _outerInstance
   #28 = Utf8               Ljava/lang/Object;
   #29 = Utf8               _thisObject
   #30 = Utf8               doCall
   #31 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #32 = Integer            0
   #33 = Utf8               run
   #34 = String             #33           // run
   #35 = Utf8               org/codehaus/groovy/runtime/callsite/CallSite
   #36 = Class              #35           // org/codehaus/groovy/runtime/callsite/CallSite
   #37 = Utf8               callCurrent
   #38 = Utf8               (Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
   #39 = NameAndType        #37:#38       // callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
   #40 = InterfaceMethodref #36.#39       // org/codehaus/groovy/runtime/callsite/CallSite.callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
   #41 = Utf8               it
   #42 = Utf8               java/lang/Throwable
   #43 = Class              #42           // java/lang/Throwable
   #44 = Utf8               Lgroovy/transform/Generated;
   #45 = NameAndType        #30:#31       // doCall:(Ljava/lang/Object;)Ljava/lang/Object;
   #46 = Methodref          #2.#45        // org/nirvana/groovy/LambdaCode$_main_closure1.doCall:(Ljava/lang/Object;)Ljava/lang/Object;
   #47 = Utf8               $getStaticMetaClass
   #48 = Utf8               ()Lgroovy/lang/MetaClass;
   #49 = Utf8               java/lang/Object
   #50 = Class              #49           // java/lang/Object
   #51 = Utf8               getClass
   #52 = Utf8               ()Ljava/lang/Class;
   #53 = NameAndType        #51:#52       // getClass:()Ljava/lang/Class;
   #54 = Methodref          #50.#53       // java/lang/Object.getClass:()Ljava/lang/Class;
   #55 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #56 = Class              #55           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #57 = Utf8               initMetaClass
   #58 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #59 = NameAndType        #57:#58       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #60 = Methodref          #56.#59       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #61 = NameAndType        #13:#14       // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #62 = Fieldref           #2.#61        // org/nirvana/groovy/LambdaCode$_main_closure1.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #63 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #64 = Class              #63           // org/codehaus/groovy/reflection/ClassInfo
   #65 = Utf8               getClassInfo
   #66 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #67 = NameAndType        #65:#66       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #68 = Methodref          #64.#67       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #69 = Utf8               getMetaClass
   #70 = NameAndType        #69:#48       // getMetaClass:()Lgroovy/lang/MetaClass;
   #71 = Methodref          #64.#70       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #72 = Utf8               $callSiteArray
   #73 = Utf8               Ljava/lang/ref/SoftReference;
   #74 = Utf8               $createCallSiteArray_1
   #75 = Utf8               ([Ljava/lang/String;)V
   #76 = Utf8               println
   #77 = String             #76           // println
   #78 = Utf8               $createCallSiteArray
   #79 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #80 = Integer            1
   #81 = Utf8               java/lang/String
   #82 = Class              #81           // java/lang/String
   #83 = NameAndType        #74:#75       // $createCallSiteArray_1:([Ljava/lang/String;)V
   #84 = Methodref          #2.#83        // org/nirvana/groovy/LambdaCode$_main_closure1.$createCallSiteArray_1:([Ljava/lang/String;)V
   #85 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
   #86 = Class              #85           // org/codehaus/groovy/runtime/callsite/CallSiteArray
   #87 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
   #88 = NameAndType        #17:#87       // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #89 = Methodref          #86.#88       // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #90 = NameAndType        #72:#73       // $callSiteArray:Ljava/lang/ref/SoftReference;
   #91 = Fieldref           #2.#90        // org/nirvana/groovy/LambdaCode$_main_closure1.$callSiteArray:Ljava/lang/ref/SoftReference;
   #92 = Utf8               java/lang/ref/SoftReference
   #93 = Class              #92           // java/lang/ref/SoftReference
   #94 = Utf8               get
   #95 = NameAndType        #94:#11       // get:()Ljava/lang/Object;
   #96 = Methodref          #93.#95       // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
   #97 = NameAndType        #78:#79       // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #98 = Methodref          #2.#97        // org/nirvana/groovy/LambdaCode$_main_closure1.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #99 = Utf8               (Ljava/lang/Object;)V
  #100 = NameAndType        #17:#99       // "<init>":(Ljava/lang/Object;)V
  #101 = Methodref          #93.#100      // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
  #102 = Utf8               array
  #103 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #104 = NameAndType        #102:#103     // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #105 = Fieldref           #86.#104      // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #106 = Utf8               _main_closure1
  #107 = Utf8               Code
  #108 = Utf8               LocalVariableTable
  #109 = Utf8               StackMapTable
  #110 = Utf8               LineNumberTable
  #111 = Utf8               RuntimeVisibleAnnotations
  #112 = Utf8               InnerClasses
  #113 = Utf8               EnclosingMethod
  #114 = Utf8               SourceFile
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

  public org.nirvana.groovy.LambdaCode$_main_closure1(java.lang.Object, java.lang.Object);
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
            0      10     0  this   Lorg/nirvana/groovy/LambdaCode$_main_closure1;
            0      10     1 _outerInstance   Ljava/lang/Object;
            0      10     2 _thisObject   Ljava/lang/Object;

  public java.lang.Object doCall(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_2
         4: aload_2
         5: ldc           #32                 // int 0
         7: aaload
         8: aload_0
         9: ldc           #34                 // String run
        11: invokeinterface #40,  3           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
        16: areturn
        17: nop
        18: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 7: 4
        line 7: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lorg/nirvana/groovy/LambdaCode$_main_closure1;
            0      17     1    it   Ljava/lang/Object;

  public java.lang.Object doCall();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_1
         4: aload_0
         5: aconst_null
         6: invokevirtual #46                 // Method doCall:(Ljava/lang/Object;)Ljava/lang/Object;
         9: areturn
        10: nop
        11: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = []
          stack = [ class java/lang/Throwable ]
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lorg/nirvana/groovy/LambdaCode$_main_closure1;
    RuntimeVisibleAnnotations:
      0: #44()

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #54                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/nirvana/groovy/LambdaCode$_main_closure1
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #60                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #62                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #54                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #68                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #62                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #71                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
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
         1: ldc           #32                 // int 0
         3: ldc           #77                 // String println
         5: aastore
         6: return

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #80                 // int 1
         2: anewarray     #82                 // class java/lang/String
         5: astore_0
         6: aload_0
         7: invokestatic  #84                 // Method $createCallSiteArray_1:([Ljava/lang/String;)V
        10: new           #86                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        13: dup
        14: ldc           #2                  // class org/nirvana/groovy/LambdaCode$_main_closure1
        16: aload_0
        17: invokespecial #89                 // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        20: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #91                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #91                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #96                 // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #86                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #98                 // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #93                 // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #101                // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #91                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #105                // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/codehaus/groovy/runtime/callsite/CallSiteArray ]
}
InnerClasses:
     public final #106= #2; //_main_closure1=class org/nirvana/groovy/LambdaCode$_main_closure1
EnclosingMethod: #9.#12                 // org.nirvana.groovy.LambdaCode.main
SourceFile: "LambdaCode.groovy"
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/groovy/LambdaCode$_main_closure2.class
  Last modified Feb 13, 2018; size 2479 bytes
  MD5 checksum 37a14d5af5678ecd7ff86fd02f18bcc0
  Compiled from "LambdaCode.groovy"
public final class org.nirvana.groovy.LambdaCode$_main_closure2 extends groovy.lang.Closure implements org.codehaus.groovy.runtime.GeneratedClosure
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/groovy/LambdaCode$_main_closure2
    #2 = Class              #1            // org/nirvana/groovy/LambdaCode$_main_closure2
    #3 = Utf8               groovy/lang/Closure
    #4 = Class              #3            // groovy/lang/Closure
    #5 = Utf8               org/codehaus/groovy/runtime/GeneratedClosure
    #6 = Class              #5            // org/codehaus/groovy/runtime/GeneratedClosure
    #7 = Utf8               LambdaCode.groovy
    #8 = Utf8               org/nirvana/groovy/LambdaCode
    #9 = Class              #8            // org/nirvana/groovy/LambdaCode
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
   #22 = Methodref          #2.#21        // org/nirvana/groovy/LambdaCode$_main_closure2.$getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #23 = NameAndType        #17:#18       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #24 = Methodref          #4.#23        // groovy/lang/Closure."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #25 = Utf8               this
   #26 = Utf8               Lorg/nirvana/groovy/LambdaCode$_main_closure2;
   #27 = Utf8               _outerInstance
   #28 = Utf8               Ljava/lang/Object;
   #29 = Utf8               _thisObject
   #30 = Utf8               doCall
   #31 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #32 = Integer            0
   #33 = Utf8               org/codehaus/groovy/runtime/callsite/CallSite
   #34 = Class              #33           // org/codehaus/groovy/runtime/callsite/CallSite
   #35 = Utf8               callCurrent
   #36 = Utf8               (Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
   #37 = NameAndType        #35:#36       // callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
   #38 = InterfaceMethodref #34.#37       // org/codehaus/groovy/runtime/callsite/CallSite.callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
   #39 = Utf8               it
   #40 = Utf8               java/lang/Throwable
   #41 = Class              #40           // java/lang/Throwable
   #42 = Utf8               Lgroovy/transform/Generated;
   #43 = NameAndType        #30:#31       // doCall:(Ljava/lang/Object;)Ljava/lang/Object;
   #44 = Methodref          #2.#43        // org/nirvana/groovy/LambdaCode$_main_closure2.doCall:(Ljava/lang/Object;)Ljava/lang/Object;
   #45 = Utf8               $getStaticMetaClass
   #46 = Utf8               ()Lgroovy/lang/MetaClass;
   #47 = Utf8               java/lang/Object
   #48 = Class              #47           // java/lang/Object
   #49 = Utf8               getClass
   #50 = Utf8               ()Ljava/lang/Class;
   #51 = NameAndType        #49:#50       // getClass:()Ljava/lang/Class;
   #52 = Methodref          #48.#51       // java/lang/Object.getClass:()Ljava/lang/Class;
   #53 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #54 = Class              #53           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #55 = Utf8               initMetaClass
   #56 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #57 = NameAndType        #55:#56       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #58 = Methodref          #54.#57       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #59 = NameAndType        #13:#14       // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #60 = Fieldref           #2.#59        // org/nirvana/groovy/LambdaCode$_main_closure2.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #61 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #62 = Class              #61           // org/codehaus/groovy/reflection/ClassInfo
   #63 = Utf8               getClassInfo
   #64 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #65 = NameAndType        #63:#64       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #66 = Methodref          #62.#65       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #67 = Utf8               getMetaClass
   #68 = NameAndType        #67:#46       // getMetaClass:()Lgroovy/lang/MetaClass;
   #69 = Methodref          #62.#68       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #70 = Utf8               $callSiteArray
   #71 = Utf8               Ljava/lang/ref/SoftReference;
   #72 = Utf8               $createCallSiteArray_1
   #73 = Utf8               ([Ljava/lang/String;)V
   #74 = Utf8               println
   #75 = String             #74           // println
   #76 = Utf8               $createCallSiteArray
   #77 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #78 = Integer            1
   #79 = Utf8               java/lang/String
   #80 = Class              #79           // java/lang/String
   #81 = NameAndType        #72:#73       // $createCallSiteArray_1:([Ljava/lang/String;)V
   #82 = Methodref          #2.#81        // org/nirvana/groovy/LambdaCode$_main_closure2.$createCallSiteArray_1:([Ljava/lang/String;)V
   #83 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
   #84 = Class              #83           // org/codehaus/groovy/runtime/callsite/CallSiteArray
   #85 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
   #86 = NameAndType        #17:#85       // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #87 = Methodref          #84.#86       // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #88 = NameAndType        #70:#71       // $callSiteArray:Ljava/lang/ref/SoftReference;
   #89 = Fieldref           #2.#88        // org/nirvana/groovy/LambdaCode$_main_closure2.$callSiteArray:Ljava/lang/ref/SoftReference;
   #90 = Utf8               java/lang/ref/SoftReference
   #91 = Class              #90           // java/lang/ref/SoftReference
   #92 = Utf8               get
   #93 = NameAndType        #92:#11       // get:()Ljava/lang/Object;
   #94 = Methodref          #91.#93       // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
   #95 = NameAndType        #76:#77       // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #96 = Methodref          #2.#95        // org/nirvana/groovy/LambdaCode$_main_closure2.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #97 = Utf8               (Ljava/lang/Object;)V
   #98 = NameAndType        #17:#97       // "<init>":(Ljava/lang/Object;)V
   #99 = Methodref          #91.#98       // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
  #100 = Utf8               array
  #101 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #102 = NameAndType        #100:#101     // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #103 = Fieldref           #84.#102      // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #104 = Utf8               _main_closure2
  #105 = Utf8               Code
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               StackMapTable
  #108 = Utf8               LineNumberTable
  #109 = Utf8               RuntimeVisibleAnnotations
  #110 = Utf8               InnerClasses
  #111 = Utf8               EnclosingMethod
  #112 = Utf8               SourceFile
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

  public org.nirvana.groovy.LambdaCode$_main_closure2(java.lang.Object, java.lang.Object);
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
            0      10     0  this   Lorg/nirvana/groovy/LambdaCode$_main_closure2;
            0      10     1 _outerInstance   Ljava/lang/Object;
            0      10     2 _thisObject   Ljava/lang/Object;

  public java.lang.Object doCall(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_2
         4: aload_2
         5: ldc           #32                 // int 0
         7: aaload
         8: aload_0
         9: aload_1
        10: invokeinterface #38,  3           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.callCurrent:(Lgroovy/lang/GroovyObject;Ljava/lang/Object;)Ljava/lang/Object;
        15: areturn
        16: nop
        17: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 8: 4
        line 8: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lorg/nirvana/groovy/LambdaCode$_main_closure2;
            0      16     1    it   Ljava/lang/Object;

  public java.lang.Object doCall();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_1
         4: aload_0
         5: aconst_null
         6: invokevirtual #44                 // Method doCall:(Ljava/lang/Object;)Ljava/lang/Object;
         9: areturn
        10: nop
        11: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = []
          stack = [ class java/lang/Throwable ]
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lorg/nirvana/groovy/LambdaCode$_main_closure2;
    RuntimeVisibleAnnotations:
      0: #42()

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #52                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/nirvana/groovy/LambdaCode$_main_closure2
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #58                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #60                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #52                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #66                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #60                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #69                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
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
         1: ldc           #32                 // int 0
         3: ldc           #75                 // String println
         5: aastore
         6: return

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #78                 // int 1
         2: anewarray     #80                 // class java/lang/String
         5: astore_0
         6: aload_0
         7: invokestatic  #82                 // Method $createCallSiteArray_1:([Ljava/lang/String;)V
        10: new           #84                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        13: dup
        14: ldc           #2                  // class org/nirvana/groovy/LambdaCode$_main_closure2
        16: aload_0
        17: invokespecial #87                 // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        20: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #89                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #89                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #94                 // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #84                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #96                 // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #91                 // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #99                 // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #89                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #103                // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/codehaus/groovy/runtime/callsite/CallSiteArray ]
}
InnerClasses:
     public final #104= #2; //_main_closure2=class org/nirvana/groovy/LambdaCode$_main_closure2
EnclosingMethod: #9.#12                 // org.nirvana.groovy.LambdaCode.main
SourceFile: "LambdaCode.groovy"
```