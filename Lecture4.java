public class Lecture4 {
    public static void main(String[] args) {
        String age = "25";
        Integer ageInInteger = Integer.valueOf(age);
//        System.out.println(ageInInteger);
        Long l = Long.valueOf(age);
        String a = "true";
        Boolean aInBoolean = Boolean.parseBoolean(a);
//        System.out.println(String.valueOf(a));


        byte b = 1;
        String b1 = String.valueOf(b);

        int i = 2;
        String i1 = String.valueOf(i);

        int s = Integer.valueOf(b1);

//        System.out.println(s);
//        System.out.println(i1);

        int x = 2;
        x += 5;
        x -=3;
        x *=10;
        x /=2;
        x %=5;
        System.out.println(x);

        int z = 5;
//        System.out.println(z>x);
//        System.out.println(z<x);
//        System.out.println(z==x);
//        System.out.println(z!=x);
//        System.out.println(z>=x);
//        System.out.println(z<=x);

        z++;
//        System.out.println(z);
        int w = 1;
        int v = 2;
        int t = 0;
//        System.out.println((w>v)||(w>t));
//        System.out.println((w>v)&&(w>t));


    }
}
