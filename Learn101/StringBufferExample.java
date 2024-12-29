public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("Hello");
        System.out.println(sb);

        sb.insert(5, "Java");
        sb.insert(5, " ");
        sb.insert(10, "Learners");
        System.out.println(sb);
        System.out.println(sb.capacity());
        
        sb.delete(10, 18);
        System.out.println(sb);

        sb.replace(5, 6, "_");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);


        // Try this
        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());


        StringBuffer sb3 = new StringBuffer("python");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

    }
}
