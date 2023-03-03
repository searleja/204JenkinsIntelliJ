import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));


        System.out.println("welcome to the calculator\nEnter a command:");

        String val = reader.readLine();

        String[] vals = val.split(" ");

        while (val != "done") {

            if (vals[0] == "add") {
                System.out.println(calculator.add(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0] == "subtract") {
                System.out.println(calculator.subtract(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0] == "multiply") {
                System.out.println(calculator.multiply(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0] == "divide") {
                System.out.println(calculator.divide(Integer.parseInt(vals[1]), Integer.parseInt(vals[2])));
            } else if (vals[0] == "fib") {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(vals[1])));
            } else if (vals[0] == "binary") {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(vals[1])));
            }
            val = reader.readLine();

            vals = val.split(" ");
        }
    }
}
