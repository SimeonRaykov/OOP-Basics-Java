import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTest {

    @Test
    public void axeShouldLoseDurability() {
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);

        axe.attack(dummy);

        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test
    public void dummyLosesHealthWhenAttacked() {
        Axe axe = new Axe(20, 5);
        Dummy dummy = new Dummy(100, 5);

        axe.attack(dummy);
        Assert.assertEquals(80, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionWhenAttacked() {
        Axe axe = new Axe(20, 5);
        Dummy dummy = new Dummy(20, 5);

        axe.attack(dummy);
        axe.attack(dummy);
    }

    @Test
    public void deadDummycanGiveXP() {
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);

        axe.attack(dummy);
        Assert.assertEquals(10, dummy.giveExperience());
    }

    @Test (expected = IllegalStateException.class)
    public void aliveDummycantGiveXP() {
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(100, 10);

        axe.attack(dummy);
        Assert.assertEquals(10, dummy.giveExperience());
    }

}
