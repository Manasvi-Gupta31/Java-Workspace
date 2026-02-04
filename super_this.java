//  10. WAP to print a value by using keywords super and this .

// Parent Class
class parent{
    int value = 10;
}

// Child Class
class child extends parent{
    int value = 11;
    
    void display(){
        System.out.println("Using super keyword value is "+super.value+".");      //refer parent class variable with same variable name in the child class
        System.out.println("Using this keyword value is "+this.value+".");        //refer child class variable with same variable name in the parent class
    }
    
}

public class super_this{
    
    public static void main(String[] args){
        
        child c = new child();
        c.display();
        
    }
}

