public class StringExample {
    public static void main(String[] args) {
        String greet = "Hello Welcome";
        char[] msg = {'t', 'r', 'a', 'v', 'e', 'l'}; //char array

        System.out.println(greet);
        System.out.println(msg);
       

        // constructor 
/* 
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("Hello Iam learning String");
        System.out.println(s2);

        String msg2 = new String(msg); // new String(char[] arr)
        System.out.println(msg2);

        byte byteArray[] = {97,98,99,100,101,102,65,66,77};
        String s3 = new String(byteArray); // new String(byte[] b)
        System.out.println(s3);


        StringBuilder sb = new StringBuilder("iam string builder");
        String s4 = new String(sb);

        StringBuffer sbf = new StringBuffer("iam String Buffer");
        String s5 = new String(sbf);

        System.out.println(s4);
        System.out.println(s5);
*/

        System.out.println("*********************************************");
        // Using Literal 
        String s1="welcome";  
	
        String s2="Welcome";  
        String s3="Welcome";//It doesn't create a new instance  
 
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));


        String s4 = new String("Hello, World!"); // creates new instance
        String s5 = new String("Hello, World!"); //create new instance. 
        String s6 = new String("Hi, World"); // creates new instance 

        System.out.println(s4 == s5);
        System.out.println(s5 == s6);

        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
    }
}
