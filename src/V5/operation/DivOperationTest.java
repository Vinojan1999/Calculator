package src.V5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThrows;

public class DivOperationTest {

    @Test
    public void should_divide_positive_values() throws InvalidOpeartionException {
        DivOperation divOperation = new DivOperation();
        Double result = divOperation.execute(new Double[] { 6.0, 3.0 });
        assertThat(result, is(2.0));
    }

    @Test
    public void should_not_divide_by_zero() {
        DivOperation divOperation = new DivOperation();
        assertThrows(InvalidCalcOpeartionException.class, () -> {
            divOperation.execute(new Double[] { 6.0, 0.0 });
        });
    }
}
