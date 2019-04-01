import org.junit.Assert;
import org.junit.Test;
import p02_ExtendedDatabase.Database;
import p02_ExtendedDatabase.Person;

import javax.naming.OperationNotSupportedException;

public class ExtendedDBTest {

    @Test(expected = OperationNotSupportedException.class)
    public void constuctorShouldThrowExcepetionForNullParams() throws OperationNotSupportedException {
        Database db = new Database();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addOperationShouldThrowForNullParam() throws OperationNotSupportedException {
        Database db = new Database(new Person(1, "Pesho"));
        db.add(null);
    }

    @Test
    public void addOperationShouldWorkCorrectlyForNormalUsage() throws OperationNotSupportedException {
        Database db = new Database(new Person(1, "Pesho"));
        db.add(new Person(2, "Sami"));
        Assert.assertEquals(2, db.getElements().length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUsernameShouldThrowForNullParam() throws OperationNotSupportedException {
        Database db = new Database(new Person(1, "Pesho"));
        db.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUsernameShouldThrowForNonExistantPersonInDB() throws OperationNotSupportedException {
        Database db = new Database(new Person(1, "Pesho"));
        db.findByUsername("Gosho");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByUsernameShouldThrowForInvalidUsernameCaseSensitive() throws OperationNotSupportedException {
        Database db = new Database(new Person(1, "Pesho"));
        db.findByUsername("pesho");
    }

    @Test
    public void findByUsernameShouldWorkForNormalUsage() throws OperationNotSupportedException {
        Person person = new Person(1, "Pesho");
        Database db = new Database(person);
        Assert.assertEquals(person, db.findByUsername("Pesho"));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void findByIDShouldThrowIfUserIsNotPresentInDB() throws OperationNotSupportedException {
        Person person = new Person(1, "Pesho");
        Database db = new Database(person);
        Assert.assertEquals(person, db.findById(2));
    }

    @Test
    public void findByIDShouldWorkForNormalUsage() throws OperationNotSupportedException {
        Person person = new Person(1, "Pesho");
        Database db = new Database(person);
        Assert.assertEquals(person, db.findById(1));
    }

}


