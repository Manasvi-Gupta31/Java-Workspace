import java.util.Scanner;
class Area {
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of the triangle : ");
        double base = sc.nextDouble();
        System.out.print("Enter height of the triangle : ");
        double height = sc.nextDouble();
        double area = (base * height)/2;
        System.out.println("Area of the triangle is "+area);
	    sc.close();
      } 
}
