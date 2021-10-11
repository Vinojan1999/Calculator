package src.V4;

public class CommandLineInputs {
    
    private final String[] args;

    public CommandLineInputs(String[] args) {

        this.args = args;
    }

    public String getOperator() {
        
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return "";
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("Please provide add,sub or mul as the operator argument.");
            return "";
        }
        return operator;
    }
}
