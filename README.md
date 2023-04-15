# DesignPatterns
**Factory Pattern**

## What is Factory Pattern and how does it work?
The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses. It gives us a way to encapsulate the instantiations of concrete types. This decouples the client code in the superclass from the object creation code in the subclass.

`abstract Product factoryMethod(String type)`

Factory Method is not the only technique for adhering to the Dependency Inversion Principle, but it is one of the more powerful ones. The Factory Pattern makes sure that our high-level components do not depend on our low-level components; rather, they both depend on abstractions.

![Factory Method](factoryPatternDescription.jpg)

## What is Abstract Factory and how does it work?
An Abstract Factory gives us an interface for creating a family of products. By writing code that uses this interface, we decouple our code from the actual factory that creates the products. That allows us to implement a variety of factories that produce products meant for different contexts - such as different regions, different operating systems, or different look and feels. Because our code is decoupled from the actual products, we can substitute different factories to get different behaviors.

![Abstract Factory](abstractFactory.jpg)

## When to use Factory Pattern and Abstract Factory?
Use Factory Pattern when:
- We need to decouple the client code from the concrete classes we need to instantiate;
- If we don't know ahead of time all the concrete classes we are going to need;
- A class we write is likely to change, we have some good techniques like Factory Method to encapsulate that change.

Use Abstract Factory whenever there families of products we need to create and we want to make sure our clients create products that belong together.