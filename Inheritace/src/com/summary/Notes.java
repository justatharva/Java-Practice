package com.summary;

public class Notes {
/*
Summary of Types
| Type         | Supported in Java?      | Structure                    |
| ------------ | ----------------------- | ---------------------------- |
| Single       | ✅ Yes                   | One Parent → One Child       |
| Multiple     | ❌ Classes, ✅ Interfaces | Many Parents → One Child     |
| Multilevel   | ✅ Yes                   | Grandparent → Parent → Child |
| Hierarchical | ✅ Yes                   | One Parent → Many Children   |
| Hybrid       | ❌ Classes, ✅ Interfaces | Combination                  |
*/
	
/*
How to Identify Inheritance While Designing Classes

Ask yourself these questions:

Question 1

Is there an "is-a" relationship?

Example:
Dog is an Animal ✔

Car is a Vehicle ✔

Employee is a Person ✔

Use inheritance.
-------------------------------------------------------------------------------

Question 2

Is it a "has-a" relationship?

Car has an Engine

Library has Books

Student has Address

Don't use inheritance.

Use Composition instead.

Rule

IS-A → Inheritance

HAS-A → Composition

Object Creation Flow

Suppose

Animal
    ↑
Dog

Create object

Dog d = new Dog();

Flow

Memory Allocation

↓

Animal Constructor

↓

Dog Constructor

↓

Object Ready

Parent constructor always executes first.
*/
}
