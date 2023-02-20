## Singleton - One of a Kind Objects

## What's Singleton ?
- The Singleton Pattern - like its name "singleton" -
assures that at any one time
there is only one instance of the Singleton object and  provides a global access point to this instance. In other words, the Singleton's purpose is to control object creation, limiting the number of obejcts to one only.he

## UML
![](/singleton/singleton_uml.png)

## How to implement Singleton ?
```java
package singleton;

public class Duck {
    private static Duck instance;

    private Duck() {
    }

    public static Duck getInstance() {
        if (instance == null) {
            instance = new Duck();
        }
        return instance;
    }
    // other methods
}
```

```java
package singleton;

public class DuckShop {
    public static void main(String[] args) {
        Duck _duck1 = Duck.getInstance();
        Duck _duck2 = Duck.getInstance();
        System.out.println(_duck1.equals(_duck2));  // true
        // Despite of the number of object created, just 
        // instance is created and they are equal together
    }
}
```

## Where used it?
- Singeton pattern is used for logging, driver objects, caching and thread pool.
- It is used in some standard API of Java (lang.Runtime, util.Calendar, awt.Desktop)
- Some other DP is use Singleton : Abstract Factory, Builder, Facade ... 

`Note` : Implementation like above code is Eager Implementation. In reality, it can be destructured by reflection API in Java. You can search about some other implement ways (synchronize, double-check,...).