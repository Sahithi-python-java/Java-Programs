public class Unary {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        int b = 3;
        System.out.println(~b);

        boolean c = true;
        System.out.println(!c);//not operator returns boolean value..
    }
}
