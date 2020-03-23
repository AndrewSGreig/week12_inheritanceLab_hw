import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Joe","AB123456C", 1000.00, "Technology");
    }

    @Test
    public void hasName(){
        assertEquals("Joe", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("AB123456C", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals("1000.0", manager.getSalary().toString());
    }

    @Test
    public void hasDept(){
        assertEquals("Technology", manager.getDeptName());
    }

    @Test
    public void testRaiseSalary(){
        //arrange
        // this is done in @before
        Double newSal = 0.0;

        //act
        newSal = manager.raiseSalary(100.00);

        //assert
        assertEquals(1100.0, newSal, 0.01);
    }

    @Test
    public void testPayBonus(){
        //arrange
        Double bonus = 0.00;

        //act
        bonus = manager.payBonus();

        assertEquals(10.00, bonus,0.01);
    }

}
