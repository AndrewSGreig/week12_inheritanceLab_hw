import org.junit.Before;
import org.junit.Test;

import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;
    @Before
    public void before(){
        developer = new Developer("Jefferson","AB123456C", 500.00);
    }

    @Test
    public void hasDevName(){
        assertEquals("Jefferson", developer.getName());
    }

    @Test
    public void hasDevNiNumber(){
        assertEquals("AB123456C", developer.getNiNumber());
    }

    @Test
    public void hasDevSalary(){
        assertEquals("500.0", developer.getSalary().toString());
    }

    @Test
    public void testDevRaiseSalary(){
        //arrange
        // this is done in @before
        Double newSal = 0.0;

        //act
        newSal = developer.raiseSalary(100.00);

        //assert
        assertEquals(600.0, newSal, 0.01);
    }

    @Test
    public void testDevPayBonus(){
        //arrange
        Double bonus = 0.00;

        //act
        bonus = developer.payBonus();

        assertEquals(5.00, bonus,0.01);
    }

}
