public class OperatorsExample1 {
    public static void main(String[] args) {
            System.out.println("inside mainMethod");
            boolean result = true || (someExpensiveMethod());
            System.out.println(result);
        }
    
        private static boolean someExpensiveMethod() {
            System.out.println("inside someExpensiveMethod");
            return false;
        }
}
