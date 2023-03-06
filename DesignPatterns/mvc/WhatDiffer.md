# Architectural Pattern
 With Design Pattern, now we could develop an application more effitively than before. But, have you ever wondered that, Design Pattern just help to strucutre a library, so what had structured something bigger, like system or framework? 

Yeah, I'm here to tell you about it - the answer is `Architectural patterns`. There is a lot of confusion around that what is difference between Architectural pattern and Design pattern , so I just show you all my opinions about this topic.

## What's an Architectural Pattern?
- By Wikipedia : 
    An __architectural pattern__ is a general, reusable solution to a commonly occurring problem in software architecture within a given context.
    The architectural patterns address various issues in software engineering, such as computer hardware performance limitations, high availability and minimization of a business risk. 

So unclear!
- I think the best definition of __architectural pattern__ that `an architectural pattern is a design pattern but has ability to solve many problems than one ordinary. It can implement many design pattern inside it.`

## What's the difference?
- __Architectural Patterns__ are broader in scope than __Design Patterns__. 
> + __Design Patterns__ provide very specific software related tasks where as __Architectural Patterns__ are solutions for business problems.
> + In other words, __Architectural Pattern__ focuses more on the abstract view of idea while __Design Patterns__ focuses on the implementation view of idea.

- Implementation of __Design Patterns__ are defined at granular level where as __Architectural Patterns__ are defined at high level. For example, different implementations of Factory or Builder pattern might look very similar in different projects. But same at Architectural Patterns can be varied in a lot in different projects.

- One __Architectural Pattern__ can be implemented by using many __Design Patterns__. There is one to many relationship between __Architectural Patterns__ and __Design Patterns__.

- __Design Patterns__ can difficult for showing pros and cons, just because it's created for solving a problem when develop. But with __Architectural Patterns__ is easier, it's used for a system, applied for all of application. 

![](/different_Archi_Desig.png)

## Popular Architectural Patterns
- There are many popular architectural patterns (by formal documentation and by team developer rule). 

In this article, I will make a brief introduction about 4 most common architectural patterns : 

1. Client - Server 
- The easiest pattern for understand and implement. 2 parties (1 server and multi clients) interact throgh a safe connection (almost network TCP/IP). 
- Advantage : using authorized access, access via "UI" without commands, distributed model, easy maintainmance
- Disadvantage : overload server, make "sigle point of failure".
- Popular in online application (email, share file, ...)

2. MVC

[Model-View-Controller, legendary architecture pattern](./Mvc.md)

3. N-Layer Pattern
- Decompose programs into group of subtasks (Layer). Each layer provides services to the next higher layer.
- Most common type is 3-tier architect 
> + Presentation layer (UI) : make UI and some small logic task
> + Business logic layer (Service) : responsible for all logic of the instruction. 
> + Data access layer (DA) : interact with database at below.
- Advantage : easy for maintain, manage large-scale product
- Disadvantage : Code logic is large; tasks only passing data will go through Service layer, make lower performance
- Popular in desktop app, web-app of commerce company.

4. MVVM
- A higher refinement of MVC, which Controller is replaced by View-Model. The specification of this pattern is the Flow one-way, which mean only View "know" about VM, and only VM "know" about Model.  
- Advantage : Easy unit-test; communitation between designer and developer; develop product fast, easy scale-up and maintainmance.
- Disadvantage : lower performance for small and ordinary applications; cost time for develop a good VM for larger applications.

## Conclustion
- Architectural Patterns is useful for many tasks when develop the big-case application. If you want to become a better engineer, let explore about it, you will see a big impact on your mindset. 