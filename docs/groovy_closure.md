```
package org.nirvana.groovy

class ClosureCode {

    def main(){
        def closureWithOneArg = { str -> str.toUpperCase() }
        assert closureWithOneArg('groovy') == 'GROOVY'
    }
}
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/groovy/ClosureCode.class
  Last modified Feb 13, 2018; size 3770 bytes
  MD5 checksum 306996d46db707aabc272936f892c800
  Compiled from "ClosureCode.groovy"
public class org.nirvana.groovy.ClosureCode implements groovy.lang.GroovyObject
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/groovy/ClosureCode
    #2 = Class              #1            // org/nirvana/groovy/ClosureCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               groovy/lang/GroovyObject
    #6 = Class              #5            // groovy/lang/GroovyObject
    #7 = Utf8               ClosureCode.groovy
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
   #19 = Methodref          #2.#18        // org/nirvana/groovy/ClosureCode.$getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #20 = NameAndType        #14:#15       // "<init>":()V
   #21 = Methodref          #4.#20        // java/lang/Object."<init>":()V
   #22 = Utf8               $getStaticMetaClass
   #23 = Utf8               ()Lgroovy/lang/MetaClass;
   #24 = NameAndType        #22:#23       // $getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #25 = Methodref          #2.#24        // org/nirvana/groovy/ClosureCode.$getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #26 = NameAndType        #12:#13       // metaClass:Lgroovy/lang/MetaClass;
   #27 = Fieldref           #2.#26        // org/nirvana/groovy/ClosureCode.metaClass:Lgroovy/lang/MetaClass;
   #28 = Utf8               this
   #29 = Utf8               Lorg/nirvana/groovy/ClosureCode;
   #30 = Utf8               main
   #31 = Utf8               ()Ljava/lang/Object;
   #32 = Utf8               org/nirvana/groovy/ClosureCode$_main_closure1
   #33 = Class              #32           // org/nirvana/groovy/ClosureCode$_main_closure1
   #34 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)V
   #35 = NameAndType        #14:#34       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #36 = Methodref          #33.#35       // org/nirvana/groovy/ClosureCode$_main_closure1."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #37 = Utf8               org/codehaus/groovy/runtime/powerassert/ValueRecorder
   #38 = Class              #37           // org/codehaus/groovy/runtime/powerassert/ValueRecorder
   #39 = Methodref          #38.#20       // org/codehaus/groovy/runtime/powerassert/ValueRecorder."<init>":()V
   #40 = Integer            0
   #41 = Integer            8
   #42 = Utf8               record
   #43 = Utf8               (Ljava/lang/Object;I)Ljava/lang/Object;
   #44 = NameAndType        #42:#43       // record:(Ljava/lang/Object;I)Ljava/lang/Object;
   #45 = Methodref          #38.#44       // org/codehaus/groovy/runtime/powerassert/ValueRecorder.record:(Ljava/lang/Object;I)Ljava/lang/Object;
   #46 = Utf8               groovy
   #47 = String             #46           // groovy
   #48 = Utf8               org/codehaus/groovy/runtime/callsite/CallSite
   #49 = Class              #48           // org/codehaus/groovy/runtime/callsite/CallSite
   #50 = Utf8               call
   #51 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #52 = NameAndType        #50:#51       // call:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #53 = InterfaceMethodref #49.#52       // org/codehaus/groovy/runtime/callsite/CallSite.call:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #54 = Utf8               GROOVY
   #55 = String             #54           // GROOVY
   #56 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #57 = Class              #56           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #58 = Utf8               compareEqual
   #59 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
   #60 = NameAndType        #58:#59       // compareEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #61 = Methodref          #57.#60       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.compareEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
   #62 = Utf8               java/lang/Boolean
   #63 = Class              #62           // java/lang/Boolean
   #64 = Utf8               valueOf
   #65 = Utf8               (Z)Ljava/lang/Boolean;
   #66 = NameAndType        #64:#65       // valueOf:(Z)Ljava/lang/Boolean;
   #67 = Methodref          #63.#66       // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
   #68 = Integer            36
   #69 = Utf8               clear
   #70 = NameAndType        #69:#15       // clear:()V
   #71 = Methodref          #38.#70       // org/codehaus/groovy/runtime/powerassert/ValueRecorder.clear:()V
   #72 = Utf8               assert closureWithOneArg('groovy') == 'GROOVY'
   #73 = String             #72           // assert closureWithOneArg('groovy') == 'GROOVY'
   #74 = Utf8               org/codehaus/groovy/runtime/powerassert/AssertionRenderer
   #75 = Class              #74           // org/codehaus/groovy/runtime/powerassert/AssertionRenderer
   #76 = Utf8               render
   #77 = Utf8               (Ljava/lang/String;Lorg/codehaus/groovy/runtime/powerassert/ValueRecorder;)Ljava/lang/String;
   #78 = NameAndType        #76:#77       // render:(Ljava/lang/String;Lorg/codehaus/groovy/runtime/powerassert/ValueRecorder;)Ljava/lang/String;
   #79 = Methodref          #75.#78       // org/codehaus/groovy/runtime/powerassert/AssertionRenderer.render:(Ljava/lang/String;Lorg/codehaus/groovy/runtime/powerassert/ValueRecorder;)Ljava/lang/String;
   #80 = Utf8               assertFailed
   #81 = NameAndType        #80:#34       // assertFailed:(Ljava/lang/Object;Ljava/lang/Object;)V
   #82 = Methodref          #57.#81       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.assertFailed:(Ljava/lang/Object;Ljava/lang/Object;)V
   #83 = Utf8               closureWithOneArg
   #84 = Utf8               Ljava/lang/Object;
   #85 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #86 = Class              #85           // "[Lorg/codehaus/groovy/runtime/callsite/CallSite;"
   #87 = Utf8               java/lang/Throwable
   #88 = Class              #87           // java/lang/Throwable
   #89 = Utf8               getClass
   #90 = Utf8               ()Ljava/lang/Class;
   #91 = NameAndType        #89:#90       // getClass:()Ljava/lang/Class;
   #92 = Methodref          #4.#91        // java/lang/Object.getClass:()Ljava/lang/Class;
   #93 = Utf8               initMetaClass
   #94 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #95 = NameAndType        #93:#94       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #96 = Methodref          #57.#95       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #97 = NameAndType        #8:#9         // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #98 = Fieldref           #2.#97        // org/nirvana/groovy/ClosureCode.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #99 = Utf8               org/codehaus/groovy/reflection/ClassInfo
  #100 = Class              #99           // org/codehaus/groovy/reflection/ClassInfo
  #101 = Utf8               getClassInfo
  #102 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
  #103 = NameAndType        #101:#102     // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
  #104 = Methodref          #100.#103     // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
  #105 = Utf8               getMetaClass
  #106 = NameAndType        #105:#23      // getMetaClass:()Lgroovy/lang/MetaClass;
  #107 = Methodref          #100.#106     // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
  #108 = Utf8               Lgroovy/transform/Generated;
  #109 = Utf8               Lgroovy/transform/Internal;
  #110 = Utf8               groovy/lang/MetaClass
  #111 = Class              #110          // groovy/lang/MetaClass
  #112 = Utf8               setMetaClass
  #113 = Utf8               (Lgroovy/lang/MetaClass;)V
  #114 = Utf8               invokeMethod
  #115 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #116 = Methodref          #2.#106       // org/nirvana/groovy/ClosureCode.getMetaClass:()Lgroovy/lang/MetaClass;
  #117 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #118 = NameAndType        #114:#117     // invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #119 = InterfaceMethodref #111.#118     // groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #120 = Utf8               getProperty
  #121 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
  #122 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #123 = NameAndType        #120:#122     // getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #124 = InterfaceMethodref #111.#123     // groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #125 = Utf8               setProperty
  #126 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #127 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #128 = NameAndType        #125:#127     // setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #129 = InterfaceMethodref #111.#128     // groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #130 = Utf8               $callSiteArray
  #131 = Utf8               Ljava/lang/ref/SoftReference;
  #132 = Utf8               $createCallSiteArray_1
  #133 = Utf8               ([Ljava/lang/String;)V
  #134 = String             #50           // call
  #135 = Utf8               $createCallSiteArray
  #136 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #137 = Integer            1
  #138 = Utf8               java/lang/String
  #139 = Class              #138          // java/lang/String
  #140 = NameAndType        #132:#133     // $createCallSiteArray_1:([Ljava/lang/String;)V
  #141 = Methodref          #2.#140       // org/nirvana/groovy/ClosureCode.$createCallSiteArray_1:([Ljava/lang/String;)V
  #142 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
  #143 = Class              #142          // org/codehaus/groovy/runtime/callsite/CallSiteArray
  #144 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
  #145 = NameAndType        #14:#144      // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #146 = Methodref          #143.#145     // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #147 = NameAndType        #130:#131     // $callSiteArray:Ljava/lang/ref/SoftReference;
  #148 = Fieldref           #2.#147       // org/nirvana/groovy/ClosureCode.$callSiteArray:Ljava/lang/ref/SoftReference;
  #149 = Utf8               java/lang/ref/SoftReference
  #150 = Class              #149          // java/lang/ref/SoftReference
  #151 = Utf8               get
  #152 = NameAndType        #151:#31      // get:()Ljava/lang/Object;
  #153 = Methodref          #150.#152     // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
  #154 = NameAndType        #135:#136     // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #155 = Methodref          #2.#154       // org/nirvana/groovy/ClosureCode.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #156 = Utf8               (Ljava/lang/Object;)V
  #157 = NameAndType        #14:#156      // "<init>":(Ljava/lang/Object;)V
  #158 = Methodref          #150.#157     // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
  #159 = Utf8               array
  #160 = NameAndType        #159:#85      // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #161 = Fieldref           #143.#160     // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #162 = Utf8               _main_closure1
  #163 = Utf8               Code
  #164 = Utf8               LocalVariableTable
  #165 = Utf8               StackMapTable
  #166 = Utf8               LineNumberTable
  #167 = Utf8               RuntimeVisibleAnnotations
  #168 = Utf8               InnerClasses
  #169 = Utf8               SourceFile
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

  public org.nirvana.groovy.ClosureCode();
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
            0      21     0  this   Lorg/nirvana/groovy/ClosureCode;

  public java.lang.Object main();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=1
         0: invokestatic  #19                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_1
         4: new           #33                 // class org/nirvana/groovy/ClosureCode$_main_closure1
         7: dup
         8: aload_0
         9: aload_0
        10: invokespecial #36                 // Method org/nirvana/groovy/ClosureCode$_main_closure1."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
        13: astore_2
        14: aload_2
        15: pop
        16: new           #38                 // class org/codehaus/groovy/runtime/powerassert/ValueRecorder
        19: dup
        20: invokespecial #39                 // Method org/codehaus/groovy/runtime/powerassert/ValueRecorder."<init>":()V
        23: astore_3
        24: aload_1
        25: ldc           #40                 // int 0
        27: aaload
        28: aload_2
        29: dup
        30: aload_3
        31: swap
        32: ldc           #41                 // int 8
        34: invokevirtual #45                 // Method org/codehaus/groovy/runtime/powerassert/ValueRecorder.record:(Ljava/lang/Object;I)Ljava/lang/Object;
        37: pop
        38: ldc           #47                 // String groovy
        40: invokeinterface #53,  3           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.call:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        45: dup
        46: aload_3
        47: swap
        48: ldc           #41                 // int 8
        50: invokevirtual #45                 // Method org/codehaus/groovy/runtime/powerassert/ValueRecorder.record:(Ljava/lang/Object;I)Ljava/lang/Object;
        53: pop
        54: ldc           #55                 // String GROOVY
        56: invokestatic  #61                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.compareEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        59: dup
        60: invokestatic  #67                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        63: aload_3
        64: swap
        65: ldc           #68                 // int 36
        67: invokevirtual #45                 // Method org/codehaus/groovy/runtime/powerassert/ValueRecorder.record:(Ljava/lang/Object;I)Ljava/lang/Object;
        70: pop
        71: ifeq          81
        74: aload_3
        75: invokevirtual #71                 // Method org/codehaus/groovy/runtime/powerassert/ValueRecorder.clear:()V
        78: goto          99
        81: ldc           #73                 // String assert closureWithOneArg('groovy') == 'GROOVY'
        83: aload_3
        84: invokestatic  #79                 // Method org/codehaus/groovy/runtime/powerassert/AssertionRenderer.render:(Ljava/lang/String;Lorg/codehaus/groovy/runtime/powerassert/ValueRecorder;)Ljava/lang/String;
        87: aconst_null
        88: invokestatic  #82                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.assertFailed:(Ljava/lang/Object;Ljava/lang/Object;)V
        91: goto          99
        94: aload_3
        95: invokevirtual #71                 // Method org/codehaus/groovy/runtime/powerassert/ValueRecorder.clear:()V
        98: athrow
        99: aconst_null
       100: areturn
       101: nop
       102: athrow
      Exception table:
         from    to  target type
            24    91    94   any
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 81
          locals = [ class "[Lorg/codehaus/groovy/runtime/callsite/CallSite;", class org/nirvana/groovy/ClosureCode$_main_closure1, class org/codehaus/groovy/runtime/powerassert/ValueRecorder ]
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 4 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 6: 4
        line 7: 16
        line 7: 101
        line 8: 101
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     101     0  this   Lorg/nirvana/groovy/ClosureCode;
           14      87     2 closureWithOneArg   Ljava/lang/Object;

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #92                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/nirvana/groovy/ClosureCode
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #96                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #98                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #92                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #104                // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #98                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #107                // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
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
      0: #108()
      1: #109()

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
      0: #108()
      1: #109()

  public java.lang.Object invokeMethod(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #116                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #119,  4          // InterfaceMethod groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
        12: areturn
    RuntimeVisibleAnnotations:
      0: #108()
      1: #109()

  public java.lang.Object getProperty(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #116                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: invokeinterface #124,  3          // InterfaceMethod groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        11: areturn
    RuntimeVisibleAnnotations:
      0: #108()
      1: #109()

  public void setProperty(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #116                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #129,  4          // InterfaceMethod groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        12: return
    RuntimeVisibleAnnotations:
      0: #108()
      1: #109()

  private static void $createCallSiteArray_1(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #40                 // int 0
         3: ldc           #134                // String call
         5: aastore
         6: return

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #137                // int 1
         2: anewarray     #139                // class java/lang/String
         5: astore_0
         6: aload_0
         7: invokestatic  #141                // Method $createCallSiteArray_1:([Ljava/lang/String;)V
        10: new           #143                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        13: dup
        14: ldc           #2                  // class org/nirvana/groovy/ClosureCode
        16: aload_0
        17: invokespecial #146                // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        20: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #148                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #148                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #153                // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #143                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #155                // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #150                // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #158                // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #148                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #161                // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/codehaus/groovy/runtime/callsite/CallSiteArray ]
}
InnerClasses:
     public final #162= #33; //_main_closure1=class org/nirvana/groovy/ClosureCode$_main_closure1
SourceFile: "ClosureCode.groovy"
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/groovy/ClosureCode$_main_closure1.class
  Last modified Feb 13, 2018; size 2258 bytes
  MD5 checksum 6e1860d7e0b377e9764ce4673b11eb0f
  Compiled from "ClosureCode.groovy"
public final class org.nirvana.groovy.ClosureCode$_main_closure1 extends groovy.lang.Closure implements org.codehaus.groovy.runtime.GeneratedClosure
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/groovy/ClosureCode$_main_closure1
    #2 = Class              #1            // org/nirvana/groovy/ClosureCode$_main_closure1
    #3 = Utf8               groovy/lang/Closure
    #4 = Class              #3            // groovy/lang/Closure
    #5 = Utf8               org/codehaus/groovy/runtime/GeneratedClosure
    #6 = Class              #5            // org/codehaus/groovy/runtime/GeneratedClosure
    #7 = Utf8               ClosureCode.groovy
    #8 = Utf8               org/nirvana/groovy/ClosureCode
    #9 = Class              #8            // org/nirvana/groovy/ClosureCode
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
   #22 = Methodref          #2.#21        // org/nirvana/groovy/ClosureCode$_main_closure1.$getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #23 = NameAndType        #17:#18       // "<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #24 = Methodref          #4.#23        // groovy/lang/Closure."<init>":(Ljava/lang/Object;Ljava/lang/Object;)V
   #25 = Utf8               this
   #26 = Utf8               Lorg/nirvana/groovy/ClosureCode$_main_closure1;
   #27 = Utf8               _outerInstance
   #28 = Utf8               Ljava/lang/Object;
   #29 = Utf8               _thisObject
   #30 = Utf8               doCall
   #31 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #32 = Integer            0
   #33 = Utf8               org/codehaus/groovy/runtime/callsite/CallSite
   #34 = Class              #33           // org/codehaus/groovy/runtime/callsite/CallSite
   #35 = Utf8               call
   #36 = NameAndType        #35:#31       // call:(Ljava/lang/Object;)Ljava/lang/Object;
   #37 = InterfaceMethodref #34.#36       // org/codehaus/groovy/runtime/callsite/CallSite.call:(Ljava/lang/Object;)Ljava/lang/Object;
   #38 = Utf8               str
   #39 = Utf8               java/lang/Throwable
   #40 = Class              #39           // java/lang/Throwable
   #41 = Utf8               $getStaticMetaClass
   #42 = Utf8               ()Lgroovy/lang/MetaClass;
   #43 = Utf8               java/lang/Object
   #44 = Class              #43           // java/lang/Object
   #45 = Utf8               getClass
   #46 = Utf8               ()Ljava/lang/Class;
   #47 = NameAndType        #45:#46       // getClass:()Ljava/lang/Class;
   #48 = Methodref          #44.#47       // java/lang/Object.getClass:()Ljava/lang/Class;
   #49 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #50 = Class              #49           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #51 = Utf8               initMetaClass
   #52 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #53 = NameAndType        #51:#52       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #54 = Methodref          #50.#53       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #55 = NameAndType        #13:#14       // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #56 = Fieldref           #2.#55        // org/nirvana/groovy/ClosureCode$_main_closure1.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #57 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #58 = Class              #57           // org/codehaus/groovy/reflection/ClassInfo
   #59 = Utf8               getClassInfo
   #60 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #61 = NameAndType        #59:#60       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #62 = Methodref          #58.#61       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #63 = Utf8               getMetaClass
   #64 = NameAndType        #63:#42       // getMetaClass:()Lgroovy/lang/MetaClass;
   #65 = Methodref          #58.#64       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #66 = Utf8               $callSiteArray
   #67 = Utf8               Ljava/lang/ref/SoftReference;
   #68 = Utf8               $createCallSiteArray_1
   #69 = Utf8               ([Ljava/lang/String;)V
   #70 = Utf8               toUpperCase
   #71 = String             #70           // toUpperCase
   #72 = Utf8               $createCallSiteArray
   #73 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #74 = Integer            1
   #75 = Utf8               java/lang/String
   #76 = Class              #75           // java/lang/String
   #77 = NameAndType        #68:#69       // $createCallSiteArray_1:([Ljava/lang/String;)V
   #78 = Methodref          #2.#77        // org/nirvana/groovy/ClosureCode$_main_closure1.$createCallSiteArray_1:([Ljava/lang/String;)V
   #79 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
   #80 = Class              #79           // org/codehaus/groovy/runtime/callsite/CallSiteArray
   #81 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
   #82 = NameAndType        #17:#81       // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #83 = Methodref          #80.#82       // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
   #84 = NameAndType        #66:#67       // $callSiteArray:Ljava/lang/ref/SoftReference;
   #85 = Fieldref           #2.#84        // org/nirvana/groovy/ClosureCode$_main_closure1.$callSiteArray:Ljava/lang/ref/SoftReference;
   #86 = Utf8               java/lang/ref/SoftReference
   #87 = Class              #86           // java/lang/ref/SoftReference
   #88 = Utf8               get
   #89 = NameAndType        #88:#11       // get:()Ljava/lang/Object;
   #90 = Methodref          #87.#89       // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
   #91 = NameAndType        #72:#73       // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #92 = Methodref          #2.#91        // org/nirvana/groovy/ClosureCode$_main_closure1.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
   #93 = Utf8               (Ljava/lang/Object;)V
   #94 = NameAndType        #17:#93       // "<init>":(Ljava/lang/Object;)V
   #95 = Methodref          #87.#94       // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
   #96 = Utf8               array
   #97 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #98 = NameAndType        #96:#97       // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
   #99 = Fieldref           #80.#98       // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #100 = Utf8               _main_closure1
  #101 = Utf8               Code
  #102 = Utf8               LocalVariableTable
  #103 = Utf8               StackMapTable
  #104 = Utf8               LineNumberTable
  #105 = Utf8               InnerClasses
  #106 = Utf8               EnclosingMethod
  #107 = Utf8               SourceFile
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

  public org.nirvana.groovy.ClosureCode$_main_closure1(java.lang.Object, java.lang.Object);
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
            0      10     0  this   Lorg/nirvana/groovy/ClosureCode$_main_closure1;
            0      10     1 _outerInstance   Ljava/lang/Object;
            0      10     2 _thisObject   Ljava/lang/Object;

  public java.lang.Object doCall(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: invokestatic  #22                 // Method $getCallSiteArray:()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
         3: astore_2
         4: aload_2
         5: ldc           #32                 // int 0
         7: aaload
         8: aload_1
         9: invokeinterface #37,  2           // InterfaceMethod org/codehaus/groovy/runtime/callsite/CallSite.call:(Ljava/lang/Object;)Ljava/lang/Object;
        14: areturn
        15: nop
        16: athrow
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = []
          stack = [ class java/lang/Throwable ]
      LineNumberTable:
        line 6: 4
        line 6: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lorg/nirvana/groovy/ClosureCode$_main_closure1;
            0      15     1   str   Ljava/lang/Object;

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #48                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/nirvana/groovy/ClosureCode$_main_closure1
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #54                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #56                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #48                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #62                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #56                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #65                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
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
         3: ldc           #71                 // String toUpperCase
         5: aastore
         6: return

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #74                 // int 1
         2: anewarray     #76                 // class java/lang/String
         5: astore_0
         6: aload_0
         7: invokestatic  #78                 // Method $createCallSiteArray_1:([Ljava/lang/String;)V
        10: new           #80                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        13: dup
        14: ldc           #2                  // class org/nirvana/groovy/ClosureCode$_main_closure1
        16: aload_0
        17: invokespecial #83                 // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        20: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #85                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #85                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #90                 // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #80                 // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #92                 // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #87                 // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #95                 // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #85                 // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #99                 // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class org/codehaus/groovy/runtime/callsite/CallSiteArray ]
}
InnerClasses:
     public final #100= #2; //_main_closure1=class org/nirvana/groovy/ClosureCode$_main_closure1
EnclosingMethod: #9.#12                 // org.nirvana.groovy.ClosureCode.main
SourceFile: "ClosureCode.groovy"
```