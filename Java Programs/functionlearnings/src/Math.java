public class Math {
    static int printAdd(int x, int y) //printAdd is the method name
    {
        System.out.println("The sum is : "+(x+y));
        return x+y;
    }
    public static void main(String[] args) { //this is main method

        int a = 10;
        int b = 20;
        printAdd(a, b);// calling a method
    }
}