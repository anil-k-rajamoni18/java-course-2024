import java.util.Scanner;

public class CodeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float price = sc.nextFloat();
        int quantity = sc.nextInt();
        sc.nextLine(); // skip the newline 
        String itemName= sc.nextLine();

        System.out.println(price);
        System.out.println(quantity);
        System.out.println(itemName);
    }
}
