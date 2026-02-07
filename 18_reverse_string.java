import java.util.Scanner;
class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String str = sc.next();
        String rev_str = "";
        
        //Reverse a string
        for(int i =0;i<str.length();i++){
            rev_str = str.charAt(i) + rev_str;
        }
        
        System.out.print("Reverse string : "+rev_str);
    }
}
