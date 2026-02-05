//  11. WAP to print a value by using keyword Static and without using static .

class value{
    
    static int static_value = 10;
    int value = 20;
    
    public static void main(String[] args){
        // calling static variable
        System.out.println("Static variable is "+static_value+".");
        
        // calling non static variable using object
        value v = new value();
        System.out.println("Non static variable is "+v.value+".");
        
    }
    
}