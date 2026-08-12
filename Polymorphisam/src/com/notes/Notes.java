package com.notes;

public class Notes {
/*Compile-Time vs Runtime Polymorphism
| Feature            | Compile-Time       | Runtime           |
| ------------------ | ------------------ | ----------------- |
| Technique          | Method Overloading | Method Overriding |
| Binding            | Early Binding      | Late Binding      |
| Inheritance Needed | No                 | Yes               |
| Parameters         | Different          | Same              |
| Decided            | During Compilation | During Execution  |
| Speed              | Faster             | Slightly Slower   |

Benefits of Polymorphism
1. Code Reusability

One parent class can be reused by many child classes.

Animal

↓

Dog

↓

Cat

↓

Lion

↓

Cow

No duplicate code.

2. Flexibility

You can write generic code.

Example

Animal animal;

animal = new Dog();

animal = new Cat();

animal = new Lion();

No changes in main logic.

3. Easy Maintenance

Suppose tomorrow you create

class Tiger extends Animal

You don't modify old code.

Just create

Animal a = new Tiger();

a.sound();

Done.

3. Forgetting @Override

Wrong

class Dog extends Animal{

    void sounds(){

    }
}

Compiler thinks it's a new method.

Correct

@Override
void sound(){

}

@Override helps the compiler detect mistakes like misspelled method names or incorrect parameters.

Interview Questions
Q1. What is Polymorphism?

Answer:
Polymorphism is the ability of one method or object to take many forms. 
In Java, it is achieved through method overloading (compile-time polymorphism) 
and method overriding (runtime polymorphism).

Q2. What is Method Overloading?

Answer:
Method overloading is defining multiple methods with the same name but 
different parameter lists in the same class. The compiler selects the 
appropriate method based on the arguments.

Q3. What is Method Overriding?

Answer:
Method overriding occurs when a subclass provides its own implementation of a method 
already defined in its superclass, enabling runtime polymorphism.

Q4. Which Polymorphism is Faster?

Answer:
Compile-time polymorphism is generally faster because the method is resolved during compilation, 
whereas runtime polymorphism involves dynamic method dispatch at execution time.

Summary

| Topic                     | Key Point                                                      |
| ------------------------- | -------------------------------------------------------------- |
| Polymorphism              | One action, many forms                                         |
| Compile-Time Polymorphism | Method Overloading                                             |
| Runtime Polymorphism      | Method Overriding                                              |
| Overloading               | Same method name, different parameters                         |
| Overriding                | Same method signature, different implementation in child class |
| `@Override`               | Helps the compiler verify correct overriding                   |
| Main Benefits             | Reusability, flexibility, maintainability, extensibility       |

Quick Memory Trick
Overloading → Same class + Same method name + Different parameters (chosen at compile time)
Overriding → Parent & Child classes + Same method signature + Different implementation (chosen at runtime)

*/
}
