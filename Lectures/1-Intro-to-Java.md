# Java Primer 

![](http://media.scraphacker.com/2011/10/IMG_8557-WM1.jpg)

---
#Primitive Data Types

```java 
float x = 20.25; 

boolean x = true;

char x = ‘x’; 

byte x = 0x03; 

short x = 15;

int x = 20;

long x = 9,274,387,302
```

---
#Variables

```java
	String name; 
	name = "Al Tyus"; 

	String name = “Al Tyus”;

	int num = 20; 
```

---
#Operators

  * **Assignment:** =, +=, -=, /=, %=, etc…
  * **Additive:** +, - 
  * **Multiplicative:** *, /, %
  * **Relational:** <, >, <=, >=
  * **Equality:** ==, != 
  * **Logical AND:** &&
  * **Logical OR:** ||

---
#Control Flow

---
#if-then

```java 

int x = 15; 

if (x > 10) {
	System.out.println(x + “ is greater than 10”); 
}
```
---
#if-then-else

```java

int x = 15; 

if (x > 10) {
	System.out.println(x + “ is greater than 10”); 
} 
else if (x < 5) {
	System.out.println(x + “ is less than 5”);
} 
else {
	System.out.println(x + “ is neither greater than 10 or less than 5”);
}
```
---
#Iteration

**For Loop:** `for (int i = 0; i < 100; i++){// loop body}`

**For-each Loop:** `for (int i : myArray){// loop body}`

**While Loop:** `while (true){//loop body}`

**Do-While Loop:** `do {//loop body}while(true)`

---
#Class

</br>

```java

	public class Person {   
		//class body
	}

```
---

#Methods
 
##Instance Method
```java 
	private void grow(int inches) {
		//can access both static and instance variables and methods
	}
```

##Static Method
```java
	private static Time currentTime(){
	return Time.now(); //Only have access to static variables and methods 
}
```
---
#Constructor

```java

	public class Person {
		private String mName;
		
		public Person(String name){
		
		mName = name; 
	}   
}
```

---
#Getters and Setters

```java 
public class Person {
	private String mName;

	public Person(String name){
		mName = name; 
	}   
	
	public String getName(){
		return mName; 
	}
	
	public void setName(String name){
		mName = name; 
	} 
}
```
---
#Inheritance

```java
public class Main {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike();
        System.out.println(mb.getColor());  //prints red
    }
    public static class Bike{
        private static String mColor;
        public Bike(){
            mColor = "red";
        }
        public String getColor(){
            return mColor;
        }
    }
    public static class MountainBike extends Bike{}
}
```
---
#Interfaces

---
#Declaring Interfaces 
```java
public interface Animal {
	public void eat();
	public void move(); 
}
```
---
#Implementing Interfaces 
```java
public class Cat implements Animal {
	public void eat(){	
	}
	public void move(){
	} 
}
```
---
Everything Else 