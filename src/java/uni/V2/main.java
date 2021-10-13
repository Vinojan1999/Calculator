package src.V2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class main {
    public static void main(String[] args) throws IOException {

        //Validation part
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("div") || operator.equals("mul"))) {
            System.out.println("Please provide add,sub or mul as the operator argument.");
        }

        //read the numbers text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("/home/vinojan/Documents/GitHub/Git-clone/Calculator/numbers.txt")
        );


        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        double result = 0;

        // Or we can use switch case
        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        }

        System.out.println("The result is " + result);//v2 - final code

    }

}