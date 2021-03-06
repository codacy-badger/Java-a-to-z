package ru.rrusanov.tracker;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;

/**
 * Class test StubInput.
 *
 * @author Roman Rusanov
 * @version 0.1
 * @since 03.05.17
 */
public class StubInputTest {
    /**
     * check method StubInput test.
     */
    @Test
    public void thenStubInputAskInvokeWithStringWhenReturnSameString() {
        final String[] expect = {"0", "1", "2", "3"};
        final Input stubInput = new StubInput(new String[]{"0", "1", "2", "3"});
        for (int i = 0; i < expect.length; i++) {
            final String result = stubInput.ask("");
            String expectFor = expect[i];
            Assert.assertThat(result, is(expectFor));
        }
    }
    /**
     * check method must throw MenuOutException.
     */
    @Test(expected = MenuOutException.class)
    public void thenInputIncorrectWhenThrowMenuOutException() {
        //Tracker tracker = new Tracker();
        final List<Integer> range = Arrays.asList(new Integer[] {0, 1, 2, 3, 4});
        int stubInput = new StubInput(new String[] {"-1"}).ask("", range);
    }
}