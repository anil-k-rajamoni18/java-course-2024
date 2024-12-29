public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World"); 
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);                                                                                                     

        sb.delete(5, 10);
        System.out.println(sb);

        sb.replace(5, 10, "New");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("New Year 2025");
        System.out.println(sb.length() + " " + sb.capacity());
    }
}
