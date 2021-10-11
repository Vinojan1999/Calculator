package src.V5.operation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OperationFactoryTest {

    @Test
    public void should_return_AddOperation_object_when_operator_is_add() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        // verify that the operation is an instance of AddOperation class
        assertThat(operation, instanceOf(AddOperation.class));
    }

    @Test
    public void should_return_SubOperation_object_when_operator_is_sub() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        // verify that the operation is an instance of SubOperation class
        assertThat(operation, instanceOf(SubOperation.class));
    }

    @Test
    public void should_return_MulOperation_object_when_operator_is_mul() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");

        // verify that the operation is an instance of MulOperation class
        assertThat(operation, instanceOf(MulOperation.class));
    }

    @Test
    public void should_return_DivOperation_object_when_operator_is_div() {
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("div");

        // verify that the operation is an instance of DivOperation class
        assertThat(operation, instanceOf(DivOperation.class));
    }
}
