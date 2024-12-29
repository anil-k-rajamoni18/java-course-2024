import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputInJavaExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        // read single character from console 
    /* 
        int data = bfn.read();
        System.out.println(data);
        System.out.println((char)data);
        
        bfn.readLine();
        
        String text = bfn.readLine();
        System.out.println(text);
    */

        // read two numbers and perform addition
    /*
        int n1 = Integer.parseInt(bfn.readLine());  // String to int 
        int n2 = Integer.parseInt(bfn.readLine());
        System.out.println(n1 + n2);

    */

        // using command-line args

        String itemName = args[0];
        float price = Float.parseFloat(args[1]);
        int quantity = Integer.parseInt(args[2]);
        System.out.println("item-name: " + itemName);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);

    }
}
