package src.V5;

import src.V5.input.CommandLineInputs;
import src.V5.input.Inputs;
import src.V5.operation.OperationFactory;
import src.V5.repository.FileNumberRepository;
import src.V5.repository.NumberRepository;
import src.V5.ui.CmdLineUI;
import src.V5.ui.UI;

public class main {
    
    public static void main(String[] args) throws Exception {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();

    }
}
