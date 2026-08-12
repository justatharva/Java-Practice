package com.multiple_inheritance;

public class Notes {
/*
2. Multiple Inheritance

One child inherits from multiple parents.

Diagram

Father      Mother
     \      /
      \    /
      Child
-------------------------------------------
Does Java support this?

❌ No (for classes)

Because of the Diamond Problem.

Example:

      Animal
      /   \
   Bird   Mammal
      \   /
       Bat

If both Bird and Mammal have same method,

Which one should Bat inherit?

Java avoids this confusion.
--------------------------------------------
Java Alternative

Java supports Multiple Inheritance using Interfaces.
*/
}
