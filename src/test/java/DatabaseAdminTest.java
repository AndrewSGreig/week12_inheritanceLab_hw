import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jefferson","AB123456C", 500.00);
    }

    @Test
    public void hasDevName(){
        assertEquals("Jefferson", databaseAdmin.getName());
    }

    @Test
    public void hasDevNiNumber(){
        assertEquals("AB123456C", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasDevSalary(){
        assertEquals("500.0", databaseAdmin.getSalary().toString());
    }

    @Test
    public void testDevRaiseSalary(){
        //arrange
        // this is done in @before
        Double newSal = 0.0;

        //act
        newSal = databaseAdmin.raiseSalary(100.00);

        //assert
        assertEquals(600.0, newSal, 0.01);
    }

    @Test
    public void testDevPayBonus(){
        //arrange
        Double bonus = 0.00;

        //act
        bonus = databaseAdmin.payBonus();

        assertEquals(5.00, bonus,0.01);
    }

}
