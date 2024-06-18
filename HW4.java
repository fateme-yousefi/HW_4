public class HW4 {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }
        public static int factorial(int n){
            if (n != 0) {
                return factorial(n - 1) * n;
            } else {
                return 1;
            }
        }

}
