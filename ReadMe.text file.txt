What is Polymorphism?
Polymorphism is a concept in Object-Oriented Programming (OOP) that means:

One method or function can perform different tasks depending on the object that calls it.

In simple words:
👉 Same name, different behaviors.

✅ Real-life Example:
Imagine the word "draw":

If a Circle draws itself, you see a circle shape.
If a Rectangle draws itself, you see a rectangle shape.
If a Triangle draws itself, you see a triangle shape.
➡️ Even though you are calling the same word "draw", each shape behaves differently.
This is Polymorphism — one name, many forms.

✅ Polymorphism in Java (Example Code):
java
Copy
Edit
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class Cat
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;  // Reference of parent class

        a = new Dog();
        a.sound();  // Output: Dog barks

        a = new Cat();
        a.sound();  // Output: Cat meows
    }
}
✅ Output:
nginx
Copy
Edit
Dog barks
Cat meows
✅ Key Points to Remember:
Polymorphism means one method, many behaviors.
It happens when a child class overrides a method of the parent class.
It makes programs easier to extend and simpler to manage.
Helps in reusing code and avoiding duplication.
✅ Types of Polymorphism in Java:
Compile-time Polymorphism (Method Overloading).
Run-time Polymorphism (Method Overriding).
✅ Simple Definition to Remember:
Polymorphism allows the same function name to act differently for different objects.

