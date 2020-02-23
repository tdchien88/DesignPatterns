package com.tdchien88.designParrtens.type01_Creational.chap12_AbstractFactoryPattern;
// https://www.javatpoint.com/singleton-design-pattern-in-java
/**
 * Abstract Factory Pattern
 * 
 * Abstract Factory Pattern says that just define an interface or abstract class
 * for creating families of related (or dependent) objects but without
 * specifying their concrete sub-classes.That means Abstract Factory lets a
 * class returns a factory of classes. So, this is the reason that Abstract
 * Factory Pattern is one level higher than the Factory Pattern.
 * 
 * An Abstract Factory Pattern is also known as Kit.
 * 
 * #Advantage of Abstract Factory Pattern
 * 
 * _ Abstract Factory Pattern isolates the client code from concrete
 * (implementation) classes.
 * 
 * _ It eases the exchanging of object families.
 * 
 * _ It promotes consistency among objects.
 * 
 * #Usage of Abstract Factory Pattern
 * 
 * _ When the system needs to be independent of how its object are created,
 * composed, and represented.
 * 
 * _ When the family of related objects has to be used together, then this
 * constraint needs to be enforced.
 * 
 * _ When you want to provide a library of objects that does not show
 * implementations and only reveals interfaces.
 * 
 * _ When the system needs to be configured with one of a multiple family of
 * objects.
 */
