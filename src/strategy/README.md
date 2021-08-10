You can find a definition of this pattern on here:

    https://refactoring.guru/design-patterns/strategy

Head First Design Pattern Definition:

> The strategy pattern defines a family of algorithms,
> encapsulates each one, and makes them interchangeable.
> Strategy lets the algorithm vary independently from
> clients that use it.

Design principles that the Strategy design pattern follow:
1. Identify aspects of your application that vary and separate them from
   what stays the same.
2. Program to an interface, not an implementation.
3. Favor composition over inheritance.

### Problem in Examples `v0`, `v1`, `vfinal`

Design a system that represents ducks. Specifically:
- All ducks should be able to swim
- All ducks can be displayed, but each duck displays itself differently
- Some ducks squeak (like rubber ducks) but can't fly
- Some ducks can fly (mallard and redhead)
- Decoy ducks can't quack nor fly
- Some ducks may fly in a different way
