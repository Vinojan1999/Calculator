package src.V5.operation;

public class DivOperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidOperationException {

        if (numbers[1] == 0) {
            throw new InvalidOperationException("Oops...! You can't divide by zero");
        }
        return numbers[0] / numbers[1];
    }
}
