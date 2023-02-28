package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    private static final String BEETLE = "Beetle";
    private static final String JOHN_DOE = "John Doe";
    private Car car;
    private CarOwner carOwner;


    @Before
    public void setUp() throws Exception {
        car = new Car(BEETLE);
        carOwner = new CarOwner(JOHN_DOE, car);
    }

    @Test
    public void getName() {
        assertEquals(JOHN_DOE, carOwner.getName());
    }


}