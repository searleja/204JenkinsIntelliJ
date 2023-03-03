import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        Console cnsl
                = System.console();


        System.out.println("welcome to the calculator\nEnter a command: ");

        String val = reader.readLine();



        // Read line
//        String val = cnsl.readLine(
//                "Enter a command: ");

        String[] vals = val.split(" ");

        while (!val.equals("done")) {

            if (vals[0].equals("add")) {
                System.out.println(calculator.add(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0].equals("subtract")) {
                System.out.println(calculator.subtract(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0].equals("multiply")) {
                System.out.println(calculator.multiply(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0].equals("divide")) {
                System.out.println(calculator.divide(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0].equals("fib")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(vals[1])));
            } else if (vals[0].equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(vals[1])));
            }
            val = reader.readLine();

            vals = val.split(" ");
        }
    }
}
