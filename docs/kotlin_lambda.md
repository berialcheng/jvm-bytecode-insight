```
package org.nirvana.kotlin

class LambdaCode {

    fun foo(){
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    }
}
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/LambdaCode.class
  Last modified Feb 13, 2018; size 3498 bytes
  MD5 checksum bfd648aa0c873e778cf36449c1f77f16
  Compiled from "LambdaCode.kt"
public final class org.nirvana.kotlin.LambdaCode
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
    #1 = Utf8               org/nirvana/kotlin/LambdaCode
    #2 = Class              #1            // org/nirvana/kotlin/LambdaCode
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               foo
    #6 = Utf8               ()V
    #7 = Utf8               java/lang/String
    #8 = Class              #7            // java/lang/String
    #9 = Utf8               banana
   #10 = String             #9            // banana
   #11 = Utf8               avocado
   #12 = String             #11           // avocado
   #13 = Utf8               apple
   #14 = String             #13           // apple
   #15 = Utf8               kiwifruit
   #16 = String             #15           // kiwifruit
   #17 = Utf8               kotlin/collections/CollectionsKt
   #18 = Class              #17           // kotlin/collections/CollectionsKt
   #19 = Utf8               listOf
   #20 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #21 = NameAndType        #19:#20       // listOf:([Ljava/lang/Object;)Ljava/util/List;
   #22 = Methodref          #18.#21       // kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
   #23 = Utf8               java/lang/Iterable
   #24 = Class              #23           // java/lang/Iterable
   #25 = Utf8               java/util/ArrayList
   #26 = Class              #25           // java/util/ArrayList
   #27 = Utf8               <init>
   #28 = NameAndType        #27:#6        // "<init>":()V
   #29 = Methodref          #26.#28       // java/util/ArrayList."<init>":()V
   #30 = Utf8               java/util/Collection
   #31 = Class              #30           // java/util/Collection
   #32 = Utf8               iterator
   #33 = Utf8               ()Ljava/util/Iterator;
   #34 = NameAndType        #32:#33       // iterator:()Ljava/util/Iterator;
   #35 = InterfaceMethodref #24.#34       // java/lang/Iterable.iterator:()Ljava/util/Iterator;
   #36 = Utf8               java/util/Iterator
   #37 = Class              #36           // java/util/Iterator
   #38 = Utf8               hasNext
   #39 = Utf8               ()Z
   #40 = NameAndType        #38:#39       // hasNext:()Z
   #41 = InterfaceMethodref #37.#40       // java/util/Iterator.hasNext:()Z
   #42 = Utf8               next
   #43 = Utf8               ()Ljava/lang/Object;
   #44 = NameAndType        #42:#43       // next:()Ljava/lang/Object;
   #45 = InterfaceMethodref #37.#44       // java/util/Iterator.next:()Ljava/lang/Object;
   #46 = Utf8               a
   #47 = String             #46           // a
   #48 = Utf8               kotlin/text/StringsKt
   #49 = Class              #48           // kotlin/text/StringsKt
   #50 = Utf8               startsWith$default
   #51 = Utf8               (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
   #52 = NameAndType        #50:#51       // startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
   #53 = Methodref          #49.#52       // kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
   #54 = Utf8               add
   #55 = Utf8               (Ljava/lang/Object;)Z
   #56 = NameAndType        #54:#55       // add:(Ljava/lang/Object;)Z
   #57 = InterfaceMethodref #31.#56       // java/util/Collection.add:(Ljava/lang/Object;)Z
   #58 = Utf8               java/util/List
   #59 = Class              #58           // java/util/List
   #60 = Utf8               org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1
   #61 = Class              #60           // org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1
   #62 = Methodref          #61.#28       // org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1."<init>":()V
   #63 = Utf8               java/util/Comparator
   #64 = Class              #63           // java/util/Comparator
   #65 = Utf8               sortedWith
   #66 = Utf8               (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
   #67 = NameAndType        #65:#66       // sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
   #68 = Methodref          #18.#67       // kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
   #69 = Utf8               collectionSizeOrDefault
   #70 = Utf8               (Ljava/lang/Iterable;I)I
   #71 = NameAndType        #69:#70       // collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
   #72 = Methodref          #18.#71       // kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
   #73 = Utf8               (I)V
   #74 = NameAndType        #27:#73       // "<init>":(I)V
   #75 = Methodref          #26.#74       // java/util/ArrayList."<init>":(I)V
   #76 = Utf8               kotlin/TypeCastException
   #77 = Class              #76           // kotlin/TypeCastException
   #78 = Utf8               null cannot be cast to non-null type java.lang.String
   #79 = String             #78           // null cannot be cast to non-null type java.lang.String
   #80 = Utf8               (Ljava/lang/String;)V
   #81 = NameAndType        #27:#80       // "<init>":(Ljava/lang/String;)V
   #82 = Methodref          #77.#81       // kotlin/TypeCastException."<init>":(Ljava/lang/String;)V
   #83 = Utf8               toUpperCase
   #84 = Utf8               ()Ljava/lang/String;
   #85 = NameAndType        #83:#84       // toUpperCase:()Ljava/lang/String;
   #86 = Methodref          #8.#85        // java/lang/String.toUpperCase:()Ljava/lang/String;
   #87 = Utf8               (this as java.lang.String).toUpperCase()
   #88 = String             #87           // (this as java.lang.String).toUpperCase()
   #89 = Utf8               kotlin/jvm/internal/Intrinsics
   #90 = Class              #89           // kotlin/jvm/internal/Intrinsics
   #91 = Utf8               checkExpressionValueIsNotNull
   #92 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)V
   #93 = NameAndType        #91:#92       // checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #94 = Methodref          #90.#93       // kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
   #95 = Utf8               java/lang/System
   #96 = Class              #95           // java/lang/System
   #97 = Utf8               out
   #98 = Utf8               Ljava/io/PrintStream;
   #99 = NameAndType        #97:#98       // out:Ljava/io/PrintStream;
  #100 = Fieldref           #96.#99       // java/lang/System.out:Ljava/io/PrintStream;
  #101 = Utf8               java/io/PrintStream
  #102 = Class              #101          // java/io/PrintStream
  #103 = Utf8               println
  #104 = Utf8               (Ljava/lang/Object;)V
  #105 = NameAndType        #103:#104     // println:(Ljava/lang/Object;)V
  #106 = Methodref          #102.#105     // java/io/PrintStream.println:(Ljava/lang/Object;)V
  #107 = Utf8               it
  #108 = Utf8               Ljava/lang/String;
  #109 = Utf8               $i$a$-filter-LambdaCode$foo$1
  #110 = Utf8               I
  #111 = Utf8               element$iv$iv
  #112 = Utf8               Ljava/lang/Object;
  #113 = Utf8               $receiver$iv$iv
  #114 = Utf8               Ljava/lang/Iterable;
  #115 = Utf8               destination$iv$iv
  #116 = Utf8               Ljava/util/Collection;
  #117 = Utf8               $i$f$filterTo
  #118 = Utf8               $receiver$iv
  #119 = Utf8               $i$f$filter
  #120 = Utf8               $i$f$sortedBy
  #121 = Utf8               $i$a$-map-LambdaCode$foo$3
  #122 = Utf8               item$iv$iv
  #123 = Utf8               $i$f$mapTo
  #124 = Utf8               $i$f$map
  #125 = Utf8               $i$a$-forEach-LambdaCode$foo$4
  #126 = Utf8               element$iv
  #127 = Utf8               $i$f$forEach
  #128 = Utf8               fruits
  #129 = Utf8               Ljava/util/List;
  #130 = Utf8               this
  #131 = Utf8               Lorg/nirvana/kotlin/LambdaCode;
  #132 = Methodref          #4.#28        // java/lang/Object."<init>":()V
  #133 = Utf8               Lkotlin/Metadata;
  #134 = Utf8               mv
  #135 = Integer            1
  #136 = Integer            13
  #137 = Utf8               bv
  #138 = Integer            0
  #139 = Integer            3
  #140 = Utf8               k
  #141 = Utf8               d1
  #142 = Utf8               \n\n\\n\n20B¢J0¨
  #143 = Utf8               d2
  #144 = Utf8
  #145 = Utf8               jvm-class-insight
  #146 = Utf8               LambdaCode.kt
  #147 = Utf8               Code
  #148 = Utf8               StackMapTable
  #149 = Utf8               LineNumberTable
  #150 = Utf8               LocalVariableTable
  #151 = Utf8               SourceFile
  #152 = Utf8               SourceDebugExtension
  #153 = Utf8               RuntimeVisibleAnnotations
{
  public final void foo();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=14, args_size=1
         0: iconst_4
         1: anewarray     #8                  // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #10                 // String banana
         8: aastore
         9: dup
        10: iconst_1
        11: ldc           #12                 // String avocado
        13: aastore
        14: dup
        15: iconst_2
        16: ldc           #14                 // String apple
        18: aastore
        19: dup
        20: iconst_3
        21: ldc           #16                 // String kiwifruit
        23: aastore
        24: invokestatic  #22                 // Method kotlin/collections/CollectionsKt.listOf:([Ljava/lang/Object;)Ljava/util/List;
        27: astore_1
        28: aload_1
        29: checkcast     #24                 // class java/lang/Iterable
        32: astore_2
        33: nop
        34: aload_2
        35: astore_3
        36: new           #26                 // class java/util/ArrayList
        39: dup
        40: invokespecial #29                 // Method java/util/ArrayList."<init>":()V
        43: checkcast     #31                 // class java/util/Collection
        46: astore        4
        48: aload_3
        49: invokeinterface #35,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
        54: astore        5
        56: aload         5
        58: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        63: ifeq          111
        66: aload         5
        68: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        73: astore        6
        75: aload         6
        77: checkcast     #8                  // class java/lang/String
        80: astore        7
        82: iconst_0
        83: istore        8
        85: aload         7
        87: ldc           #47                 // String a
        89: iconst_0
        90: iconst_2
        91: aconst_null
        92: invokestatic  #53                 // Method kotlin/text/StringsKt.startsWith$default:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        95: ifeq          56
        98: aload         4
       100: aload         6
       102: invokeinterface #57,  2           // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       107: pop
       108: goto          56
       111: aload         4
       113: checkcast     #59                 // class java/util/List
       116: checkcast     #24                 // class java/lang/Iterable
       119: astore_2
       120: nop
       121: aload_2
       122: astore_3
       123: new           #61                 // class org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1
       126: dup
       127: invokespecial #62                 // Method org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1."<init>":()V
       130: checkcast     #64                 // class java/util/Comparator
       133: astore        4
       135: aload_3
       136: aload         4
       138: invokestatic  #68                 // Method kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
       141: checkcast     #24                 // class java/lang/Iterable
       144: astore_2
       145: nop
       146: aload_2
       147: astore_3
       148: new           #26                 // class java/util/ArrayList
       151: dup
       152: aload_2
       153: bipush        10
       155: invokestatic  #72                 // Method kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
       158: invokespecial #75                 // Method java/util/ArrayList."<init>":(I)V
       161: checkcast     #31                 // class java/util/Collection
       164: astore        4
       166: aload_3
       167: invokeinterface #35,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       172: astore        5
       174: aload         5
       176: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       181: ifeq          251
       184: aload         5
       186: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       191: astore        6
       193: aload         4
       195: aload         6
       197: checkcast     #8                  // class java/lang/String
       200: astore        7
       202: astore        12
       204: iconst_0
       205: istore        8
       207: aload         7
       209: astore        9
       211: aload         9
       213: dup
       214: ifnonnull     227
       217: new           #77                 // class kotlin/TypeCastException
       220: dup
       221: ldc           #79                 // String null cannot be cast to non-null type java.lang.String
       223: invokespecial #82                 // Method kotlin/TypeCastException."<init>":(Ljava/lang/String;)V
       226: athrow
       227: invokevirtual #86                 // Method java/lang/String.toUpperCase:()Ljava/lang/String;
       230: dup
       231: ldc           #88                 // String (this as java.lang.String).toUpperCase()
       233: invokestatic  #94                 // Method kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull:(Ljava/lang/Object;Ljava/lang/String;)V
       236: astore        13
       238: aload         12
       240: aload         13
       242: invokeinterface #57,  2           // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
       247: pop
       248: goto          174
       251: aload         4
       253: checkcast     #59                 // class java/util/List
       256: checkcast     #24                 // class java/lang/Iterable
       259: astore_2
       260: nop
       261: aload_2
       262: invokeinterface #35,  1           // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
       267: astore_3
       268: aload_3
       269: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       274: ifeq          307
       277: aload_3
       278: invokeinterface #45,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       283: astore        4
       285: aload         4
       287: checkcast     #8                  // class java/lang/String
       290: astore        5
       292: iconst_0
       293: istore        6
       295: getstatic     #100                // Field java/lang/System.out:Ljava/io/PrintStream;
       298: aload         5
       300: invokevirtual #106                // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
       303: nop
       304: goto          268
       307: nop
       308: return
      StackMapTable: number_of_entries = 7
        frame_type = 255 /* full_frame */
          offset_delta = 56
          locals = [ class org/nirvana/kotlin/LambdaCode, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, class java/util/Collection, class java/util/Iterator ]
          stack = []
        frame_type = 54 /* same */
        frame_type = 62 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 52
          locals = [ class org/nirvana/kotlin/LambdaCode, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, class java/util/Collection, class java/util/Iterator, class java/lang/Object, class java/lang/String, int, class java/lang/String, top, top, class java/util/Collection ]
          stack = [ class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class org/nirvana/kotlin/LambdaCode, class java/util/List, class java/lang/Iterable, class java/lang/Iterable, class java/util/Collection, class java/util/Iterator ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class org/nirvana/kotlin/LambdaCode, class java/util/List, class java/lang/Iterable, class java/util/Iterator, class java/lang/Object, class java/lang/Object ]
          stack = []
        frame_type = 38 /* same */
      LineNumberTable:
        line 6: 0
        line 7: 28
        line 11: 28
        line 7: 28
        line 10: 28
        line 7: 28
        line 9: 28
        line 7: 28
        line 8: 28
        line 7: 28
        line 8: 33
        line 14: 34
        line 15: 48
        line 8: 85
        line 16: 111
        line 9: 120
        line 17: 121
        line 17: 138
        line 10: 145
        line 18: 146
        line 19: 166
        line 20: 193
        line 10: 207
        line 10: 236
        line 19: 248
        line 21: 251
        line 11: 260
        line 22: 261
        line 11: 295
        line 11: 303
        line 23: 307
        line 12: 308
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           82      13     7    it   Ljava/lang/String;
           85      10     8 $i$a$-filter-LambdaCode$foo$1   I
           75      33     6 element$iv$iv   Ljava/lang/Object;
           48      65     3 $receiver$iv$iv   Ljava/lang/Iterable;
           48      65     4 destination$iv$iv   Ljava/util/Collection;
           48      65     9 $i$f$filterTo   I
           34      82     2 $receiver$iv   Ljava/lang/Iterable;
           34      82    10 $i$f$filter   I
          121      20     2 $receiver$iv   Ljava/lang/Iterable;
          121      20     5 $i$f$sortedBy   I
          204      32     7    it   Ljava/lang/String;
          207      29     8 $i$a$-map-LambdaCode$foo$3   I
          193      55     6 item$iv$iv   Ljava/lang/Object;
          166      87     3 $receiver$iv$iv   Ljava/lang/Iterable;
          166      87     4 destination$iv$iv   Ljava/util/Collection;
          166      87    10 $i$f$mapTo   I
          146     110     2 $receiver$iv   Ljava/lang/Iterable;
          146     110    11 $i$f$map   I
          292      11     5    it   Ljava/lang/String;
          295       8     6 $i$a$-forEach-LambdaCode$foo$4   I
          285      19     4 element$iv   Ljava/lang/Object;
          261      47     2 $receiver$iv   Ljava/lang/Iterable;
          261      47     7 $i$f$forEach   I
           28     281     1 fruits   Ljava/util/List;
            0     309     0  this   Lorg/nirvana/kotlin/LambdaCode;

  public org.nirvana.kotlin.LambdaCode();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #132                // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lorg/nirvana/kotlin/LambdaCode;
}
SourceFile: "LambdaCode.kt"
SourceDebugExtension:
  SMAP
  LambdaCode.kt
  Kotlin
  *S Kotlin
  *F
  + 1 LambdaCode.kt
  org/nirvana/kotlin/LambdaCode
  + 2 _Collections.kt
  kotlin/collections/CollectionsKt___CollectionsKt
  *L
  1#1,13:1
  667#2:14
  740#2,2:15
  909#2:17
  1301#2:18
  1370#2,3:19
  1574#2,2:22
  *E
  *S KotlinDebug
  *F
  + 1 LambdaCode.kt
  org/nirvana/kotlin/LambdaCode
  *L
  8#1:14
  8#1,2:15
  9#1:17
  10#1:18
  10#1,3:19
  11#1,2:22
  *E
RuntimeVisibleAnnotations:
  0: #133(#134=[I#135,I#135,I#136],#137=[I#135,I#138,I#139],#140=I#135,#141=[s#142],#143=[s#131,s#144,s#6,s#5,s#144,s#145])
```

