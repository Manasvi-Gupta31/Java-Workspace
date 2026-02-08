class Functions{

    public static void main(String[] args){

        String str1 = new String("Java ");     //-----> stores in heap
        String str2 = "java";                //-----> stores in pool
	    String str3 = "Java";
        String str4 = "Java";
        String str5 = "    Hello, I am Ok.         ";

        //functions
        System.out.println(str1.equals(str2));                    //-----> compares content
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str2);                          //-----> compares memory
        System.out.println(str3 == str4);

        System.out.println("Length of string 1 is "+str1.length()+".");
        System.out.println("Character at index 0 is "+str1.charAt(0)+".");
        System.out.println("Upper case : "+str1.toUpperCase()+".");
        System.out.println("Lower case : "+str1.toLowerCase()+".");
        System.out.println("Substring : "+str1.substring(0,2)+".");
        System.out.println("Compare content of str1 and str2 (case-insensitive) : "+str1.equalsIgnoreCase(str2)+".");
        System.out.println("Lexicographic comparison of str1 and str2 : "+str1.compareTo(str2)+".");                //unicode comparison
        System.out.println("Check substring va in string 1 : "+str1.contains("va")+".");
        System.out.println("Replace str2 with Python ."+str2.replace("Java","Python"));                          //can't replace as str2 is java not Java
        System.out.println("Replace str2 with Python ."+str2.replace("java","Python"));
        System.out.println("String 2 : " +str2+".");                                                                //o/p--->java as string is immutable
        System.out.println("Trim va from str5 : "+str5.trim());
        System.out.println("String 5 : "+str5+".");
        
        String arr[] = str5.split(",");
        for(String str : arr){
            System.out.println(str);
        }

        System.out.println("Index of o in string 2: "+str2.indexOf("o")+".");                                       //-1 if element not found.

    }
    
}