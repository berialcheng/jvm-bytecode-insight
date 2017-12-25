```
package org.nirvana.java;

public class GenericCode<T> {

    T instanceField;

    public GenericCode(T instanceField) {
        this.instanceField = instanceField;
    }

    public static void main(String[] args) {
        GenericCode<String> o = new GenericCode<>("Generic");
    }
}

```


```
Classfile /Users/zhongcheng/workingcopy/jvm-class-insight/target/classes/org/nirvana/java/GenericCode.class
  Last modified Feb 13, 2018; size 732 bytes
  MD5 checksum 0b5a7437df226c69ccb6e6502703ad23
  Compiled from "GenericCode.java"
public class org.nirvana.java.GenericCode<T extends java.lang.Object> extends java.lang.Object
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // org/nirvana/java/GenericCode
   #2 = Utf8               org/nirvana/java/GenericCode
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               instanceField
   #6 = Utf8               Ljava/lang/Object;
   #7 = Utf8               Signature
   #8 = Utf8               TT;
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/Object;)V
  #11 = Utf8               (TT;)V
  #12 = Utf8               Code
  #13 = Methodref          #3.#14         // java/lang/Object."<init>":()V
  #14 = NameAndType        #9:#15         // "<init>":()V
  #15 = Utf8               ()V
  #16 = Fieldref           #1.#17         // org/nirvana/java/GenericCode.instanceField:Ljava/lang/Object;
  #17 = NameAndType        #5:#6          // instanceField:Ljava/lang/Object;
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lorg/nirvana/java/GenericCode;
  #22 = Utf8               LocalVariableTypeTable
  #23 = Utf8               Lorg/nirvana/java/GenericCode<TT;>;
  #24 = Utf8               main
  #25 = Utf8               ([Ljava/lang/String;)V
  #26 = String             #27            // Generic
  #27 = Utf8               Generic
  #28 = Methodref          #1.#29         // org/nirvana/java/GenericCode."<init>":(Ljava/lang/Object;)V
  #29 = NameAndType        #9:#10         // "<init>":(Ljava/lang/Object;)V
  #30 = Utf8               args
  #31 = Utf8               [Ljava/lang/String;
  #32 = Utf8               SourceFile
  #33 = Utf8               GenericCode.java
  #34 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;
{
  T instanceField;
    descriptor: Ljava/lang/Object;
    flags:
    Signature: #8                           // TT;

  public org.nirvana.java.GenericCode(T);
    descriptor: (Ljava/lang/Object;)V
    flags: ACC_PUBLIC
    Signature: #11                          // (TT;)V
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #13                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #16                 // Field instanceField:Ljava/lang/Object;
         9: return
      LineNumberTable:
        line 7: 0
        line 8: 4
        line 9: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lorg/nirvana/java/GenericCode;
            0      10     1 instanceField   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lorg/nirvana/java/GenericCode<TT;>;
            0      10     1 instanceField   TT;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: new           #1                  // class org/nirvana/java/GenericCode
         3: ldc           #26                 // String Generic
         5: invokespecial #28                 // Method "<init>":(Ljava/lang/Object;)V
         8: return
      LineNumberTable:
        line 12: 0
        line 13: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  args   [Ljava/lang/String;
}
SourceFile: "GenericCode.java"
Signature: #34                          // <T:Ljava/lang/Object;>Ljava/lang/Object;
```