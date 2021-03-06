package ru.rrusanov.switcher;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * @author Roman Rusanov
 * @version 0.1
 * @since 27.10.2018
 *
 * The class test behavior Container, Creator class.
 */
public class ContainerTest {
    /**
     * The field contain common resource.
     */
    private Container container;
    /**
     * The field contain instance lock. To synchronize threads.
     */
    private ReentrantLock lock = new ReentrantLock(true);
    /**
     * The field contain instance the lock condition.
     */
    private Condition condition = lock.newCondition();
    /**
     * The method execute before each tests.
     */
    @Before
    public void setUp() {
        this.container = new Container();
    }
    /**
     * Test for add(), getStoredString().
     */
    @Test
    public void whenAddedValueThenReturnThem() {
        this.container.add(123);
        assertEquals("123", this.container.getStoredString().toString());
    }
    /**
     * Test behavior two thread1 must adding value 1 in container 10 times,
     * and next thread2 must adding value 2 same way sequentially.
     */
    @Test
    @RepeatedTest(100)
    public void whenWorkTwoThreadThenValueAddedSequentially() {
        this.container = new Container();
        Thread thread1 = new Thread(new Creator(lock, container, 1, condition));
        Thread thread2 = new Thread(new Creator(lock, container, 2, condition));
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String expect = "1111111111222222222211111111112222222222111111111122222222221111111111222222222211111111112222222222";
        String expect2 = "2222222222111111111122222222221111111111222222222211111111112222222222111111111122222222221111111111";
        assertThat(this.container.getStoredString().toString(), Matchers.anyOf(Matchers.is(expect), Matchers.is(expect2)));
    }
}