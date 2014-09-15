## 'Advanced' Java

---

### Generics

--- 
# Without Generics

</br></br>

```java 
	ArrayList list = new ArrayList(); 
    list.add("myString"); 
    String myString = (String)list.get(0);
```

---
# With Generics

</br></br>

```java
	// ArrayList<String> genericList = new ArrayList<String>(); 
	List<String> genericList = new ArrayList<String>(); 
    genericList.add("myGenericString"); 
    String myGenericString = genericList.get(0); 
```

---
# List

  * Ordered
  * Allows duplicate elements 
  * Extends Iterator
  * Use generics to specify type 

---
# HashMap
	
  * Uses HashTable to Implement the map interface
  * Get and Put has constant execution time for large sets
  * Should be used rather than HashTable in single threaded scopes (if thread safety is a must, see ConcurrentHashMap)
  * Order is not guaranteed 

---
# HashMap with Generics



```java
		HashMap<String, Double> myHashMap = new HashMap<String, Double>();
        
        myHashMap.put("key1", 20.5);
        myHashMap.get("key1"); // outputs 20.5
        
        myHashMap.containsKey("key1"); //outputs true
        myHashMap.remove("key1");
        
        myHashMap.get("key1"); // outputs null
        myHashMap.containsKey("key1"); //outputs false
```
---
# Static Factory Methods

  * Can improve performance by not creating a new object each time it’s invoked
  * Can return the same object from multiple invocations
  * Can return an object of any subtype of their return type. 
  * Can be difficult to distinguish from normal static methods

---
```java
	public static Boolean valueOf(boolean b) {
    	return b ? Boolean.TRUE : Boolean.FALSE;
	}
```

---
# Builder 

  * Should be considered when constructor has many parameters
  * Helps to avoid subtle logical bugs in reversing parameters
  * Simulates named optional parameters found in other languages

---
# Code to Interface vs Code to Implementation

  * Coding to Interface is preferred 
  * That a class implements an interface should therefore say something about what a client can do with instances of the class

---
# Exceptions

  * Abstracts away error checking logic 
  * Throw
  * Try-Catch-Finally

