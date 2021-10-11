package src.V5.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    public CommandLineInputs(String[] args) {

        this.args = args;
    }

    public String getOperator() {
        
        if (args.length == 0) {
            System.out.println("Please put the operation as an argument...!");
            return "";
        }

        //ope-close principle violated here
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("Please put the operator like add or sub or mul");
            return "";
        }
        return operator;
    }
}
