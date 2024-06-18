public class HandsOn2 {
    public static void main(String[] args) {
        double p = power(12.5);
        System.out.println(root(p));
        System.out.println(power(p));
    }
    public static Double power(double a){
        double b = a*a;
        return b;
    }
    public static Double root(double p){
        double r = Math.sqrt(p);
        return r;
    }
}
