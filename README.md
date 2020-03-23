# Inheritance

Inheritance is an Object-oriented Programming (OOP) core concept.

## Liskov

## Living hierarchy

## is List<Cat> a List<Animal> ?
  
Most say yes based on intuition. It seems that a list of cats is indeed a list of animals.
Will you follow that intuition ?

It seems that it will be true for any pair of abstraction from that hierarchy.
A list of felidae is a list of vertebrates.

So it seems intuitive that the List<> container preserves the class hierarchy.
It seems foolish to say that a list of mammal is also a list of cats because you can have any mammal in a list of mammals, not only cats.

The statement that the inheritance link between classes is preserved through the application of the List<> container seems obvious. The reverse seems false.

If you follow the intuitive answer, go to the PreservingLiskov class in the exercice package.
If you smell a trap and think that maybe the intuition is wrong, go to the ReversingLiskov class.
