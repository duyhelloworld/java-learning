# Design Pattern - One of success keys for good software developers

*`This essay's example is written in Java. Please get the basic Java core and OOP skills first, and you can mark it somewhere in your device to read later`*
## What Is Design Pattern? What's it solve
- First, let back to the past, when programming is only inceptive structure. Our forerunners in the profession has developed the typical app several time, based on Object-Oriented programming languages. They __meet the same problem__,__follow a conception__ and __do the same solution__. 

    But noone make it more __architectural__ and aggregate this solutions,
    or make it more 'easy-access' for other junior.
- In  1995, there are four person - senior developer who aggregate and write to the [Design Patterns: Elements Of Reusable Object-Oriented Software]("http://www.amazon.co.uk/Design-patterns-elements-reusable-object-oriented/dp/0201633612") - the "bible" of many software developer over time (The authors is call `"Gang of Four"`). This book has architect 23 "forms" of solution for developer in OOP language (Later, some language's owner operater like Oracle(Java) and Microsoft(C#) has support many features for their language based in them). [Link](https://www.oracle.com/technical-resources/articles/javaee/j2eepatterns.html)

    These "forms" is called "design pattern" - which we will explore today.
Like data structures and algorithms, it isn't in a special programming language , but it can implement easiest and powerest in the OO programming language (general and pure like Java, C# or support for OOP like Python, C++, JavaScript). 
`It's just the pattern for one or some problem which it can solve effectively.`

- Design Patterns is divided into layers, based on **level of problem** you meet (medium, difficult), not your **coding level**. So, please don't use it for show off your ability by using so much design patterns. It may have the opposite effect and make other problem. **It's created to solve the complex problem, not to make the problem more complex.**

___
`Definition`: "In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. It offer a best practice approach to support object-oriented software design, which is easier to design, implement, change, test and reuse."
___

## How's a Design Pattern structured?
- Each design pattern solve it's problem, and base on them, it suggest a design pattern which is most suitable and approciated conception and implementation.
- Best practice of learning Design Patterns is follow 3 issue of this design pattern : 
> + Problem : "What's it solve?"
> + UML     : "How's it look?"
> + Code example : "How to implement it?"

## Benefit of using Design Paterns
> - It help you solve the problem you meet effectively. 
> - Improve your code 
`Your code can be more reusable and easier to scale up whenever the project / product extend. Additional, it can improves your code's readability and maintainability.`
> - Less errors and less costing time for test
`Design pattern help us to void potential problem, fallibility by using tested, proven development paradigms (Not to "Reinvent the wheel")`
> - Better communitcation
`DP allow developers the easier way to communicate about problems.`

--> If used well, DP can speed up your development process and reduce the chance of errors.

## Cristicism of using Design Patterns
> - Target **wrong** problem. 
`Some developer desmonstrate that 16/23 design pattern can be eliminated in some other programming language, which can help developer avoid to "choose" wrong solution.`
> - Require **extensive knowledge**
`Conquering design pattern is need more time to deep into, both the time for learning the OO programming language. It consume a large space for concepts inside the programmer’s head.`
> - Limit creativity and the power of programming language 
`Because of the "path thinking" whenever meet a problem solved before and use it anytime, you may limit your innovation and cannot use programming language's features in the effectest way. You will scare to try another technology, no hope when move language or try a new and high risk way to solve the problem.`
> - Lack of formal foundations
`It is the experience of software developers, not the study in "ad hoc" way of computer scientists. In 1999, Gang of Four were "charged" by numberous computer scientist, architecture,... in OOPSLA show trial.`
> - Differ unsignificantly from other abstractions
`The MVC , MVP and MVVM are use the same logic for implementation, just enhance some feature in a layer. Used by several year, if you expect a new architecture will make "big change" in our current architecture,  it will never be impossible. The "path thinking" make both us and big corperation can't leave the shadow of safety and laziness.`

## Groups of Design Patterns
- Despite of the cristicism, learning how to use DP effective won't be a very difficult task, so if you believe you can archive it, let try my list below.
### Creational Patterns
> - [Singleton]()
> - [Factory Method]()
> - Abtract Factory
> - Builder
> - Prototype
### Structural Patterns
> - Adaptor
> - [Facade]()
> - [Decorator]()
> - Flyweight
> - Proxy
> - Composite
> - Bridge
### Behavior Patterns
> - Interpreter
> - Template Method
> - Chain of Responsibility
> - Command
> - Iterator
> - Mediator
> - Memento
> - [Observer]
> - [Stategy]()
> - State
> - Visitor





<!-- Blog of some "Trashing DP" -->
[](https://www.red-gate.com/simple-talk/blogs/why-following-design-patterns-is-a-bad-idea/)
[](https://sourcemaking.com/design_patterns)

```
- When we have not studied the religion, we see mountains as mountains,  rivers as rivers. 
- When we first learn the religion, we see that mountains are not mountains, rivers are not rivers. 
- After studying the religion, we see that mountains are just rivers, rivers are just rivers.
```