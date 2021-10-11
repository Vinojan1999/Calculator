package src.V5;

import src.V5.input.Inputs;
import src.V5.operation.Operation;
import src.V5.operation.OperationFactory;
import src.V5.repository.NumberRepository;
import src.V5.ui.UI;

import java.io.IOException;

public class CalculatorApp {
    
    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {
        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException {//will change this in the future

        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);
        ui.showMessage("The result is " + result);

    }
}
