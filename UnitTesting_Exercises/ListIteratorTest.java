import org.junit.Assert;
import org.junit.Test;
import p03_IteratorTest.ListIterator;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {

    private static ListIterator ITERATOR_DEFAULTCHARS = null;

    static {
        try {
            ITERATOR_DEFAULTCHARS = new ListIterator("a", "b", "c");
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructor() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator(null);
    }

    @Test
    public void moveCommandShouldMoveToNextIndex() throws OperationNotSupportedException {
        ListIterator listIterator = ITERATOR_DEFAULTCHARS;
        listIterator.move();
        Assert.assertEquals("b", listIterator.print());
    }

    @Test
    public void hasNextShouldReturnFalseIfThereIsntMoreElements() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("a");
        Assert.assertFalse(listIterator.hasNext());
    }

    @Test
    public void hasNextShouldReturnTrueIfThereAreMoreElements() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("a", "b");
        Assert.assertTrue(listIterator.hasNext());
    }


}
