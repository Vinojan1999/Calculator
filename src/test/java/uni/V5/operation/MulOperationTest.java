package src.V5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MulOperationTest {

    @Test
    public void should_mul_positive_values() {
        MulOperation mulOperation = new MulOperation();
        Double result = mulOperation.execute(new Double[] { 2.0, 3.0 });
        assertThat(result, is(6.0));
    }

    @Test
    public void should_mul_zeros_values() {
        MulOperation mulOperation = new MulOperation();
        Double result = mulOperation.execute(new Double[] { 0.0, 0.0 });
        assertThat(result, is(0.0));
    }

    @Test
    public void should_mul_negative_values() {
        MulOperation mulOperation = new MulOperation();
        Double result = mulOperation.execute(new Double[] { -1.0, -4.0 });
        assertThat(result, is(4.0));

    }

    @Test
    public void should_mul_positive_and_negative_values() {
        MulOperation mulOperation = new MulOperation();
        Double result = mulOperation.execute(new Double[] { 2.0, -2.0 });
        assertThat(result, is(-4.0));

    }

}
