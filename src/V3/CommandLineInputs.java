package src.V3;

public class CommandLineInputs {
    private final String[] args;

    public CommandLineInputs(String[] args) {

        this.args = args;
    }

    public String getOperator() {
        
        if (args.length == 0) {
            System.out.println("Please put the operation as an argument...!");
            return "";
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("div") || operator.equals("mul"))) {
            System.out.println("Please put the operator like add or sub or mul");
            return "";
        }
        return operator;
    }
}
