// POLYMORPHISM BY BOTH METHODS "METHOD OVERLOADING" AND "METHOD OVERRIDING".

//METHOD OVERRING
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {

    // Method Overriding
    // Same method name, same parameters, same return type
    // This overrides the parent class method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {

    // Method Overriding
    // Overriding the sound() method of Animal class
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        // Parent class reference
        Animal a;

        // Dog object assigned to parent reference
        a = new Dog();
        a.sound();   // Calls Dog's sound() method (decided at runtime)

        // Cat object assigned to parent reference
        a = new Cat();
        a.sound();   // Calls Cat's sound() method (decided at runtime)
    }
}


//              OR


// BOTH METHOD OVERLOADING AND METHOD OVERRIDING
// Parent class
class Animal {

    // This method will be overridden in child class
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading (same method name, different parameters)
    void sound(String name) {
        System.out.println(name + " makes a special sound");
    }
}

// Child class
class Dog extends Animal {

    // Method Overriding
    // Same method name and parameters as parent
    // But behavior is changed
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating parent reference
        Animal a;

        // Parent reference holding child object
        // This shows Runtime Polymorphism (Overriding)
        a = new Dog();
        a.sound();   // Dog's version will run

        // This shows Method Overloading
        // Same method name but with parameter
        a.sound("Tommy");
    }
}
