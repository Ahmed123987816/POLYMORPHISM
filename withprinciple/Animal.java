/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package withprinciple;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class extends Animal
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

