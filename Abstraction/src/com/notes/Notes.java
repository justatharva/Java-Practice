package com.notes;

public class Notes {
	
//=========================Difference Between Abstract Class and Interface===========================
	
/*---------------------------------------------------------------------------------------------------------------------------------------------------------
| Feature               | Abstract Class                                | Interface                                                                        |
| --------------------- | --------------------------------------------- | -------------------------------------------------------------------------------- |
| Constructor           | ✅ Yes                                         | ❌ No                                                                             |
| Instance Variables    | ✅ Yes                                         | ❌ No (only constants)                                                            |
| Method Implementation | ✅ Can have both abstract and concrete methods | Primarily abstract methods (also supports default/static methods in modern Java) |
| Inheritance           | One abstract class                            | Multiple interfaces                                                              |
| Keyword               | `extends`                                     | `implements`                                                                     |
|----------------------------------------------------------------------------------------------------------------------------------------------------------
*/
	
//==========================Real-World Analogies============================
	
/*
Example 1: Car Steering Wheel

Imagine driving a car.

You use:

Steering Wheel
Brake
Accelerator

You do not need to know:

Engine combustion
Gearbox mechanics
Fuel injection process

The steering wheel provides an abstract interface to control the car while hiding the complex machinery.

Example 2: TV Remote

When you press:

Power
Volume +
Channel

You don't need to understand:

Circuit boards
Infrared signals
Processor logic
Internal electronics

The remote hides all these complexities and provides only the necessary controls.*/
	
//==========================Visual Representation==============================
	
/*
                User

                  |
                  ▼

         +----------------+
         |     Vehicle    |
         |----------------|
         | startEngine()  |
         | stopEngine()   |
         +----------------+
                  |
        (Implementation Hidden)
                  |
                  ▼

      +----------------------+
      | Engine, Fuel System, |
      | Battery, Starter     |
      +----------------------+
*/
	
//==========================Class Hierarchy============================
	
/*
            Vehicle
          (Abstract Class)
                 |
        ------------------
        |                |
      Car            Motorcycle
        |                |
 startEngine()    startEngine()
 */
	
	
}