```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1.class
  Last modified Feb 13, 2018; size 1764 bytes
  MD5 checksum 682a793675f03240715ceaa8cf8df0a9
  Compiled from "Comparisons.kt"
public final class org.nirvana.kotlin.LambdaCode$foo$$inlined$sortedBy$1<T extends java.lang.Object> extends java.lang.Object implements java.util.Comparator<T>
  minor version: 0
  major version: 50
  flags: ACC_PUBLIC, ACC_FINAL, ACC_SUPER
Constant pool:
   #1 = Utf8               org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1
   #2 = Class              #1             // org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1
   #3 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator<TT;>;
   #4 = Utf8               java/lang/Object
   #5 = Class              #4             // java/lang/Object
   #6 = Utf8               java/util/Comparator
   #7 = Class              #6             // java/util/Comparator
   #8 = Utf8               kotlin/comparisons/ComparisonsKt__ComparisonsKt
   #9 = Class              #8             // kotlin/comparisons/ComparisonsKt__ComparisonsKt
  #10 = Utf8               compareBy
  #11 = Utf8               (Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #12 = NameAndType        #10:#11        // compareBy:(Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
  #13 = Utf8               <init>
  #14 = Utf8               ()V
  #15 = NameAndType        #13:#14        // "<init>":()V
  #16 = Methodref          #5.#15         // java/lang/Object."<init>":()V
  #17 = Utf8               compare
  #18 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #19 = Utf8               (TT;TT;)I
  #20 = Utf8               java/lang/String
  #21 = Class              #20            // java/lang/String
  #22 = Utf8               java/lang/Comparable
  #23 = Class              #22            // java/lang/Comparable
  #24 = Utf8               kotlin/comparisons/ComparisonsKt
  #25 = Class              #24            // kotlin/comparisons/ComparisonsKt
  #26 = Utf8               compareValues
  #27 = Utf8               (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #28 = NameAndType        #26:#27        // compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #29 = Methodref          #25.#28        // kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
  #30 = Utf8               it
  #31 = Utf8               Ljava/lang/String;
  #32 = Utf8               $i$a$-sortedBy-LambdaCode$foo$2
  #33 = Utf8               I
  #34 = Utf8               this
  #35 = Utf8               Lorg/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1;
  #36 = Utf8               a
  #37 = Utf8               Ljava/lang/Object;
  #38 = Utf8               b
  #39 = Utf8               Lkotlin/Metadata;
  #40 = Utf8               mv
  #41 = Integer            1
  #42 = Integer            13
  #43 = Utf8               bv
  #44 = Integer            0
  #45 = Integer            3
  #46 = Utf8               k
  #47 = Utf8               d1
  #48 = Utf8               \n\\\\\\\0\2\n *HH2\n *HHH\n¨
  #49 = Utf8               d2
  #50 = Utf8               <anonymous>
  #51 = Utf8
  #52 = Utf8               T
  #53 = Utf8               kotlin.jvm.PlatformType
  #54 = Utf8               kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2
  #55 = Utf8               org/nirvana/kotlin/LambdaCode
  #56 = Class              #55            // org/nirvana/kotlin/LambdaCode
  #57 = Utf8               foo
  #58 = NameAndType        #57:#14        // foo:()V
  #59 = Utf8               Comparisons.kt
  #60 = Utf8               Code
  #61 = Utf8               LineNumberTable
  #62 = Utf8               LocalVariableTable
  #63 = Utf8               Signature
  #64 = Utf8               InnerClasses
  #65 = Utf8               EnclosingMethod
  #66 = Utf8               SourceFile
  #67 = Utf8               SourceDebugExtension
  #68 = Utf8               RuntimeVisibleAnnotations
{
  public org.nirvana.kotlin.LambdaCode$foo$$inlined$sortedBy$1();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #16                 // Method java/lang/Object."<init>":()V
         4: return

  public final int compare(T, T);
    descriptor: (Ljava/lang/Object;Ljava/lang/Object;)I
    flags: ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=7, args_size=3
         0: aload_1
         1: checkcast     #21                 // class java/lang/String
         4: astore_3
         5: iconst_0
         6: istore        4
         8: aload_3
         9: checkcast     #23                 // class java/lang/Comparable
        12: aload_2
        13: checkcast     #21                 // class java/lang/String
        16: astore_3
        17: astore        5
        19: iconst_0
        20: istore        4
        22: aload_3
        23: astore        6
        25: aload         5
        27: aload         6
        29: checkcast     #23                 // class java/lang/Comparable
        32: invokestatic  #29                 // Method kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
        35: ireturn
      LineNumberTable:
        line 102: 0
        line 320: 8
        line 321: 22
        line 102: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            5       4     3    it   Ljava/lang/String;
            8       1     4 $i$a$-sortedBy-LambdaCode$foo$2   I
           19       4     3    it   Ljava/lang/String;
           22       1     4 $i$a$-sortedBy-LambdaCode$foo$2   I
            0      36     0  this   Lorg/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1;
            0      36     1     a   Ljava/lang/Object;
            0      36     2     b   Ljava/lang/Object;
    Signature: #19                          // (TT;TT;)I
}
InnerClasses:
     public static final #2; //class org/nirvana/kotlin/LambdaCode$foo$$inlined$sortedBy$1
EnclosingMethod: #56.#58                // org.nirvana.kotlin.LambdaCode.foo
Signature: #3                           // <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator<TT;>;
SourceFile: "Comparisons.kt"
SourceDebugExtension:
  SMAP
  Comparisons.kt
  Kotlin
  *S Kotlin
  *F
  + 1 Comparisons.kt
  kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2
  + 2 LambdaCode.kt
  org/nirvana/kotlin/LambdaCode
  *L
  1#1,319:1
  9#2:320
  9#2:321
  *E
RuntimeVisibleAnnotations:
  0: #39(#40=[I#41,I#41,I#42],#43=[I#41,I#44,I#45],#46=I#45,#47=[s#48],#49=[s#50,s#51,s#52,s#36,s#53,s#38,s#17,s#18,s#54])
```