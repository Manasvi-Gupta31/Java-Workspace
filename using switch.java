//Code to perform mathematical operation using switch

import java.util.Scanner;

class arithmetic_operation{
    
    void AO(String operation, float x, float y){
        
        float result;
        
        switch(operation){
            case "addition":
                result = x + y;
                System.out.println("Addition is "+result);
                break;
            case "subtraction":
                result = x - y;
                System.out.println("Subtraction is "+result);
                break;
            case "multiplication":
                result = x * y;
                System.out.println("Multiplication is "+result);
                break;
            case "division":
                if(y == 0){
                    System.out.println("Denominator can't be 0.");
                    break;
                }
                result = x / y;
                System.out.println("Division is "+result);
                break;
            default:
                System.out.println("Wrong Input.");
        }
        
    }
    
}

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the arithmetic operation(addition, subtraction, multiplicatio and division) you want to do between two operators.");
        
        String operation = sc.next();
        
        System.out.println("Enter two operators : ");
        
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        
        arithmetic_operation a1 = new arithmetic_operation();
        a1.AO(operation,x,y);
        
        sc.close();
        
    }
    
}