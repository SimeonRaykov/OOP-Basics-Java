import org.junit.Assert;
import org.junit.Test;
import p01_Database.Database;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    private static final int[] DB_INITIALVALUES = new int[]{1, 2, 3};
    private static final int [] DB_OVERFLOW = new int [17];

    @Test(expected = OperationNotSupportedException.class)
    public void dbConstructorShouldThrowExceptionWithoutParameters() throws OperationNotSupportedException {
        Database db = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void dbConstructorShouldThrowExceptionWhenDBhasMoreThan16Elements() throws OperationNotSupportedException {
        Database db = new Database(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void removeMethodShouldThrowExceptionWhenEmptyDB() throws OperationNotSupportedException {
        Database db = new Database();
        db.remove();
    }

    @Test
    public void removeMethodShouldRemoveWhenUsedCorrectly() throws OperationNotSupportedException {
        Database db = new Database(1, 2, 3);
        db.remove();
        int[] expected = new int[]{1, 2};

        Assert.assertEquals(expected.length, db.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addMethodShouldThrowExceptionWhenParameterIsNull() throws OperationNotSupportedException {
        Database db = new Database();
        db.add(null);
    }

    @Test
    public void addMethodShouldWorkCorrectlyWithIntegerValues() throws OperationNotSupportedException {
        Database db = new Database(1, 2);
        db.add(1);
        Assert.assertEquals(3, db.getElements().length);
    }

}
