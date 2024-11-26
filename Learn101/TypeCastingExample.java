class Animal {}
class Dog extends Animal {}

public class TypeCastingExample {
    public static void main(String[] args) {
        System.out.println("*******Primitive Implicit TypeCasting*********");
        int myInt = 10;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        char ch = 'R';
        long l = ch;
        System.out.println(ch);
        System.out.println(l);

        boolean isPrime = true;
        // int result = isPrime;

        System.out.println("*******Primitive Explicit TypeCasting*********");
        double val = 9.78;
        int resVal = (int)val;
        System.out.println(val);
        System.out.println(resVal);

        char ch1 = 'a';
        byte byt = (byte) ch1; 
        System.out.println(ch1);
        System.out.println(byt);

        System.out.println("******* Reference Type Casting ********");
        Dog myDog = new Dog();
        Animal myAnimal = myDog; //  Upcasting from Dog to Animal

        Animal myAnimal2 = new Dog();
        Dog myDog2 = (Dog)myAnimal2; // Downcasting from Animal to Dog


    }
}
