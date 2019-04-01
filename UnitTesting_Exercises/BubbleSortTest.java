import org.junit.Assert;
import org.junit.Test;
import p04_BubbleSortTest.Bubble;

public class BubbleSortTest {

    @Test
    public void normalTest() {
        int[] array = new int[]{3, 2, 1};
        Bubble.sort(array);
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void testWithSameArr() {
        int[] array = new int[]{1, 2, 3};
        Bubble.sort(array);
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void sameArrayTest() {
        int[] array = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        Bubble.sort(array);
        int[] expected = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expected, array);
    }

}
