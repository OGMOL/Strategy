import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingContextTest {
    Sorter sortStrategy;
    Sorter sortStrategy2;
    int[] arr = {2, 3, 34, 3, 2, 5};
    int[] arr2 = {2, 3, 34, 3, 2, 5};

    @Before
    public void setUp() throws Exception {
        sortStrategy = new SelectionSort();
        sortStrategy2 = new BubbleSort();
    }

    @After
    public void tearDown() throws Exception {
        sortStrategy = null;
        sortStrategy2 = null;
    }

    @Test
    public void execute() {
        SortingContext context = new SortingContext(sortStrategy);
        context.execute(arr);
        int[] res = {2, 2, 3, 3, 5, 34};
        assertArrayEquals(arr, res);
    }
    @Test
    public void execute2() {
        SortingContext context = new SortingContext(sortStrategy2);
        context.execute(arr2);
        int[] res = {2, 2, 3, 3, 5, 34};
        assertArrayEquals(arr2, res);
    }
}