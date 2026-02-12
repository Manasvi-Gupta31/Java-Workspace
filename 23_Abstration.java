// Abstract Parent class
abstract class Sample {

    int a = 10;

    void f() {
        System.out.println("Value from parent class: " + a);
    }
}

// Child class inheriting Sample
class Child extends Sample {

    void display() {

        // Accessing parent class variable using super
        System.out.println("Accessing parent variable using super: " + super.a);

        // Calling parent class method using super
        super.f();
    }
}

public class Abstration {   // Class name corrected to match file name

    public static void main(String[] args) {

        // Creating object of child class
        Child c = new Child();

        // Calling child method
        c.display();
    }
}


//           OR 

// abstract class sample { // hiding details
//     int a = 10;

//     void function() {
//         System.out.println(a);
//     }

// }

// class child extends sample{
//     void function(){
//         super.function(); // we can access parent class method using super keyword
//         System.out.println(super.a);
//         }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         child s = new child(); // we can not make or access object for abstract class first we need to make a child class because it hide the details 
//         s.function();
//     }
// }