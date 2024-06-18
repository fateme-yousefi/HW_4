public class HandsOn {
    public static void main(String[] args) {
        System.out.println(birthdate(1375));
    }

    public static Integer birthdate(int birth){
        int year = 1402;
        int age = year - birth;
        return age;
    }
}
