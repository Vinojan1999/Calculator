package src.V4;

import src.V4.Operation.*;

public class main {
    public static void main(String[] args) throws Exception {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result value: " + result);

    }
}
