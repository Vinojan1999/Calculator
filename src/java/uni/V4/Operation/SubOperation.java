package src.V4.Operation;

public class SubOperation implements Operation {
    
    public Double execute(Double[] numbers) {
        return numbers[0] - numbers[1];
    }
}
