/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package withprinciple;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Animal reference, Dog object
        Animal a2 = new Cat(); // Animal reference, Cat object

        a1.sound(); // Calls Dog's sound
        a2.sound(); // Calls Cat's sound
    }
}