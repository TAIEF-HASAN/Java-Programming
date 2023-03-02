How Interface is similar to a class
1.Interface can have any number of methods.
2.it has same file extensions as class (.java)

How Interface is different form a class
1.you can not instantiate(object) an interface.\n
2.Interface doesn't contain constructor.
3.All the method interface are abstract.
4.Ann interface can not have instance variables.
5.A Class can implements(extends) multiple interface.

Interface vs Abstract Class

|   Interface   	| Abstract   	|
|-------------------|---	|
|   	            |   	|
|   	            |   	|
|   	            |   	|

Interface:
1. Can have only abstract method
2.it support multiple inheritance
3.Can only have static and final variable
4.Full Abstract.
5.Example

Interface Animal{
    void Eat();
}

Abstract:
1. Can have abstract and not abstract method
2.It Does not support multiple inheritance
3.Can have static, ,no static, final and not final variable.
4.Partial abstraction.
5.Example
abstract class Animal{
    abstract void eat();
} 
