import java.util.Arrays;

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


        System.out.println("**********************************************");
        String firstName = "Kumar              ";
        String lastName = "Rajamoni";
        // length()
        System.out.println(firstName.length());

        // toUpperCase() and toLowerCase() 
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());

        // charAt(int index)
        System.out.println(firstName.charAt(1));
        System.out.println(lastName.charAt(lastName.length() - 1 )); // last character

        // substring(int beginIndex)
        String teamName = "Chennai Super Kings.";
        System.out.println(teamName.substring(7));
        System.out.println(teamName.substring(8,10));

        // equals() & equalsIgnoreCase
        System.out.println("mumbai".equals("chennai"));
        System.out.println("hyderabad".equalsIgnoreCase("HyDeraBad"));

        // contains()
        System.out.println(teamName.contains("nig"));

        // startsWith() & endsWith()
        System.out.println(teamName.startsWith("The"));
        System.out.println(teamName.endsWith("Kings."));

        // indexOf(int ch) & lastIndexOf(int ch)
        System.out.println(teamName.indexOf('S'));
        System.out.println(teamName.indexOf('n'));
        System.out.println(teamName.lastIndexOf('n'));

        // replace() & replaceAll()
        System.out.println(teamName.replace(" ", "_"));


        // trim()
        System.out.println(firstName.length());
        System.out.println(firstName.trim() + " " + firstName.trim().length());

        // split()
        String[] splitArr = teamName.split(" ");
        System.out.println(splitArr[2]);

        // isEmpty() 
        System.out.println("H".isEmpty());
        System.out.println("".isBlank());

        // getBytes()
        String message = "Welcome";
        byte[] byteArr = message.getBytes();
        System.out.println(Arrays.toString(byteArr));

        System.out.println(new String(new byte[] {87, 101, 108, 99, 111, 109, 101}));

        // valueOf() 
        int number = 123;
        boolean boolValue = true;
        char singleChar = 'A';
        char[] charArray = {'J', 'a', 'v', 'a'};
        
        // Using valueOf with primitive types
        String str1 = String.valueOf(number);  // "123"
        String str2 = String.valueOf(boolValue);  // "true"
        String str3 = String.valueOf(singleChar);  // "A"
        String str4 = String.valueOf(charArray);  // "Java"

        // compareTo()

        String str5 = "apple";
        String str6 = "banana";
        String str7 = "apple";

        System.out.println(str5.compareTo(str6)); // Negative value (-1)
        System.out.println(str6.compareTo(str5)); // Positive value (1)
        System.out.println(str5.compareTo(str7)); // Zero (0)
        System.out.println("INDIa".compareTo("INDia"));

        // hashCode()
        String str8 = "hello";
        String str9 = "world";
        
        System.out.println("Hash code of 'hello': " + str8.hashCode());
        System.out.println("Hash code of 'world': " + str9.hashCode());
        
    }
}
