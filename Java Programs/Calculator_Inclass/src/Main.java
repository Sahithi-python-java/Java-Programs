import com.sahithi.service.calculator.Calculator;

public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        int addResult=calculator.add(10, 20);
        System.out.println("The Result of Addition is: " +addResult);
    }
}